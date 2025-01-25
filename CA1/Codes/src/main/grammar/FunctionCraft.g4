grammar FunctionCraft;

program:
    (function | pattern | comment)*
    main
    (comment)*
;

tab_or:
     '    |'
;

comment:
    SINGLELINE_COMMENT
    | MULTILINE_COMMENT
;

number:
    INTEGER
    | FLOAT
;

bool:
    TRUE
    | FALSE
;

function_pointer:
   METHOD LPAR COLON IDENTIFIER RPAR
;

inc_dec_operator:
    INCREMENT {System.out.println("Operator: ++");}
    | DECREMENT {System.out.println("Operator: --");}
;

plus_minus_operator:
    PLUS {System.out.println("Operator: +");}
    | MINUS {System.out.println("Operator: -");}
;

assign_operator:
    ASSIGN
    | PLUS_ASSIGN
    | MINUS_ASSIGN
    | MULTIPLY_ASSIGN
    | DIVIDE_ASSIGN
    | REMAINDER_ASSIGN
;

assignment:
    name = IDENTIFIER {System.out.println("Assignment: " + $name.text);}
    assign_operator append
    | append

;

append:
    or (append_prime)*
    | equality (append_prime)*
;

append_prime:
    APPEND or {System.out.println("Operator: <<");}
    | APPEND equality {System.out.println("Operator: <<");}
;

or:
    and (or_prime)*
;

or_prime:

    OR and {System.out.println("Operator: ||");}
;

and:
    parentheses (and_prime)*
;

and_prime:
    AND parentheses {System.out.println("Operator: &&");}
;

equality:
    comparison (equality_prime)*
;

equality_prime:
    EQUAL comparison {System.out.println("Operator: ==");}
    | NOT_EQUAL comparison {System.out.println("Operator: !=");}
;

comparison:
    add_sub (comparison_prime)*
;

comparison_prime:
    LESS_THAN add_sub {System.out.println("Operator: <");}
    | LESS_EQUAL add_sub {System.out.println("Operator: <=");}
    | GREATER_THAN add_sub {System.out.println("Operator: >");}
    | GREATER_EQUAL add_sub {System.out.println("Operator: >=");}
;

add_sub:
    mul_div_mod (add_sub_prime)*
;

add_sub_prime:
    PLUS mul_div_mod {System.out.println("Operator: +");}
    | MINUS mul_div_mod {System.out.println("Operator: -");}
;

mul_div_mod:
    not_neg (mul_div_mod_prime)*
;

mul_div_mod_prime:
    MULTIPLY not_neg {System.out.println("Operator: *");}
    | DIVIDE not_neg {System.out.println("Operator: /");}
    | REMAINDER not_neg {System.out.println("Operator: %");}
;

not_neg:
    NOT inc_dec {System.out.println("Operator: !");}
    | MINUS inc_dec {System.out.println("Operator: -");}
    | inc_dec
;

inc_dec:
    bracket inc_dec_operator
    | bracket
;

bracket:
    list
    | parentheses
    | value
;

parentheses:
    LPAR append RPAR
    LPAR equality RPAR
;

value:
    number
    | STRING
    | bool
    | IDENTIFIER indexing
    | function_pointer
    | IDENTIFIER LPAR {System.out.println("Function Call");}
    (elements)? RPAR
    | match
    | len
    | chop
    | chomp
    | lambda_function
;

list:
    LBRACKET RBRACKET
    | LBRACKET elements RBRACKET
;

elements:
    append (assign_operator append | /*epsilon*/) COMMA elements
    | append (assign_operator append | /*epsilon*/)
;

indexing:
    LBRACKET assignment RBRACKET indexing
    | /*epsilon*/
;

range:
    LPAR number DOUBLE_DOT number RPAR
    | LPAR number DOUBLE_DOT IDENTIFIER RPAR
    | LPAR IDENTIFIER DOUBLE_DOT number RPAR
    | LPAR IDENTIFIER DOUBLE_DOT IDENTIFIER RPAR
;

puts:
    PUTS {System.out.println("Built-In: PUTS");}
    LPAR assignment RPAR
;

push:
    PUSH {System.out.println("Built-In: PUSH");}
    LPAR (IDENTIFIER | list | STRING) COMMA assignment RPAR
;

len:
    LEN {System.out.println("Built-In: LEN");}
    LPAR (list | IDENTIFIER | STRING) RPAR
;

chop:
    CHOP {System.out.println("Built-In: CHOP");}
    LPAR (STRING | IDENTIFIER | chop) RPAR
;

chomp:
    CHOMP {System.out.println("Built-In: CHOMP");}
    LPAR (STRING | IDENTIFIER | chomp) RPAR
;

do_loop:
    LOOP DO {System.out.println("Loop: DO");}
    (statement | if_in_loop | break_next)*
    (
    RETURN {System.out.println("RETURN");}
    elements SEMICOLON
    | RETURN {System.out.println("RETURN");}
    LPAR elements RPAR SEMICOLON
    | /*epsilon*/
    )
    END
;

for:
    FOR {System.out.println("Loop: FOR");}
    IDENTIFIER IN (IDENTIFIER | list | range)
    (statement | if_in_loop | break_next)*
    (
    RETURN {System.out.println("RETURN");}
    elements SEMICOLON
    | RETURN {System.out.println("RETURN");}
    LPAR elements RPAR SEMICOLON
    | /*epsilon*/
    )
    END
;

break_next:
    (
    NEXT {System.out.println("Control: NEXT");}
    | BREAK {System.out.println("Control: BREAK");}
    | NEXT_IF {System.out.println("Control: NEXT");}
    LPAR assignment RPAR
    | BREAK_IF {System.out.println("Control: BREAK");}
    LPAR assignment RPAR
    )
    SEMICOLON
;

if:
    IF {System.out.println("Decision: IF");}
    LPAR assignment RPAR
    (statement)*
    (
    RETURN {System.out.println("RETURN");}
    elements SEMICOLON
    | RETURN {System.out.println("RETURN");}
    LPAR elements RPAR SEMICOLON
    | /*epsilon*/
    )
    (
        ELSEIF {System.out.println("Decision: ELSE IF");}
        LPAR assignment RPAR
        (statement)*
        (
        RETURN {System.out.println("RETURN");}
        elements SEMICOLON
        | RETURN {System.out.println("RETURN");}
        LPAR elements RPAR SEMICOLON
        | /*epsilon*/
        )
    )*
    (
        ELSE {System.out.println("Decision: ELSE");}
        (statement)*
        (
        RETURN {System.out.println("RETURN");}
        elements SEMICOLON
        | RETURN {System.out.println("RETURN");}
        LPAR elements RPAR SEMICOLON
        | /*epsilon*/
        )
    )?
    END
;

if_in_loop:
    IF {System.out.println("Decision: IF");}
    LPAR assignment RPAR
    (statement | break_next)*
    (
    RETURN {System.out.println("RETURN");}
    elements SEMICOLON
    | RETURN {System.out.println("RETURN");}
    LPAR elements RPAR SEMICOLON
    | /*epsilon*/
    )
    (
        ELSEIF {System.out.println("Decision: ELSE IF");}
        LPAR assignment RPAR
        (statement | break_next)*
        (
        RETURN {System.out.println("RETURN");}
        elements SEMICOLON
        | RETURN {System.out.println("RETURN");}
        LPAR elements RPAR SEMICOLON
        | /*epsilon*/
        )
    )*
    (
        ELSE {System.out.println("Decision: ELSE");}
        (statement | break_next)*
        (
        RETURN {System.out.println("RETURN");}
        elements SEMICOLON
        | RETURN {System.out.println("RETURN");}
        LPAR elements RPAR SEMICOLON
        | /*epsilon*/
        )
    )?
    END
;

statement:
    (
        assignment
        | puts
        | push
    )
    SEMICOLON
    | comment
    | do_loop
    | if
;

pattern:
    PATTERN
    name = IDENTIFIER {System.out.println("PatternDec: " + $name.text);}
    LPAR elements RPAR
    ( '    |' LPAR assignment RPAR ASSIGN assignment)+
    SEMICOLON
;

match:
    IDENTIFIER SINGLE_DOT MATCH {System.out.println("Built-In: MATCH");}
    LPAR assignment RPAR
;

function:
    DEF
    name = IDENTIFIER {System.out.println("FuncDec: " + $name.text);}
    LPAR (elements | /*epsilon*/) RPAR
    (statement)*
    (
    RETURN {System.out.println("RETURN");}
    elements SEMICOLON
    | RETURN {System.out.println("RETURN");}
    LPAR elements RPAR SEMICOLON
    | /*epsilon*/
    )
    END
;

lambda_function:
    ARROW {System.out.println("Structure: LAMBDA");}
    LPAR elements RPAR LBRACE
    (
    RETURN {System.out.println("RETURN");}
    elements
    | RETURN {System.out.println("RETURN");}
    LPAR elements RPAR
    )
    SEMICOLON RBRACE
    (LPAR elements RPAR SEMICOLON | /*epsilon*/)
;

main:
    DEF MAIN LPAR RPAR {System.out.println("MAIN");}
    (statement)*
    END
;



LPAR: '(';
RPAR: ')';
LBRACKET: '[';
RBRACKET: ']';
LBRACE: '{';
RBRACE: '}';
DQUATE: '"';
ARROW: '->';
COLON: ':';
SEMICOLON: ';';
COMMA: ',';

DEF: 'def';
END : 'end';
MAIN: 'main';
RETURN: 'return';
IF: 'if';
ELSE : 'else';
ELSEIF : 'elseif';
TRUE : 'true';
FALSE : 'false';
CHOP : 'chop';
CHOMP  : 'chomp';
PUSH : 'push';
PUTS : 'puts';
METHOD : 'method';
LEN: 'len';
PATTERN : 'pattern';
MATCH : 'match';
NEXT_IF: 'next if';
BREAK_IF: 'break if';
NEXT: 'next';
BREAK : 'break';
LOOP : 'loop';
DO : 'do';
FOR : 'for';
IN: 'in';

PLUS: '+';
MINUS: '-';
MULTIPLY: '*';
DIVIDE: '/';
REMAINDER: '%';
DECREMENT : '--';
INCREMENT: '++';
ASSIGN: '=';
GREATER_THAN: '>';
LESS_THAN: '<';
LESS_EQUAL: '<=';
GREATER_EQUAL: '>=';
AND: '&&';
OR: '||';
NOT: '!';
SINGLE_DOT: '.';
DOUBLE_DOT: '..';

APPEND: '<<';
PLUS_ASSIGN: '+=';
MINUS_ASSIGN: '-=';
MULTIPLY_ASSIGN: '*=';
DIVIDE_ASSIGN :  '/=';
REMAINDER_ASSIGN: '%=';
EQUAL: '==';
NOT_EQUAL: '!=';

IDENTIFIER: [A-Za-z_][A-Za-z_0-9]*;
FLOAT:  ([1-9][0-9]* | '0') '.' ([0-9]+);
INTEGER: [1-9][0-9]* | '0';
STRING:   '"' ('\\' ["\\] | ~["\\\r\n])* '"';

MULTILINE_COMMENT: '=begin' .*? '=end' -> skip;
SINGLELINE_COMMENT : '#' ~[\r\n]* -> skip ;

WS: ([ \t\r\n]) -> skip;
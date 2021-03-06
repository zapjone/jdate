grammar Date ;

jdate: pname indate? format? ;

pname: 'date' ;


indate : '-d' DELIMITER specdate? opdate?  DELIMITER ;

specdate : NUMBER NUMBER NUMBER ;
opdate : (NUMBER  cycle  AGO?);

// 输入周期
cycle : MILLIS
      | SECOND
      | MINUTE
      | HOUR
      | DAY
      | WEEK
      | MONTH
      | YEAR
      ;

// 格式化
format : ADDOPER formatval (spector? formatval)* spector?  ;

spector : '-'
        | '/'
        | '_'
        | '%'
        | ':'
        | '#'
        | '^'
        | '$'
        | '~'
        | '*'
        | CHINAES
        | ENGLISH
        | UNICODE
        ;

formatval : (FORMATOPER formatinfo)+ ;
formatinfo : 'Y'
           | 'm'
           | 'd'
           | 'H'
           | 'M'
           | 'S'
           ;



NUMBER : '-'? [0-9]+ ;
MILLIS : 'millis' | 'MILLIS' ;
SECOND : 'second' | 'SECOND' ;
MINUTE : 'minute' | 'MINUTE' ;
HOUR : 'hour' | 'HOUR' ;
DAY : 'day' | 'DAY' ;
WEEK : 'week' | 'WEEK' ;
MONTH : 'month' | 'MONTH' ;
YEAR : 'year' | 'YEAR' ;

AGO : 'ago' | 'AGO' ;

DELIMITER : '\'' | '"' ;
FORMATOPER : '%' ;
ADDOPER : '+' ;
SUBOPER : '-' ;

CHINAES : [\u4e00-\u9fa5] ;
ENGLISH : [0-9a-zA-Z]+ ;
UNICODE : 'u' HEX HEX HEX HEX ;

WS  :   [\t\r\n ]+ -> skip;

fragment HEX : [0-9a-fA-F] ;


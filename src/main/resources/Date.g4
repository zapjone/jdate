grammar Date ;

jdate: pname  indate? format? ;

pname: 'date' ;


indate : '-d'  operator  opdate?  operator ;

// 操作符，日期中需要存在单引号或者双引号
operator : '\'' | '"' ;

opdate : 'yyyy-MM-dd'
       | (NUMBER  cycle  AGO?)
       ;

// 输入周期
cycle : DAY
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
        | CHINAES
        | ENGLISH
        | UNICODE
        ;

formatval : FORMATOPER (yearformat | monthformat | dayformat) ;
yearformat : 'Y' | 'y' ;
monthformat : 'M' | 'm' ;
dayformat : 'd' | 'D' ;



NUMBER : '-'? [0-9]+ ;
DAY : 'day' | 'DAY';
WEEK : 'week' | 'WEEK' ;
MONTH : 'month' | 'MONTH' ;
YEAR : 'year' | 'YEAR' ;

AGO : 'ago' | 'AGO' ;

FORMATOPER : '%' ;
ADDOPER : '+' ;
SUBOPER : '-' ;

CHINAES : [\u4e00-\u9fa5] ;
ENGLISH : [0-9a-zA-Z]+ ;
UNICODE : 'u' HEX HEX HEX HEX ;

WS  :   [\t\r\n ]+ -> skip;

fragment HEX : [0-9a-fA-F] ;


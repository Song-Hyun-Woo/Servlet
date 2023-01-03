

SELECT * FROM dba_users;
ALTER SESSION SET "_ORACLE_SCRIPT"=TURE;
CREATE USER web IDENTIFIED BY web;
DEFAULT tablespace USERS quota unlimited ON USERS;
GRANT resource, CONNECT TO web;
SELECT * FROM dba_users;


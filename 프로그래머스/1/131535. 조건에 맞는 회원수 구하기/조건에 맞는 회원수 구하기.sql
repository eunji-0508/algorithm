-- 코드를 입력하세요
SELECT COUNT(USER_ID)
FROM USER_INFO
WHERE JOINED LIKE '2021%' 
  AND AGE BETWEEN 20 AND 29;
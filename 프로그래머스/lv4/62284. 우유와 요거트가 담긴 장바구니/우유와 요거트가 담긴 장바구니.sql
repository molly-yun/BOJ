-- 코드를 입력하세요
SELECT CART_ID
FROM CART_PRODUCTS
WHERE CART_ID IN (
    SELECT CART_ID
    FROM CART_PRODUCTS
    WHERE NAME = 'Milk'
) AND NAME = 'Yogurt'
ORDER BY CART_ID
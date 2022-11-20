-- https://www.codewars.com/kata/580d08b5c049aef8f900007c
SELECT customer.customer_id, email, COUNT(payment_id) AS payments_count, SUM(CAST(amount AS FLOAT)) AS total_amount
FROM customer
JOIN payment ON customer.customer_id = payment.customer_id
GROUP BY customer.customer_id
ORDER BY total_amount DESC
LIMIT 10
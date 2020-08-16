
use BOOTCAMP;
SELECT * ,MAX(weight)
FROM ANIMALS
where weight > 100
group by species , name 
order by id asc;





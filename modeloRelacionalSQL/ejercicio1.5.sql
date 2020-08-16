use BOOTCAMP;
select name,id,species 
from ANIMALS
group by species
order by id desc;
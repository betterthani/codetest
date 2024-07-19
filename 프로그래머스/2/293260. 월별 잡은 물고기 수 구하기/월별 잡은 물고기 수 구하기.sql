select
    count(id) as FISH_COUNT
    , month(time) AS MONTH
from fish_info
    group by month(time)
    order by month(time) asc
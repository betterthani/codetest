with t1 as (
    select
        max(SIZE_OF_COLONY) as maxNum
        , year(DIFFERENTIATION_DATE) as year
    from ECOLI_DATA 
    group by year
)

select
    year(e.DIFFERENTIATION_DATE) as YEAR
    , t1.maxNum - e.SIZE_OF_COLONY as YEAR_DEV
    , e.id
from ECOLI_DATA e
join t1 on year(e.DIFFERENTIATION_DATE) = t1.year
order by YEAR, YEAR_DEV
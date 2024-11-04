-- 코드를 작성해주세요
select
    count(a.fish_type) as FISH_COUNT
    , b.fish_name as FISH_NAME
from FISH_INFO a
join FISH_NAME_INFO b
on a.FISH_TYPE = b.FISH_TYPE
group by a.fish_type, b.fish_name
order by fish_count desc
    
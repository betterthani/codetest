select
    count(*) as fish_count
from FISH_INFO a
join FISH_NAME_INFO b
on a.fish_type = b.fish_type
where b.fish_name = 'BASS' or b.fish_name = 'SNAPPER'
#    and a.length is not null
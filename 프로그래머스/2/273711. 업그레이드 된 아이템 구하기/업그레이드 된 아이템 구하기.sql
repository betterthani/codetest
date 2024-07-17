select
    tree.item_id
    , info.item_name
    , info.rarity
from item_info info
join item_tree tree
on info.item_id = tree.item_id
where tree.PARENT_ITEM_ID in (select item_id from item_info where rarity = 'rare')
order by tree.item_id desc
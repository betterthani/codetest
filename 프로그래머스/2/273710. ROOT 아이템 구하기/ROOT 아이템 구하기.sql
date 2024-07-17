select
    tree.item_id
    , info.item_name
from item_tree tree
join item_info info
on tree.item_id = info.item_id
where tree.PARENT_ITEM_ID is null
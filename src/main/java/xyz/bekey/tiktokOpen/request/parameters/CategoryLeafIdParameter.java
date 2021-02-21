package xyz.bekey.tiktokOpen.request.parameters;

import xyz.bekey.tiktokOpen.utils.AssertUtils;

import java.util.Objects;

public class CategoryLeafIdParameter {

    private Long category_leaf_id;

    public CategoryLeafIdParameter(Long cid) {
        AssertUtils.notNull(cid, "category_leaf_id can not be null!");
        this.category_leaf_id = cid;
    }

    public String getCategory_leaf_id() {
        return Objects.toString(category_leaf_id, null);
    }
}

package ivo.rakar.api.core.menu.item;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

public interface MenuItemService {
    /**
     * Sample usage: "curl $HOST:$PORT/menu-item/1".
     *
     * @param menuItemId Id of the menu item
     * @return the menu item, if found, else null
     */
    @GetMapping(
            value    = "/menu-item/{menuItemId}",
            produces = "application/json")
    MenuItem getMenuItem(@PathVariable int menuItemId);
}

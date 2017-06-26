package org.springframework.social.botframework.util;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Anton Leliuk
 */
public class CollectionUtils {

    public static <E>List<E> add(List<E> list, E element){
        if (element != null) {
            List<E> newList = new ArrayList<E>();
            if (list != null) {
                newList.addAll(list);
            }
            newList.add(element);
            return newList;
        }
        return list;
    }
}

package org.springframework.social.botframework.util;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Anton Leliuk
 */
public class CollectionUtils {

    public static <E>List<E> add(List<E> list, E element){
        if (element != null) {
            if(list == null){
                list = new ArrayList<>();
            }
            list.add(element);
        }
        return list;
    }
}

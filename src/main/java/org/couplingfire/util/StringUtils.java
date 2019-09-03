package org.couplingfire.util;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * @version 1.0.1
 * @auto jerry lee
 * @date 2019/8/31
 */
public class StringUtils {
    public static List toList(String[] inArr) {
        List<String> result ;
        if (null != inArr && inArr.length > 0) {
            result = new ArrayList(inArr.length);
            for (String str : inArr) {
                if (isNotEmpty(str)) {
                    result.add(str);
                }
            }
            return result;
        } else {
            return Collections.emptyList();
        }
    }

    public static boolean isEmpty(String inStr) {
        if (null == inStr || "".equals(inStr)) {
            return true;
        }
        return false;
    }

    public static boolean isNotEmpty(String inStr) {
        return !isEmpty(inStr);
    }
}

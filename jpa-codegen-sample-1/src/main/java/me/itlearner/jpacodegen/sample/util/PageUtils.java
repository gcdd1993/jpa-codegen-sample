package me.itlearner.jpacodegen.sample.util;

import lombok.experimental.UtilityClass;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

/**
 * @author gaochen
 * @date 2019/2/12
 */
@UtilityClass
public class PageUtils {
    private static final String[] DEFAULT_ORDER = new String[]{"id"};

    public static Pageable page(Integer page, Integer perPage, Boolean sort, String... order) {
        if (page == null) {
            page = 0;
        }
        if (perPage == null) {
            perPage = 10;
        }
        if (perPage == -1 || perPage == 0) {
            perPage = Integer.MAX_VALUE;
        }
        if (sort == null) {
            sort = true;
        }
        if (order == null || order.length == 0) {
            order = DEFAULT_ORDER;
        }
        return new PageRequest(page, perPage, sort ? Sort.Direction.ASC : Sort.Direction.DESC, order);
    }

    public static Pageable page(Integer page, Integer perPage, Sort sort) {
        if (page == null) {
            page = 0;
        }
        if (perPage == null) {
            perPage = 10;
        }
        if (perPage == -1 || perPage == 0) {
            perPage = Integer.MAX_VALUE;
        }
        return new PageRequest(page, perPage, sort);
    }

    public static Map<String, Object> pageResponse(String contentName, List<?> list,
                                                   Pageable pageable,
                                                   Long totalCount) {
        return new HashMap<String, Object>(4) {{
            put("page", pageable == null ? 0 : pageable.getPageNumber());
            put("per_page", pageable == null ? list.size() : pageable.getPageSize());
            put(contentName, list);
            put("total", totalCount == null ? list.size() : totalCount);
        }};
    }

    /**
     * 基于已有列表分页
     */
    public static <T> Map<String, Object> toPage(String contentName, List<T> list, Pageable pageable) {
        List<Object> pageResult = list.stream().skip(pageable.getOffset())
                .limit(pageable.getPageSize())
                .collect(Collectors.toList());
        return pageResponse(contentName, pageResult, pageable, (long) list.size());
    }

}

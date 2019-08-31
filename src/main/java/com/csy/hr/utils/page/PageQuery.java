package com.csy.hr.utils.page;

import com.google.common.base.Splitter;
import org.apache.commons.collections4.CollectionUtils;
import org.apache.commons.lang3.StringUtils;

import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/**
 * 分页查询条件
 */
public class PageQuery {
    private static final long serialVersionUID = 1469329917089241726L;
    private int page;//页码
    private int size;//每页大小
    private String filter;//查询条件
    private String order;//排序条件

    public PageQuery() {
    }

    public int getPage() {
        return page;
    }

    public void setPage(int page) {
        this.page = page;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public String getFilter() {
        return filter;
    }

    public void setFilter(String filter) {
        this.filter = filter;
    }

    public String getOrder() {
        return order;
    }

    public void setOrder(String order) {
        this.order = order;
    }

    /**
     * 把key1=vale1;key2=value2转为 map
     * @return
     */
    public Map<String, String> convertFilterToMap(){
        if (StringUtils.isEmpty(this.filter)) {
            return new HashMap();
        }else {
            List<String> list = Splitter.on(";").omitEmptyStrings().trimResults().splitToList(this.filter);
            if (CollectionUtils.isEmpty(list)) {
                return new HashMap();
            } else {
                Map<String, String> map = new HashMap();
                Iterator var3 = list.iterator();
                while(var3.hasNext()) {
                    String s = (String)var3.next();
                    List<String> item = Splitter.on("=").limit(2).omitEmptyStrings().trimResults().splitToList(s);
                    if (item.size() == 2) {
                        map.put(item.get(0), item.get(1));
                    }
                }
                return map;
            }
        }
    }

    /**
     * 处理排序
     * @return
     */
    public String convertSort() {
        if (StringUtils.isEmpty(this.order)) {
            return "";
        } else {
            List<String> list = Splitter.on(",").omitEmptyStrings().trimResults().splitToList(this.order);
            if (CollectionUtils.isEmpty(list)) {
                return "";
            } else {
                StringBuilder sb = new StringBuilder();
                Iterator var3 = list.iterator();
                while(var3.hasNext()) {
                    String s = (String)var3.next();
                    List<String> item = Splitter.on("=").limit(2).omitEmptyStrings().trimResults().splitToList(s);
                    if (item.size() >= 2 && item.size() <= 2) {
                        String fieldName = (String)item.get(0);
                        String sortDirection = (String)item.get(1);
                        sb.append(fieldName);
                        sb.append(" ");
                        sb.append(sortDirection);
                        sb.append(",");
                    }
                }
                if (StringUtils.isEmpty(sb.toString())) {
                    return "";
                } else {
                    return sb.toString().substring(0, sb.toString().length() - 1);
                }
            }
        }
    }
}

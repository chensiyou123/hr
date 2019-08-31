package com.csy.hr.utils.result;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.github.pagehelper.PageInfo;
import org.apache.commons.collections4.CollectionUtils;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

/**
 * 分页对象封装
 * @param <T>：分装泛型
 */
public class SimplePage<T>implements Serializable {
    private static final long serialVersionUID = -6096499032560216123L;
    private int totalPages;//总页数
    @JsonProperty("iTotalRecords")
    private long totalElements;//总记录数
    private int number;//当前页
    private int size = 20;//每页大小
    @JsonProperty("aaData")
    private List<T> content = new ArrayList();//返回列表
    private boolean hasContent = false;//是否有内容
    private boolean isFirst = true;//是否第一页
    private boolean isLast = true;//是否最后一页
    public SimplePage() {
    }

    public int getTotalPages() {
        return totalPages;
    }

    public void setTotalPages(int totalPages) {
        this.totalPages = totalPages;
    }

    public long getTotalElements() {
        return totalElements;
    }

    public void setTotalElements(long totalElements) {
        this.totalElements = totalElements;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public List<T> getContent() {
        return content;
    }

    public void setContent(List<T> content) {
        this.content = content;
    }

    public boolean isHasContent() {
        return hasContent;
    }

    public void setHasContent(boolean hasContent) {
        this.hasContent = hasContent;
    }

    public boolean isFirst() {
        return isFirst;
    }

    public void setFirst(boolean first) {
        isFirst = first;
    }

    public boolean isLast() {
        return isLast;
    }

    public void setLast(boolean last) {
        isLast = last;
    }

    //mybaties分页对象转我们系统的对象
    public SimplePage<T> convert(PageInfo<T> page) {
        SimplePage<T> simplePage = new SimplePage();
        if (page != null) {
            simplePage.setTotalPages(page.getPages());
            simplePage.setTotalElements(page.getTotal());
            simplePage.setNumber(page.getPageNum());
            simplePage.setSize(page.getSize());
            simplePage.setContent(page.getList());
            simplePage.setHasContent(CollectionUtils.isNotEmpty(page.getList()));
            simplePage.setFirst(page.isIsFirstPage());
            simplePage.setLast(page.isIsLastPage());
        }

        return simplePage;
    }
}

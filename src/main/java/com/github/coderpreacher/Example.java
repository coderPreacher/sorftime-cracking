package com.github.coderpreacher;

import com.github.coderpreacher.enums.AmazonSiteEnum;

public class Example {

    /**
     * 获取sorftime类目下关键词数据
     */
    public static void fetchSorftimeKeyWords() {
        String nodeId = "1045434";// 亚马逊类目<Pajama Sets>ID
        SorftimeApiHubs.queryKeywordBoard(AmazonSiteEnum.US.getSorftimeSiteId(), nodeId);
    }


    public static void main(String[] args) {
        fetchSorftimeKeyWords();
    }
}
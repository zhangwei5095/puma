package com.dianping.puma.checkserver.fetcher;

import java.util.Date;
import java.util.List;
import java.util.Map;

/**
 * Dozer @ 2015-09
 * mail@dozer.cc
 * http://www.dozer.cc
 */
public interface SourceFetcher extends DataFetcher {

    void setStartTime(Date time);

    void setEndTime(Date time);

    List<Map<String, Object>> fetch();

    Map<String, Object> retry(Map<String, Object> source);
}
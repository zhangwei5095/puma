package com.dianping.puma.core.service;

import com.dianping.puma.core.entity.SyncServerEntity;

import java.util.List;

public interface SyncServerService {

	SyncServerEntity find(String id);

	List<SyncServerEntity> findAll();

	void create(SyncServerEntity entity);

	void update(SyncServerEntity entity);

	void remove(String id);

	SyncServerEntity findByHost(String host, int port);
}
package com.inno.modelview.dao.impl;

import java.util.List;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

import com.inno.modelview.dao.ICoreEntityDao;
import com.inno.modelview.model.CoreEntity;

@Repository
@Component(value="OutMemory")
public class CoreEntityDao extends BaseDao<CoreEntity> implements ICoreEntityDao {
	
	public List<CoreEntity> getEnties(){
		return (List<CoreEntity>) this.getHibernateTemplate().find("FROM CoreEntity");
	}
	
	public CoreEntity getCoreEntityById(String id){
		List<CoreEntity> coreEntities = (List<CoreEntity>) this.getHibernateTemplate().find("FROM CoreEntity where id = ?",new Object[]{new Integer(id)});
		if(coreEntities.size() > 0){
			return coreEntities.get(0);
		}
		return null;
	}

	@Override
	public CoreEntity getCoreEntityByName(String name) {
		List<CoreEntity> coreEntities = (List<CoreEntity>) this.getHibernateTemplate().find("FROM CoreEntity where entityname = ?",new Object[]{new String(name)});
		if(coreEntities.size() > 0){
			return coreEntities.get(0);
		}
		return null;
	}


	public void saveCoreEntity(CoreEntity coreEntity){
		save(coreEntity);
	}
	
	public CoreEntity getParentEntity(CoreEntity coreEntity){
		List<CoreEntity> coreEntities = (List<CoreEntity>) this.getHibernateTemplate().find("FROM CoreEntity where parentEntity = ?",new Object[]{coreEntity.getParentEntity().getId()});
		if(coreEntities.size() > 0){
			return coreEntities.get(0);
		}
		return null;
	}
	
}

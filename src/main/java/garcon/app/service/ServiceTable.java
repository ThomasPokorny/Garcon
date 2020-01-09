package garcon.app.service;

import java.util.List;

import org.jooq.DSLContext;

import garcon.app.model.Table;
import garcon.datasource.DataSource;
import garcon.generated.garcon.tables.records.TableRecord;

public class ServiceTable implements StandardRestService<Table>{

	@Override
	public List<Table> getCollection() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Table getObject(int id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Table createObject(Table obj) {
		DataSource dataSource = new DataSource();
		try {
			dataSource.connect();
			DSLContext create = DataSource.getCreate(dataSource);
			
			TableRecord rec = new TableRecord();
			rec.setNum(obj.getNumber());
			
			rec.attach(create.configuration());
			rec.insert();
			
		}catch (Exception e) {
			e.printStackTrace();
			obj = null;
		}
		finally {
			dataSource.close();
		}
	
		return obj;
	}

	@Override
	public boolean updateObject(Table obj) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean deleteObject(int id) {
		// TODO Auto-generated method stub
		return false;
	}

}

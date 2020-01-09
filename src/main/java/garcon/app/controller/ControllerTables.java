package garcon.app.controller;

import java.util.List;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import garcon.app.model.Table;
import garcon.app.service.ServiceTable;

@RestController
public class ControllerTables implements StandardRestController<Table>{

	private ServiceTable tableService;
	
	public ControllerTables() {
		this.tableService = new ServiceTable();
	}
	
	@GetMapping("/tables/all")
	@ResponseBody
	public List<Table> getCollection() {
		return tableService.getCollection();
	}
	
	@PostMapping("/tables/{id}")
	@ResponseBody
	public Table getObject(@PathVariable(value = "id") int id) {
		return tableService.getObject(id);
	}
	
	@PostMapping(
			  value = "/tables/create", consumes = "application/json", produces = "application/json")
	public Table createObject(@RequestBody Table obj) {
		return tableService.createObject(obj);
	}
	
	@PutMapping(
			  value = "/tables/update", consumes = "application/json", produces = "application/json")
	public boolean updateObject(@RequestBody Table o) {
		return tableService.updateObject(o);
	}
	
	@DeleteMapping("/tables/delete/{id}")
	@ResponseBody
	public boolean deleteObject(@PathVariable(value = "id") int id) {
		return tableService.deleteObject(id);
	}
}

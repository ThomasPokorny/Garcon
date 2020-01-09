package garcon.app.service;

import java.util.List;

public interface StandardRestService<T> {
	/**
	 * NOTE: returns the complete set of this collection, for instance all Tables
	 * @return list of all elements
	 */
	List<T> getCollection();
	
	/**
	 * PRECONDITION: the given id has to exists, otherwise null is returned!
	 * @param id
	 * @return the object with the given id
	 */
	T getObject(int id);
	
	/**
	 * PRECONDITION: the object cannot be null
	 * POSTCONDITION: a new object has been saved to the database
	 * NOTE: saves the object of the type T to the database.
	 * @param obj the object to save
	 */
	T createObject(T obj);
	
	/**
	 * PRECONDITION: the object cannot be null, and the id has to exist
	 * POSTCONDITION: a object has been updated in the database
	 * NOTE: updates the object of the type T in the database
	 * @param obj the object to update
	 * @return true if the object was updated, false if it was not updated
	 */
	boolean updateObject(T obj);
	
	/**
	 * NOTE: deletes a object with given id from the database
	 * PRECONDITION: the given id has to exists, otherwise null is returned!
	 * POSTCONDITION: a object has been removed from the database
	 * @param id
	 * @return true if the object was deleted, false if it was not deleted
	 */
	boolean deleteObject(int id);
}

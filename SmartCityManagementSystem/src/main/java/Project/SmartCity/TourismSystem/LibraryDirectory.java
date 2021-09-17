/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Project.SmartCity.TourismSystem;

import java.util.ArrayList;

/**
 *
 * @author harooniqbal
 */
public class LibraryDirectory {
    public ArrayList<Library> libraryList;

    public LibraryDirectory() {
        libraryList = new ArrayList();
    }

    public ArrayList<Library> getLibraryList() {
        return libraryList;
    }
    public void removeLibrary(Library library){
        libraryList.remove(library);
    }
    
    public Library getLibrary(String name){
        for(Library dm : libraryList){
            if(dm.getName().equals(name))
                return dm;
        }
        return null;
    }
    
    public Library getLibrary(int id){
        for(Library dm : libraryList){
            if(dm.getId() == id)
                return dm;
        }
        return null;
    }
    
    public Library createLibrary(String name, String[] location, String username, String[] bookList){
        Library library = new Library();
        library.setName(name);
        library.setLocation(location);
        library.setUsername(username);
        library.setBookList(bookList);
        library.setId(libraryList.size()+1);
        libraryList.add(library);
        return library;
    }
}

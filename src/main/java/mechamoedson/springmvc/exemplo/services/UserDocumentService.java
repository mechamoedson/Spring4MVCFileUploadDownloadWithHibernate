package mechamoedson.springmvc.exemplo.services;

import java.util.List;

import mechamoedson.springmvc.exemplo.model.UserDocument;

public interface UserDocumentService {
	 
    UserDocument findById(int id);
 
    List<UserDocument> findAll();
     
    List<UserDocument> findAllByUserId(int id);
     
    void saveDocument(UserDocument document);
     
    void deleteById(int id);
}

package mechamoedson.springmvc.exemplo.util;

import org.springframework.stereotype.Component;
import org.springframework.validation.Errors;
import org.springframework.validation.Validator;

import mechamoedson.springmvc.exemplo.model.FileBucket;
 
@Component
public class FileValidator implements Validator {
         
    public boolean supports(Class<?> clazz) {
        return FileBucket.class.isAssignableFrom(clazz);
    }
 
    public void validate(Object obj, Errors errors) {
        FileBucket file = (FileBucket) obj;
             
        if(file.getFile()!=null && file.getFile().getSize() == 0) {
            errors.rejectValue("file", "missing.file");
        }
    }
}
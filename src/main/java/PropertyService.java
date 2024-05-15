import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PropertyService {
    @Autowired
    private PropertyRepo propertyRepo;

    public Property createProperty(Property property){
        return (Property) propertyRepo.save(property);
    }
    public List<Property> findproperty(){
        return propertyRepo.findAll();
    }
    public void deleteproperty(Long id){
         propertyRepo.deleteById(id);
    }
}

package v8_registry_of_singletons;

import java.util.HashMap;
import java.util.Map;

public class RegistryPachete {
	  private RegistryPachete(){} 
	  static Map<String, PachetTuristic> collection=new HashMap<>();
      
	  public static void register(String name, PachetTuristic value) throws Exception 
      {
          if ( collection.containsKey(name)) 
              throw new Exception("Key '" + name + "' already registered"); 
          else 
              collection.put(name, value); 
      }
      public static PachetTuristic getPachet(String name) 
      {
          return collection.get(name); 
      }
}

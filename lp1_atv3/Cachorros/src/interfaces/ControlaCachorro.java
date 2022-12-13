package interfaces;


import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;

public class ControlaCachorro{
    
    private ArrayList<Cachorro> cachorro = new ArrayList<>();
    
    public boolean salvar(Cachorro cc){
        if (cc != null ){
            cachorro.add(cc);
            return true;
        }else{
            return false;  
        }
    }
    public ArrayList<Cachorro> retornaTodos (){
        return cachorro;
    }
    
    
    private HashSet<String> cachorro1 = new HashSet<>();
    private Map<String,String> nome = new HashMap<>();
    private Map<String,String> raca = new HashMap<>();
    private Map<String,String> sexo = new HashMap<>();
    private Map<String,String> cor = new HashMap<>();
    private Map<String,Integer> idade = new HashMap<>();
    
    public boolean Map(Cachorro c){
        
        if (c != null){
            nome.put("Nome", c.getNome());
            raca.put("Raca", c.getRaca());
            sexo.put("Sexo", c.getSexo());
            idade.put("Idade", c.getIdade());
            cor.put("Cor", c.getCor());
            
                
            return true;
        } else{
            return false;
        }
    }
    
    public Map<String,String> retornaNome(){
        return nome;
    }
    
    public Map<String,String> retornaRaca(){
        return raca;
    }
    
    public Map<String,String> retornaSexo(){
        return sexo;
    }
    
    public Map<String,Integer> retornaIdade(){
        return idade;
    }

    public Map<String,String> retornaCor(){
        return cor;
    }
    

    
    public HashSet<String> retornaHashSet(){
        return cachorro1;
    }
    
    public boolean salvarHash(Cachorro c){
        
        if (c != null){
            cachorro1.add(c.getNome());
            return true;
            
        } else{
            return false;
        }
    }
    
    public ArrayList<Cachorro> retornaCachorro(){
        return cachorro;
        
    }
    
}

    
    


    
    
    
   

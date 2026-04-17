package se.fk.rimfrost.ersattningdata;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

public class ErsattningData
{
   private ErsattningsTyp ersattningstyp;
   private int omfattningProcent;
   private int belopp;
   private int berakningsgrund;
   private Beslutsutfall beslutsutfall;

   public ErsattningData()
   {
   }

   public ErsattningData(ErsattningsTyp ersattningstyp, int omfattningProcent, int belopp,
         int berakningsgrund, Beslutsutfall beslutsutfall)
   {
      this.ersattningstyp = ersattningstyp;
      this.omfattningProcent = omfattningProcent;
      this.belopp = belopp;
      this.berakningsgrund = berakningsgrund;
      this.beslutsutfall = beslutsutfall;
   }

   // Getters and setters
   public ErsattningsTyp getErsattningstyp()
   {
      return ersattningstyp;
   }

   public void setErsattningstyp(ErsattningsTyp ersattningstyp)
   {
      this.ersattningstyp = ersattningstyp;
   }

   public int getOmfattningProcent()
   {
      return omfattningProcent;
   }

   public void setOmfattningProcent(int omfattningProcent)
   {
      this.omfattningProcent = omfattningProcent;
   }

   public int getBelopp()
   {
      return belopp;
   }

   public void setBelopp(int belopp)
   {
      this.belopp = belopp;
   }

   public int getBerakningsgrund()
   {
      return berakningsgrund;
   }

   public void setBerakningsgrund(int berakningsgrund)
   {
      this.berakningsgrund = berakningsgrund;
   }

   public Beslutsutfall getBeslutsutfall()
   {
      return beslutsutfall;
   }

   public void setBeslutsutfall(Beslutsutfall beslutsutfall)
   {
      this.beslutsutfall = beslutsutfall;
   }

   @Override
   public String toString()
   {
      return "ErsattningData{" +
            "ersattningstyp='" + ersattningstyp + '\'' +
            ", omfattningProcent=" + omfattningProcent +
            ", belopp=" + belopp +
            ", berakningsgrund=" + berakningsgrund +
            ", beslutsutfall=" + beslutsutfall +
            '}';
   }

   public static ErsattningData fromJson(String json, ObjectMapper mapper)
   {
      try
      {
         return mapper.readValue(json, ErsattningData.class);
      }
      catch (JsonProcessingException e)
      {
         throw new RuntimeException("Failed to deserialize JSON", e);
      }
   }
}

package se.fk.rimfrost.ersattningdata;

import java.time.LocalDate;
import java.util.UUID;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

public class ErsattningData
{
   private UUID id;
   private int version;
   private ErsattningsTyp ersattningstyp;
   private int omfattningProcent;
   private int belopp;
   private int berakningsgrund;
   private Beslutsutfall beslutsutfall;
   private LocalDate from;
   private LocalDate tom;
   private String avslagsanledning;

   public ErsattningData()
   {
   }

   public ErsattningData(UUID id, int version, ErsattningsTyp ersattningstyp, int omfattningProcent, int belopp,
         int berakningsgrund, Beslutsutfall beslutsutfall, LocalDate from, LocalDate tom,
         String avslagsanledning)
   {
      this.id = id;
      this.version = version;
      this.ersattningstyp = ersattningstyp;
      this.omfattningProcent = omfattningProcent;
      this.belopp = belopp;
      this.berakningsgrund = berakningsgrund;
      this.beslutsutfall = beslutsutfall;
      this.from = from;
      this.tom = tom;
      this.avslagsanledning = avslagsanledning;
   }

   // Getters and setters
   public UUID getId()
   {
      return id;
   }

   public void setId(UUID id)
   {
      this.id = id;
   }

   public int getVersion()
   {
      return version;
   }

   public void setVersion(int version)
   {
      this.version = version;
   }

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

   public LocalDate getFrom()
   {
      return from;
   }

   public void setFrom(LocalDate from)
   {
      this.from = from;
   }

   public LocalDate getTom()
   {
      return tom;
   }

   public void setTom(LocalDate tom)
   {
      this.tom = tom;
   }

   public String getAvslagsanledning()
   {
      return avslagsanledning;
   }

   public void setAvslagsanledning(String avslagsanledning)
   {
      this.avslagsanledning = avslagsanledning;
   }

   @Override
   public String toString()
   {
      return "ErsattningData{" +
            "id=" + id +
            ", version=" + version +
            ", ersattningstyp='" + ersattningstyp + '\'' +
            ", omfattningProcent=" + omfattningProcent +
            ", belopp=" + belopp +
            ", berakningsgrund=" + berakningsgrund +
            ", beslutsutfall=" + beslutsutfall +
            ", from=" + from +
            ", tom=" + tom +
            ", avslagsanledning='" + avslagsanledning + '\'' +
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

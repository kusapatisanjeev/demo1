/*
 * package practice;
 * 
 * import javax.persistence.Entity; import javax.persistence.GeneratedValue;
 * import javax.persistence.GenerationType; import javax.persistence.Id; import
 * javax.persistence.ManyToOne;
 * 
 * @Entity public class State {
 * 
 * @Id
 * 
 * @GeneratedValue(strategy=GenerationType.AUTO) private Integer stateId;
 * private String name;
 * 
 * @ManyToOne private Integer countryId; public Integer getStateId() { return
 * stateId; } public void setStateId(Integer stateId) { this.stateId = stateId;
 * } public String getName() { return name; } public void setName(String name) {
 * this.name = name; } public Integer getCountryId() { return countryId; }
 * public void setCountryId(Integer countryId) { this.countryId = countryId; } }
 */
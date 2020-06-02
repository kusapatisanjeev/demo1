/*
 * package practice;
 * 
 * import javax.persistence.Entity; import javax.persistence.GeneratedValue;
 * import javax.persistence.GenerationType; import javax.persistence.Id; import
 * javax.persistence.ManyToOne;
 * 
 * @Entity public class City {
 * 
 * @Id
 * 
 * @GeneratedValue(strategy=GenerationType.AUTO) private Integer cityId; private
 * String name;
 * 
 * @ManyToOne private Integer stateId; public Integer getCityId() { return
 * cityId; } public void setCityId(Integer cityId) { this.cityId = cityId; }
 * public String getName() { return name; } public void setName(String name) {
 * this.name = name; } public Integer getStateId() { return stateId; } public
 * void setStateId(Integer stateId) { this.stateId = stateId; }
 * 
 * }
 */
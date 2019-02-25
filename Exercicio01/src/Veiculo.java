import javax.persistence.SequenceGenerator;

@Entity
@Table(name="T_VEICULO")
@SequenceGenerator(name="veiculo",sequenceName="SQ_T_VEICULO",allocationSize=1)
public class Veiculo {

}

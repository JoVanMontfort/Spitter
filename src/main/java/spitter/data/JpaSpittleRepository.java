package spitter.data;

//@Repository
//@Transactional
//public class JpaSpittleRepository implements SpittleRepository {
//	@PersistenceUnit
//	private EntityManagerFactory emf;
//
//	public void addSpitter(Spittle spittle) {
//		emf.createEntityManager().persist(spittle);
//	}
//
//	public Spittle getSpitterById(long id) {
//		return emf.createEntityManager().find(Spittle.class, id);
//	}
//
//	public void saveSpitter(Spittle spittle) {
//		emf.createEntityManager().merge(spittle);
//	}
//
//	@Override
//	public List<Spittle> findSpittles(long max, int count) {
//		return emf.createEntityManager().createQuery("SELECT s FROM Spittle s").getResultList();
//	}
//}
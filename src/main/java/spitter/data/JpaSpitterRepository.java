package spitter.data;

//@Repository
//@Transactional
//public class JpaSpitterRepository implements SpitterRepository {
//	@PersistenceContext
//	private EntityManager em;
//
//	public void addSpitter(Spitter spitter) {
//		em.persist(spitter);
//	}
//
//	public Spitter getSpitterById(long id) {
//		return em.find(Spitter.class, id);
//	}
//
//	@Override
//	public Spitter save(Spitter spitter) {
//		return em.merge(spitter);
//	}
//
//	@Override
//	public Spitter findByUsername(String username) {
//		return em.find(Spitter.class, username);
//	}
//
//}
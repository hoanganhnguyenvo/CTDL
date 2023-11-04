package Lab7;

import java.util.Collection;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.function.Predicate;

public class MyPredicates {

	// Remove every object, obj, from coll for which p.test(obj)
	// is true. (This does the same thing as coll.removeIf(p).)
	public static <T> void remove(Collection<T> coll, Predicate<T> p) {
		coll.removeIf(p);
	}

	// Remove every object, obj, from coll for which pr.test(obj) is false.
	// (That is, retain the objects for which the predicate is true.)
	public static <T> void retain(Collection<T> coll, Predicate<T> p) {
		coll.removeIf(p.negate());
	}

	// Return a Set that contains all unique objects, obj, from the collection,
	// coll,
	// such that p.test(obj) is true.
	public static <T> Set<T> collect(Collection<T> coll, Predicate<T> p) {
		Set<T> set = new HashSet<>();
		for (T t : coll) {
			if (p.test(t)) {
				set.add(t);
			}
		}
		return set;
	}

	// Return the index of the first item in list for which the predicate is true,
	// if any.
	// If there is no such item, return -1.
	public static <T> int find(List<T> list, Predicate<T> p) {
		for (int i = 0; i < list.size(); i++) {
			if (p.test(list.get(i))) {
				return i;
			}
		}
		return -1;
	}

}

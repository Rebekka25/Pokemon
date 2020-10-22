package de.pokemon.service;

import javax.jws.WebParam;

import de.pokemon.entity.User;
public interface PokemonService {
	/**
	 * Liest alle Kundenobjekte mit einem bestimmten Namen {@code name} auf einer bestimmten Seite {@code page} mit
	 * bestimmter GrÃ¶ÃŸe {@code pageSize} , sortiert nach dem in {@link SortContainer} {@code sort} definierten Kriterien
	 * und gibt diese in Form einer Seite zurÃ¼ck.
	 *
	 *
	 * @param name
	 *            - Nachname zu dem Kunden gesucht werden sollen.
	 * @param seite
	 *            Anzufordernde Seite
	 * @param seitenGroesse
	 *            Jeweilige SeitengrÃ¶sse
	 * @param sortierung
	 *            Sortierkriterien
	 * @return PagedList<Kunde> mit den zu den eingegebenen Kriterien passende Seite mit Kundenobjekten.
	 */
	/*@WebResult(name = "liste")
	KundePage sucheKundenZuNamenUndSeitenParameter(@WebParam(name = "name") String name, @WebParam(name = "page") int seite,
			@WebParam(name = "pageSize") int seitenGroesse, @WebParam(name = "sortContainer") Sort sortierung)
					throws RemoteBusinessException, RemoteTechnicalException;

*/
	void saveUser(@WebParam(name="user") User user);
}

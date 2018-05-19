/*
* INRECOADALT
*
* Creado el día: 15-05-2018
*/

package in.store;

import java.sql.PreparedStatement;
import java.sql.ResultSet;

import base.ejb.BaseStore;

/*
 * Autor: Convertidor de procedimientos by Vaikthor.
 */

public class INRECOADALT extends BaseStore {
	private INRECOADALTpar par;
	private ResultSet resultSet;

	public INRECOADALT() {
		super();
		par = new INRECOADALTpar();
	}

	public INRECOADALTpar getParametros() {
		return par;
	}

	public void setParametros(INRECOADALTpar par) {
		this.par = par;
		super.parametros = par;
	}

	public int ejecutaStoreConvertido() throws Exception {
		int Status = 0;
		String sqlStr = new String();
		PreparedStatement prepSta = null;

		try {
			borraTablasTemporales();
			return 0;
		} catch(Exception e) {
			sqlStr = "rollback";
			prepSta = getParametros().getConn().prepareStatement(sqlStr, ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_READ_ONLY);
			prepSta.execute();
			borraTablasTemporales();
			agregaResultadoError(e, getParametros());
			if (prepSta != null) {
				prepSta.close();
			}
			if (resultSet != null) {
				resultSet.close();
			}
			return 1;
		}
	}
}

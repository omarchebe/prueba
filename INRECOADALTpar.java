/*
* INRECOADALT
*
* Creado el día: 15-05-2018
*/

package in.store;

import general.dao.TablasDAO;

import java.sql.Connection;

import base.ejb.BaseParametrosStore;

/*
 * Autor: Convertidor de procedimientos by Vaikthor.
 */

public class INRECOADALTpar extends BaseParametrosStore {
	private String Rca_TipPer;
	private String Rca_Moneda;
	private String Rca_ClaInv;
	private String Rca_InReCa;
	private java.util.Date Rca_FecAct;

	public INRECOADALTpar() {
		super();
	}

	public void setParValues(Connection conn,
							TablasDAO tablas,
							int nestLevel,
							String nomResult,
							int numResult,
							String Rca_TipPer,
							String Rca_Moneda,
							String Rca_ClaInv,
							String Rca_InReCa,
							java.util.Date Rca_FecAct,
							String NumTransac,
							String Transaccio,
							String Usuario,
							java.util.Date FechaSis,
							String SucOrigen,
							String SucDestino,
							String Modulo) {

		setConn(conn);
		setTablas(tablas);
		setNestLevel(nestLevel);
		setNomResult(nomResult);
		setNumResult(numResult);
		setRca_TipPer(Rca_TipPer);
		setRca_Moneda(Rca_Moneda);
		setRca_ClaInv(Rca_ClaInv);
		setRca_InReCa(Rca_InReCa);
		setRca_FecAct(Rca_FecAct);
		setNumTransac(NumTransac);
		setTransaccio(Transaccio);
		setUsuario(Usuario);
		setFechaSis(FechaSis);
		setSucOrigen(SucOrigen);
		setSucDestino(SucDestino);
		setModulo(Modulo);
	}

	public String getPar_05() {
		return Rca_TipPer;
	}
	public void setPar_05(String value) {
		Rca_TipPer = value;
	}
	public String getRca_TipPer() {
		return Rca_TipPer;
	}
	public void setRca_TipPer(String value) {
		Rca_TipPer = value;
	}
	public String getPar_06() {
		return Rca_Moneda;
	}
	public void setPar_06(String value) {
		Rca_Moneda = value;
	}
	public String getRca_Moneda() {
		return Rca_Moneda;
	}
	public void setRca_Moneda(String value) {
		Rca_Moneda = value;
	}
	public String getPar_07() {
		return Rca_ClaInv;
	}
	public void setPar_07(String value) {
		Rca_ClaInv = value;
	}
	public String getRca_ClaInv() {
		return Rca_ClaInv;
	}
	public void setRca_ClaInv(String value) {
		Rca_ClaInv = value;
	}
	public String getPar_08() {
		return Rca_InReCa;
	}
	public void setPar_08(String value) {
		Rca_InReCa = value;
	}
	public String getRca_InReCa() {
		return Rca_InReCa;
	}
	public void setRca_InReCa(String value) {
		Rca_InReCa = value;
	}
	public java.util.Date getPar_09() {
		return Rca_FecAct;
	}
	public void setPar_09(java.util.Date value) {
		Rca_FecAct = value;
	}
	public java.util.Date getRca_FecAct() {
		return Rca_FecAct;
	}
	public void setRca_FecAct(java.util.Date value) {
		Rca_FecAct = value;
	}
	public String getPar_10() {
		return getNumTransac();
	}	public String getPar_11() {
		return getTransaccio();
	}	public String getPar_12() {
		return getUsuario();
	}	public java.util.Date getPar_13() {
		return getFechaSis();
	}	public String getPar_14() {
		return getSucOrigen();
	}	public String getPar_15() {
		return getSucDestino();
	}	public String getPar_16() {
		return getModulo();
	}
}
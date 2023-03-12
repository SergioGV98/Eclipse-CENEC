package clases;

import java.util.Arrays;

import enums.EstadoMaterial;
import enums.Resoluciones;
import enums.TipoCable;

public class Monitor extends Hardware {

	private float pulgadas;
	private Resoluciones resolucionMaxima;
	private TipoCable[] entradasVideo;

	public Monitor(String modelo, String marca, byte añosGarantia, EstadoMaterial estado, boolean reestreno,
			float pulgadas, Resoluciones resolucionMaxima, TipoCable[] entradasVideo) {
		super(modelo, marca, añosGarantia, estado, reestreno);
		this.pulgadas = pulgadas;
		this.resolucionMaxima = resolucionMaxima;
		this.setEntradasVideo(entradasVideo);
	}

	public float getPulgadas() {
		return pulgadas;
	}

	public void setPulgadas(float pulgadas) {
		this.pulgadas = pulgadas;
	}

	public Resoluciones getResolucionMaxima() {
		return resolucionMaxima;
	}

	public void setResolucionMaxima(Resoluciones resolucionMaxima) {
		this.resolucionMaxima = resolucionMaxima;
	}

	public TipoCable[] getEntradasVideo() {
		return entradasVideo;
	}

	public void setEntradasVideo(TipoCable[] entradasVideo) {
	   for(byte i = 0; i < entradasVideo.length; i++) {
		   if(entradasVideo[i] != TipoCable.HDMI && entradasVideo[i] != TipoCable.DVI && entradasVideo[i] != TipoCable.VGA) {
			   System.out.println("Tipo de cable no valido para un monitor");
			   this.entradasVideo = null;
		   } else {
			   this.entradasVideo = entradasVideo;
		   }
	   }
	}

	@Override
	public String toString() {
		return super.toString() + "Monitor [pulgadas=" + pulgadas + ", resolucionMaxima=" + resolucionMaxima
				+ ", entradasVideo=" + Arrays.toString(entradasVideo) + "]";
	}

}

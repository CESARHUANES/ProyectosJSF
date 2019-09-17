/**
 * 
 */
package com.cardif.satelite.soat.rpp.service.impl;

import static com.cardif.satelite.constantes.ErrorConstants.COD_ERROR_BD_INSERTAR;
import static com.cardif.satelite.constantes.ErrorConstants.COD_ERROR_BD_OBTENER;

import java.util.List;

import org.apache.commons.beanutils.BeanUtils;
import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cardif.framework.excepcion.SyncconException;
import com.cardif.satelite.callcenter.bean.ConsultaRegVehicular;
import com.cardif.satelite.constantes.ErrorConstants;
import com.cardif.satelite.soat.model.VehiculoPe;
import com.cardif.satelite.soat.rpp.dao.VehiculoPeRppMapper;
import com.cardif.satelite.soat.rpp.service.VehiculoPeServiceRpp;

@Service("vehiculoPeServiceRpp")
public class VehiculoPeServiceRppImpl implements VehiculoPeServiceRpp {

  public static final Logger log = Logger.getLogger(VehiculoPeServiceRppImpl.class);

  @Autowired
  private VehiculoPeRppMapper vehiculoPeRppMapper;

  @Override
  public List<ConsultaRegVehicular> buscarPlaca(String placa) throws SyncconException {
    log.info("Inicio");
    List<ConsultaRegVehicular> lista = null;
    int size = 0;

    try {
      if (log.isDebugEnabled())
        log.debug("Input [" + placa + "]");
      lista = vehiculoPeRppMapper.selectVehicular(placa);
      size = (lista != null) ? lista.size() : 0;
      if (log.isDebugEnabled())
        log.debug("Output [Registros = " + size + "]");
      if (log.isDebugEnabled())
        log.debug("Output [" + BeanUtils.describe(lista) + "]");
    } catch (Exception e) {
      log.error(e.getMessage(), e);
      throw new SyncconException(ErrorConstants.COD_ERROR_BD_OBTENER);
    }

    log.info("Final");
    return lista;
  }

  @Override
  public int insertarVehiculo(VehiculoPe vehiculoPe) throws SyncconException {
    log.info("[ Inicio ]");
    int numRowsAfected = 0;
    try {
      if (log.isDebugEnabled())
        log.debug("Input [ " + BeanUtils.describe(vehiculoPe).toString() + " ]");
      numRowsAfected = vehiculoPeRppMapper.insert(vehiculoPe);
      if (log.isDebugEnabled())
        log.debug("[ Output [ " + numRowsAfected + "] ]");
    } catch (Exception e) {
      log.error(e.getMessage(), e);
      throw new SyncconException(COD_ERROR_BD_INSERTAR);
    }
    log.info("[ Fin ]");
    return numRowsAfected;
  }

  @Override
  public VehiculoPe findVehiculo(VehiculoPe vehiculoPe) throws SyncconException {
    log.info("[ Inicio ]");
    VehiculoPe vehiculoPe2 = null;

    try {
      if (log.isDebugEnabled())
        log.debug("Input [ " + BeanUtils.describe(vehiculoPe).toString() + " ]");
      vehiculoPe2 = vehiculoPeRppMapper.selectVehiculoByPlaca(vehiculoPe.getPlaca());
      if (log.isDebugEnabled())
        log.debug("[ Output [ " + BeanUtils.describe(vehiculoPe2) + "] ]");
    } catch (Exception e) {
      log.error(e.getMessage(), e);
      throw new SyncconException(COD_ERROR_BD_OBTENER);
    }
    log.info("[ Fin ]");
    return vehiculoPe2;
  }

  @Override
  public int actualizar(VehiculoPe vehiculoPe) throws SyncconException {
    log.info("[ Inicio ]");
    int numRowsAffected = 0;

    try {
      if (log.isDebugEnabled())
        log.debug("Input [ " + BeanUtils.describe(vehiculoPe).toString() + " ]");
      numRowsAffected = vehiculoPeRppMapper.updateByPrimaryKey(vehiculoPe);
      if (log.isDebugEnabled())
        log.debug("[ Output [ " + numRowsAffected + "] ]");
    } catch (Exception e) {
      log.error(e.getMessage(), e);
      throw new SyncconException(COD_ERROR_BD_OBTENER);
    }
    log.info("[ Fin ]");
    return numRowsAffected;
  }

}
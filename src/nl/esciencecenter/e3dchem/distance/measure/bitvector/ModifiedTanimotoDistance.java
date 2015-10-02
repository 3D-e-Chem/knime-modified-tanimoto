package nl.esciencecenter.e3dchem.distance.measure.bitvector;

import org.knime.core.data.DataRow;
import org.knime.core.data.DataTableSpec;
import org.knime.core.node.InvalidSettingsException;
import org.knime.distance.DistanceMeasurementException;
import org.knime.distance.SingleColumnDistanceMeasure;


public final class ModifiedTanimotoDistance extends SingleColumnDistanceMeasure<ModifiedTanimotoDistanceConfig>{

	public ModifiedTanimotoDistance(ModifiedTanimotoDistanceConfig config,
			DataTableSpec spec) throws InvalidSettingsException {
		super(config, spec);
		// TODO Auto-generated constructor stub
	}

	@Override
	public double computeDistance(DataRow row1, DataRow row2)
			throws DistanceMeasurementException {
		// TODO Auto-generated method stub
		return 0;
	}
}

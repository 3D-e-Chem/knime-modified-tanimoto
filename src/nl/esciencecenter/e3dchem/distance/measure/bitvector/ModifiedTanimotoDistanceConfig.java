package nl.esciencecenter.e3dchem.distance.measure.bitvector;

import org.knime.base.util.flowvariable.FlowVariableProvider;
import org.knime.core.data.DataTableSpec;
import org.knime.core.node.InvalidSettingsException;
import org.knime.distance.category.DistanceCategoryConfig;


final class ModifiedTanimotoDistanceConfig extends DistanceCategoryConfig<ModifiedTanimotoDistance> {

	@Override
	protected DistanceCategoryConfig<?> clone(String... columns)
			throws InvalidSettingsException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String getFactoryId() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public ModifiedTanimotoDistance createDistanceMeasure(DataTableSpec spec,
			FlowVariableProvider flowVariableProvider)
			throws InvalidSettingsException {
		// TODO Auto-generated method stub
		return null;
	}

}

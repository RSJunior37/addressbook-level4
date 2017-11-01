package seedu.address.commons.events.ui;

import seedu.address.commons.events.BaseEvent;
import seedu.address.model.insurance.ReadOnlyInsurance;
import seedu.address.ui.InsuranceProfile;

/**
 * Represents a selection change in the Person List Panel
 */
public class InsurancePanelSelectionChangedEvent extends BaseEvent {

    private final ReadOnlyInsurance insurance;

    public InsurancePanelSelectionChangedEvent(InsuranceProfile newSelection) {
        insurance = newSelection.getInsurance();
    }

    public InsurancePanelSelectionChangedEvent(ReadOnlyInsurance insurance) {
        this.insurance = insurance;
    }

    @Override
    public String toString() {
        return this.getClass().getSimpleName();
    }

    public ReadOnlyInsurance getInsurance() {
        return insurance;
    }
}

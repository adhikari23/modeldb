// THIS FILE IS AUTO-GENERATED. DO NOT EDIT
package ai.verta.modeldb.versioning.autogenerated._public.modeldb.versioning.model;

import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

import ai.verta.modeldb.ModelDBException;
import ai.verta.modeldb.versioning.*;
import ai.verta.modeldb.versioning.blob.diff.Function3;
import ai.verta.modeldb.versioning.blob.diff.*;
import ai.verta.modeldb.versioning.blob.visitors.Visitor;

public class ContinuousHyperparameterSetConfigBlob implements ProtoType {
    public HyperparameterValuesConfigBlob IntervalBegin;
    public HyperparameterValuesConfigBlob IntervalEnd;
    public HyperparameterValuesConfigBlob IntervalStep;

    public ContinuousHyperparameterSetConfigBlob() {
        this.IntervalBegin = null;
        this.IntervalEnd = null;
        this.IntervalStep = null;
    }

    public Boolean isEmpty() {
        if (this.IntervalBegin != null) {
            return false;
        }
        if (this.IntervalEnd != null) {
            return false;
        }
        if (this.IntervalStep != null) {
            return false;
        }
        return true;
    }

    // TODO: not consider order on lists
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null) return false;
        if (!(o instanceof ContinuousHyperparameterSetConfigBlob)) return false;
        ContinuousHyperparameterSetConfigBlob other = (ContinuousHyperparameterSetConfigBlob) o;

        {
            Function3<HyperparameterValuesConfigBlob,HyperparameterValuesConfigBlob,Boolean> f = (x, y) -> x.equals(y);
            if (this.IntervalBegin != null || other.IntervalBegin != null) {
                if (this.IntervalBegin == null && other.IntervalBegin != null)
                    return false;
                if (this.IntervalBegin != null && other.IntervalBegin == null)
                    return false;
                if (!f.apply(this.IntervalBegin, other.IntervalBegin))
                    return false;
            }
        }
        {
            Function3<HyperparameterValuesConfigBlob,HyperparameterValuesConfigBlob,Boolean> f = (x, y) -> x.equals(y);
            if (this.IntervalEnd != null || other.IntervalEnd != null) {
                if (this.IntervalEnd == null && other.IntervalEnd != null)
                    return false;
                if (this.IntervalEnd != null && other.IntervalEnd == null)
                    return false;
                if (!f.apply(this.IntervalEnd, other.IntervalEnd))
                    return false;
            }
        }
        {
            Function3<HyperparameterValuesConfigBlob,HyperparameterValuesConfigBlob,Boolean> f = (x, y) -> x.equals(y);
            if (this.IntervalStep != null || other.IntervalStep != null) {
                if (this.IntervalStep == null && other.IntervalStep != null)
                    return false;
                if (this.IntervalStep != null && other.IntervalStep == null)
                    return false;
                if (!f.apply(this.IntervalStep, other.IntervalStep))
                    return false;
            }
        }
        return true;
    }

    public ContinuousHyperparameterSetConfigBlob setIntervalBegin(HyperparameterValuesConfigBlob value) {
        this.IntervalBegin = value;
        return this;
    }
    public ContinuousHyperparameterSetConfigBlob setIntervalEnd(HyperparameterValuesConfigBlob value) {
        this.IntervalEnd = value;
        return this;
    }
    public ContinuousHyperparameterSetConfigBlob setIntervalStep(HyperparameterValuesConfigBlob value) {
        this.IntervalStep = value;
        return this;
    }

    static public ContinuousHyperparameterSetConfigBlob fromProto(ai.verta.modeldb.versioning.ContinuousHyperparameterSetConfigBlob blob) {
        if (blob == null) {
            return null;
        }

        ContinuousHyperparameterSetConfigBlob obj = new ContinuousHyperparameterSetConfigBlob();
        {
            Function<ai.verta.modeldb.versioning.ContinuousHyperparameterSetConfigBlob,HyperparameterValuesConfigBlob> f = x -> HyperparameterValuesConfigBlob.fromProto(blob.getIntervalBegin());
            obj.IntervalBegin = Utils.removeEmpty(f.apply(blob));
        }
        {
            Function<ai.verta.modeldb.versioning.ContinuousHyperparameterSetConfigBlob,HyperparameterValuesConfigBlob> f = x -> HyperparameterValuesConfigBlob.fromProto(blob.getIntervalEnd());
            obj.IntervalEnd = Utils.removeEmpty(f.apply(blob));
        }
        {
            Function<ai.verta.modeldb.versioning.ContinuousHyperparameterSetConfigBlob,HyperparameterValuesConfigBlob> f = x -> HyperparameterValuesConfigBlob.fromProto(blob.getIntervalStep());
            obj.IntervalStep = Utils.removeEmpty(f.apply(blob));
        }
        return obj;
    }

    public ai.verta.modeldb.versioning.ContinuousHyperparameterSetConfigBlob.Builder toProto() {
        ai.verta.modeldb.versioning.ContinuousHyperparameterSetConfigBlob.Builder builder = ai.verta.modeldb.versioning.ContinuousHyperparameterSetConfigBlob.newBuilder();
        {
            if (this.IntervalBegin != null) {
                Function<ai.verta.modeldb.versioning.ContinuousHyperparameterSetConfigBlob.Builder,Void> f = x -> { builder.setIntervalBegin(this.IntervalBegin.toProto()); return null; };
                f.apply(builder);
            }
        }
        {
            if (this.IntervalEnd != null) {
                Function<ai.verta.modeldb.versioning.ContinuousHyperparameterSetConfigBlob.Builder,Void> f = x -> { builder.setIntervalEnd(this.IntervalEnd.toProto()); return null; };
                f.apply(builder);
            }
        }
        {
            if (this.IntervalStep != null) {
                Function<ai.verta.modeldb.versioning.ContinuousHyperparameterSetConfigBlob.Builder,Void> f = x -> { builder.setIntervalStep(this.IntervalStep.toProto()); return null; };
                f.apply(builder);
            }
        }
        return builder;
    }

    public void preVisitShallow(Visitor visitor) throws ModelDBException {
        visitor.preVisitContinuousHyperparameterSetConfigBlob(this);
    }

    public void preVisitDeep(Visitor visitor) throws ModelDBException {
        this.preVisitShallow(visitor);
        visitor.preVisitDeepHyperparameterValuesConfigBlob(this.IntervalBegin);
        visitor.preVisitDeepHyperparameterValuesConfigBlob(this.IntervalEnd);
        visitor.preVisitDeepHyperparameterValuesConfigBlob(this.IntervalStep);
    }

    public ContinuousHyperparameterSetConfigBlob postVisitShallow(Visitor visitor) throws ModelDBException {
        return visitor.postVisitContinuousHyperparameterSetConfigBlob(this);
    }

    public ContinuousHyperparameterSetConfigBlob postVisitDeep(Visitor visitor) throws ModelDBException {
        this.IntervalBegin = visitor.postVisitDeepHyperparameterValuesConfigBlob(this.IntervalBegin);
        this.IntervalEnd = visitor.postVisitDeepHyperparameterValuesConfigBlob(this.IntervalEnd);
        this.IntervalStep = visitor.postVisitDeepHyperparameterValuesConfigBlob(this.IntervalStep);
        return this.postVisitShallow(visitor);
    }
}

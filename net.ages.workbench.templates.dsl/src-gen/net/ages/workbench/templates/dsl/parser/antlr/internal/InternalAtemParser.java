package net.ages.workbench.templates.dsl.parser.antlr.internal; 

import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.common.util.Enumerator;
import org.eclipse.xtext.parser.antlr.AbstractInternalAntlrParser;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.parser.antlr.AntlrDatatypeRuleToken;
import net.ages.workbench.templates.dsl.services.AtemGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalAtemParser extends AbstractInternalAntlrParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_STRING", "RULE_ID", "RULE_INT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'Template'", "'End-Template'", "'Head'", "'End_Head'", "'Generation_Driver'", "'Service_Regular_Expression'", "'Service_Status'", "'End_Generation_Driver'", "'Template_Title'", "'End_Title'", "'Page_Keep_With_Next'", "'End_Page_Keep_With_Next'", "'Page_Header_Even'", "'End_Page_Header_Even'", "'Page_Header_Odd'", "'End_Page_Header_Odd'", "'Page_Footer_Even'", "'End_Page_Footer_Even'", "'Page_Footer_Odd'", "'End_Page_Footer_Odd'", "'left'", "'center'", "'right'", "'@text'", "'@date'", "'lang'", "'@pageNbr'", "'@lookup'", "'@title'", "'@commemoration'", "'Template_Commemoration'", "'End_Template_Commemoration'", "'Status'", "'.'", "'.*'", "'import'", "'Switch-Version'", "'End-Switch-Version'", "'sid'", "'@ver'", "'media-off'", "'rid'", "'@mode'", "'@day'", "'ldp'", "'<'", "'>'", "'</>'", "'Info'", "'End-Info'", "'Set_Date'", "'month'", "'day'", "'year'", "'End_Date'", "'Set_mcDay'", "'End_mcDay'", "'Preface'", "'End-Preface'", "'Section'", "'role'", "'End-Section'", "'@All_Liturgical_Day_Properties'", "'@Service_Date'", "'@Service_Year'", "'@Day_of_Movable_Cycle'", "'@Mode_of_Week'", "'@Name_of_Period'", "'@Day_of_Month'", "'@Day_of_Period'", "'@Day_of_Week_As_Number'", "'@Day_of_Week_As_Text'", "'@Eothinon'", "'@Sunday_After_Elevation_Cross_Date'", "'@Lukan_Cycle_Start_Date'", "'@Lukan_Cycle_Elapsed_Days'", "'@Lukan_Cycle_Week'", "'@Lukan_Cycle_Week_Day'", "'@Sundays_Before_Triodion'", "'Insert_template'", "'End-Insert'", "'Insert_section'", "'Break'", "'End_Break'", "'Set_Page_Number'", "'End_Set_Page_Number'", "'Passthrough-Html'", "'END-Passthrough-Html'", "'END-Passthrough-Pdf'", "'Title'", "'End-Title'", "'Sub-Title'", "'End-Sub-Title'", "'Para'", "'End-Para'", "'bTag'", "'End-bTag'", "'Hymn'", "'End-Hymn'", "'Media'", "'End-Media'", "'Verse'", "'End-Verse'", "'Actor'", "'End-Actor'", "'Rubric'", "'End-Rubric'", "'Dialog'", "'End-Dialog'", "'Reading'", "'End-Reading'", "'Heading_1'", "'End_Heading_1'", "'Heading_2'", "'End_Heading_2'", "'Heading_3'", "'End_Heading_3'", "'AGES_ID'", "'Version'", "'LiturgicalBook'", "'Set_Locale'", "'locale_1'", "'locale_2'", "'End_Set_Locale'", "'@restoreLocale'", "'when-date-is'", "'end-when'", "'use:'", "'thru'", "','", "'when-name-of-day-is'", "'when-pentecostarion-day-is'", "'when-triodion-day-is'", "'when-movable-cycle-day-is'", "'when-Sunday-after-Elevation-of-Cross-is'", "'when-Lukan-Cycle-Day-is'", "'when-pascha use:'", "'otherwise use:'", "'when-mode-of-week-is'", "'when-sundays-before-triodion-is'", "'when-exists'", "'L1'", "'L2'", "'Both'", "'line'", "'page'", "'NA'", "'Draft'", "'Review'", "'Final'", "'M1'", "'M2'", "'M3'", "'M4'", "'M5'", "'M6'", "'M7'", "'M8'", "'D1'", "'D2'", "'D3'", "'D4'", "'D5'", "'D6'", "'D7'", "'Sunday'", "'Monday'", "'Tuesday'", "'Wednesday'", "'Thursday'", "'Friday'", "'Saturday'", "'Jan'", "'Feb'", "'Mar'", "'Apr'", "'May'", "'Jun'", "'Jul'", "'Aug'", "'Sep'", "'Oct'", "'Nov'", "'Dec'"
    };
    public static final int RULE_ID=5;
    public static final int T__159=159;
    public static final int T__158=158;
    public static final int RULE_ANY_OTHER=10;
    public static final int T__160=160;
    public static final int T__167=167;
    public static final int EOF=-1;
    public static final int T__168=168;
    public static final int T__165=165;
    public static final int T__166=166;
    public static final int T__163=163;
    public static final int T__164=164;
    public static final int T__161=161;
    public static final int T__162=162;
    public static final int T__93=93;
    public static final int T__94=94;
    public static final int T__91=91;
    public static final int T__92=92;
    public static final int T__148=148;
    public static final int T__90=90;
    public static final int T__147=147;
    public static final int T__149=149;
    public static final int T__154=154;
    public static final int T__155=155;
    public static final int T__156=156;
    public static final int T__99=99;
    public static final int T__157=157;
    public static final int T__98=98;
    public static final int T__150=150;
    public static final int T__97=97;
    public static final int T__151=151;
    public static final int T__96=96;
    public static final int T__152=152;
    public static final int T__95=95;
    public static final int T__153=153;
    public static final int T__139=139;
    public static final int T__138=138;
    public static final int T__137=137;
    public static final int T__136=136;
    public static final int T__80=80;
    public static final int T__81=81;
    public static final int T__82=82;
    public static final int T__83=83;
    public static final int T__85=85;
    public static final int T__141=141;
    public static final int T__84=84;
    public static final int T__142=142;
    public static final int T__87=87;
    public static final int T__86=86;
    public static final int T__140=140;
    public static final int T__89=89;
    public static final int T__145=145;
    public static final int T__88=88;
    public static final int T__146=146;
    public static final int RULE_ML_COMMENT=7;
    public static final int T__143=143;
    public static final int T__144=144;
    public static final int T__126=126;
    public static final int T__125=125;
    public static final int T__128=128;
    public static final int RULE_STRING=4;
    public static final int T__127=127;
    public static final int T__71=71;
    public static final int T__72=72;
    public static final int T__129=129;
    public static final int T__70=70;
    public static final int T__76=76;
    public static final int T__75=75;
    public static final int T__74=74;
    public static final int T__130=130;
    public static final int T__73=73;
    public static final int T__131=131;
    public static final int T__132=132;
    public static final int T__79=79;
    public static final int T__133=133;
    public static final int T__78=78;
    public static final int T__134=134;
    public static final int T__77=77;
    public static final int T__135=135;
    public static final int T__118=118;
    public static final int T__119=119;
    public static final int T__116=116;
    public static final int T__117=117;
    public static final int T__114=114;
    public static final int T__115=115;
    public static final int T__124=124;
    public static final int T__123=123;
    public static final int T__122=122;
    public static final int T__121=121;
    public static final int T__120=120;
    public static final int T__107=107;
    public static final int T__108=108;
    public static final int T__109=109;
    public static final int T__103=103;
    public static final int T__104=104;
    public static final int T__105=105;
    public static final int T__106=106;
    public static final int T__111=111;
    public static final int T__110=110;
    public static final int T__113=113;
    public static final int T__112=112;
    public static final int T__102=102;
    public static final int T__101=101;
    public static final int T__100=100;
    public static final int RULE_SL_COMMENT=8;
    public static final int T__29=29;
    public static final int T__28=28;
    public static final int T__27=27;
    public static final int T__26=26;
    public static final int T__25=25;
    public static final int T__24=24;
    public static final int T__23=23;
    public static final int T__22=22;
    public static final int T__21=21;
    public static final int T__20=20;
    public static final int T__19=19;
    public static final int T__16=16;
    public static final int T__15=15;
    public static final int T__18=18;
    public static final int T__17=17;
    public static final int T__12=12;
    public static final int T__11=11;
    public static final int T__14=14;
    public static final int T__13=13;
    public static final int T__68=68;
    public static final int T__69=69;
    public static final int T__66=66;
    public static final int T__67=67;
    public static final int T__64=64;
    public static final int T__65=65;
    public static final int T__62=62;
    public static final int T__63=63;
    public static final int T__61=61;
    public static final int T__60=60;
    public static final int T__55=55;
    public static final int T__56=56;
    public static final int T__57=57;
    public static final int T__58=58;
    public static final int T__51=51;
    public static final int T__52=52;
    public static final int T__53=53;
    public static final int T__194=194;
    public static final int T__54=54;
    public static final int T__193=193;
    public static final int T__192=192;
    public static final int T__191=191;
    public static final int T__190=190;
    public static final int T__59=59;
    public static final int RULE_INT=6;
    public static final int T__50=50;
    public static final int T__42=42;
    public static final int T__184=184;
    public static final int T__43=43;
    public static final int T__183=183;
    public static final int T__40=40;
    public static final int T__186=186;
    public static final int T__41=41;
    public static final int T__185=185;
    public static final int T__46=46;
    public static final int T__188=188;
    public static final int T__47=47;
    public static final int T__187=187;
    public static final int T__44=44;
    public static final int T__45=45;
    public static final int T__189=189;
    public static final int T__48=48;
    public static final int T__49=49;
    public static final int T__180=180;
    public static final int T__182=182;
    public static final int T__181=181;
    public static final int T__175=175;
    public static final int T__30=30;
    public static final int T__174=174;
    public static final int T__31=31;
    public static final int T__173=173;
    public static final int T__32=32;
    public static final int T__172=172;
    public static final int T__33=33;
    public static final int T__179=179;
    public static final int T__34=34;
    public static final int T__178=178;
    public static final int T__35=35;
    public static final int T__177=177;
    public static final int T__36=36;
    public static final int T__176=176;
    public static final int T__37=37;
    public static final int T__38=38;
    public static final int T__39=39;
    public static final int T__171=171;
    public static final int T__170=170;
    public static final int RULE_WS=9;
    public static final int T__169=169;

    // delegates
    // delegators


        public InternalAtemParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalAtemParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalAtemParser.tokenNames; }
    public String getGrammarFileName() { return "../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g"; }



     	private AtemGrammarAccess grammarAccess;
     	
        public InternalAtemParser(TokenStream input, AtemGrammarAccess grammarAccess) {
            this(input);
            this.grammarAccess = grammarAccess;
            registerRules(grammarAccess.getGrammar());
        }
        
        @Override
        protected String getFirstRuleName() {
        	return "AtemModel";	
       	}
       	
       	@Override
       	protected AtemGrammarAccess getGrammarAccess() {
       		return grammarAccess;
       	}



    // $ANTLR start "entryRuleAtemModel"
    // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:68:1: entryRuleAtemModel returns [EObject current=null] : iv_ruleAtemModel= ruleAtemModel EOF ;
    public final EObject entryRuleAtemModel() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAtemModel = null;


        try {
            // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:69:2: (iv_ruleAtemModel= ruleAtemModel EOF )
            // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:70:2: iv_ruleAtemModel= ruleAtemModel EOF
            {
             newCompositeNode(grammarAccess.getAtemModelRule()); 
            pushFollow(FOLLOW_ruleAtemModel_in_entryRuleAtemModel75);
            iv_ruleAtemModel=ruleAtemModel();

            state._fsp--;

             current =iv_ruleAtemModel; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleAtemModel85); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleAtemModel"


    // $ANTLR start "ruleAtemModel"
    // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:77:1: ruleAtemModel returns [EObject current=null] : (otherlv_0= 'Template' ( (lv_name_1_0= ruleQualifiedName ) ) ( (lv_dsl_Template_Status_2_0= ruleTemplateStatus ) )? ( (lv_imports_3_0= ruleImport ) )* ( (lv_dsl_Template_Driver_4_0= ruleDriver ) )? ( (lv_dsl_Template_head_5_0= ruleHead ) )? ( (lv_dsl_Template_preface_6_0= rulePreface ) )? ( (lv_dsl_Template_components_7_0= ruleAbstractComponent ) )* otherlv_8= 'End-Template' ) ;
    public final EObject ruleAtemModel() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_8=null;
        AntlrDatatypeRuleToken lv_name_1_0 = null;

        EObject lv_dsl_Template_Status_2_0 = null;

        EObject lv_imports_3_0 = null;

        EObject lv_dsl_Template_Driver_4_0 = null;

        EObject lv_dsl_Template_head_5_0 = null;

        EObject lv_dsl_Template_preface_6_0 = null;

        EObject lv_dsl_Template_components_7_0 = null;


         enterRule(); 
            
        try {
            // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:80:28: ( (otherlv_0= 'Template' ( (lv_name_1_0= ruleQualifiedName ) ) ( (lv_dsl_Template_Status_2_0= ruleTemplateStatus ) )? ( (lv_imports_3_0= ruleImport ) )* ( (lv_dsl_Template_Driver_4_0= ruleDriver ) )? ( (lv_dsl_Template_head_5_0= ruleHead ) )? ( (lv_dsl_Template_preface_6_0= rulePreface ) )? ( (lv_dsl_Template_components_7_0= ruleAbstractComponent ) )* otherlv_8= 'End-Template' ) )
            // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:81:1: (otherlv_0= 'Template' ( (lv_name_1_0= ruleQualifiedName ) ) ( (lv_dsl_Template_Status_2_0= ruleTemplateStatus ) )? ( (lv_imports_3_0= ruleImport ) )* ( (lv_dsl_Template_Driver_4_0= ruleDriver ) )? ( (lv_dsl_Template_head_5_0= ruleHead ) )? ( (lv_dsl_Template_preface_6_0= rulePreface ) )? ( (lv_dsl_Template_components_7_0= ruleAbstractComponent ) )* otherlv_8= 'End-Template' )
            {
            // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:81:1: (otherlv_0= 'Template' ( (lv_name_1_0= ruleQualifiedName ) ) ( (lv_dsl_Template_Status_2_0= ruleTemplateStatus ) )? ( (lv_imports_3_0= ruleImport ) )* ( (lv_dsl_Template_Driver_4_0= ruleDriver ) )? ( (lv_dsl_Template_head_5_0= ruleHead ) )? ( (lv_dsl_Template_preface_6_0= rulePreface ) )? ( (lv_dsl_Template_components_7_0= ruleAbstractComponent ) )* otherlv_8= 'End-Template' )
            // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:81:3: otherlv_0= 'Template' ( (lv_name_1_0= ruleQualifiedName ) ) ( (lv_dsl_Template_Status_2_0= ruleTemplateStatus ) )? ( (lv_imports_3_0= ruleImport ) )* ( (lv_dsl_Template_Driver_4_0= ruleDriver ) )? ( (lv_dsl_Template_head_5_0= ruleHead ) )? ( (lv_dsl_Template_preface_6_0= rulePreface ) )? ( (lv_dsl_Template_components_7_0= ruleAbstractComponent ) )* otherlv_8= 'End-Template'
            {
            otherlv_0=(Token)match(input,11,FOLLOW_11_in_ruleAtemModel122); 

                	newLeafNode(otherlv_0, grammarAccess.getAtemModelAccess().getTemplateKeyword_0());
                
            // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:85:1: ( (lv_name_1_0= ruleQualifiedName ) )
            // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:86:1: (lv_name_1_0= ruleQualifiedName )
            {
            // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:86:1: (lv_name_1_0= ruleQualifiedName )
            // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:87:3: lv_name_1_0= ruleQualifiedName
            {
             
            	        newCompositeNode(grammarAccess.getAtemModelAccess().getNameQualifiedNameParserRuleCall_1_0()); 
            	    
            pushFollow(FOLLOW_ruleQualifiedName_in_ruleAtemModel143);
            lv_name_1_0=ruleQualifiedName();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getAtemModelRule());
            	        }
                   		set(
                   			current, 
                   			"name",
                    		lv_name_1_0, 
                    		"QualifiedName");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:103:2: ( (lv_dsl_Template_Status_2_0= ruleTemplateStatus ) )?
            int alt1=2;
            int LA1_0 = input.LA(1);

            if ( (LA1_0==43) ) {
                alt1=1;
            }
            switch (alt1) {
                case 1 :
                    // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:104:1: (lv_dsl_Template_Status_2_0= ruleTemplateStatus )
                    {
                    // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:104:1: (lv_dsl_Template_Status_2_0= ruleTemplateStatus )
                    // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:105:3: lv_dsl_Template_Status_2_0= ruleTemplateStatus
                    {
                     
                    	        newCompositeNode(grammarAccess.getAtemModelAccess().getDsl_Template_StatusTemplateStatusParserRuleCall_2_0()); 
                    	    
                    pushFollow(FOLLOW_ruleTemplateStatus_in_ruleAtemModel164);
                    lv_dsl_Template_Status_2_0=ruleTemplateStatus();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getAtemModelRule());
                    	        }
                           		set(
                           			current, 
                           			"dsl_Template_Status",
                            		lv_dsl_Template_Status_2_0, 
                            		"TemplateStatus");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }
                    break;

            }

            // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:121:3: ( (lv_imports_3_0= ruleImport ) )*
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( (LA2_0==46) ) {
                    alt2=1;
                }


                switch (alt2) {
            	case 1 :
            	    // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:122:1: (lv_imports_3_0= ruleImport )
            	    {
            	    // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:122:1: (lv_imports_3_0= ruleImport )
            	    // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:123:3: lv_imports_3_0= ruleImport
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getAtemModelAccess().getImportsImportParserRuleCall_3_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleImport_in_ruleAtemModel186);
            	    lv_imports_3_0=ruleImport();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getAtemModelRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"imports",
            	            		lv_imports_3_0, 
            	            		"Import");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }
            	    break;

            	default :
            	    break loop2;
                }
            } while (true);

            // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:139:3: ( (lv_dsl_Template_Driver_4_0= ruleDriver ) )?
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==15) ) {
                alt3=1;
            }
            switch (alt3) {
                case 1 :
                    // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:140:1: (lv_dsl_Template_Driver_4_0= ruleDriver )
                    {
                    // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:140:1: (lv_dsl_Template_Driver_4_0= ruleDriver )
                    // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:141:3: lv_dsl_Template_Driver_4_0= ruleDriver
                    {
                     
                    	        newCompositeNode(grammarAccess.getAtemModelAccess().getDsl_Template_DriverDriverParserRuleCall_4_0()); 
                    	    
                    pushFollow(FOLLOW_ruleDriver_in_ruleAtemModel208);
                    lv_dsl_Template_Driver_4_0=ruleDriver();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getAtemModelRule());
                    	        }
                           		set(
                           			current, 
                           			"dsl_Template_Driver",
                            		lv_dsl_Template_Driver_4_0, 
                            		"Driver");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }
                    break;

            }

            // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:157:3: ( (lv_dsl_Template_head_5_0= ruleHead ) )?
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==13) ) {
                alt4=1;
            }
            switch (alt4) {
                case 1 :
                    // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:158:1: (lv_dsl_Template_head_5_0= ruleHead )
                    {
                    // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:158:1: (lv_dsl_Template_head_5_0= ruleHead )
                    // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:159:3: lv_dsl_Template_head_5_0= ruleHead
                    {
                     
                    	        newCompositeNode(grammarAccess.getAtemModelAccess().getDsl_Template_headHeadParserRuleCall_5_0()); 
                    	    
                    pushFollow(FOLLOW_ruleHead_in_ruleAtemModel230);
                    lv_dsl_Template_head_5_0=ruleHead();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getAtemModelRule());
                    	        }
                           		set(
                           			current, 
                           			"dsl_Template_head",
                            		lv_dsl_Template_head_5_0, 
                            		"Head");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }
                    break;

            }

            // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:175:3: ( (lv_dsl_Template_preface_6_0= rulePreface ) )?
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==68) ) {
                alt5=1;
            }
            switch (alt5) {
                case 1 :
                    // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:176:1: (lv_dsl_Template_preface_6_0= rulePreface )
                    {
                    // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:176:1: (lv_dsl_Template_preface_6_0= rulePreface )
                    // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:177:3: lv_dsl_Template_preface_6_0= rulePreface
                    {
                     
                    	        newCompositeNode(grammarAccess.getAtemModelAccess().getDsl_Template_prefacePrefaceParserRuleCall_6_0()); 
                    	    
                    pushFollow(FOLLOW_rulePreface_in_ruleAtemModel252);
                    lv_dsl_Template_preface_6_0=rulePreface();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getAtemModelRule());
                    	        }
                           		set(
                           			current, 
                           			"dsl_Template_preface",
                            		lv_dsl_Template_preface_6_0, 
                            		"Preface");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }
                    break;

            }

            // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:193:3: ( (lv_dsl_Template_components_7_0= ruleAbstractComponent ) )*
            loop6:
            do {
                int alt6=2;
                int LA6_0 = input.LA(1);

                if ( (LA6_0==47||LA6_0==59||LA6_0==70||LA6_0==90||(LA6_0>=92 && LA6_0<=93)||LA6_0==97||LA6_0==100||LA6_0==102||LA6_0==104||LA6_0==106||LA6_0==108||LA6_0==110||LA6_0==112||LA6_0==114||LA6_0==116||LA6_0==118||LA6_0==120||LA6_0==122||LA6_0==124||LA6_0==126||(LA6_0>=128 && LA6_0<=131)||(LA6_0>=135 && LA6_0<=136)||(LA6_0>=141 && LA6_0<=147)||(LA6_0>=149 && LA6_0<=151)) ) {
                    alt6=1;
                }


                switch (alt6) {
            	case 1 :
            	    // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:194:1: (lv_dsl_Template_components_7_0= ruleAbstractComponent )
            	    {
            	    // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:194:1: (lv_dsl_Template_components_7_0= ruleAbstractComponent )
            	    // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:195:3: lv_dsl_Template_components_7_0= ruleAbstractComponent
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getAtemModelAccess().getDsl_Template_componentsAbstractComponentParserRuleCall_7_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleAbstractComponent_in_ruleAtemModel274);
            	    lv_dsl_Template_components_7_0=ruleAbstractComponent();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getAtemModelRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"dsl_Template_components",
            	            		lv_dsl_Template_components_7_0, 
            	            		"AbstractComponent");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }
            	    break;

            	default :
            	    break loop6;
                }
            } while (true);

            otherlv_8=(Token)match(input,12,FOLLOW_12_in_ruleAtemModel287); 

                	newLeafNode(otherlv_8, grammarAccess.getAtemModelAccess().getEndTemplateKeyword_8());
                

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleAtemModel"


    // $ANTLR start "entryRuleHead"
    // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:223:1: entryRuleHead returns [EObject current=null] : iv_ruleHead= ruleHead EOF ;
    public final EObject entryRuleHead() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleHead = null;


        try {
            // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:224:2: (iv_ruleHead= ruleHead EOF )
            // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:225:2: iv_ruleHead= ruleHead EOF
            {
             newCompositeNode(grammarAccess.getHeadRule()); 
            pushFollow(FOLLOW_ruleHead_in_entryRuleHead323);
            iv_ruleHead=ruleHead();

            state._fsp--;

             current =iv_ruleHead; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleHead333); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleHead"


    // $ANTLR start "ruleHead"
    // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:232:1: ruleHead returns [EObject current=null] : (otherlv_0= 'Head' ( (lv_dsl_Head_components_1_0= ruleHeadComponent ) )+ otherlv_2= 'End_Head' ) ;
    public final EObject ruleHead() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        EObject lv_dsl_Head_components_1_0 = null;


         enterRule(); 
            
        try {
            // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:235:28: ( (otherlv_0= 'Head' ( (lv_dsl_Head_components_1_0= ruleHeadComponent ) )+ otherlv_2= 'End_Head' ) )
            // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:236:1: (otherlv_0= 'Head' ( (lv_dsl_Head_components_1_0= ruleHeadComponent ) )+ otherlv_2= 'End_Head' )
            {
            // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:236:1: (otherlv_0= 'Head' ( (lv_dsl_Head_components_1_0= ruleHeadComponent ) )+ otherlv_2= 'End_Head' )
            // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:236:3: otherlv_0= 'Head' ( (lv_dsl_Head_components_1_0= ruleHeadComponent ) )+ otherlv_2= 'End_Head'
            {
            otherlv_0=(Token)match(input,13,FOLLOW_13_in_ruleHead370); 

                	newLeafNode(otherlv_0, grammarAccess.getHeadAccess().getHeadKeyword_0());
                
            // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:240:1: ( (lv_dsl_Head_components_1_0= ruleHeadComponent ) )+
            int cnt7=0;
            loop7:
            do {
                int alt7=2;
                int LA7_0 = input.LA(1);

                if ( (LA7_0==19||LA7_0==21||LA7_0==23||LA7_0==25||LA7_0==27||LA7_0==29||LA7_0==41||LA7_0==61||LA7_0==66||LA7_0==95) ) {
                    alt7=1;
                }


                switch (alt7) {
            	case 1 :
            	    // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:241:1: (lv_dsl_Head_components_1_0= ruleHeadComponent )
            	    {
            	    // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:241:1: (lv_dsl_Head_components_1_0= ruleHeadComponent )
            	    // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:242:3: lv_dsl_Head_components_1_0= ruleHeadComponent
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getHeadAccess().getDsl_Head_componentsHeadComponentParserRuleCall_1_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleHeadComponent_in_ruleHead391);
            	    lv_dsl_Head_components_1_0=ruleHeadComponent();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getHeadRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"dsl_Head_components",
            	            		lv_dsl_Head_components_1_0, 
            	            		"HeadComponent");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }
            	    break;

            	default :
            	    if ( cnt7 >= 1 ) break loop7;
                        EarlyExitException eee =
                            new EarlyExitException(7, input);
                        throw eee;
                }
                cnt7++;
            } while (true);

            otherlv_2=(Token)match(input,14,FOLLOW_14_in_ruleHead404); 

                	newLeafNode(otherlv_2, grammarAccess.getHeadAccess().getEnd_HeadKeyword_2());
                

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleHead"


    // $ANTLR start "entryRuleHeadComponent"
    // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:270:1: entryRuleHeadComponent returns [EObject current=null] : iv_ruleHeadComponent= ruleHeadComponent EOF ;
    public final EObject entryRuleHeadComponent() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleHeadComponent = null;


        try {
            // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:271:2: (iv_ruleHeadComponent= ruleHeadComponent EOF )
            // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:272:2: iv_ruleHeadComponent= ruleHeadComponent EOF
            {
             newCompositeNode(grammarAccess.getHeadComponentRule()); 
            pushFollow(FOLLOW_ruleHeadComponent_in_entryRuleHeadComponent440);
            iv_ruleHeadComponent=ruleHeadComponent();

            state._fsp--;

             current =iv_ruleHeadComponent; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleHeadComponent450); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleHeadComponent"


    // $ANTLR start "ruleHeadComponent"
    // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:279:1: ruleHeadComponent returns [EObject current=null] : (this_Commemoration_0= ruleCommemoration | this_Date_1= ruleDate | this_McDay_2= ruleMcDay | this_PageHeaderEven_3= rulePageHeaderEven | this_PageHeaderOdd_4= rulePageHeaderOdd | this_PageFooterEven_5= rulePageFooterEven | this_PageFooterOdd_6= rulePageFooterOdd | this_PageKeepWithNext_7= rulePageKeepWithNext | this_PageNumber_8= rulePageNumber | this_TemplateTitle_9= ruleTemplateTitle ) ;
    public final EObject ruleHeadComponent() throws RecognitionException {
        EObject current = null;

        EObject this_Commemoration_0 = null;

        EObject this_Date_1 = null;

        EObject this_McDay_2 = null;

        EObject this_PageHeaderEven_3 = null;

        EObject this_PageHeaderOdd_4 = null;

        EObject this_PageFooterEven_5 = null;

        EObject this_PageFooterOdd_6 = null;

        EObject this_PageKeepWithNext_7 = null;

        EObject this_PageNumber_8 = null;

        EObject this_TemplateTitle_9 = null;


         enterRule(); 
            
        try {
            // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:282:28: ( (this_Commemoration_0= ruleCommemoration | this_Date_1= ruleDate | this_McDay_2= ruleMcDay | this_PageHeaderEven_3= rulePageHeaderEven | this_PageHeaderOdd_4= rulePageHeaderOdd | this_PageFooterEven_5= rulePageFooterEven | this_PageFooterOdd_6= rulePageFooterOdd | this_PageKeepWithNext_7= rulePageKeepWithNext | this_PageNumber_8= rulePageNumber | this_TemplateTitle_9= ruleTemplateTitle ) )
            // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:283:1: (this_Commemoration_0= ruleCommemoration | this_Date_1= ruleDate | this_McDay_2= ruleMcDay | this_PageHeaderEven_3= rulePageHeaderEven | this_PageHeaderOdd_4= rulePageHeaderOdd | this_PageFooterEven_5= rulePageFooterEven | this_PageFooterOdd_6= rulePageFooterOdd | this_PageKeepWithNext_7= rulePageKeepWithNext | this_PageNumber_8= rulePageNumber | this_TemplateTitle_9= ruleTemplateTitle )
            {
            // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:283:1: (this_Commemoration_0= ruleCommemoration | this_Date_1= ruleDate | this_McDay_2= ruleMcDay | this_PageHeaderEven_3= rulePageHeaderEven | this_PageHeaderOdd_4= rulePageHeaderOdd | this_PageFooterEven_5= rulePageFooterEven | this_PageFooterOdd_6= rulePageFooterOdd | this_PageKeepWithNext_7= rulePageKeepWithNext | this_PageNumber_8= rulePageNumber | this_TemplateTitle_9= ruleTemplateTitle )
            int alt8=10;
            switch ( input.LA(1) ) {
            case 41:
                {
                alt8=1;
                }
                break;
            case 61:
                {
                alt8=2;
                }
                break;
            case 66:
                {
                alt8=3;
                }
                break;
            case 23:
                {
                alt8=4;
                }
                break;
            case 25:
                {
                alt8=5;
                }
                break;
            case 27:
                {
                alt8=6;
                }
                break;
            case 29:
                {
                alt8=7;
                }
                break;
            case 21:
                {
                alt8=8;
                }
                break;
            case 95:
                {
                alt8=9;
                }
                break;
            case 19:
                {
                alt8=10;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 8, 0, input);

                throw nvae;
            }

            switch (alt8) {
                case 1 :
                    // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:284:5: this_Commemoration_0= ruleCommemoration
                    {
                     
                            newCompositeNode(grammarAccess.getHeadComponentAccess().getCommemorationParserRuleCall_0()); 
                        
                    pushFollow(FOLLOW_ruleCommemoration_in_ruleHeadComponent497);
                    this_Commemoration_0=ruleCommemoration();

                    state._fsp--;

                     
                            current = this_Commemoration_0; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 2 :
                    // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:294:5: this_Date_1= ruleDate
                    {
                     
                            newCompositeNode(grammarAccess.getHeadComponentAccess().getDateParserRuleCall_1()); 
                        
                    pushFollow(FOLLOW_ruleDate_in_ruleHeadComponent524);
                    this_Date_1=ruleDate();

                    state._fsp--;

                     
                            current = this_Date_1; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 3 :
                    // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:304:5: this_McDay_2= ruleMcDay
                    {
                     
                            newCompositeNode(grammarAccess.getHeadComponentAccess().getMcDayParserRuleCall_2()); 
                        
                    pushFollow(FOLLOW_ruleMcDay_in_ruleHeadComponent551);
                    this_McDay_2=ruleMcDay();

                    state._fsp--;

                     
                            current = this_McDay_2; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 4 :
                    // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:314:5: this_PageHeaderEven_3= rulePageHeaderEven
                    {
                     
                            newCompositeNode(grammarAccess.getHeadComponentAccess().getPageHeaderEvenParserRuleCall_3()); 
                        
                    pushFollow(FOLLOW_rulePageHeaderEven_in_ruleHeadComponent578);
                    this_PageHeaderEven_3=rulePageHeaderEven();

                    state._fsp--;

                     
                            current = this_PageHeaderEven_3; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 5 :
                    // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:324:5: this_PageHeaderOdd_4= rulePageHeaderOdd
                    {
                     
                            newCompositeNode(grammarAccess.getHeadComponentAccess().getPageHeaderOddParserRuleCall_4()); 
                        
                    pushFollow(FOLLOW_rulePageHeaderOdd_in_ruleHeadComponent605);
                    this_PageHeaderOdd_4=rulePageHeaderOdd();

                    state._fsp--;

                     
                            current = this_PageHeaderOdd_4; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 6 :
                    // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:334:5: this_PageFooterEven_5= rulePageFooterEven
                    {
                     
                            newCompositeNode(grammarAccess.getHeadComponentAccess().getPageFooterEvenParserRuleCall_5()); 
                        
                    pushFollow(FOLLOW_rulePageFooterEven_in_ruleHeadComponent632);
                    this_PageFooterEven_5=rulePageFooterEven();

                    state._fsp--;

                     
                            current = this_PageFooterEven_5; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 7 :
                    // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:344:5: this_PageFooterOdd_6= rulePageFooterOdd
                    {
                     
                            newCompositeNode(grammarAccess.getHeadComponentAccess().getPageFooterOddParserRuleCall_6()); 
                        
                    pushFollow(FOLLOW_rulePageFooterOdd_in_ruleHeadComponent659);
                    this_PageFooterOdd_6=rulePageFooterOdd();

                    state._fsp--;

                     
                            current = this_PageFooterOdd_6; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 8 :
                    // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:354:5: this_PageKeepWithNext_7= rulePageKeepWithNext
                    {
                     
                            newCompositeNode(grammarAccess.getHeadComponentAccess().getPageKeepWithNextParserRuleCall_7()); 
                        
                    pushFollow(FOLLOW_rulePageKeepWithNext_in_ruleHeadComponent686);
                    this_PageKeepWithNext_7=rulePageKeepWithNext();

                    state._fsp--;

                     
                            current = this_PageKeepWithNext_7; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 9 :
                    // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:364:5: this_PageNumber_8= rulePageNumber
                    {
                     
                            newCompositeNode(grammarAccess.getHeadComponentAccess().getPageNumberParserRuleCall_8()); 
                        
                    pushFollow(FOLLOW_rulePageNumber_in_ruleHeadComponent713);
                    this_PageNumber_8=rulePageNumber();

                    state._fsp--;

                     
                            current = this_PageNumber_8; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 10 :
                    // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:374:5: this_TemplateTitle_9= ruleTemplateTitle
                    {
                     
                            newCompositeNode(grammarAccess.getHeadComponentAccess().getTemplateTitleParserRuleCall_9()); 
                        
                    pushFollow(FOLLOW_ruleTemplateTitle_in_ruleHeadComponent740);
                    this_TemplateTitle_9=ruleTemplateTitle();

                    state._fsp--;

                     
                            current = this_TemplateTitle_9; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleHeadComponent"


    // $ANTLR start "entryRuleDriver"
    // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:390:1: entryRuleDriver returns [EObject current=null] : iv_ruleDriver= ruleDriver EOF ;
    public final EObject entryRuleDriver() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDriver = null;


        try {
            // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:391:2: (iv_ruleDriver= ruleDriver EOF )
            // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:392:2: iv_ruleDriver= ruleDriver EOF
            {
             newCompositeNode(grammarAccess.getDriverRule()); 
            pushFollow(FOLLOW_ruleDriver_in_entryRuleDriver775);
            iv_ruleDriver=ruleDriver();

            state._fsp--;

             current =iv_ruleDriver; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleDriver785); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleDriver"


    // $ANTLR start "ruleDriver"
    // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:399:1: ruleDriver returns [EObject current=null] : (otherlv_0= 'Generation_Driver' otherlv_1= 'Service_Regular_Expression' ( (lv_dsl_Driver_RegEx_2_0= RULE_STRING ) ) (otherlv_3= 'Service_Status' ( (lv_dsl_Driver_Status_4_0= ruleTemplateStatuses ) ) )? otherlv_5= 'End_Generation_Driver' ) ;
    public final EObject ruleDriver() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token lv_dsl_Driver_RegEx_2_0=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Enumerator lv_dsl_Driver_Status_4_0 = null;


         enterRule(); 
            
        try {
            // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:402:28: ( (otherlv_0= 'Generation_Driver' otherlv_1= 'Service_Regular_Expression' ( (lv_dsl_Driver_RegEx_2_0= RULE_STRING ) ) (otherlv_3= 'Service_Status' ( (lv_dsl_Driver_Status_4_0= ruleTemplateStatuses ) ) )? otherlv_5= 'End_Generation_Driver' ) )
            // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:403:1: (otherlv_0= 'Generation_Driver' otherlv_1= 'Service_Regular_Expression' ( (lv_dsl_Driver_RegEx_2_0= RULE_STRING ) ) (otherlv_3= 'Service_Status' ( (lv_dsl_Driver_Status_4_0= ruleTemplateStatuses ) ) )? otherlv_5= 'End_Generation_Driver' )
            {
            // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:403:1: (otherlv_0= 'Generation_Driver' otherlv_1= 'Service_Regular_Expression' ( (lv_dsl_Driver_RegEx_2_0= RULE_STRING ) ) (otherlv_3= 'Service_Status' ( (lv_dsl_Driver_Status_4_0= ruleTemplateStatuses ) ) )? otherlv_5= 'End_Generation_Driver' )
            // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:403:3: otherlv_0= 'Generation_Driver' otherlv_1= 'Service_Regular_Expression' ( (lv_dsl_Driver_RegEx_2_0= RULE_STRING ) ) (otherlv_3= 'Service_Status' ( (lv_dsl_Driver_Status_4_0= ruleTemplateStatuses ) ) )? otherlv_5= 'End_Generation_Driver'
            {
            otherlv_0=(Token)match(input,15,FOLLOW_15_in_ruleDriver822); 

                	newLeafNode(otherlv_0, grammarAccess.getDriverAccess().getGeneration_DriverKeyword_0());
                
            otherlv_1=(Token)match(input,16,FOLLOW_16_in_ruleDriver834); 

                	newLeafNode(otherlv_1, grammarAccess.getDriverAccess().getService_Regular_ExpressionKeyword_1());
                
            // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:411:1: ( (lv_dsl_Driver_RegEx_2_0= RULE_STRING ) )
            // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:412:1: (lv_dsl_Driver_RegEx_2_0= RULE_STRING )
            {
            // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:412:1: (lv_dsl_Driver_RegEx_2_0= RULE_STRING )
            // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:413:3: lv_dsl_Driver_RegEx_2_0= RULE_STRING
            {
            lv_dsl_Driver_RegEx_2_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleDriver851); 

            			newLeafNode(lv_dsl_Driver_RegEx_2_0, grammarAccess.getDriverAccess().getDsl_Driver_RegExSTRINGTerminalRuleCall_2_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getDriverRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"dsl_Driver_RegEx",
                    		lv_dsl_Driver_RegEx_2_0, 
                    		"STRING");
            	    

            }


            }

            // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:429:2: (otherlv_3= 'Service_Status' ( (lv_dsl_Driver_Status_4_0= ruleTemplateStatuses ) ) )?
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0==17) ) {
                alt9=1;
            }
            switch (alt9) {
                case 1 :
                    // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:429:4: otherlv_3= 'Service_Status' ( (lv_dsl_Driver_Status_4_0= ruleTemplateStatuses ) )
                    {
                    otherlv_3=(Token)match(input,17,FOLLOW_17_in_ruleDriver869); 

                        	newLeafNode(otherlv_3, grammarAccess.getDriverAccess().getService_StatusKeyword_3_0());
                        
                    // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:433:1: ( (lv_dsl_Driver_Status_4_0= ruleTemplateStatuses ) )
                    // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:434:1: (lv_dsl_Driver_Status_4_0= ruleTemplateStatuses )
                    {
                    // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:434:1: (lv_dsl_Driver_Status_4_0= ruleTemplateStatuses )
                    // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:435:3: lv_dsl_Driver_Status_4_0= ruleTemplateStatuses
                    {
                     
                    	        newCompositeNode(grammarAccess.getDriverAccess().getDsl_Driver_StatusTemplateStatusesEnumRuleCall_3_1_0()); 
                    	    
                    pushFollow(FOLLOW_ruleTemplateStatuses_in_ruleDriver890);
                    lv_dsl_Driver_Status_4_0=ruleTemplateStatuses();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getDriverRule());
                    	        }
                           		set(
                           			current, 
                           			"dsl_Driver_Status",
                            		lv_dsl_Driver_Status_4_0, 
                            		"TemplateStatuses");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }


                    }
                    break;

            }

            otherlv_5=(Token)match(input,18,FOLLOW_18_in_ruleDriver904); 

                	newLeafNode(otherlv_5, grammarAccess.getDriverAccess().getEnd_Generation_DriverKeyword_4());
                

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleDriver"


    // $ANTLR start "entryRuleTemplateTitle"
    // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:463:1: entryRuleTemplateTitle returns [EObject current=null] : iv_ruleTemplateTitle= ruleTemplateTitle EOF ;
    public final EObject entryRuleTemplateTitle() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTemplateTitle = null;


        try {
            // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:464:2: (iv_ruleTemplateTitle= ruleTemplateTitle EOF )
            // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:465:2: iv_ruleTemplateTitle= ruleTemplateTitle EOF
            {
             newCompositeNode(grammarAccess.getTemplateTitleRule()); 
            pushFollow(FOLLOW_ruleTemplateTitle_in_entryRuleTemplateTitle940);
            iv_ruleTemplateTitle=ruleTemplateTitle();

            state._fsp--;

             current =iv_ruleTemplateTitle; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleTemplateTitle950); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleTemplateTitle"


    // $ANTLR start "ruleTemplateTitle"
    // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:472:1: ruleTemplateTitle returns [EObject current=null] : (otherlv_0= 'Template_Title' ( (lv_dsl_TemplateTitle_Elements_1_0= ruleHeaderFooterFragment ) )+ otherlv_2= 'End_Title' ) ;
    public final EObject ruleTemplateTitle() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        EObject lv_dsl_TemplateTitle_Elements_1_0 = null;


         enterRule(); 
            
        try {
            // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:475:28: ( (otherlv_0= 'Template_Title' ( (lv_dsl_TemplateTitle_Elements_1_0= ruleHeaderFooterFragment ) )+ otherlv_2= 'End_Title' ) )
            // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:476:1: (otherlv_0= 'Template_Title' ( (lv_dsl_TemplateTitle_Elements_1_0= ruleHeaderFooterFragment ) )+ otherlv_2= 'End_Title' )
            {
            // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:476:1: (otherlv_0= 'Template_Title' ( (lv_dsl_TemplateTitle_Elements_1_0= ruleHeaderFooterFragment ) )+ otherlv_2= 'End_Title' )
            // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:476:3: otherlv_0= 'Template_Title' ( (lv_dsl_TemplateTitle_Elements_1_0= ruleHeaderFooterFragment ) )+ otherlv_2= 'End_Title'
            {
            otherlv_0=(Token)match(input,19,FOLLOW_19_in_ruleTemplateTitle987); 

                	newLeafNode(otherlv_0, grammarAccess.getTemplateTitleAccess().getTemplate_TitleKeyword_0());
                
            // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:480:1: ( (lv_dsl_TemplateTitle_Elements_1_0= ruleHeaderFooterFragment ) )+
            int cnt10=0;
            loop10:
            do {
                int alt10=2;
                int LA10_0 = input.LA(1);

                if ( ((LA10_0>=34 && LA10_0<=35)||(LA10_0>=37 && LA10_0<=40)) ) {
                    alt10=1;
                }


                switch (alt10) {
            	case 1 :
            	    // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:481:1: (lv_dsl_TemplateTitle_Elements_1_0= ruleHeaderFooterFragment )
            	    {
            	    // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:481:1: (lv_dsl_TemplateTitle_Elements_1_0= ruleHeaderFooterFragment )
            	    // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:482:3: lv_dsl_TemplateTitle_Elements_1_0= ruleHeaderFooterFragment
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getTemplateTitleAccess().getDsl_TemplateTitle_ElementsHeaderFooterFragmentParserRuleCall_1_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleHeaderFooterFragment_in_ruleTemplateTitle1008);
            	    lv_dsl_TemplateTitle_Elements_1_0=ruleHeaderFooterFragment();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getTemplateTitleRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"dsl_TemplateTitle_Elements",
            	            		lv_dsl_TemplateTitle_Elements_1_0, 
            	            		"HeaderFooterFragment");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }
            	    break;

            	default :
            	    if ( cnt10 >= 1 ) break loop10;
                        EarlyExitException eee =
                            new EarlyExitException(10, input);
                        throw eee;
                }
                cnt10++;
            } while (true);

            otherlv_2=(Token)match(input,20,FOLLOW_20_in_ruleTemplateTitle1021); 

                	newLeafNode(otherlv_2, grammarAccess.getTemplateTitleAccess().getEnd_TitleKeyword_2());
                

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleTemplateTitle"


    // $ANTLR start "entryRulePageKeepWithNext"
    // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:510:1: entryRulePageKeepWithNext returns [EObject current=null] : iv_rulePageKeepWithNext= rulePageKeepWithNext EOF ;
    public final EObject entryRulePageKeepWithNext() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePageKeepWithNext = null;


        try {
            // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:511:2: (iv_rulePageKeepWithNext= rulePageKeepWithNext EOF )
            // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:512:2: iv_rulePageKeepWithNext= rulePageKeepWithNext EOF
            {
             newCompositeNode(grammarAccess.getPageKeepWithNextRule()); 
            pushFollow(FOLLOW_rulePageKeepWithNext_in_entryRulePageKeepWithNext1057);
            iv_rulePageKeepWithNext=rulePageKeepWithNext();

            state._fsp--;

             current =iv_rulePageKeepWithNext; 
            match(input,EOF,FOLLOW_EOF_in_entryRulePageKeepWithNext1067); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRulePageKeepWithNext"


    // $ANTLR start "rulePageKeepWithNext"
    // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:519:1: rulePageKeepWithNext returns [EObject current=null] : (otherlv_0= 'Page_Keep_With_Next' ( (lv_dsl_PageKeepWithNext_value_1_0= RULE_STRING ) ) otherlv_2= 'End_Page_Keep_With_Next' ) ;
    public final EObject rulePageKeepWithNext() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_dsl_PageKeepWithNext_value_1_0=null;
        Token otherlv_2=null;

         enterRule(); 
            
        try {
            // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:522:28: ( (otherlv_0= 'Page_Keep_With_Next' ( (lv_dsl_PageKeepWithNext_value_1_0= RULE_STRING ) ) otherlv_2= 'End_Page_Keep_With_Next' ) )
            // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:523:1: (otherlv_0= 'Page_Keep_With_Next' ( (lv_dsl_PageKeepWithNext_value_1_0= RULE_STRING ) ) otherlv_2= 'End_Page_Keep_With_Next' )
            {
            // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:523:1: (otherlv_0= 'Page_Keep_With_Next' ( (lv_dsl_PageKeepWithNext_value_1_0= RULE_STRING ) ) otherlv_2= 'End_Page_Keep_With_Next' )
            // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:523:3: otherlv_0= 'Page_Keep_With_Next' ( (lv_dsl_PageKeepWithNext_value_1_0= RULE_STRING ) ) otherlv_2= 'End_Page_Keep_With_Next'
            {
            otherlv_0=(Token)match(input,21,FOLLOW_21_in_rulePageKeepWithNext1104); 

                	newLeafNode(otherlv_0, grammarAccess.getPageKeepWithNextAccess().getPage_Keep_With_NextKeyword_0());
                
            // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:527:1: ( (lv_dsl_PageKeepWithNext_value_1_0= RULE_STRING ) )
            // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:528:1: (lv_dsl_PageKeepWithNext_value_1_0= RULE_STRING )
            {
            // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:528:1: (lv_dsl_PageKeepWithNext_value_1_0= RULE_STRING )
            // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:529:3: lv_dsl_PageKeepWithNext_value_1_0= RULE_STRING
            {
            lv_dsl_PageKeepWithNext_value_1_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rulePageKeepWithNext1121); 

            			newLeafNode(lv_dsl_PageKeepWithNext_value_1_0, grammarAccess.getPageKeepWithNextAccess().getDsl_PageKeepWithNext_valueSTRINGTerminalRuleCall_1_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getPageKeepWithNextRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"dsl_PageKeepWithNext_value",
                    		lv_dsl_PageKeepWithNext_value_1_0, 
                    		"STRING");
            	    

            }


            }

            otherlv_2=(Token)match(input,22,FOLLOW_22_in_rulePageKeepWithNext1138); 

                	newLeafNode(otherlv_2, grammarAccess.getPageKeepWithNextAccess().getEnd_Page_Keep_With_NextKeyword_2());
                

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "rulePageKeepWithNext"


    // $ANTLR start "entryRulePageHeaderEven"
    // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:557:1: entryRulePageHeaderEven returns [EObject current=null] : iv_rulePageHeaderEven= rulePageHeaderEven EOF ;
    public final EObject entryRulePageHeaderEven() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePageHeaderEven = null;


        try {
            // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:558:2: (iv_rulePageHeaderEven= rulePageHeaderEven EOF )
            // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:559:2: iv_rulePageHeaderEven= rulePageHeaderEven EOF
            {
             newCompositeNode(grammarAccess.getPageHeaderEvenRule()); 
            pushFollow(FOLLOW_rulePageHeaderEven_in_entryRulePageHeaderEven1174);
            iv_rulePageHeaderEven=rulePageHeaderEven();

            state._fsp--;

             current =iv_rulePageHeaderEven; 
            match(input,EOF,FOLLOW_EOF_in_entryRulePageHeaderEven1184); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRulePageHeaderEven"


    // $ANTLR start "rulePageHeaderEven"
    // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:566:1: rulePageHeaderEven returns [EObject current=null] : (otherlv_0= 'Page_Header_Even' ( (lv_dsl_PageHeader_columns_1_0= ruleHeaderFooterColumn ) )+ otherlv_2= 'End_Page_Header_Even' ) ;
    public final EObject rulePageHeaderEven() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        EObject lv_dsl_PageHeader_columns_1_0 = null;


         enterRule(); 
            
        try {
            // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:569:28: ( (otherlv_0= 'Page_Header_Even' ( (lv_dsl_PageHeader_columns_1_0= ruleHeaderFooterColumn ) )+ otherlv_2= 'End_Page_Header_Even' ) )
            // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:570:1: (otherlv_0= 'Page_Header_Even' ( (lv_dsl_PageHeader_columns_1_0= ruleHeaderFooterColumn ) )+ otherlv_2= 'End_Page_Header_Even' )
            {
            // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:570:1: (otherlv_0= 'Page_Header_Even' ( (lv_dsl_PageHeader_columns_1_0= ruleHeaderFooterColumn ) )+ otherlv_2= 'End_Page_Header_Even' )
            // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:570:3: otherlv_0= 'Page_Header_Even' ( (lv_dsl_PageHeader_columns_1_0= ruleHeaderFooterColumn ) )+ otherlv_2= 'End_Page_Header_Even'
            {
            otherlv_0=(Token)match(input,23,FOLLOW_23_in_rulePageHeaderEven1221); 

                	newLeafNode(otherlv_0, grammarAccess.getPageHeaderEvenAccess().getPage_Header_EvenKeyword_0());
                
            // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:574:1: ( (lv_dsl_PageHeader_columns_1_0= ruleHeaderFooterColumn ) )+
            int cnt11=0;
            loop11:
            do {
                int alt11=2;
                int LA11_0 = input.LA(1);

                if ( ((LA11_0>=31 && LA11_0<=33)) ) {
                    alt11=1;
                }


                switch (alt11) {
            	case 1 :
            	    // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:575:1: (lv_dsl_PageHeader_columns_1_0= ruleHeaderFooterColumn )
            	    {
            	    // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:575:1: (lv_dsl_PageHeader_columns_1_0= ruleHeaderFooterColumn )
            	    // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:576:3: lv_dsl_PageHeader_columns_1_0= ruleHeaderFooterColumn
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getPageHeaderEvenAccess().getDsl_PageHeader_columnsHeaderFooterColumnParserRuleCall_1_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleHeaderFooterColumn_in_rulePageHeaderEven1242);
            	    lv_dsl_PageHeader_columns_1_0=ruleHeaderFooterColumn();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getPageHeaderEvenRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"dsl_PageHeader_columns",
            	            		lv_dsl_PageHeader_columns_1_0, 
            	            		"HeaderFooterColumn");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }
            	    break;

            	default :
            	    if ( cnt11 >= 1 ) break loop11;
                        EarlyExitException eee =
                            new EarlyExitException(11, input);
                        throw eee;
                }
                cnt11++;
            } while (true);

            otherlv_2=(Token)match(input,24,FOLLOW_24_in_rulePageHeaderEven1255); 

                	newLeafNode(otherlv_2, grammarAccess.getPageHeaderEvenAccess().getEnd_Page_Header_EvenKeyword_2());
                

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "rulePageHeaderEven"


    // $ANTLR start "entryRulePageHeaderOdd"
    // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:604:1: entryRulePageHeaderOdd returns [EObject current=null] : iv_rulePageHeaderOdd= rulePageHeaderOdd EOF ;
    public final EObject entryRulePageHeaderOdd() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePageHeaderOdd = null;


        try {
            // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:605:2: (iv_rulePageHeaderOdd= rulePageHeaderOdd EOF )
            // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:606:2: iv_rulePageHeaderOdd= rulePageHeaderOdd EOF
            {
             newCompositeNode(grammarAccess.getPageHeaderOddRule()); 
            pushFollow(FOLLOW_rulePageHeaderOdd_in_entryRulePageHeaderOdd1291);
            iv_rulePageHeaderOdd=rulePageHeaderOdd();

            state._fsp--;

             current =iv_rulePageHeaderOdd; 
            match(input,EOF,FOLLOW_EOF_in_entryRulePageHeaderOdd1301); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRulePageHeaderOdd"


    // $ANTLR start "rulePageHeaderOdd"
    // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:613:1: rulePageHeaderOdd returns [EObject current=null] : (otherlv_0= 'Page_Header_Odd' ( (lv_dsl_PageHeader_columns_1_0= ruleHeaderFooterColumn ) )+ otherlv_2= 'End_Page_Header_Odd' ) ;
    public final EObject rulePageHeaderOdd() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        EObject lv_dsl_PageHeader_columns_1_0 = null;


         enterRule(); 
            
        try {
            // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:616:28: ( (otherlv_0= 'Page_Header_Odd' ( (lv_dsl_PageHeader_columns_1_0= ruleHeaderFooterColumn ) )+ otherlv_2= 'End_Page_Header_Odd' ) )
            // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:617:1: (otherlv_0= 'Page_Header_Odd' ( (lv_dsl_PageHeader_columns_1_0= ruleHeaderFooterColumn ) )+ otherlv_2= 'End_Page_Header_Odd' )
            {
            // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:617:1: (otherlv_0= 'Page_Header_Odd' ( (lv_dsl_PageHeader_columns_1_0= ruleHeaderFooterColumn ) )+ otherlv_2= 'End_Page_Header_Odd' )
            // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:617:3: otherlv_0= 'Page_Header_Odd' ( (lv_dsl_PageHeader_columns_1_0= ruleHeaderFooterColumn ) )+ otherlv_2= 'End_Page_Header_Odd'
            {
            otherlv_0=(Token)match(input,25,FOLLOW_25_in_rulePageHeaderOdd1338); 

                	newLeafNode(otherlv_0, grammarAccess.getPageHeaderOddAccess().getPage_Header_OddKeyword_0());
                
            // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:621:1: ( (lv_dsl_PageHeader_columns_1_0= ruleHeaderFooterColumn ) )+
            int cnt12=0;
            loop12:
            do {
                int alt12=2;
                int LA12_0 = input.LA(1);

                if ( ((LA12_0>=31 && LA12_0<=33)) ) {
                    alt12=1;
                }


                switch (alt12) {
            	case 1 :
            	    // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:622:1: (lv_dsl_PageHeader_columns_1_0= ruleHeaderFooterColumn )
            	    {
            	    // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:622:1: (lv_dsl_PageHeader_columns_1_0= ruleHeaderFooterColumn )
            	    // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:623:3: lv_dsl_PageHeader_columns_1_0= ruleHeaderFooterColumn
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getPageHeaderOddAccess().getDsl_PageHeader_columnsHeaderFooterColumnParserRuleCall_1_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleHeaderFooterColumn_in_rulePageHeaderOdd1359);
            	    lv_dsl_PageHeader_columns_1_0=ruleHeaderFooterColumn();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getPageHeaderOddRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"dsl_PageHeader_columns",
            	            		lv_dsl_PageHeader_columns_1_0, 
            	            		"HeaderFooterColumn");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }
            	    break;

            	default :
            	    if ( cnt12 >= 1 ) break loop12;
                        EarlyExitException eee =
                            new EarlyExitException(12, input);
                        throw eee;
                }
                cnt12++;
            } while (true);

            otherlv_2=(Token)match(input,26,FOLLOW_26_in_rulePageHeaderOdd1372); 

                	newLeafNode(otherlv_2, grammarAccess.getPageHeaderOddAccess().getEnd_Page_Header_OddKeyword_2());
                

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "rulePageHeaderOdd"


    // $ANTLR start "entryRulePageFooterEven"
    // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:651:1: entryRulePageFooterEven returns [EObject current=null] : iv_rulePageFooterEven= rulePageFooterEven EOF ;
    public final EObject entryRulePageFooterEven() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePageFooterEven = null;


        try {
            // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:652:2: (iv_rulePageFooterEven= rulePageFooterEven EOF )
            // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:653:2: iv_rulePageFooterEven= rulePageFooterEven EOF
            {
             newCompositeNode(grammarAccess.getPageFooterEvenRule()); 
            pushFollow(FOLLOW_rulePageFooterEven_in_entryRulePageFooterEven1408);
            iv_rulePageFooterEven=rulePageFooterEven();

            state._fsp--;

             current =iv_rulePageFooterEven; 
            match(input,EOF,FOLLOW_EOF_in_entryRulePageFooterEven1418); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRulePageFooterEven"


    // $ANTLR start "rulePageFooterEven"
    // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:660:1: rulePageFooterEven returns [EObject current=null] : (otherlv_0= 'Page_Footer_Even' ( (lv_dsl_PageHeader_columns_1_0= ruleHeaderFooterColumn ) )+ otherlv_2= 'End_Page_Footer_Even' ) ;
    public final EObject rulePageFooterEven() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        EObject lv_dsl_PageHeader_columns_1_0 = null;


         enterRule(); 
            
        try {
            // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:663:28: ( (otherlv_0= 'Page_Footer_Even' ( (lv_dsl_PageHeader_columns_1_0= ruleHeaderFooterColumn ) )+ otherlv_2= 'End_Page_Footer_Even' ) )
            // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:664:1: (otherlv_0= 'Page_Footer_Even' ( (lv_dsl_PageHeader_columns_1_0= ruleHeaderFooterColumn ) )+ otherlv_2= 'End_Page_Footer_Even' )
            {
            // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:664:1: (otherlv_0= 'Page_Footer_Even' ( (lv_dsl_PageHeader_columns_1_0= ruleHeaderFooterColumn ) )+ otherlv_2= 'End_Page_Footer_Even' )
            // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:664:3: otherlv_0= 'Page_Footer_Even' ( (lv_dsl_PageHeader_columns_1_0= ruleHeaderFooterColumn ) )+ otherlv_2= 'End_Page_Footer_Even'
            {
            otherlv_0=(Token)match(input,27,FOLLOW_27_in_rulePageFooterEven1455); 

                	newLeafNode(otherlv_0, grammarAccess.getPageFooterEvenAccess().getPage_Footer_EvenKeyword_0());
                
            // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:668:1: ( (lv_dsl_PageHeader_columns_1_0= ruleHeaderFooterColumn ) )+
            int cnt13=0;
            loop13:
            do {
                int alt13=2;
                int LA13_0 = input.LA(1);

                if ( ((LA13_0>=31 && LA13_0<=33)) ) {
                    alt13=1;
                }


                switch (alt13) {
            	case 1 :
            	    // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:669:1: (lv_dsl_PageHeader_columns_1_0= ruleHeaderFooterColumn )
            	    {
            	    // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:669:1: (lv_dsl_PageHeader_columns_1_0= ruleHeaderFooterColumn )
            	    // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:670:3: lv_dsl_PageHeader_columns_1_0= ruleHeaderFooterColumn
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getPageFooterEvenAccess().getDsl_PageHeader_columnsHeaderFooterColumnParserRuleCall_1_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleHeaderFooterColumn_in_rulePageFooterEven1476);
            	    lv_dsl_PageHeader_columns_1_0=ruleHeaderFooterColumn();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getPageFooterEvenRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"dsl_PageHeader_columns",
            	            		lv_dsl_PageHeader_columns_1_0, 
            	            		"HeaderFooterColumn");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }
            	    break;

            	default :
            	    if ( cnt13 >= 1 ) break loop13;
                        EarlyExitException eee =
                            new EarlyExitException(13, input);
                        throw eee;
                }
                cnt13++;
            } while (true);

            otherlv_2=(Token)match(input,28,FOLLOW_28_in_rulePageFooterEven1489); 

                	newLeafNode(otherlv_2, grammarAccess.getPageFooterEvenAccess().getEnd_Page_Footer_EvenKeyword_2());
                

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "rulePageFooterEven"


    // $ANTLR start "entryRulePageFooterOdd"
    // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:698:1: entryRulePageFooterOdd returns [EObject current=null] : iv_rulePageFooterOdd= rulePageFooterOdd EOF ;
    public final EObject entryRulePageFooterOdd() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePageFooterOdd = null;


        try {
            // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:699:2: (iv_rulePageFooterOdd= rulePageFooterOdd EOF )
            // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:700:2: iv_rulePageFooterOdd= rulePageFooterOdd EOF
            {
             newCompositeNode(grammarAccess.getPageFooterOddRule()); 
            pushFollow(FOLLOW_rulePageFooterOdd_in_entryRulePageFooterOdd1525);
            iv_rulePageFooterOdd=rulePageFooterOdd();

            state._fsp--;

             current =iv_rulePageFooterOdd; 
            match(input,EOF,FOLLOW_EOF_in_entryRulePageFooterOdd1535); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRulePageFooterOdd"


    // $ANTLR start "rulePageFooterOdd"
    // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:707:1: rulePageFooterOdd returns [EObject current=null] : (otherlv_0= 'Page_Footer_Odd' ( (lv_dsl_PageHeader_columns_1_0= ruleHeaderFooterColumn ) )+ otherlv_2= 'End_Page_Footer_Odd' ) ;
    public final EObject rulePageFooterOdd() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        EObject lv_dsl_PageHeader_columns_1_0 = null;


         enterRule(); 
            
        try {
            // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:710:28: ( (otherlv_0= 'Page_Footer_Odd' ( (lv_dsl_PageHeader_columns_1_0= ruleHeaderFooterColumn ) )+ otherlv_2= 'End_Page_Footer_Odd' ) )
            // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:711:1: (otherlv_0= 'Page_Footer_Odd' ( (lv_dsl_PageHeader_columns_1_0= ruleHeaderFooterColumn ) )+ otherlv_2= 'End_Page_Footer_Odd' )
            {
            // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:711:1: (otherlv_0= 'Page_Footer_Odd' ( (lv_dsl_PageHeader_columns_1_0= ruleHeaderFooterColumn ) )+ otherlv_2= 'End_Page_Footer_Odd' )
            // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:711:3: otherlv_0= 'Page_Footer_Odd' ( (lv_dsl_PageHeader_columns_1_0= ruleHeaderFooterColumn ) )+ otherlv_2= 'End_Page_Footer_Odd'
            {
            otherlv_0=(Token)match(input,29,FOLLOW_29_in_rulePageFooterOdd1572); 

                	newLeafNode(otherlv_0, grammarAccess.getPageFooterOddAccess().getPage_Footer_OddKeyword_0());
                
            // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:715:1: ( (lv_dsl_PageHeader_columns_1_0= ruleHeaderFooterColumn ) )+
            int cnt14=0;
            loop14:
            do {
                int alt14=2;
                int LA14_0 = input.LA(1);

                if ( ((LA14_0>=31 && LA14_0<=33)) ) {
                    alt14=1;
                }


                switch (alt14) {
            	case 1 :
            	    // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:716:1: (lv_dsl_PageHeader_columns_1_0= ruleHeaderFooterColumn )
            	    {
            	    // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:716:1: (lv_dsl_PageHeader_columns_1_0= ruleHeaderFooterColumn )
            	    // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:717:3: lv_dsl_PageHeader_columns_1_0= ruleHeaderFooterColumn
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getPageFooterOddAccess().getDsl_PageHeader_columnsHeaderFooterColumnParserRuleCall_1_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleHeaderFooterColumn_in_rulePageFooterOdd1593);
            	    lv_dsl_PageHeader_columns_1_0=ruleHeaderFooterColumn();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getPageFooterOddRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"dsl_PageHeader_columns",
            	            		lv_dsl_PageHeader_columns_1_0, 
            	            		"HeaderFooterColumn");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }
            	    break;

            	default :
            	    if ( cnt14 >= 1 ) break loop14;
                        EarlyExitException eee =
                            new EarlyExitException(14, input);
                        throw eee;
                }
                cnt14++;
            } while (true);

            otherlv_2=(Token)match(input,30,FOLLOW_30_in_rulePageFooterOdd1606); 

                	newLeafNode(otherlv_2, grammarAccess.getPageFooterOddAccess().getEnd_Page_Footer_OddKeyword_2());
                

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "rulePageFooterOdd"


    // $ANTLR start "entryRuleHeaderFooterColumn"
    // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:745:1: entryRuleHeaderFooterColumn returns [EObject current=null] : iv_ruleHeaderFooterColumn= ruleHeaderFooterColumn EOF ;
    public final EObject entryRuleHeaderFooterColumn() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleHeaderFooterColumn = null;


        try {
            // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:746:2: (iv_ruleHeaderFooterColumn= ruleHeaderFooterColumn EOF )
            // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:747:2: iv_ruleHeaderFooterColumn= ruleHeaderFooterColumn EOF
            {
             newCompositeNode(grammarAccess.getHeaderFooterColumnRule()); 
            pushFollow(FOLLOW_ruleHeaderFooterColumn_in_entryRuleHeaderFooterColumn1642);
            iv_ruleHeaderFooterColumn=ruleHeaderFooterColumn();

            state._fsp--;

             current =iv_ruleHeaderFooterColumn; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleHeaderFooterColumn1652); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleHeaderFooterColumn"


    // $ANTLR start "ruleHeaderFooterColumn"
    // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:754:1: ruleHeaderFooterColumn returns [EObject current=null] : (this_HeaderFooterColumnLeft_0= ruleHeaderFooterColumnLeft | this_HeaderFooterColumnCenter_1= ruleHeaderFooterColumnCenter | this_HeaderFooterColumnRight_2= ruleHeaderFooterColumnRight ) ;
    public final EObject ruleHeaderFooterColumn() throws RecognitionException {
        EObject current = null;

        EObject this_HeaderFooterColumnLeft_0 = null;

        EObject this_HeaderFooterColumnCenter_1 = null;

        EObject this_HeaderFooterColumnRight_2 = null;


         enterRule(); 
            
        try {
            // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:757:28: ( (this_HeaderFooterColumnLeft_0= ruleHeaderFooterColumnLeft | this_HeaderFooterColumnCenter_1= ruleHeaderFooterColumnCenter | this_HeaderFooterColumnRight_2= ruleHeaderFooterColumnRight ) )
            // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:758:1: (this_HeaderFooterColumnLeft_0= ruleHeaderFooterColumnLeft | this_HeaderFooterColumnCenter_1= ruleHeaderFooterColumnCenter | this_HeaderFooterColumnRight_2= ruleHeaderFooterColumnRight )
            {
            // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:758:1: (this_HeaderFooterColumnLeft_0= ruleHeaderFooterColumnLeft | this_HeaderFooterColumnCenter_1= ruleHeaderFooterColumnCenter | this_HeaderFooterColumnRight_2= ruleHeaderFooterColumnRight )
            int alt15=3;
            switch ( input.LA(1) ) {
            case 31:
                {
                alt15=1;
                }
                break;
            case 32:
                {
                alt15=2;
                }
                break;
            case 33:
                {
                alt15=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 15, 0, input);

                throw nvae;
            }

            switch (alt15) {
                case 1 :
                    // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:759:5: this_HeaderFooterColumnLeft_0= ruleHeaderFooterColumnLeft
                    {
                     
                            newCompositeNode(grammarAccess.getHeaderFooterColumnAccess().getHeaderFooterColumnLeftParserRuleCall_0()); 
                        
                    pushFollow(FOLLOW_ruleHeaderFooterColumnLeft_in_ruleHeaderFooterColumn1699);
                    this_HeaderFooterColumnLeft_0=ruleHeaderFooterColumnLeft();

                    state._fsp--;

                     
                            current = this_HeaderFooterColumnLeft_0; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 2 :
                    // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:769:5: this_HeaderFooterColumnCenter_1= ruleHeaderFooterColumnCenter
                    {
                     
                            newCompositeNode(grammarAccess.getHeaderFooterColumnAccess().getHeaderFooterColumnCenterParserRuleCall_1()); 
                        
                    pushFollow(FOLLOW_ruleHeaderFooterColumnCenter_in_ruleHeaderFooterColumn1726);
                    this_HeaderFooterColumnCenter_1=ruleHeaderFooterColumnCenter();

                    state._fsp--;

                     
                            current = this_HeaderFooterColumnCenter_1; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 3 :
                    // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:779:5: this_HeaderFooterColumnRight_2= ruleHeaderFooterColumnRight
                    {
                     
                            newCompositeNode(grammarAccess.getHeaderFooterColumnAccess().getHeaderFooterColumnRightParserRuleCall_2()); 
                        
                    pushFollow(FOLLOW_ruleHeaderFooterColumnRight_in_ruleHeaderFooterColumn1753);
                    this_HeaderFooterColumnRight_2=ruleHeaderFooterColumnRight();

                    state._fsp--;

                     
                            current = this_HeaderFooterColumnRight_2; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleHeaderFooterColumn"


    // $ANTLR start "entryRuleHeaderFooterColumnLeft"
    // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:795:1: entryRuleHeaderFooterColumnLeft returns [EObject current=null] : iv_ruleHeaderFooterColumnLeft= ruleHeaderFooterColumnLeft EOF ;
    public final EObject entryRuleHeaderFooterColumnLeft() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleHeaderFooterColumnLeft = null;


        try {
            // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:796:2: (iv_ruleHeaderFooterColumnLeft= ruleHeaderFooterColumnLeft EOF )
            // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:797:2: iv_ruleHeaderFooterColumnLeft= ruleHeaderFooterColumnLeft EOF
            {
             newCompositeNode(grammarAccess.getHeaderFooterColumnLeftRule()); 
            pushFollow(FOLLOW_ruleHeaderFooterColumnLeft_in_entryRuleHeaderFooterColumnLeft1788);
            iv_ruleHeaderFooterColumnLeft=ruleHeaderFooterColumnLeft();

            state._fsp--;

             current =iv_ruleHeaderFooterColumnLeft; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleHeaderFooterColumnLeft1798); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleHeaderFooterColumnLeft"


    // $ANTLR start "ruleHeaderFooterColumnLeft"
    // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:804:1: ruleHeaderFooterColumnLeft returns [EObject current=null] : (otherlv_0= 'left' ( (lv_dsl_HeaderFooterColumn_fragments_1_0= ruleHeaderFooterFragment ) )+ ) ;
    public final EObject ruleHeaderFooterColumnLeft() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        EObject lv_dsl_HeaderFooterColumn_fragments_1_0 = null;


         enterRule(); 
            
        try {
            // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:807:28: ( (otherlv_0= 'left' ( (lv_dsl_HeaderFooterColumn_fragments_1_0= ruleHeaderFooterFragment ) )+ ) )
            // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:808:1: (otherlv_0= 'left' ( (lv_dsl_HeaderFooterColumn_fragments_1_0= ruleHeaderFooterFragment ) )+ )
            {
            // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:808:1: (otherlv_0= 'left' ( (lv_dsl_HeaderFooterColumn_fragments_1_0= ruleHeaderFooterFragment ) )+ )
            // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:808:3: otherlv_0= 'left' ( (lv_dsl_HeaderFooterColumn_fragments_1_0= ruleHeaderFooterFragment ) )+
            {
            otherlv_0=(Token)match(input,31,FOLLOW_31_in_ruleHeaderFooterColumnLeft1835); 

                	newLeafNode(otherlv_0, grammarAccess.getHeaderFooterColumnLeftAccess().getLeftKeyword_0());
                
            // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:812:1: ( (lv_dsl_HeaderFooterColumn_fragments_1_0= ruleHeaderFooterFragment ) )+
            int cnt16=0;
            loop16:
            do {
                int alt16=2;
                int LA16_0 = input.LA(1);

                if ( ((LA16_0>=34 && LA16_0<=35)||(LA16_0>=37 && LA16_0<=40)) ) {
                    alt16=1;
                }


                switch (alt16) {
            	case 1 :
            	    // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:813:1: (lv_dsl_HeaderFooterColumn_fragments_1_0= ruleHeaderFooterFragment )
            	    {
            	    // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:813:1: (lv_dsl_HeaderFooterColumn_fragments_1_0= ruleHeaderFooterFragment )
            	    // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:814:3: lv_dsl_HeaderFooterColumn_fragments_1_0= ruleHeaderFooterFragment
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getHeaderFooterColumnLeftAccess().getDsl_HeaderFooterColumn_fragmentsHeaderFooterFragmentParserRuleCall_1_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleHeaderFooterFragment_in_ruleHeaderFooterColumnLeft1856);
            	    lv_dsl_HeaderFooterColumn_fragments_1_0=ruleHeaderFooterFragment();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getHeaderFooterColumnLeftRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"dsl_HeaderFooterColumn_fragments",
            	            		lv_dsl_HeaderFooterColumn_fragments_1_0, 
            	            		"HeaderFooterFragment");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }
            	    break;

            	default :
            	    if ( cnt16 >= 1 ) break loop16;
                        EarlyExitException eee =
                            new EarlyExitException(16, input);
                        throw eee;
                }
                cnt16++;
            } while (true);


            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleHeaderFooterColumnLeft"


    // $ANTLR start "entryRuleHeaderFooterColumnCenter"
    // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:838:1: entryRuleHeaderFooterColumnCenter returns [EObject current=null] : iv_ruleHeaderFooterColumnCenter= ruleHeaderFooterColumnCenter EOF ;
    public final EObject entryRuleHeaderFooterColumnCenter() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleHeaderFooterColumnCenter = null;


        try {
            // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:839:2: (iv_ruleHeaderFooterColumnCenter= ruleHeaderFooterColumnCenter EOF )
            // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:840:2: iv_ruleHeaderFooterColumnCenter= ruleHeaderFooterColumnCenter EOF
            {
             newCompositeNode(grammarAccess.getHeaderFooterColumnCenterRule()); 
            pushFollow(FOLLOW_ruleHeaderFooterColumnCenter_in_entryRuleHeaderFooterColumnCenter1893);
            iv_ruleHeaderFooterColumnCenter=ruleHeaderFooterColumnCenter();

            state._fsp--;

             current =iv_ruleHeaderFooterColumnCenter; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleHeaderFooterColumnCenter1903); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleHeaderFooterColumnCenter"


    // $ANTLR start "ruleHeaderFooterColumnCenter"
    // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:847:1: ruleHeaderFooterColumnCenter returns [EObject current=null] : (otherlv_0= 'center' ( (lv_dsl_HeaderFooterColumn_fragments_1_0= ruleHeaderFooterFragment ) )+ ) ;
    public final EObject ruleHeaderFooterColumnCenter() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        EObject lv_dsl_HeaderFooterColumn_fragments_1_0 = null;


         enterRule(); 
            
        try {
            // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:850:28: ( (otherlv_0= 'center' ( (lv_dsl_HeaderFooterColumn_fragments_1_0= ruleHeaderFooterFragment ) )+ ) )
            // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:851:1: (otherlv_0= 'center' ( (lv_dsl_HeaderFooterColumn_fragments_1_0= ruleHeaderFooterFragment ) )+ )
            {
            // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:851:1: (otherlv_0= 'center' ( (lv_dsl_HeaderFooterColumn_fragments_1_0= ruleHeaderFooterFragment ) )+ )
            // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:851:3: otherlv_0= 'center' ( (lv_dsl_HeaderFooterColumn_fragments_1_0= ruleHeaderFooterFragment ) )+
            {
            otherlv_0=(Token)match(input,32,FOLLOW_32_in_ruleHeaderFooterColumnCenter1940); 

                	newLeafNode(otherlv_0, grammarAccess.getHeaderFooterColumnCenterAccess().getCenterKeyword_0());
                
            // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:855:1: ( (lv_dsl_HeaderFooterColumn_fragments_1_0= ruleHeaderFooterFragment ) )+
            int cnt17=0;
            loop17:
            do {
                int alt17=2;
                int LA17_0 = input.LA(1);

                if ( ((LA17_0>=34 && LA17_0<=35)||(LA17_0>=37 && LA17_0<=40)) ) {
                    alt17=1;
                }


                switch (alt17) {
            	case 1 :
            	    // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:856:1: (lv_dsl_HeaderFooterColumn_fragments_1_0= ruleHeaderFooterFragment )
            	    {
            	    // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:856:1: (lv_dsl_HeaderFooterColumn_fragments_1_0= ruleHeaderFooterFragment )
            	    // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:857:3: lv_dsl_HeaderFooterColumn_fragments_1_0= ruleHeaderFooterFragment
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getHeaderFooterColumnCenterAccess().getDsl_HeaderFooterColumn_fragmentsHeaderFooterFragmentParserRuleCall_1_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleHeaderFooterFragment_in_ruleHeaderFooterColumnCenter1961);
            	    lv_dsl_HeaderFooterColumn_fragments_1_0=ruleHeaderFooterFragment();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getHeaderFooterColumnCenterRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"dsl_HeaderFooterColumn_fragments",
            	            		lv_dsl_HeaderFooterColumn_fragments_1_0, 
            	            		"HeaderFooterFragment");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }
            	    break;

            	default :
            	    if ( cnt17 >= 1 ) break loop17;
                        EarlyExitException eee =
                            new EarlyExitException(17, input);
                        throw eee;
                }
                cnt17++;
            } while (true);


            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleHeaderFooterColumnCenter"


    // $ANTLR start "entryRuleHeaderFooterColumnRight"
    // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:881:1: entryRuleHeaderFooterColumnRight returns [EObject current=null] : iv_ruleHeaderFooterColumnRight= ruleHeaderFooterColumnRight EOF ;
    public final EObject entryRuleHeaderFooterColumnRight() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleHeaderFooterColumnRight = null;


        try {
            // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:882:2: (iv_ruleHeaderFooterColumnRight= ruleHeaderFooterColumnRight EOF )
            // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:883:2: iv_ruleHeaderFooterColumnRight= ruleHeaderFooterColumnRight EOF
            {
             newCompositeNode(grammarAccess.getHeaderFooterColumnRightRule()); 
            pushFollow(FOLLOW_ruleHeaderFooterColumnRight_in_entryRuleHeaderFooterColumnRight1998);
            iv_ruleHeaderFooterColumnRight=ruleHeaderFooterColumnRight();

            state._fsp--;

             current =iv_ruleHeaderFooterColumnRight; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleHeaderFooterColumnRight2008); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleHeaderFooterColumnRight"


    // $ANTLR start "ruleHeaderFooterColumnRight"
    // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:890:1: ruleHeaderFooterColumnRight returns [EObject current=null] : (otherlv_0= 'right' ( (lv_dsl_HeaderFooterColumn_fragments_1_0= ruleHeaderFooterFragment ) )+ ) ;
    public final EObject ruleHeaderFooterColumnRight() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        EObject lv_dsl_HeaderFooterColumn_fragments_1_0 = null;


         enterRule(); 
            
        try {
            // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:893:28: ( (otherlv_0= 'right' ( (lv_dsl_HeaderFooterColumn_fragments_1_0= ruleHeaderFooterFragment ) )+ ) )
            // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:894:1: (otherlv_0= 'right' ( (lv_dsl_HeaderFooterColumn_fragments_1_0= ruleHeaderFooterFragment ) )+ )
            {
            // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:894:1: (otherlv_0= 'right' ( (lv_dsl_HeaderFooterColumn_fragments_1_0= ruleHeaderFooterFragment ) )+ )
            // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:894:3: otherlv_0= 'right' ( (lv_dsl_HeaderFooterColumn_fragments_1_0= ruleHeaderFooterFragment ) )+
            {
            otherlv_0=(Token)match(input,33,FOLLOW_33_in_ruleHeaderFooterColumnRight2045); 

                	newLeafNode(otherlv_0, grammarAccess.getHeaderFooterColumnRightAccess().getRightKeyword_0());
                
            // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:898:1: ( (lv_dsl_HeaderFooterColumn_fragments_1_0= ruleHeaderFooterFragment ) )+
            int cnt18=0;
            loop18:
            do {
                int alt18=2;
                int LA18_0 = input.LA(1);

                if ( ((LA18_0>=34 && LA18_0<=35)||(LA18_0>=37 && LA18_0<=40)) ) {
                    alt18=1;
                }


                switch (alt18) {
            	case 1 :
            	    // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:899:1: (lv_dsl_HeaderFooterColumn_fragments_1_0= ruleHeaderFooterFragment )
            	    {
            	    // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:899:1: (lv_dsl_HeaderFooterColumn_fragments_1_0= ruleHeaderFooterFragment )
            	    // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:900:3: lv_dsl_HeaderFooterColumn_fragments_1_0= ruleHeaderFooterFragment
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getHeaderFooterColumnRightAccess().getDsl_HeaderFooterColumn_fragmentsHeaderFooterFragmentParserRuleCall_1_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleHeaderFooterFragment_in_ruleHeaderFooterColumnRight2066);
            	    lv_dsl_HeaderFooterColumn_fragments_1_0=ruleHeaderFooterFragment();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getHeaderFooterColumnRightRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"dsl_HeaderFooterColumn_fragments",
            	            		lv_dsl_HeaderFooterColumn_fragments_1_0, 
            	            		"HeaderFooterFragment");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }
            	    break;

            	default :
            	    if ( cnt18 >= 1 ) break loop18;
                        EarlyExitException eee =
                            new EarlyExitException(18, input);
                        throw eee;
                }
                cnt18++;
            } while (true);


            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleHeaderFooterColumnRight"


    // $ANTLR start "entryRuleHeaderFooterFragment"
    // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:924:1: entryRuleHeaderFooterFragment returns [EObject current=null] : iv_ruleHeaderFooterFragment= ruleHeaderFooterFragment EOF ;
    public final EObject entryRuleHeaderFooterFragment() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleHeaderFooterFragment = null;


        try {
            // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:925:2: (iv_ruleHeaderFooterFragment= ruleHeaderFooterFragment EOF )
            // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:926:2: iv_ruleHeaderFooterFragment= ruleHeaderFooterFragment EOF
            {
             newCompositeNode(grammarAccess.getHeaderFooterFragmentRule()); 
            pushFollow(FOLLOW_ruleHeaderFooterFragment_in_entryRuleHeaderFooterFragment2103);
            iv_ruleHeaderFooterFragment=ruleHeaderFooterFragment();

            state._fsp--;

             current =iv_ruleHeaderFooterFragment; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleHeaderFooterFragment2113); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleHeaderFooterFragment"


    // $ANTLR start "ruleHeaderFooterFragment"
    // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:933:1: ruleHeaderFooterFragment returns [EObject current=null] : (this_HeaderFooterText_0= ruleHeaderFooterText | this_HeaderFooterDate_1= ruleHeaderFooterDate | this_HeaderFooterPageNumber_2= ruleHeaderFooterPageNumber | this_HeaderFooterLookup_3= ruleHeaderFooterLookup | this_HeaderFooterTitle_4= ruleHeaderFooterTitle | this_HeaderFooterCommemoration_5= ruleHeaderFooterCommemoration ) ;
    public final EObject ruleHeaderFooterFragment() throws RecognitionException {
        EObject current = null;

        EObject this_HeaderFooterText_0 = null;

        EObject this_HeaderFooterDate_1 = null;

        EObject this_HeaderFooterPageNumber_2 = null;

        EObject this_HeaderFooterLookup_3 = null;

        EObject this_HeaderFooterTitle_4 = null;

        EObject this_HeaderFooterCommemoration_5 = null;


         enterRule(); 
            
        try {
            // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:936:28: ( (this_HeaderFooterText_0= ruleHeaderFooterText | this_HeaderFooterDate_1= ruleHeaderFooterDate | this_HeaderFooterPageNumber_2= ruleHeaderFooterPageNumber | this_HeaderFooterLookup_3= ruleHeaderFooterLookup | this_HeaderFooterTitle_4= ruleHeaderFooterTitle | this_HeaderFooterCommemoration_5= ruleHeaderFooterCommemoration ) )
            // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:937:1: (this_HeaderFooterText_0= ruleHeaderFooterText | this_HeaderFooterDate_1= ruleHeaderFooterDate | this_HeaderFooterPageNumber_2= ruleHeaderFooterPageNumber | this_HeaderFooterLookup_3= ruleHeaderFooterLookup | this_HeaderFooterTitle_4= ruleHeaderFooterTitle | this_HeaderFooterCommemoration_5= ruleHeaderFooterCommemoration )
            {
            // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:937:1: (this_HeaderFooterText_0= ruleHeaderFooterText | this_HeaderFooterDate_1= ruleHeaderFooterDate | this_HeaderFooterPageNumber_2= ruleHeaderFooterPageNumber | this_HeaderFooterLookup_3= ruleHeaderFooterLookup | this_HeaderFooterTitle_4= ruleHeaderFooterTitle | this_HeaderFooterCommemoration_5= ruleHeaderFooterCommemoration )
            int alt19=6;
            switch ( input.LA(1) ) {
            case 34:
                {
                alt19=1;
                }
                break;
            case 35:
                {
                alt19=2;
                }
                break;
            case 37:
                {
                alt19=3;
                }
                break;
            case 38:
                {
                alt19=4;
                }
                break;
            case 39:
                {
                alt19=5;
                }
                break;
            case 40:
                {
                alt19=6;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 19, 0, input);

                throw nvae;
            }

            switch (alt19) {
                case 1 :
                    // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:938:5: this_HeaderFooterText_0= ruleHeaderFooterText
                    {
                     
                            newCompositeNode(grammarAccess.getHeaderFooterFragmentAccess().getHeaderFooterTextParserRuleCall_0()); 
                        
                    pushFollow(FOLLOW_ruleHeaderFooterText_in_ruleHeaderFooterFragment2160);
                    this_HeaderFooterText_0=ruleHeaderFooterText();

                    state._fsp--;

                     
                            current = this_HeaderFooterText_0; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 2 :
                    // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:948:5: this_HeaderFooterDate_1= ruleHeaderFooterDate
                    {
                     
                            newCompositeNode(grammarAccess.getHeaderFooterFragmentAccess().getHeaderFooterDateParserRuleCall_1()); 
                        
                    pushFollow(FOLLOW_ruleHeaderFooterDate_in_ruleHeaderFooterFragment2187);
                    this_HeaderFooterDate_1=ruleHeaderFooterDate();

                    state._fsp--;

                     
                            current = this_HeaderFooterDate_1; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 3 :
                    // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:958:5: this_HeaderFooterPageNumber_2= ruleHeaderFooterPageNumber
                    {
                     
                            newCompositeNode(grammarAccess.getHeaderFooterFragmentAccess().getHeaderFooterPageNumberParserRuleCall_2()); 
                        
                    pushFollow(FOLLOW_ruleHeaderFooterPageNumber_in_ruleHeaderFooterFragment2214);
                    this_HeaderFooterPageNumber_2=ruleHeaderFooterPageNumber();

                    state._fsp--;

                     
                            current = this_HeaderFooterPageNumber_2; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 4 :
                    // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:968:5: this_HeaderFooterLookup_3= ruleHeaderFooterLookup
                    {
                     
                            newCompositeNode(grammarAccess.getHeaderFooterFragmentAccess().getHeaderFooterLookupParserRuleCall_3()); 
                        
                    pushFollow(FOLLOW_ruleHeaderFooterLookup_in_ruleHeaderFooterFragment2241);
                    this_HeaderFooterLookup_3=ruleHeaderFooterLookup();

                    state._fsp--;

                     
                            current = this_HeaderFooterLookup_3; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 5 :
                    // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:978:5: this_HeaderFooterTitle_4= ruleHeaderFooterTitle
                    {
                     
                            newCompositeNode(grammarAccess.getHeaderFooterFragmentAccess().getHeaderFooterTitleParserRuleCall_4()); 
                        
                    pushFollow(FOLLOW_ruleHeaderFooterTitle_in_ruleHeaderFooterFragment2268);
                    this_HeaderFooterTitle_4=ruleHeaderFooterTitle();

                    state._fsp--;

                     
                            current = this_HeaderFooterTitle_4; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 6 :
                    // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:988:5: this_HeaderFooterCommemoration_5= ruleHeaderFooterCommemoration
                    {
                     
                            newCompositeNode(grammarAccess.getHeaderFooterFragmentAccess().getHeaderFooterCommemorationParserRuleCall_5()); 
                        
                    pushFollow(FOLLOW_ruleHeaderFooterCommemoration_in_ruleHeaderFooterFragment2295);
                    this_HeaderFooterCommemoration_5=ruleHeaderFooterCommemoration();

                    state._fsp--;

                     
                            current = this_HeaderFooterCommemoration_5; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleHeaderFooterFragment"


    // $ANTLR start "entryRuleHeaderFooterText"
    // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:1004:1: entryRuleHeaderFooterText returns [EObject current=null] : iv_ruleHeaderFooterText= ruleHeaderFooterText EOF ;
    public final EObject entryRuleHeaderFooterText() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleHeaderFooterText = null;


        try {
            // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:1005:2: (iv_ruleHeaderFooterText= ruleHeaderFooterText EOF )
            // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:1006:2: iv_ruleHeaderFooterText= ruleHeaderFooterText EOF
            {
             newCompositeNode(grammarAccess.getHeaderFooterTextRule()); 
            pushFollow(FOLLOW_ruleHeaderFooterText_in_entryRuleHeaderFooterText2330);
            iv_ruleHeaderFooterText=ruleHeaderFooterText();

            state._fsp--;

             current =iv_ruleHeaderFooterText; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleHeaderFooterText2340); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleHeaderFooterText"


    // $ANTLR start "ruleHeaderFooterText"
    // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:1013:1: ruleHeaderFooterText returns [EObject current=null] : (otherlv_0= '@text' ( (lv_dsl_HeaderFooterText_1_0= RULE_STRING ) ) ) ;
    public final EObject ruleHeaderFooterText() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_dsl_HeaderFooterText_1_0=null;

         enterRule(); 
            
        try {
            // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:1016:28: ( (otherlv_0= '@text' ( (lv_dsl_HeaderFooterText_1_0= RULE_STRING ) ) ) )
            // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:1017:1: (otherlv_0= '@text' ( (lv_dsl_HeaderFooterText_1_0= RULE_STRING ) ) )
            {
            // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:1017:1: (otherlv_0= '@text' ( (lv_dsl_HeaderFooterText_1_0= RULE_STRING ) ) )
            // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:1017:3: otherlv_0= '@text' ( (lv_dsl_HeaderFooterText_1_0= RULE_STRING ) )
            {
            otherlv_0=(Token)match(input,34,FOLLOW_34_in_ruleHeaderFooterText2377); 

                	newLeafNode(otherlv_0, grammarAccess.getHeaderFooterTextAccess().getTextKeyword_0());
                
            // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:1021:1: ( (lv_dsl_HeaderFooterText_1_0= RULE_STRING ) )
            // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:1022:1: (lv_dsl_HeaderFooterText_1_0= RULE_STRING )
            {
            // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:1022:1: (lv_dsl_HeaderFooterText_1_0= RULE_STRING )
            // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:1023:3: lv_dsl_HeaderFooterText_1_0= RULE_STRING
            {
            lv_dsl_HeaderFooterText_1_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleHeaderFooterText2394); 

            			newLeafNode(lv_dsl_HeaderFooterText_1_0, grammarAccess.getHeaderFooterTextAccess().getDsl_HeaderFooterTextSTRINGTerminalRuleCall_1_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getHeaderFooterTextRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"dsl_HeaderFooterText",
                    		lv_dsl_HeaderFooterText_1_0, 
                    		"STRING");
            	    

            }


            }


            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleHeaderFooterText"


    // $ANTLR start "entryRuleHeaderFooterDate"
    // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:1047:1: entryRuleHeaderFooterDate returns [EObject current=null] : iv_ruleHeaderFooterDate= ruleHeaderFooterDate EOF ;
    public final EObject entryRuleHeaderFooterDate() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleHeaderFooterDate = null;


        try {
            // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:1048:2: (iv_ruleHeaderFooterDate= ruleHeaderFooterDate EOF )
            // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:1049:2: iv_ruleHeaderFooterDate= ruleHeaderFooterDate EOF
            {
             newCompositeNode(grammarAccess.getHeaderFooterDateRule()); 
            pushFollow(FOLLOW_ruleHeaderFooterDate_in_entryRuleHeaderFooterDate2435);
            iv_ruleHeaderFooterDate=ruleHeaderFooterDate();

            state._fsp--;

             current =iv_ruleHeaderFooterDate; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleHeaderFooterDate2445); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleHeaderFooterDate"


    // $ANTLR start "ruleHeaderFooterDate"
    // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:1056:1: ruleHeaderFooterDate returns [EObject current=null] : ( ( (lv_dsl_HeaderFooterDate_0_0= '@date' ) ) (otherlv_1= 'lang' ( (lv_dsl_HeaderFooterDate_Language_2_0= ruleLanguage ) ) )? ) ;
    public final EObject ruleHeaderFooterDate() throws RecognitionException {
        EObject current = null;

        Token lv_dsl_HeaderFooterDate_0_0=null;
        Token otherlv_1=null;
        Enumerator lv_dsl_HeaderFooterDate_Language_2_0 = null;


         enterRule(); 
            
        try {
            // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:1059:28: ( ( ( (lv_dsl_HeaderFooterDate_0_0= '@date' ) ) (otherlv_1= 'lang' ( (lv_dsl_HeaderFooterDate_Language_2_0= ruleLanguage ) ) )? ) )
            // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:1060:1: ( ( (lv_dsl_HeaderFooterDate_0_0= '@date' ) ) (otherlv_1= 'lang' ( (lv_dsl_HeaderFooterDate_Language_2_0= ruleLanguage ) ) )? )
            {
            // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:1060:1: ( ( (lv_dsl_HeaderFooterDate_0_0= '@date' ) ) (otherlv_1= 'lang' ( (lv_dsl_HeaderFooterDate_Language_2_0= ruleLanguage ) ) )? )
            // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:1060:2: ( (lv_dsl_HeaderFooterDate_0_0= '@date' ) ) (otherlv_1= 'lang' ( (lv_dsl_HeaderFooterDate_Language_2_0= ruleLanguage ) ) )?
            {
            // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:1060:2: ( (lv_dsl_HeaderFooterDate_0_0= '@date' ) )
            // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:1061:1: (lv_dsl_HeaderFooterDate_0_0= '@date' )
            {
            // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:1061:1: (lv_dsl_HeaderFooterDate_0_0= '@date' )
            // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:1062:3: lv_dsl_HeaderFooterDate_0_0= '@date'
            {
            lv_dsl_HeaderFooterDate_0_0=(Token)match(input,35,FOLLOW_35_in_ruleHeaderFooterDate2488); 

                    newLeafNode(lv_dsl_HeaderFooterDate_0_0, grammarAccess.getHeaderFooterDateAccess().getDsl_HeaderFooterDateDateKeyword_0_0());
                

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getHeaderFooterDateRule());
            	        }
                   		setWithLastConsumed(current, "dsl_HeaderFooterDate", true, "@date");
            	    

            }


            }

            // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:1075:2: (otherlv_1= 'lang' ( (lv_dsl_HeaderFooterDate_Language_2_0= ruleLanguage ) ) )?
            int alt20=2;
            int LA20_0 = input.LA(1);

            if ( (LA20_0==36) ) {
                alt20=1;
            }
            switch (alt20) {
                case 1 :
                    // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:1075:4: otherlv_1= 'lang' ( (lv_dsl_HeaderFooterDate_Language_2_0= ruleLanguage ) )
                    {
                    otherlv_1=(Token)match(input,36,FOLLOW_36_in_ruleHeaderFooterDate2514); 

                        	newLeafNode(otherlv_1, grammarAccess.getHeaderFooterDateAccess().getLangKeyword_1_0());
                        
                    // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:1079:1: ( (lv_dsl_HeaderFooterDate_Language_2_0= ruleLanguage ) )
                    // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:1080:1: (lv_dsl_HeaderFooterDate_Language_2_0= ruleLanguage )
                    {
                    // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:1080:1: (lv_dsl_HeaderFooterDate_Language_2_0= ruleLanguage )
                    // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:1081:3: lv_dsl_HeaderFooterDate_Language_2_0= ruleLanguage
                    {
                     
                    	        newCompositeNode(grammarAccess.getHeaderFooterDateAccess().getDsl_HeaderFooterDate_LanguageLanguageEnumRuleCall_1_1_0()); 
                    	    
                    pushFollow(FOLLOW_ruleLanguage_in_ruleHeaderFooterDate2535);
                    lv_dsl_HeaderFooterDate_Language_2_0=ruleLanguage();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getHeaderFooterDateRule());
                    	        }
                           		set(
                           			current, 
                           			"dsl_HeaderFooterDate_Language",
                            		lv_dsl_HeaderFooterDate_Language_2_0, 
                            		"Language");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }


                    }
                    break;

            }


            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleHeaderFooterDate"


    // $ANTLR start "entryRuleHeaderFooterPageNumber"
    // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:1105:1: entryRuleHeaderFooterPageNumber returns [EObject current=null] : iv_ruleHeaderFooterPageNumber= ruleHeaderFooterPageNumber EOF ;
    public final EObject entryRuleHeaderFooterPageNumber() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleHeaderFooterPageNumber = null;


        try {
            // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:1106:2: (iv_ruleHeaderFooterPageNumber= ruleHeaderFooterPageNumber EOF )
            // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:1107:2: iv_ruleHeaderFooterPageNumber= ruleHeaderFooterPageNumber EOF
            {
             newCompositeNode(grammarAccess.getHeaderFooterPageNumberRule()); 
            pushFollow(FOLLOW_ruleHeaderFooterPageNumber_in_entryRuleHeaderFooterPageNumber2573);
            iv_ruleHeaderFooterPageNumber=ruleHeaderFooterPageNumber();

            state._fsp--;

             current =iv_ruleHeaderFooterPageNumber; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleHeaderFooterPageNumber2583); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleHeaderFooterPageNumber"


    // $ANTLR start "ruleHeaderFooterPageNumber"
    // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:1114:1: ruleHeaderFooterPageNumber returns [EObject current=null] : ( (lv_dsl_HeaderFooterPageNumber_0_0= '@pageNbr' ) ) ;
    public final EObject ruleHeaderFooterPageNumber() throws RecognitionException {
        EObject current = null;

        Token lv_dsl_HeaderFooterPageNumber_0_0=null;

         enterRule(); 
            
        try {
            // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:1117:28: ( ( (lv_dsl_HeaderFooterPageNumber_0_0= '@pageNbr' ) ) )
            // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:1118:1: ( (lv_dsl_HeaderFooterPageNumber_0_0= '@pageNbr' ) )
            {
            // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:1118:1: ( (lv_dsl_HeaderFooterPageNumber_0_0= '@pageNbr' ) )
            // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:1119:1: (lv_dsl_HeaderFooterPageNumber_0_0= '@pageNbr' )
            {
            // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:1119:1: (lv_dsl_HeaderFooterPageNumber_0_0= '@pageNbr' )
            // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:1120:3: lv_dsl_HeaderFooterPageNumber_0_0= '@pageNbr'
            {
            lv_dsl_HeaderFooterPageNumber_0_0=(Token)match(input,37,FOLLOW_37_in_ruleHeaderFooterPageNumber2625); 

                    newLeafNode(lv_dsl_HeaderFooterPageNumber_0_0, grammarAccess.getHeaderFooterPageNumberAccess().getDsl_HeaderFooterPageNumberPageNbrKeyword_0());
                

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getHeaderFooterPageNumberRule());
            	        }
                   		setWithLastConsumed(current, "dsl_HeaderFooterPageNumber", true, "@pageNbr");
            	    

            }


            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleHeaderFooterPageNumber"


    // $ANTLR start "entryRuleHeaderFooterLookup"
    // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:1141:1: entryRuleHeaderFooterLookup returns [EObject current=null] : iv_ruleHeaderFooterLookup= ruleHeaderFooterLookup EOF ;
    public final EObject entryRuleHeaderFooterLookup() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleHeaderFooterLookup = null;


        try {
            // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:1142:2: (iv_ruleHeaderFooterLookup= ruleHeaderFooterLookup EOF )
            // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:1143:2: iv_ruleHeaderFooterLookup= ruleHeaderFooterLookup EOF
            {
             newCompositeNode(grammarAccess.getHeaderFooterLookupRule()); 
            pushFollow(FOLLOW_ruleHeaderFooterLookup_in_entryRuleHeaderFooterLookup2673);
            iv_ruleHeaderFooterLookup=ruleHeaderFooterLookup();

            state._fsp--;

             current =iv_ruleHeaderFooterLookup; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleHeaderFooterLookup2683); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleHeaderFooterLookup"


    // $ANTLR start "ruleHeaderFooterLookup"
    // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:1150:1: ruleHeaderFooterLookup returns [EObject current=null] : (otherlv_0= '@lookup' ( (lv_dsl_HeaderFooterLookup_Elements_1_0= ruleElementType ) )* otherlv_2= 'lang' ( (lv_dsl_HeaderFooterLookup_Language_3_0= ruleLanguage ) ) ) ;
    public final EObject ruleHeaderFooterLookup() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        EObject lv_dsl_HeaderFooterLookup_Elements_1_0 = null;

        Enumerator lv_dsl_HeaderFooterLookup_Language_3_0 = null;


         enterRule(); 
            
        try {
            // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:1153:28: ( (otherlv_0= '@lookup' ( (lv_dsl_HeaderFooterLookup_Elements_1_0= ruleElementType ) )* otherlv_2= 'lang' ( (lv_dsl_HeaderFooterLookup_Language_3_0= ruleLanguage ) ) ) )
            // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:1154:1: (otherlv_0= '@lookup' ( (lv_dsl_HeaderFooterLookup_Elements_1_0= ruleElementType ) )* otherlv_2= 'lang' ( (lv_dsl_HeaderFooterLookup_Language_3_0= ruleLanguage ) ) )
            {
            // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:1154:1: (otherlv_0= '@lookup' ( (lv_dsl_HeaderFooterLookup_Elements_1_0= ruleElementType ) )* otherlv_2= 'lang' ( (lv_dsl_HeaderFooterLookup_Language_3_0= ruleLanguage ) ) )
            // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:1154:3: otherlv_0= '@lookup' ( (lv_dsl_HeaderFooterLookup_Elements_1_0= ruleElementType ) )* otherlv_2= 'lang' ( (lv_dsl_HeaderFooterLookup_Language_3_0= ruleLanguage ) )
            {
            otherlv_0=(Token)match(input,38,FOLLOW_38_in_ruleHeaderFooterLookup2720); 

                	newLeafNode(otherlv_0, grammarAccess.getHeaderFooterLookupAccess().getLookupKeyword_0());
                
            // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:1158:1: ( (lv_dsl_HeaderFooterLookup_Elements_1_0= ruleElementType ) )*
            loop21:
            do {
                int alt21=2;
                int LA21_0 = input.LA(1);

                if ( (LA21_0==49||LA21_0==52||(LA21_0>=55 && LA21_0<=56)) ) {
                    alt21=1;
                }


                switch (alt21) {
            	case 1 :
            	    // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:1159:1: (lv_dsl_HeaderFooterLookup_Elements_1_0= ruleElementType )
            	    {
            	    // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:1159:1: (lv_dsl_HeaderFooterLookup_Elements_1_0= ruleElementType )
            	    // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:1160:3: lv_dsl_HeaderFooterLookup_Elements_1_0= ruleElementType
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getHeaderFooterLookupAccess().getDsl_HeaderFooterLookup_ElementsElementTypeParserRuleCall_1_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleElementType_in_ruleHeaderFooterLookup2741);
            	    lv_dsl_HeaderFooterLookup_Elements_1_0=ruleElementType();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getHeaderFooterLookupRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"dsl_HeaderFooterLookup_Elements",
            	            		lv_dsl_HeaderFooterLookup_Elements_1_0, 
            	            		"ElementType");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }
            	    break;

            	default :
            	    break loop21;
                }
            } while (true);

            otherlv_2=(Token)match(input,36,FOLLOW_36_in_ruleHeaderFooterLookup2754); 

                	newLeafNode(otherlv_2, grammarAccess.getHeaderFooterLookupAccess().getLangKeyword_2());
                
            // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:1180:1: ( (lv_dsl_HeaderFooterLookup_Language_3_0= ruleLanguage ) )
            // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:1181:1: (lv_dsl_HeaderFooterLookup_Language_3_0= ruleLanguage )
            {
            // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:1181:1: (lv_dsl_HeaderFooterLookup_Language_3_0= ruleLanguage )
            // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:1182:3: lv_dsl_HeaderFooterLookup_Language_3_0= ruleLanguage
            {
             
            	        newCompositeNode(grammarAccess.getHeaderFooterLookupAccess().getDsl_HeaderFooterLookup_LanguageLanguageEnumRuleCall_3_0()); 
            	    
            pushFollow(FOLLOW_ruleLanguage_in_ruleHeaderFooterLookup2775);
            lv_dsl_HeaderFooterLookup_Language_3_0=ruleLanguage();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getHeaderFooterLookupRule());
            	        }
                   		set(
                   			current, 
                   			"dsl_HeaderFooterLookup_Language",
                    		lv_dsl_HeaderFooterLookup_Language_3_0, 
                    		"Language");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }


            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleHeaderFooterLookup"


    // $ANTLR start "entryRuleHeaderFooterTitle"
    // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:1206:1: entryRuleHeaderFooterTitle returns [EObject current=null] : iv_ruleHeaderFooterTitle= ruleHeaderFooterTitle EOF ;
    public final EObject entryRuleHeaderFooterTitle() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleHeaderFooterTitle = null;


        try {
            // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:1207:2: (iv_ruleHeaderFooterTitle= ruleHeaderFooterTitle EOF )
            // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:1208:2: iv_ruleHeaderFooterTitle= ruleHeaderFooterTitle EOF
            {
             newCompositeNode(grammarAccess.getHeaderFooterTitleRule()); 
            pushFollow(FOLLOW_ruleHeaderFooterTitle_in_entryRuleHeaderFooterTitle2811);
            iv_ruleHeaderFooterTitle=ruleHeaderFooterTitle();

            state._fsp--;

             current =iv_ruleHeaderFooterTitle; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleHeaderFooterTitle2821); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleHeaderFooterTitle"


    // $ANTLR start "ruleHeaderFooterTitle"
    // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:1215:1: ruleHeaderFooterTitle returns [EObject current=null] : ( (lv_dsl_HeaderFooterTitle_0_0= '@title' ) ) ;
    public final EObject ruleHeaderFooterTitle() throws RecognitionException {
        EObject current = null;

        Token lv_dsl_HeaderFooterTitle_0_0=null;

         enterRule(); 
            
        try {
            // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:1218:28: ( ( (lv_dsl_HeaderFooterTitle_0_0= '@title' ) ) )
            // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:1219:1: ( (lv_dsl_HeaderFooterTitle_0_0= '@title' ) )
            {
            // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:1219:1: ( (lv_dsl_HeaderFooterTitle_0_0= '@title' ) )
            // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:1220:1: (lv_dsl_HeaderFooterTitle_0_0= '@title' )
            {
            // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:1220:1: (lv_dsl_HeaderFooterTitle_0_0= '@title' )
            // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:1221:3: lv_dsl_HeaderFooterTitle_0_0= '@title'
            {
            lv_dsl_HeaderFooterTitle_0_0=(Token)match(input,39,FOLLOW_39_in_ruleHeaderFooterTitle2863); 

                    newLeafNode(lv_dsl_HeaderFooterTitle_0_0, grammarAccess.getHeaderFooterTitleAccess().getDsl_HeaderFooterTitleTitleKeyword_0());
                

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getHeaderFooterTitleRule());
            	        }
                   		setWithLastConsumed(current, "dsl_HeaderFooterTitle", true, "@title");
            	    

            }


            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleHeaderFooterTitle"


    // $ANTLR start "entryRuleHeaderFooterCommemoration"
    // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:1242:1: entryRuleHeaderFooterCommemoration returns [EObject current=null] : iv_ruleHeaderFooterCommemoration= ruleHeaderFooterCommemoration EOF ;
    public final EObject entryRuleHeaderFooterCommemoration() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleHeaderFooterCommemoration = null;


        try {
            // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:1243:2: (iv_ruleHeaderFooterCommemoration= ruleHeaderFooterCommemoration EOF )
            // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:1244:2: iv_ruleHeaderFooterCommemoration= ruleHeaderFooterCommemoration EOF
            {
             newCompositeNode(grammarAccess.getHeaderFooterCommemorationRule()); 
            pushFollow(FOLLOW_ruleHeaderFooterCommemoration_in_entryRuleHeaderFooterCommemoration2911);
            iv_ruleHeaderFooterCommemoration=ruleHeaderFooterCommemoration();

            state._fsp--;

             current =iv_ruleHeaderFooterCommemoration; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleHeaderFooterCommemoration2921); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleHeaderFooterCommemoration"


    // $ANTLR start "ruleHeaderFooterCommemoration"
    // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:1251:1: ruleHeaderFooterCommemoration returns [EObject current=null] : ( (lv_dsl_HeaderFooterCommemoration_0_0= '@commemoration' ) ) ;
    public final EObject ruleHeaderFooterCommemoration() throws RecognitionException {
        EObject current = null;

        Token lv_dsl_HeaderFooterCommemoration_0_0=null;

         enterRule(); 
            
        try {
            // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:1254:28: ( ( (lv_dsl_HeaderFooterCommemoration_0_0= '@commemoration' ) ) )
            // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:1255:1: ( (lv_dsl_HeaderFooterCommemoration_0_0= '@commemoration' ) )
            {
            // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:1255:1: ( (lv_dsl_HeaderFooterCommemoration_0_0= '@commemoration' ) )
            // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:1256:1: (lv_dsl_HeaderFooterCommemoration_0_0= '@commemoration' )
            {
            // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:1256:1: (lv_dsl_HeaderFooterCommemoration_0_0= '@commemoration' )
            // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:1257:3: lv_dsl_HeaderFooterCommemoration_0_0= '@commemoration'
            {
            lv_dsl_HeaderFooterCommemoration_0_0=(Token)match(input,40,FOLLOW_40_in_ruleHeaderFooterCommemoration2963); 

                    newLeafNode(lv_dsl_HeaderFooterCommemoration_0_0, grammarAccess.getHeaderFooterCommemorationAccess().getDsl_HeaderFooterCommemorationCommemorationKeyword_0());
                

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getHeaderFooterCommemorationRule());
            	        }
                   		setWithLastConsumed(current, "dsl_HeaderFooterCommemoration", true, "@commemoration");
            	    

            }


            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleHeaderFooterCommemoration"


    // $ANTLR start "entryRuleCommemoration"
    // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:1278:1: entryRuleCommemoration returns [EObject current=null] : iv_ruleCommemoration= ruleCommemoration EOF ;
    public final EObject entryRuleCommemoration() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCommemoration = null;


        try {
            // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:1279:2: (iv_ruleCommemoration= ruleCommemoration EOF )
            // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:1280:2: iv_ruleCommemoration= ruleCommemoration EOF
            {
             newCompositeNode(grammarAccess.getCommemorationRule()); 
            pushFollow(FOLLOW_ruleCommemoration_in_entryRuleCommemoration3011);
            iv_ruleCommemoration=ruleCommemoration();

            state._fsp--;

             current =iv_ruleCommemoration; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleCommemoration3021); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleCommemoration"


    // $ANTLR start "ruleCommemoration"
    // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:1287:1: ruleCommemoration returns [EObject current=null] : (otherlv_0= 'Template_Commemoration' ( (lv_dsl_Commemoration_Elements_1_0= ruleHeaderFooterFragment ) )+ otherlv_2= 'End_Template_Commemoration' ) ;
    public final EObject ruleCommemoration() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        EObject lv_dsl_Commemoration_Elements_1_0 = null;


         enterRule(); 
            
        try {
            // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:1290:28: ( (otherlv_0= 'Template_Commemoration' ( (lv_dsl_Commemoration_Elements_1_0= ruleHeaderFooterFragment ) )+ otherlv_2= 'End_Template_Commemoration' ) )
            // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:1291:1: (otherlv_0= 'Template_Commemoration' ( (lv_dsl_Commemoration_Elements_1_0= ruleHeaderFooterFragment ) )+ otherlv_2= 'End_Template_Commemoration' )
            {
            // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:1291:1: (otherlv_0= 'Template_Commemoration' ( (lv_dsl_Commemoration_Elements_1_0= ruleHeaderFooterFragment ) )+ otherlv_2= 'End_Template_Commemoration' )
            // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:1291:3: otherlv_0= 'Template_Commemoration' ( (lv_dsl_Commemoration_Elements_1_0= ruleHeaderFooterFragment ) )+ otherlv_2= 'End_Template_Commemoration'
            {
            otherlv_0=(Token)match(input,41,FOLLOW_41_in_ruleCommemoration3058); 

                	newLeafNode(otherlv_0, grammarAccess.getCommemorationAccess().getTemplate_CommemorationKeyword_0());
                
            // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:1295:1: ( (lv_dsl_Commemoration_Elements_1_0= ruleHeaderFooterFragment ) )+
            int cnt22=0;
            loop22:
            do {
                int alt22=2;
                int LA22_0 = input.LA(1);

                if ( ((LA22_0>=34 && LA22_0<=35)||(LA22_0>=37 && LA22_0<=40)) ) {
                    alt22=1;
                }


                switch (alt22) {
            	case 1 :
            	    // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:1296:1: (lv_dsl_Commemoration_Elements_1_0= ruleHeaderFooterFragment )
            	    {
            	    // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:1296:1: (lv_dsl_Commemoration_Elements_1_0= ruleHeaderFooterFragment )
            	    // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:1297:3: lv_dsl_Commemoration_Elements_1_0= ruleHeaderFooterFragment
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getCommemorationAccess().getDsl_Commemoration_ElementsHeaderFooterFragmentParserRuleCall_1_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleHeaderFooterFragment_in_ruleCommemoration3079);
            	    lv_dsl_Commemoration_Elements_1_0=ruleHeaderFooterFragment();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getCommemorationRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"dsl_Commemoration_Elements",
            	            		lv_dsl_Commemoration_Elements_1_0, 
            	            		"HeaderFooterFragment");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }
            	    break;

            	default :
            	    if ( cnt22 >= 1 ) break loop22;
                        EarlyExitException eee =
                            new EarlyExitException(22, input);
                        throw eee;
                }
                cnt22++;
            } while (true);

            otherlv_2=(Token)match(input,42,FOLLOW_42_in_ruleCommemoration3092); 

                	newLeafNode(otherlv_2, grammarAccess.getCommemorationAccess().getEnd_Template_CommemorationKeyword_2());
                

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleCommemoration"


    // $ANTLR start "entryRuleTemplateStatus"
    // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:1325:1: entryRuleTemplateStatus returns [EObject current=null] : iv_ruleTemplateStatus= ruleTemplateStatus EOF ;
    public final EObject entryRuleTemplateStatus() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTemplateStatus = null;


        try {
            // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:1326:2: (iv_ruleTemplateStatus= ruleTemplateStatus EOF )
            // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:1327:2: iv_ruleTemplateStatus= ruleTemplateStatus EOF
            {
             newCompositeNode(grammarAccess.getTemplateStatusRule()); 
            pushFollow(FOLLOW_ruleTemplateStatus_in_entryRuleTemplateStatus3128);
            iv_ruleTemplateStatus=ruleTemplateStatus();

            state._fsp--;

             current =iv_ruleTemplateStatus; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleTemplateStatus3138); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleTemplateStatus"


    // $ANTLR start "ruleTemplateStatus"
    // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:1334:1: ruleTemplateStatus returns [EObject current=null] : (otherlv_0= 'Status' ( (lv_dsl_TemplateStatus_1_0= ruleTemplateStatuses ) ) ) ;
    public final EObject ruleTemplateStatus() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Enumerator lv_dsl_TemplateStatus_1_0 = null;


         enterRule(); 
            
        try {
            // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:1337:28: ( (otherlv_0= 'Status' ( (lv_dsl_TemplateStatus_1_0= ruleTemplateStatuses ) ) ) )
            // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:1338:1: (otherlv_0= 'Status' ( (lv_dsl_TemplateStatus_1_0= ruleTemplateStatuses ) ) )
            {
            // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:1338:1: (otherlv_0= 'Status' ( (lv_dsl_TemplateStatus_1_0= ruleTemplateStatuses ) ) )
            // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:1338:3: otherlv_0= 'Status' ( (lv_dsl_TemplateStatus_1_0= ruleTemplateStatuses ) )
            {
            otherlv_0=(Token)match(input,43,FOLLOW_43_in_ruleTemplateStatus3175); 

                	newLeafNode(otherlv_0, grammarAccess.getTemplateStatusAccess().getStatusKeyword_0());
                
            // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:1342:1: ( (lv_dsl_TemplateStatus_1_0= ruleTemplateStatuses ) )
            // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:1343:1: (lv_dsl_TemplateStatus_1_0= ruleTemplateStatuses )
            {
            // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:1343:1: (lv_dsl_TemplateStatus_1_0= ruleTemplateStatuses )
            // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:1344:3: lv_dsl_TemplateStatus_1_0= ruleTemplateStatuses
            {
             
            	        newCompositeNode(grammarAccess.getTemplateStatusAccess().getDsl_TemplateStatusTemplateStatusesEnumRuleCall_1_0()); 
            	    
            pushFollow(FOLLOW_ruleTemplateStatuses_in_ruleTemplateStatus3196);
            lv_dsl_TemplateStatus_1_0=ruleTemplateStatuses();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getTemplateStatusRule());
            	        }
                   		set(
                   			current, 
                   			"dsl_TemplateStatus",
                    		lv_dsl_TemplateStatus_1_0, 
                    		"TemplateStatuses");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }


            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleTemplateStatus"


    // $ANTLR start "entryRuleAbstractComponent"
    // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:1368:1: entryRuleAbstractComponent returns [EObject current=null] : iv_ruleAbstractComponent= ruleAbstractComponent EOF ;
    public final EObject entryRuleAbstractComponent() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAbstractComponent = null;


        try {
            // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:1369:2: (iv_ruleAbstractComponent= ruleAbstractComponent EOF )
            // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:1370:2: iv_ruleAbstractComponent= ruleAbstractComponent EOF
            {
             newCompositeNode(grammarAccess.getAbstractComponentRule()); 
            pushFollow(FOLLOW_ruleAbstractComponent_in_entryRuleAbstractComponent3232);
            iv_ruleAbstractComponent=ruleAbstractComponent();

            state._fsp--;

             current =iv_ruleAbstractComponent; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleAbstractComponent3242); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleAbstractComponent"


    // $ANTLR start "ruleAbstractComponent"
    // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:1377:1: ruleAbstractComponent returns [EObject current=null] : (this_Actor_0= ruleActor | this_Aid_1= ruleAid | this_Block_2= ruleBlock | this_Break_3= ruleBreak | this_Dialog_4= ruleDialog | this_Title_5= ruleTitle | this_Heading1_6= ruleHeading1 | this_Heading2_7= ruleHeading2 | this_Heading3_8= ruleHeading3 | this_Hymn_9= ruleHymn | this_Media_10= ruleMedia | this_Info_11= ruleInfo | this_LitBook_12= ruleLitBook | this_Paragraph_13= ruleParagraph | this_PassThroughHtml_14= rulePassThroughHtml | this_PassThroughPdf_15= rulePassThroughPdf | this_Reading_16= ruleReading | this_RestoreLocale_17= ruleRestoreLocale | this_Rubric_18= ruleRubric | this_Section_19= ruleSection | this_SectionFragment_20= ruleSectionFragment | this_SetLocale_21= ruleSetLocale | this_TemplateFragment_22= ruleTemplateFragment | this_SubTitle_23= ruleSubTitle | this_Verse_24= ruleVerse | this_Version_25= ruleVersion | this_VersionSwitch_26= ruleVersionSwitch | this_WhenDate_27= ruleWhenDate | this_WhenDayName_28= ruleWhenDayName | this_WhenExists_29= ruleWhenExists | this_WhenLukanCycleDay_30= ruleWhenLukanCycleDay | this_WhenModeOfWeek_31= ruleWhenModeOfWeek | this_WhenPascha_32= ruleWhenPascha | this_WhenMovableCycleDay_33= ruleWhenMovableCycleDay | this_WhenPentecostarionDay_34= ruleWhenPentecostarionDay | this_WhenSundayAfterElevationOfCrossDay_35= ruleWhenSundayAfterElevationOfCrossDay | this_WhenTriodionDay_36= ruleWhenTriodionDay | this_WhenSundaysBeforeTriodion_37= ruleWhenSundaysBeforeTriodion ) ;
    public final EObject ruleAbstractComponent() throws RecognitionException {
        EObject current = null;

        EObject this_Actor_0 = null;

        EObject this_Aid_1 = null;

        EObject this_Block_2 = null;

        EObject this_Break_3 = null;

        EObject this_Dialog_4 = null;

        EObject this_Title_5 = null;

        EObject this_Heading1_6 = null;

        EObject this_Heading2_7 = null;

        EObject this_Heading3_8 = null;

        EObject this_Hymn_9 = null;

        EObject this_Media_10 = null;

        EObject this_Info_11 = null;

        EObject this_LitBook_12 = null;

        EObject this_Paragraph_13 = null;

        EObject this_PassThroughHtml_14 = null;

        EObject this_PassThroughPdf_15 = null;

        EObject this_Reading_16 = null;

        EObject this_RestoreLocale_17 = null;

        EObject this_Rubric_18 = null;

        EObject this_Section_19 = null;

        EObject this_SectionFragment_20 = null;

        EObject this_SetLocale_21 = null;

        EObject this_TemplateFragment_22 = null;

        EObject this_SubTitle_23 = null;

        EObject this_Verse_24 = null;

        EObject this_Version_25 = null;

        EObject this_VersionSwitch_26 = null;

        EObject this_WhenDate_27 = null;

        EObject this_WhenDayName_28 = null;

        EObject this_WhenExists_29 = null;

        EObject this_WhenLukanCycleDay_30 = null;

        EObject this_WhenModeOfWeek_31 = null;

        EObject this_WhenPascha_32 = null;

        EObject this_WhenMovableCycleDay_33 = null;

        EObject this_WhenPentecostarionDay_34 = null;

        EObject this_WhenSundayAfterElevationOfCrossDay_35 = null;

        EObject this_WhenTriodionDay_36 = null;

        EObject this_WhenSundaysBeforeTriodion_37 = null;


         enterRule(); 
            
        try {
            // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:1380:28: ( (this_Actor_0= ruleActor | this_Aid_1= ruleAid | this_Block_2= ruleBlock | this_Break_3= ruleBreak | this_Dialog_4= ruleDialog | this_Title_5= ruleTitle | this_Heading1_6= ruleHeading1 | this_Heading2_7= ruleHeading2 | this_Heading3_8= ruleHeading3 | this_Hymn_9= ruleHymn | this_Media_10= ruleMedia | this_Info_11= ruleInfo | this_LitBook_12= ruleLitBook | this_Paragraph_13= ruleParagraph | this_PassThroughHtml_14= rulePassThroughHtml | this_PassThroughPdf_15= rulePassThroughPdf | this_Reading_16= ruleReading | this_RestoreLocale_17= ruleRestoreLocale | this_Rubric_18= ruleRubric | this_Section_19= ruleSection | this_SectionFragment_20= ruleSectionFragment | this_SetLocale_21= ruleSetLocale | this_TemplateFragment_22= ruleTemplateFragment | this_SubTitle_23= ruleSubTitle | this_Verse_24= ruleVerse | this_Version_25= ruleVersion | this_VersionSwitch_26= ruleVersionSwitch | this_WhenDate_27= ruleWhenDate | this_WhenDayName_28= ruleWhenDayName | this_WhenExists_29= ruleWhenExists | this_WhenLukanCycleDay_30= ruleWhenLukanCycleDay | this_WhenModeOfWeek_31= ruleWhenModeOfWeek | this_WhenPascha_32= ruleWhenPascha | this_WhenMovableCycleDay_33= ruleWhenMovableCycleDay | this_WhenPentecostarionDay_34= ruleWhenPentecostarionDay | this_WhenSundayAfterElevationOfCrossDay_35= ruleWhenSundayAfterElevationOfCrossDay | this_WhenTriodionDay_36= ruleWhenTriodionDay | this_WhenSundaysBeforeTriodion_37= ruleWhenSundaysBeforeTriodion ) )
            // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:1381:1: (this_Actor_0= ruleActor | this_Aid_1= ruleAid | this_Block_2= ruleBlock | this_Break_3= ruleBreak | this_Dialog_4= ruleDialog | this_Title_5= ruleTitle | this_Heading1_6= ruleHeading1 | this_Heading2_7= ruleHeading2 | this_Heading3_8= ruleHeading3 | this_Hymn_9= ruleHymn | this_Media_10= ruleMedia | this_Info_11= ruleInfo | this_LitBook_12= ruleLitBook | this_Paragraph_13= ruleParagraph | this_PassThroughHtml_14= rulePassThroughHtml | this_PassThroughPdf_15= rulePassThroughPdf | this_Reading_16= ruleReading | this_RestoreLocale_17= ruleRestoreLocale | this_Rubric_18= ruleRubric | this_Section_19= ruleSection | this_SectionFragment_20= ruleSectionFragment | this_SetLocale_21= ruleSetLocale | this_TemplateFragment_22= ruleTemplateFragment | this_SubTitle_23= ruleSubTitle | this_Verse_24= ruleVerse | this_Version_25= ruleVersion | this_VersionSwitch_26= ruleVersionSwitch | this_WhenDate_27= ruleWhenDate | this_WhenDayName_28= ruleWhenDayName | this_WhenExists_29= ruleWhenExists | this_WhenLukanCycleDay_30= ruleWhenLukanCycleDay | this_WhenModeOfWeek_31= ruleWhenModeOfWeek | this_WhenPascha_32= ruleWhenPascha | this_WhenMovableCycleDay_33= ruleWhenMovableCycleDay | this_WhenPentecostarionDay_34= ruleWhenPentecostarionDay | this_WhenSundayAfterElevationOfCrossDay_35= ruleWhenSundayAfterElevationOfCrossDay | this_WhenTriodionDay_36= ruleWhenTriodionDay | this_WhenSundaysBeforeTriodion_37= ruleWhenSundaysBeforeTriodion )
            {
            // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:1381:1: (this_Actor_0= ruleActor | this_Aid_1= ruleAid | this_Block_2= ruleBlock | this_Break_3= ruleBreak | this_Dialog_4= ruleDialog | this_Title_5= ruleTitle | this_Heading1_6= ruleHeading1 | this_Heading2_7= ruleHeading2 | this_Heading3_8= ruleHeading3 | this_Hymn_9= ruleHymn | this_Media_10= ruleMedia | this_Info_11= ruleInfo | this_LitBook_12= ruleLitBook | this_Paragraph_13= ruleParagraph | this_PassThroughHtml_14= rulePassThroughHtml | this_PassThroughPdf_15= rulePassThroughPdf | this_Reading_16= ruleReading | this_RestoreLocale_17= ruleRestoreLocale | this_Rubric_18= ruleRubric | this_Section_19= ruleSection | this_SectionFragment_20= ruleSectionFragment | this_SetLocale_21= ruleSetLocale | this_TemplateFragment_22= ruleTemplateFragment | this_SubTitle_23= ruleSubTitle | this_Verse_24= ruleVerse | this_Version_25= ruleVersion | this_VersionSwitch_26= ruleVersionSwitch | this_WhenDate_27= ruleWhenDate | this_WhenDayName_28= ruleWhenDayName | this_WhenExists_29= ruleWhenExists | this_WhenLukanCycleDay_30= ruleWhenLukanCycleDay | this_WhenModeOfWeek_31= ruleWhenModeOfWeek | this_WhenPascha_32= ruleWhenPascha | this_WhenMovableCycleDay_33= ruleWhenMovableCycleDay | this_WhenPentecostarionDay_34= ruleWhenPentecostarionDay | this_WhenSundayAfterElevationOfCrossDay_35= ruleWhenSundayAfterElevationOfCrossDay | this_WhenTriodionDay_36= ruleWhenTriodionDay | this_WhenSundaysBeforeTriodion_37= ruleWhenSundaysBeforeTriodion )
            int alt23=38;
            alt23 = dfa23.predict(input);
            switch (alt23) {
                case 1 :
                    // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:1382:5: this_Actor_0= ruleActor
                    {
                     
                            newCompositeNode(grammarAccess.getAbstractComponentAccess().getActorParserRuleCall_0()); 
                        
                    pushFollow(FOLLOW_ruleActor_in_ruleAbstractComponent3289);
                    this_Actor_0=ruleActor();

                    state._fsp--;

                     
                            current = this_Actor_0; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 2 :
                    // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:1392:5: this_Aid_1= ruleAid
                    {
                     
                            newCompositeNode(grammarAccess.getAbstractComponentAccess().getAidParserRuleCall_1()); 
                        
                    pushFollow(FOLLOW_ruleAid_in_ruleAbstractComponent3316);
                    this_Aid_1=ruleAid();

                    state._fsp--;

                     
                            current = this_Aid_1; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 3 :
                    // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:1402:5: this_Block_2= ruleBlock
                    {
                     
                            newCompositeNode(grammarAccess.getAbstractComponentAccess().getBlockParserRuleCall_2()); 
                        
                    pushFollow(FOLLOW_ruleBlock_in_ruleAbstractComponent3343);
                    this_Block_2=ruleBlock();

                    state._fsp--;

                     
                            current = this_Block_2; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 4 :
                    // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:1412:5: this_Break_3= ruleBreak
                    {
                     
                            newCompositeNode(grammarAccess.getAbstractComponentAccess().getBreakParserRuleCall_3()); 
                        
                    pushFollow(FOLLOW_ruleBreak_in_ruleAbstractComponent3370);
                    this_Break_3=ruleBreak();

                    state._fsp--;

                     
                            current = this_Break_3; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 5 :
                    // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:1422:5: this_Dialog_4= ruleDialog
                    {
                     
                            newCompositeNode(grammarAccess.getAbstractComponentAccess().getDialogParserRuleCall_4()); 
                        
                    pushFollow(FOLLOW_ruleDialog_in_ruleAbstractComponent3397);
                    this_Dialog_4=ruleDialog();

                    state._fsp--;

                     
                            current = this_Dialog_4; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 6 :
                    // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:1432:5: this_Title_5= ruleTitle
                    {
                     
                            newCompositeNode(grammarAccess.getAbstractComponentAccess().getTitleParserRuleCall_5()); 
                        
                    pushFollow(FOLLOW_ruleTitle_in_ruleAbstractComponent3424);
                    this_Title_5=ruleTitle();

                    state._fsp--;

                     
                            current = this_Title_5; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 7 :
                    // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:1442:5: this_Heading1_6= ruleHeading1
                    {
                     
                            newCompositeNode(grammarAccess.getAbstractComponentAccess().getHeading1ParserRuleCall_6()); 
                        
                    pushFollow(FOLLOW_ruleHeading1_in_ruleAbstractComponent3451);
                    this_Heading1_6=ruleHeading1();

                    state._fsp--;

                     
                            current = this_Heading1_6; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 8 :
                    // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:1452:5: this_Heading2_7= ruleHeading2
                    {
                     
                            newCompositeNode(grammarAccess.getAbstractComponentAccess().getHeading2ParserRuleCall_7()); 
                        
                    pushFollow(FOLLOW_ruleHeading2_in_ruleAbstractComponent3478);
                    this_Heading2_7=ruleHeading2();

                    state._fsp--;

                     
                            current = this_Heading2_7; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 9 :
                    // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:1462:5: this_Heading3_8= ruleHeading3
                    {
                     
                            newCompositeNode(grammarAccess.getAbstractComponentAccess().getHeading3ParserRuleCall_8()); 
                        
                    pushFollow(FOLLOW_ruleHeading3_in_ruleAbstractComponent3505);
                    this_Heading3_8=ruleHeading3();

                    state._fsp--;

                     
                            current = this_Heading3_8; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 10 :
                    // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:1472:5: this_Hymn_9= ruleHymn
                    {
                     
                            newCompositeNode(grammarAccess.getAbstractComponentAccess().getHymnParserRuleCall_9()); 
                        
                    pushFollow(FOLLOW_ruleHymn_in_ruleAbstractComponent3532);
                    this_Hymn_9=ruleHymn();

                    state._fsp--;

                     
                            current = this_Hymn_9; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 11 :
                    // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:1482:5: this_Media_10= ruleMedia
                    {
                     
                            newCompositeNode(grammarAccess.getAbstractComponentAccess().getMediaParserRuleCall_10()); 
                        
                    pushFollow(FOLLOW_ruleMedia_in_ruleAbstractComponent3559);
                    this_Media_10=ruleMedia();

                    state._fsp--;

                     
                            current = this_Media_10; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 12 :
                    // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:1492:5: this_Info_11= ruleInfo
                    {
                     
                            newCompositeNode(grammarAccess.getAbstractComponentAccess().getInfoParserRuleCall_11()); 
                        
                    pushFollow(FOLLOW_ruleInfo_in_ruleAbstractComponent3586);
                    this_Info_11=ruleInfo();

                    state._fsp--;

                     
                            current = this_Info_11; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 13 :
                    // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:1502:5: this_LitBook_12= ruleLitBook
                    {
                     
                            newCompositeNode(grammarAccess.getAbstractComponentAccess().getLitBookParserRuleCall_12()); 
                        
                    pushFollow(FOLLOW_ruleLitBook_in_ruleAbstractComponent3613);
                    this_LitBook_12=ruleLitBook();

                    state._fsp--;

                     
                            current = this_LitBook_12; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 14 :
                    // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:1512:5: this_Paragraph_13= ruleParagraph
                    {
                     
                            newCompositeNode(grammarAccess.getAbstractComponentAccess().getParagraphParserRuleCall_13()); 
                        
                    pushFollow(FOLLOW_ruleParagraph_in_ruleAbstractComponent3640);
                    this_Paragraph_13=ruleParagraph();

                    state._fsp--;

                     
                            current = this_Paragraph_13; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 15 :
                    // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:1522:5: this_PassThroughHtml_14= rulePassThroughHtml
                    {
                     
                            newCompositeNode(grammarAccess.getAbstractComponentAccess().getPassThroughHtmlParserRuleCall_14()); 
                        
                    pushFollow(FOLLOW_rulePassThroughHtml_in_ruleAbstractComponent3667);
                    this_PassThroughHtml_14=rulePassThroughHtml();

                    state._fsp--;

                     
                            current = this_PassThroughHtml_14; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 16 :
                    // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:1532:5: this_PassThroughPdf_15= rulePassThroughPdf
                    {
                     
                            newCompositeNode(grammarAccess.getAbstractComponentAccess().getPassThroughPdfParserRuleCall_15()); 
                        
                    pushFollow(FOLLOW_rulePassThroughPdf_in_ruleAbstractComponent3694);
                    this_PassThroughPdf_15=rulePassThroughPdf();

                    state._fsp--;

                     
                            current = this_PassThroughPdf_15; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 17 :
                    // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:1542:5: this_Reading_16= ruleReading
                    {
                     
                            newCompositeNode(grammarAccess.getAbstractComponentAccess().getReadingParserRuleCall_16()); 
                        
                    pushFollow(FOLLOW_ruleReading_in_ruleAbstractComponent3721);
                    this_Reading_16=ruleReading();

                    state._fsp--;

                     
                            current = this_Reading_16; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 18 :
                    // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:1552:5: this_RestoreLocale_17= ruleRestoreLocale
                    {
                     
                            newCompositeNode(grammarAccess.getAbstractComponentAccess().getRestoreLocaleParserRuleCall_17()); 
                        
                    pushFollow(FOLLOW_ruleRestoreLocale_in_ruleAbstractComponent3748);
                    this_RestoreLocale_17=ruleRestoreLocale();

                    state._fsp--;

                     
                            current = this_RestoreLocale_17; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 19 :
                    // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:1562:5: this_Rubric_18= ruleRubric
                    {
                     
                            newCompositeNode(grammarAccess.getAbstractComponentAccess().getRubricParserRuleCall_18()); 
                        
                    pushFollow(FOLLOW_ruleRubric_in_ruleAbstractComponent3775);
                    this_Rubric_18=ruleRubric();

                    state._fsp--;

                     
                            current = this_Rubric_18; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 20 :
                    // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:1572:5: this_Section_19= ruleSection
                    {
                     
                            newCompositeNode(grammarAccess.getAbstractComponentAccess().getSectionParserRuleCall_19()); 
                        
                    pushFollow(FOLLOW_ruleSection_in_ruleAbstractComponent3802);
                    this_Section_19=ruleSection();

                    state._fsp--;

                     
                            current = this_Section_19; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 21 :
                    // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:1582:5: this_SectionFragment_20= ruleSectionFragment
                    {
                     
                            newCompositeNode(grammarAccess.getAbstractComponentAccess().getSectionFragmentParserRuleCall_20()); 
                        
                    pushFollow(FOLLOW_ruleSectionFragment_in_ruleAbstractComponent3829);
                    this_SectionFragment_20=ruleSectionFragment();

                    state._fsp--;

                     
                            current = this_SectionFragment_20; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 22 :
                    // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:1592:5: this_SetLocale_21= ruleSetLocale
                    {
                     
                            newCompositeNode(grammarAccess.getAbstractComponentAccess().getSetLocaleParserRuleCall_21()); 
                        
                    pushFollow(FOLLOW_ruleSetLocale_in_ruleAbstractComponent3856);
                    this_SetLocale_21=ruleSetLocale();

                    state._fsp--;

                     
                            current = this_SetLocale_21; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 23 :
                    // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:1602:5: this_TemplateFragment_22= ruleTemplateFragment
                    {
                     
                            newCompositeNode(grammarAccess.getAbstractComponentAccess().getTemplateFragmentParserRuleCall_22()); 
                        
                    pushFollow(FOLLOW_ruleTemplateFragment_in_ruleAbstractComponent3883);
                    this_TemplateFragment_22=ruleTemplateFragment();

                    state._fsp--;

                     
                            current = this_TemplateFragment_22; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 24 :
                    // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:1612:5: this_SubTitle_23= ruleSubTitle
                    {
                     
                            newCompositeNode(grammarAccess.getAbstractComponentAccess().getSubTitleParserRuleCall_23()); 
                        
                    pushFollow(FOLLOW_ruleSubTitle_in_ruleAbstractComponent3910);
                    this_SubTitle_23=ruleSubTitle();

                    state._fsp--;

                     
                            current = this_SubTitle_23; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 25 :
                    // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:1622:5: this_Verse_24= ruleVerse
                    {
                     
                            newCompositeNode(grammarAccess.getAbstractComponentAccess().getVerseParserRuleCall_24()); 
                        
                    pushFollow(FOLLOW_ruleVerse_in_ruleAbstractComponent3937);
                    this_Verse_24=ruleVerse();

                    state._fsp--;

                     
                            current = this_Verse_24; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 26 :
                    // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:1632:5: this_Version_25= ruleVersion
                    {
                     
                            newCompositeNode(grammarAccess.getAbstractComponentAccess().getVersionParserRuleCall_25()); 
                        
                    pushFollow(FOLLOW_ruleVersion_in_ruleAbstractComponent3964);
                    this_Version_25=ruleVersion();

                    state._fsp--;

                     
                            current = this_Version_25; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 27 :
                    // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:1642:5: this_VersionSwitch_26= ruleVersionSwitch
                    {
                     
                            newCompositeNode(grammarAccess.getAbstractComponentAccess().getVersionSwitchParserRuleCall_26()); 
                        
                    pushFollow(FOLLOW_ruleVersionSwitch_in_ruleAbstractComponent3991);
                    this_VersionSwitch_26=ruleVersionSwitch();

                    state._fsp--;

                     
                            current = this_VersionSwitch_26; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 28 :
                    // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:1652:5: this_WhenDate_27= ruleWhenDate
                    {
                     
                            newCompositeNode(grammarAccess.getAbstractComponentAccess().getWhenDateParserRuleCall_27()); 
                        
                    pushFollow(FOLLOW_ruleWhenDate_in_ruleAbstractComponent4018);
                    this_WhenDate_27=ruleWhenDate();

                    state._fsp--;

                     
                            current = this_WhenDate_27; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 29 :
                    // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:1662:5: this_WhenDayName_28= ruleWhenDayName
                    {
                     
                            newCompositeNode(grammarAccess.getAbstractComponentAccess().getWhenDayNameParserRuleCall_28()); 
                        
                    pushFollow(FOLLOW_ruleWhenDayName_in_ruleAbstractComponent4045);
                    this_WhenDayName_28=ruleWhenDayName();

                    state._fsp--;

                     
                            current = this_WhenDayName_28; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 30 :
                    // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:1672:5: this_WhenExists_29= ruleWhenExists
                    {
                     
                            newCompositeNode(grammarAccess.getAbstractComponentAccess().getWhenExistsParserRuleCall_29()); 
                        
                    pushFollow(FOLLOW_ruleWhenExists_in_ruleAbstractComponent4072);
                    this_WhenExists_29=ruleWhenExists();

                    state._fsp--;

                     
                            current = this_WhenExists_29; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 31 :
                    // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:1682:5: this_WhenLukanCycleDay_30= ruleWhenLukanCycleDay
                    {
                     
                            newCompositeNode(grammarAccess.getAbstractComponentAccess().getWhenLukanCycleDayParserRuleCall_30()); 
                        
                    pushFollow(FOLLOW_ruleWhenLukanCycleDay_in_ruleAbstractComponent4099);
                    this_WhenLukanCycleDay_30=ruleWhenLukanCycleDay();

                    state._fsp--;

                     
                            current = this_WhenLukanCycleDay_30; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 32 :
                    // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:1692:5: this_WhenModeOfWeek_31= ruleWhenModeOfWeek
                    {
                     
                            newCompositeNode(grammarAccess.getAbstractComponentAccess().getWhenModeOfWeekParserRuleCall_31()); 
                        
                    pushFollow(FOLLOW_ruleWhenModeOfWeek_in_ruleAbstractComponent4126);
                    this_WhenModeOfWeek_31=ruleWhenModeOfWeek();

                    state._fsp--;

                     
                            current = this_WhenModeOfWeek_31; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 33 :
                    // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:1702:5: this_WhenPascha_32= ruleWhenPascha
                    {
                     
                            newCompositeNode(grammarAccess.getAbstractComponentAccess().getWhenPaschaParserRuleCall_32()); 
                        
                    pushFollow(FOLLOW_ruleWhenPascha_in_ruleAbstractComponent4153);
                    this_WhenPascha_32=ruleWhenPascha();

                    state._fsp--;

                     
                            current = this_WhenPascha_32; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 34 :
                    // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:1712:5: this_WhenMovableCycleDay_33= ruleWhenMovableCycleDay
                    {
                     
                            newCompositeNode(grammarAccess.getAbstractComponentAccess().getWhenMovableCycleDayParserRuleCall_33()); 
                        
                    pushFollow(FOLLOW_ruleWhenMovableCycleDay_in_ruleAbstractComponent4180);
                    this_WhenMovableCycleDay_33=ruleWhenMovableCycleDay();

                    state._fsp--;

                     
                            current = this_WhenMovableCycleDay_33; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 35 :
                    // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:1722:5: this_WhenPentecostarionDay_34= ruleWhenPentecostarionDay
                    {
                     
                            newCompositeNode(grammarAccess.getAbstractComponentAccess().getWhenPentecostarionDayParserRuleCall_34()); 
                        
                    pushFollow(FOLLOW_ruleWhenPentecostarionDay_in_ruleAbstractComponent4207);
                    this_WhenPentecostarionDay_34=ruleWhenPentecostarionDay();

                    state._fsp--;

                     
                            current = this_WhenPentecostarionDay_34; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 36 :
                    // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:1732:5: this_WhenSundayAfterElevationOfCrossDay_35= ruleWhenSundayAfterElevationOfCrossDay
                    {
                     
                            newCompositeNode(grammarAccess.getAbstractComponentAccess().getWhenSundayAfterElevationOfCrossDayParserRuleCall_35()); 
                        
                    pushFollow(FOLLOW_ruleWhenSundayAfterElevationOfCrossDay_in_ruleAbstractComponent4234);
                    this_WhenSundayAfterElevationOfCrossDay_35=ruleWhenSundayAfterElevationOfCrossDay();

                    state._fsp--;

                     
                            current = this_WhenSundayAfterElevationOfCrossDay_35; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 37 :
                    // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:1742:5: this_WhenTriodionDay_36= ruleWhenTriodionDay
                    {
                     
                            newCompositeNode(grammarAccess.getAbstractComponentAccess().getWhenTriodionDayParserRuleCall_36()); 
                        
                    pushFollow(FOLLOW_ruleWhenTriodionDay_in_ruleAbstractComponent4261);
                    this_WhenTriodionDay_36=ruleWhenTriodionDay();

                    state._fsp--;

                     
                            current = this_WhenTriodionDay_36; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 38 :
                    // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:1752:5: this_WhenSundaysBeforeTriodion_37= ruleWhenSundaysBeforeTriodion
                    {
                     
                            newCompositeNode(grammarAccess.getAbstractComponentAccess().getWhenSundaysBeforeTriodionParserRuleCall_37()); 
                        
                    pushFollow(FOLLOW_ruleWhenSundaysBeforeTriodion_in_ruleAbstractComponent4288);
                    this_WhenSundaysBeforeTriodion_37=ruleWhenSundaysBeforeTriodion();

                    state._fsp--;

                     
                            current = this_WhenSundaysBeforeTriodion_37; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleAbstractComponent"


    // $ANTLR start "entryRuleQualifiedName"
    // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:1768:1: entryRuleQualifiedName returns [String current=null] : iv_ruleQualifiedName= ruleQualifiedName EOF ;
    public final String entryRuleQualifiedName() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleQualifiedName = null;


        try {
            // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:1769:2: (iv_ruleQualifiedName= ruleQualifiedName EOF )
            // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:1770:2: iv_ruleQualifiedName= ruleQualifiedName EOF
            {
             newCompositeNode(grammarAccess.getQualifiedNameRule()); 
            pushFollow(FOLLOW_ruleQualifiedName_in_entryRuleQualifiedName4324);
            iv_ruleQualifiedName=ruleQualifiedName();

            state._fsp--;

             current =iv_ruleQualifiedName.getText(); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleQualifiedName4335); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleQualifiedName"


    // $ANTLR start "ruleQualifiedName"
    // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:1777:1: ruleQualifiedName returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )* ) ;
    public final AntlrDatatypeRuleToken ruleQualifiedName() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_ID_0=null;
        Token kw=null;
        Token this_ID_2=null;

         enterRule(); 
            
        try {
            // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:1780:28: ( (this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )* ) )
            // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:1781:1: (this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )* )
            {
            // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:1781:1: (this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )* )
            // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:1781:6: this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )*
            {
            this_ID_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleQualifiedName4375); 

            		current.merge(this_ID_0);
                
             
                newLeafNode(this_ID_0, grammarAccess.getQualifiedNameAccess().getIDTerminalRuleCall_0()); 
                
            // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:1788:1: (kw= '.' this_ID_2= RULE_ID )*
            loop24:
            do {
                int alt24=2;
                int LA24_0 = input.LA(1);

                if ( (LA24_0==44) ) {
                    alt24=1;
                }


                switch (alt24) {
            	case 1 :
            	    // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:1789:2: kw= '.' this_ID_2= RULE_ID
            	    {
            	    kw=(Token)match(input,44,FOLLOW_44_in_ruleQualifiedName4394); 

            	            current.merge(kw);
            	            newLeafNode(kw, grammarAccess.getQualifiedNameAccess().getFullStopKeyword_1_0()); 
            	        
            	    this_ID_2=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleQualifiedName4409); 

            	    		current.merge(this_ID_2);
            	        
            	     
            	        newLeafNode(this_ID_2, grammarAccess.getQualifiedNameAccess().getIDTerminalRuleCall_1_1()); 
            	        

            	    }
            	    break;

            	default :
            	    break loop24;
                }
            } while (true);


            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleQualifiedName"


    // $ANTLR start "entryRuleQualifiedNameWithWildCard"
    // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:1809:1: entryRuleQualifiedNameWithWildCard returns [String current=null] : iv_ruleQualifiedNameWithWildCard= ruleQualifiedNameWithWildCard EOF ;
    public final String entryRuleQualifiedNameWithWildCard() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleQualifiedNameWithWildCard = null;


        try {
            // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:1810:2: (iv_ruleQualifiedNameWithWildCard= ruleQualifiedNameWithWildCard EOF )
            // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:1811:2: iv_ruleQualifiedNameWithWildCard= ruleQualifiedNameWithWildCard EOF
            {
             newCompositeNode(grammarAccess.getQualifiedNameWithWildCardRule()); 
            pushFollow(FOLLOW_ruleQualifiedNameWithWildCard_in_entryRuleQualifiedNameWithWildCard4457);
            iv_ruleQualifiedNameWithWildCard=ruleQualifiedNameWithWildCard();

            state._fsp--;

             current =iv_ruleQualifiedNameWithWildCard.getText(); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleQualifiedNameWithWildCard4468); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleQualifiedNameWithWildCard"


    // $ANTLR start "ruleQualifiedNameWithWildCard"
    // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:1818:1: ruleQualifiedNameWithWildCard returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_QualifiedName_0= ruleQualifiedName (kw= '.*' )? ) ;
    public final AntlrDatatypeRuleToken ruleQualifiedNameWithWildCard() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        AntlrDatatypeRuleToken this_QualifiedName_0 = null;


         enterRule(); 
            
        try {
            // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:1821:28: ( (this_QualifiedName_0= ruleQualifiedName (kw= '.*' )? ) )
            // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:1822:1: (this_QualifiedName_0= ruleQualifiedName (kw= '.*' )? )
            {
            // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:1822:1: (this_QualifiedName_0= ruleQualifiedName (kw= '.*' )? )
            // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:1823:5: this_QualifiedName_0= ruleQualifiedName (kw= '.*' )?
            {
             
                    newCompositeNode(grammarAccess.getQualifiedNameWithWildCardAccess().getQualifiedNameParserRuleCall_0()); 
                
            pushFollow(FOLLOW_ruleQualifiedName_in_ruleQualifiedNameWithWildCard4515);
            this_QualifiedName_0=ruleQualifiedName();

            state._fsp--;


            		current.merge(this_QualifiedName_0);
                
             
                    afterParserOrEnumRuleCall();
                
            // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:1833:1: (kw= '.*' )?
            int alt25=2;
            int LA25_0 = input.LA(1);

            if ( (LA25_0==45) ) {
                alt25=1;
            }
            switch (alt25) {
                case 1 :
                    // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:1834:2: kw= '.*'
                    {
                    kw=(Token)match(input,45,FOLLOW_45_in_ruleQualifiedNameWithWildCard4534); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getQualifiedNameWithWildCardAccess().getFullStopAsteriskKeyword_1()); 
                        

                    }
                    break;

            }


            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleQualifiedNameWithWildCard"


    // $ANTLR start "entryRuleImport"
    // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:1847:1: entryRuleImport returns [EObject current=null] : iv_ruleImport= ruleImport EOF ;
    public final EObject entryRuleImport() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleImport = null;


        try {
            // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:1848:2: (iv_ruleImport= ruleImport EOF )
            // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:1849:2: iv_ruleImport= ruleImport EOF
            {
             newCompositeNode(grammarAccess.getImportRule()); 
            pushFollow(FOLLOW_ruleImport_in_entryRuleImport4576);
            iv_ruleImport=ruleImport();

            state._fsp--;

             current =iv_ruleImport; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleImport4586); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleImport"


    // $ANTLR start "ruleImport"
    // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:1856:1: ruleImport returns [EObject current=null] : (otherlv_0= 'import' ( (lv_importedNamespace_1_0= ruleQualifiedNameWithWildCard ) ) ) ;
    public final EObject ruleImport() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        AntlrDatatypeRuleToken lv_importedNamespace_1_0 = null;


         enterRule(); 
            
        try {
            // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:1859:28: ( (otherlv_0= 'import' ( (lv_importedNamespace_1_0= ruleQualifiedNameWithWildCard ) ) ) )
            // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:1860:1: (otherlv_0= 'import' ( (lv_importedNamespace_1_0= ruleQualifiedNameWithWildCard ) ) )
            {
            // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:1860:1: (otherlv_0= 'import' ( (lv_importedNamespace_1_0= ruleQualifiedNameWithWildCard ) ) )
            // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:1860:3: otherlv_0= 'import' ( (lv_importedNamespace_1_0= ruleQualifiedNameWithWildCard ) )
            {
            otherlv_0=(Token)match(input,46,FOLLOW_46_in_ruleImport4623); 

                	newLeafNode(otherlv_0, grammarAccess.getImportAccess().getImportKeyword_0());
                
            // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:1864:1: ( (lv_importedNamespace_1_0= ruleQualifiedNameWithWildCard ) )
            // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:1865:1: (lv_importedNamespace_1_0= ruleQualifiedNameWithWildCard )
            {
            // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:1865:1: (lv_importedNamespace_1_0= ruleQualifiedNameWithWildCard )
            // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:1866:3: lv_importedNamespace_1_0= ruleQualifiedNameWithWildCard
            {
             
            	        newCompositeNode(grammarAccess.getImportAccess().getImportedNamespaceQualifiedNameWithWildCardParserRuleCall_1_0()); 
            	    
            pushFollow(FOLLOW_ruleQualifiedNameWithWildCard_in_ruleImport4644);
            lv_importedNamespace_1_0=ruleQualifiedNameWithWildCard();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getImportRule());
            	        }
                   		set(
                   			current, 
                   			"importedNamespace",
                    		lv_importedNamespace_1_0, 
                    		"QualifiedNameWithWildCard");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }


            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleImport"


    // $ANTLR start "entryRuleVersionSwitch"
    // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:1890:1: entryRuleVersionSwitch returns [EObject current=null] : iv_ruleVersionSwitch= ruleVersionSwitch EOF ;
    public final EObject entryRuleVersionSwitch() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleVersionSwitch = null;


        try {
            // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:1891:2: (iv_ruleVersionSwitch= ruleVersionSwitch EOF )
            // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:1892:2: iv_ruleVersionSwitch= ruleVersionSwitch EOF
            {
             newCompositeNode(grammarAccess.getVersionSwitchRule()); 
            pushFollow(FOLLOW_ruleVersionSwitch_in_entryRuleVersionSwitch4680);
            iv_ruleVersionSwitch=ruleVersionSwitch();

            state._fsp--;

             current =iv_ruleVersionSwitch; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleVersionSwitch4690); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleVersionSwitch"


    // $ANTLR start "ruleVersionSwitch"
    // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:1899:1: ruleVersionSwitch returns [EObject current=null] : (otherlv_0= 'Switch-Version' ( (lv_dsl_VersionSwitch_flag_1_0= ruleVersionSwitchType ) ) otherlv_2= 'End-Switch-Version' ) ;
    public final EObject ruleVersionSwitch() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Enumerator lv_dsl_VersionSwitch_flag_1_0 = null;


         enterRule(); 
            
        try {
            // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:1902:28: ( (otherlv_0= 'Switch-Version' ( (lv_dsl_VersionSwitch_flag_1_0= ruleVersionSwitchType ) ) otherlv_2= 'End-Switch-Version' ) )
            // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:1903:1: (otherlv_0= 'Switch-Version' ( (lv_dsl_VersionSwitch_flag_1_0= ruleVersionSwitchType ) ) otherlv_2= 'End-Switch-Version' )
            {
            // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:1903:1: (otherlv_0= 'Switch-Version' ( (lv_dsl_VersionSwitch_flag_1_0= ruleVersionSwitchType ) ) otherlv_2= 'End-Switch-Version' )
            // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:1903:3: otherlv_0= 'Switch-Version' ( (lv_dsl_VersionSwitch_flag_1_0= ruleVersionSwitchType ) ) otherlv_2= 'End-Switch-Version'
            {
            otherlv_0=(Token)match(input,47,FOLLOW_47_in_ruleVersionSwitch4727); 

                	newLeafNode(otherlv_0, grammarAccess.getVersionSwitchAccess().getSwitchVersionKeyword_0());
                
            // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:1907:1: ( (lv_dsl_VersionSwitch_flag_1_0= ruleVersionSwitchType ) )
            // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:1908:1: (lv_dsl_VersionSwitch_flag_1_0= ruleVersionSwitchType )
            {
            // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:1908:1: (lv_dsl_VersionSwitch_flag_1_0= ruleVersionSwitchType )
            // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:1909:3: lv_dsl_VersionSwitch_flag_1_0= ruleVersionSwitchType
            {
             
            	        newCompositeNode(grammarAccess.getVersionSwitchAccess().getDsl_VersionSwitch_flagVersionSwitchTypeEnumRuleCall_1_0()); 
            	    
            pushFollow(FOLLOW_ruleVersionSwitchType_in_ruleVersionSwitch4748);
            lv_dsl_VersionSwitch_flag_1_0=ruleVersionSwitchType();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getVersionSwitchRule());
            	        }
                   		set(
                   			current, 
                   			"dsl_VersionSwitch_flag",
                    		lv_dsl_VersionSwitch_flag_1_0, 
                    		"VersionSwitchType");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            otherlv_2=(Token)match(input,48,FOLLOW_48_in_ruleVersionSwitch4760); 

                	newLeafNode(otherlv_2, grammarAccess.getVersionSwitchAccess().getEndSwitchVersionKeyword_2());
                

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleVersionSwitch"


    // $ANTLR start "entryRuleResourceText"
    // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:1937:1: entryRuleResourceText returns [EObject current=null] : iv_ruleResourceText= ruleResourceText EOF ;
    public final EObject entryRuleResourceText() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleResourceText = null;


        try {
            // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:1938:2: (iv_ruleResourceText= ruleResourceText EOF )
            // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:1939:2: iv_ruleResourceText= ruleResourceText EOF
            {
             newCompositeNode(grammarAccess.getResourceTextRule()); 
            pushFollow(FOLLOW_ruleResourceText_in_entryRuleResourceText4796);
            iv_ruleResourceText=ruleResourceText();

            state._fsp--;

             current =iv_ruleResourceText; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleResourceText4806); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleResourceText"


    // $ANTLR start "ruleResourceText"
    // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:1946:1: ruleResourceText returns [EObject current=null] : (otherlv_0= 'sid' ( ( ruleQualifiedName ) ) ( (lv_dsl_ResourceText_Version_2_0= '@ver' ) )? ( (lv_dsl_ResourceText_Media_Off_3_0= 'media-off' ) )? ) ;
    public final EObject ruleResourceText() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_dsl_ResourceText_Version_2_0=null;
        Token lv_dsl_ResourceText_Media_Off_3_0=null;

         enterRule(); 
            
        try {
            // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:1949:28: ( (otherlv_0= 'sid' ( ( ruleQualifiedName ) ) ( (lv_dsl_ResourceText_Version_2_0= '@ver' ) )? ( (lv_dsl_ResourceText_Media_Off_3_0= 'media-off' ) )? ) )
            // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:1950:1: (otherlv_0= 'sid' ( ( ruleQualifiedName ) ) ( (lv_dsl_ResourceText_Version_2_0= '@ver' ) )? ( (lv_dsl_ResourceText_Media_Off_3_0= 'media-off' ) )? )
            {
            // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:1950:1: (otherlv_0= 'sid' ( ( ruleQualifiedName ) ) ( (lv_dsl_ResourceText_Version_2_0= '@ver' ) )? ( (lv_dsl_ResourceText_Media_Off_3_0= 'media-off' ) )? )
            // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:1950:3: otherlv_0= 'sid' ( ( ruleQualifiedName ) ) ( (lv_dsl_ResourceText_Version_2_0= '@ver' ) )? ( (lv_dsl_ResourceText_Media_Off_3_0= 'media-off' ) )?
            {
            otherlv_0=(Token)match(input,49,FOLLOW_49_in_ruleResourceText4843); 

                	newLeafNode(otherlv_0, grammarAccess.getResourceTextAccess().getSidKeyword_0());
                
            // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:1954:1: ( ( ruleQualifiedName ) )
            // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:1955:1: ( ruleQualifiedName )
            {
            // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:1955:1: ( ruleQualifiedName )
            // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:1956:3: ruleQualifiedName
            {

            			if (current==null) {
            	            current = createModelElement(grammarAccess.getResourceTextRule());
            	        }
                    
             
            	        newCompositeNode(grammarAccess.getResourceTextAccess().getDsl_ResourceTextRefDefinitionCrossReference_1_0()); 
            	    
            pushFollow(FOLLOW_ruleQualifiedName_in_ruleResourceText4866);
            ruleQualifiedName();

            state._fsp--;

             
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:1969:2: ( (lv_dsl_ResourceText_Version_2_0= '@ver' ) )?
            int alt26=2;
            int LA26_0 = input.LA(1);

            if ( (LA26_0==50) ) {
                alt26=1;
            }
            switch (alt26) {
                case 1 :
                    // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:1970:1: (lv_dsl_ResourceText_Version_2_0= '@ver' )
                    {
                    // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:1970:1: (lv_dsl_ResourceText_Version_2_0= '@ver' )
                    // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:1971:3: lv_dsl_ResourceText_Version_2_0= '@ver'
                    {
                    lv_dsl_ResourceText_Version_2_0=(Token)match(input,50,FOLLOW_50_in_ruleResourceText4884); 

                            newLeafNode(lv_dsl_ResourceText_Version_2_0, grammarAccess.getResourceTextAccess().getDsl_ResourceText_VersionVerKeyword_2_0());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getResourceTextRule());
                    	        }
                           		setWithLastConsumed(current, "dsl_ResourceText_Version", true, "@ver");
                    	    

                    }


                    }
                    break;

            }

            // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:1984:3: ( (lv_dsl_ResourceText_Media_Off_3_0= 'media-off' ) )?
            int alt27=2;
            int LA27_0 = input.LA(1);

            if ( (LA27_0==51) ) {
                alt27=1;
            }
            switch (alt27) {
                case 1 :
                    // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:1985:1: (lv_dsl_ResourceText_Media_Off_3_0= 'media-off' )
                    {
                    // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:1985:1: (lv_dsl_ResourceText_Media_Off_3_0= 'media-off' )
                    // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:1986:3: lv_dsl_ResourceText_Media_Off_3_0= 'media-off'
                    {
                    lv_dsl_ResourceText_Media_Off_3_0=(Token)match(input,51,FOLLOW_51_in_ruleResourceText4916); 

                            newLeafNode(lv_dsl_ResourceText_Media_Off_3_0, grammarAccess.getResourceTextAccess().getDsl_ResourceText_Media_OffMediaOffKeyword_3_0());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getResourceTextRule());
                    	        }
                           		setWithLastConsumed(current, "dsl_ResourceText_Media_Off", true, "media-off");
                    	    

                    }


                    }
                    break;

            }


            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleResourceText"


    // $ANTLR start "entryRuleLookup"
    // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:2007:1: entryRuleLookup returns [EObject current=null] : iv_ruleLookup= ruleLookup EOF ;
    public final EObject entryRuleLookup() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleLookup = null;


        try {
            // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:2008:2: (iv_ruleLookup= ruleLookup EOF )
            // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:2009:2: iv_ruleLookup= ruleLookup EOF
            {
             newCompositeNode(grammarAccess.getLookupRule()); 
            pushFollow(FOLLOW_ruleLookup_in_entryRuleLookup4966);
            iv_ruleLookup=ruleLookup();

            state._fsp--;

             current =iv_ruleLookup; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleLookup4976); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleLookup"


    // $ANTLR start "ruleLookup"
    // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:2016:1: ruleLookup returns [EObject current=null] : (otherlv_0= 'rid' ( ( ruleQualifiedName ) ) ( (lv_dsl_Lookup_Version_2_0= '@ver' ) )? ( (lv_dsl_Lookup_Media_Off_3_0= 'media-off' ) )? ( ( (lv_dsl_Lookup_Override_Mode_Set_4_0= '@mode' ) ) ( (lv_dsl_Lookup_OverrideMode_5_0= ruleModeTypes ) ) )? ( ( (lv_dsl_Lookup_Override__Day_Set_6_0= '@day' ) ) ( (lv_dsl_Lookup_OverrideDay_7_0= ruleDowTypes ) ) )? ) ;
    public final EObject ruleLookup() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_dsl_Lookup_Version_2_0=null;
        Token lv_dsl_Lookup_Media_Off_3_0=null;
        Token lv_dsl_Lookup_Override_Mode_Set_4_0=null;
        Token lv_dsl_Lookup_Override__Day_Set_6_0=null;
        Enumerator lv_dsl_Lookup_OverrideMode_5_0 = null;

        Enumerator lv_dsl_Lookup_OverrideDay_7_0 = null;


         enterRule(); 
            
        try {
            // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:2019:28: ( (otherlv_0= 'rid' ( ( ruleQualifiedName ) ) ( (lv_dsl_Lookup_Version_2_0= '@ver' ) )? ( (lv_dsl_Lookup_Media_Off_3_0= 'media-off' ) )? ( ( (lv_dsl_Lookup_Override_Mode_Set_4_0= '@mode' ) ) ( (lv_dsl_Lookup_OverrideMode_5_0= ruleModeTypes ) ) )? ( ( (lv_dsl_Lookup_Override__Day_Set_6_0= '@day' ) ) ( (lv_dsl_Lookup_OverrideDay_7_0= ruleDowTypes ) ) )? ) )
            // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:2020:1: (otherlv_0= 'rid' ( ( ruleQualifiedName ) ) ( (lv_dsl_Lookup_Version_2_0= '@ver' ) )? ( (lv_dsl_Lookup_Media_Off_3_0= 'media-off' ) )? ( ( (lv_dsl_Lookup_Override_Mode_Set_4_0= '@mode' ) ) ( (lv_dsl_Lookup_OverrideMode_5_0= ruleModeTypes ) ) )? ( ( (lv_dsl_Lookup_Override__Day_Set_6_0= '@day' ) ) ( (lv_dsl_Lookup_OverrideDay_7_0= ruleDowTypes ) ) )? )
            {
            // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:2020:1: (otherlv_0= 'rid' ( ( ruleQualifiedName ) ) ( (lv_dsl_Lookup_Version_2_0= '@ver' ) )? ( (lv_dsl_Lookup_Media_Off_3_0= 'media-off' ) )? ( ( (lv_dsl_Lookup_Override_Mode_Set_4_0= '@mode' ) ) ( (lv_dsl_Lookup_OverrideMode_5_0= ruleModeTypes ) ) )? ( ( (lv_dsl_Lookup_Override__Day_Set_6_0= '@day' ) ) ( (lv_dsl_Lookup_OverrideDay_7_0= ruleDowTypes ) ) )? )
            // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:2020:3: otherlv_0= 'rid' ( ( ruleQualifiedName ) ) ( (lv_dsl_Lookup_Version_2_0= '@ver' ) )? ( (lv_dsl_Lookup_Media_Off_3_0= 'media-off' ) )? ( ( (lv_dsl_Lookup_Override_Mode_Set_4_0= '@mode' ) ) ( (lv_dsl_Lookup_OverrideMode_5_0= ruleModeTypes ) ) )? ( ( (lv_dsl_Lookup_Override__Day_Set_6_0= '@day' ) ) ( (lv_dsl_Lookup_OverrideDay_7_0= ruleDowTypes ) ) )?
            {
            otherlv_0=(Token)match(input,52,FOLLOW_52_in_ruleLookup5013); 

                	newLeafNode(otherlv_0, grammarAccess.getLookupAccess().getRidKeyword_0());
                
            // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:2024:1: ( ( ruleQualifiedName ) )
            // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:2025:1: ( ruleQualifiedName )
            {
            // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:2025:1: ( ruleQualifiedName )
            // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:2026:3: ruleQualifiedName
            {

            			if (current==null) {
            	            current = createModelElement(grammarAccess.getLookupRule());
            	        }
                    
             
            	        newCompositeNode(grammarAccess.getLookupAccess().getDsl_ResourceTextRefDefinitionCrossReference_1_0()); 
            	    
            pushFollow(FOLLOW_ruleQualifiedName_in_ruleLookup5036);
            ruleQualifiedName();

            state._fsp--;

             
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:2039:2: ( (lv_dsl_Lookup_Version_2_0= '@ver' ) )?
            int alt28=2;
            int LA28_0 = input.LA(1);

            if ( (LA28_0==50) ) {
                alt28=1;
            }
            switch (alt28) {
                case 1 :
                    // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:2040:1: (lv_dsl_Lookup_Version_2_0= '@ver' )
                    {
                    // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:2040:1: (lv_dsl_Lookup_Version_2_0= '@ver' )
                    // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:2041:3: lv_dsl_Lookup_Version_2_0= '@ver'
                    {
                    lv_dsl_Lookup_Version_2_0=(Token)match(input,50,FOLLOW_50_in_ruleLookup5054); 

                            newLeafNode(lv_dsl_Lookup_Version_2_0, grammarAccess.getLookupAccess().getDsl_Lookup_VersionVerKeyword_2_0());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getLookupRule());
                    	        }
                           		setWithLastConsumed(current, "dsl_Lookup_Version", true, "@ver");
                    	    

                    }


                    }
                    break;

            }

            // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:2054:3: ( (lv_dsl_Lookup_Media_Off_3_0= 'media-off' ) )?
            int alt29=2;
            int LA29_0 = input.LA(1);

            if ( (LA29_0==51) ) {
                alt29=1;
            }
            switch (alt29) {
                case 1 :
                    // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:2055:1: (lv_dsl_Lookup_Media_Off_3_0= 'media-off' )
                    {
                    // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:2055:1: (lv_dsl_Lookup_Media_Off_3_0= 'media-off' )
                    // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:2056:3: lv_dsl_Lookup_Media_Off_3_0= 'media-off'
                    {
                    lv_dsl_Lookup_Media_Off_3_0=(Token)match(input,51,FOLLOW_51_in_ruleLookup5086); 

                            newLeafNode(lv_dsl_Lookup_Media_Off_3_0, grammarAccess.getLookupAccess().getDsl_Lookup_Media_OffMediaOffKeyword_3_0());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getLookupRule());
                    	        }
                           		setWithLastConsumed(current, "dsl_Lookup_Media_Off", true, "media-off");
                    	    

                    }


                    }
                    break;

            }

            // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:2069:3: ( ( (lv_dsl_Lookup_Override_Mode_Set_4_0= '@mode' ) ) ( (lv_dsl_Lookup_OverrideMode_5_0= ruleModeTypes ) ) )?
            int alt30=2;
            int LA30_0 = input.LA(1);

            if ( (LA30_0==53) ) {
                alt30=1;
            }
            switch (alt30) {
                case 1 :
                    // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:2069:4: ( (lv_dsl_Lookup_Override_Mode_Set_4_0= '@mode' ) ) ( (lv_dsl_Lookup_OverrideMode_5_0= ruleModeTypes ) )
                    {
                    // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:2069:4: ( (lv_dsl_Lookup_Override_Mode_Set_4_0= '@mode' ) )
                    // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:2070:1: (lv_dsl_Lookup_Override_Mode_Set_4_0= '@mode' )
                    {
                    // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:2070:1: (lv_dsl_Lookup_Override_Mode_Set_4_0= '@mode' )
                    // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:2071:3: lv_dsl_Lookup_Override_Mode_Set_4_0= '@mode'
                    {
                    lv_dsl_Lookup_Override_Mode_Set_4_0=(Token)match(input,53,FOLLOW_53_in_ruleLookup5119); 

                            newLeafNode(lv_dsl_Lookup_Override_Mode_Set_4_0, grammarAccess.getLookupAccess().getDsl_Lookup_Override_Mode_SetModeKeyword_4_0_0());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getLookupRule());
                    	        }
                           		setWithLastConsumed(current, "dsl_Lookup_Override_Mode_Set", true, "@mode");
                    	    

                    }


                    }

                    // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:2084:2: ( (lv_dsl_Lookup_OverrideMode_5_0= ruleModeTypes ) )
                    // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:2085:1: (lv_dsl_Lookup_OverrideMode_5_0= ruleModeTypes )
                    {
                    // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:2085:1: (lv_dsl_Lookup_OverrideMode_5_0= ruleModeTypes )
                    // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:2086:3: lv_dsl_Lookup_OverrideMode_5_0= ruleModeTypes
                    {
                     
                    	        newCompositeNode(grammarAccess.getLookupAccess().getDsl_Lookup_OverrideModeModeTypesEnumRuleCall_4_1_0()); 
                    	    
                    pushFollow(FOLLOW_ruleModeTypes_in_ruleLookup5153);
                    lv_dsl_Lookup_OverrideMode_5_0=ruleModeTypes();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getLookupRule());
                    	        }
                           		set(
                           			current, 
                           			"dsl_Lookup_OverrideMode",
                            		lv_dsl_Lookup_OverrideMode_5_0, 
                            		"ModeTypes");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }


                    }
                    break;

            }

            // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:2102:4: ( ( (lv_dsl_Lookup_Override__Day_Set_6_0= '@day' ) ) ( (lv_dsl_Lookup_OverrideDay_7_0= ruleDowTypes ) ) )?
            int alt31=2;
            int LA31_0 = input.LA(1);

            if ( (LA31_0==54) ) {
                alt31=1;
            }
            switch (alt31) {
                case 1 :
                    // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:2102:5: ( (lv_dsl_Lookup_Override__Day_Set_6_0= '@day' ) ) ( (lv_dsl_Lookup_OverrideDay_7_0= ruleDowTypes ) )
                    {
                    // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:2102:5: ( (lv_dsl_Lookup_Override__Day_Set_6_0= '@day' ) )
                    // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:2103:1: (lv_dsl_Lookup_Override__Day_Set_6_0= '@day' )
                    {
                    // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:2103:1: (lv_dsl_Lookup_Override__Day_Set_6_0= '@day' )
                    // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:2104:3: lv_dsl_Lookup_Override__Day_Set_6_0= '@day'
                    {
                    lv_dsl_Lookup_Override__Day_Set_6_0=(Token)match(input,54,FOLLOW_54_in_ruleLookup5174); 

                            newLeafNode(lv_dsl_Lookup_Override__Day_Set_6_0, grammarAccess.getLookupAccess().getDsl_Lookup_Override__Day_SetDayKeyword_5_0_0());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getLookupRule());
                    	        }
                           		setWithLastConsumed(current, "dsl_Lookup_Override__Day_Set", true, "@day");
                    	    

                    }


                    }

                    // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:2117:2: ( (lv_dsl_Lookup_OverrideDay_7_0= ruleDowTypes ) )
                    // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:2118:1: (lv_dsl_Lookup_OverrideDay_7_0= ruleDowTypes )
                    {
                    // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:2118:1: (lv_dsl_Lookup_OverrideDay_7_0= ruleDowTypes )
                    // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:2119:3: lv_dsl_Lookup_OverrideDay_7_0= ruleDowTypes
                    {
                     
                    	        newCompositeNode(grammarAccess.getLookupAccess().getDsl_Lookup_OverrideDayDowTypesEnumRuleCall_5_1_0()); 
                    	    
                    pushFollow(FOLLOW_ruleDowTypes_in_ruleLookup5208);
                    lv_dsl_Lookup_OverrideDay_7_0=ruleDowTypes();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getLookupRule());
                    	        }
                           		set(
                           			current, 
                           			"dsl_Lookup_OverrideDay",
                            		lv_dsl_Lookup_OverrideDay_7_0, 
                            		"DowTypes");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }


                    }
                    break;

            }


            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleLookup"


    // $ANTLR start "entryRuleLDP"
    // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:2143:1: entryRuleLDP returns [EObject current=null] : iv_ruleLDP= ruleLDP EOF ;
    public final EObject entryRuleLDP() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleLDP = null;


        try {
            // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:2144:2: (iv_ruleLDP= ruleLDP EOF )
            // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:2145:2: iv_ruleLDP= ruleLDP EOF
            {
             newCompositeNode(grammarAccess.getLDPRule()); 
            pushFollow(FOLLOW_ruleLDP_in_entryRuleLDP5246);
            iv_ruleLDP=ruleLDP();

            state._fsp--;

             current =iv_ruleLDP; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleLDP5256); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleLDP"


    // $ANTLR start "ruleLDP"
    // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:2152:1: ruleLDP returns [EObject current=null] : (otherlv_0= 'ldp' ( (lv_dsl_LDP_1_0= ruleLdpType ) )* ) ;
    public final EObject ruleLDP() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        EObject lv_dsl_LDP_1_0 = null;


         enterRule(); 
            
        try {
            // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:2155:28: ( (otherlv_0= 'ldp' ( (lv_dsl_LDP_1_0= ruleLdpType ) )* ) )
            // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:2156:1: (otherlv_0= 'ldp' ( (lv_dsl_LDP_1_0= ruleLdpType ) )* )
            {
            // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:2156:1: (otherlv_0= 'ldp' ( (lv_dsl_LDP_1_0= ruleLdpType ) )* )
            // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:2156:3: otherlv_0= 'ldp' ( (lv_dsl_LDP_1_0= ruleLdpType ) )*
            {
            otherlv_0=(Token)match(input,55,FOLLOW_55_in_ruleLDP5293); 

                	newLeafNode(otherlv_0, grammarAccess.getLDPAccess().getLdpKeyword_0());
                
            // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:2160:1: ( (lv_dsl_LDP_1_0= ruleLdpType ) )*
            loop32:
            do {
                int alt32=2;
                int LA32_0 = input.LA(1);

                if ( ((LA32_0>=73 && LA32_0<=89)) ) {
                    alt32=1;
                }


                switch (alt32) {
            	case 1 :
            	    // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:2161:1: (lv_dsl_LDP_1_0= ruleLdpType )
            	    {
            	    // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:2161:1: (lv_dsl_LDP_1_0= ruleLdpType )
            	    // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:2162:3: lv_dsl_LDP_1_0= ruleLdpType
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getLDPAccess().getDsl_LDPLdpTypeParserRuleCall_1_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleLdpType_in_ruleLDP5314);
            	    lv_dsl_LDP_1_0=ruleLdpType();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getLDPRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"dsl_LDP",
            	            		lv_dsl_LDP_1_0, 
            	            		"LdpType");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }
            	    break;

            	default :
            	    break loop32;
                }
            } while (true);


            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleLDP"


    // $ANTLR start "entryRuleTaggedText"
    // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:2186:1: entryRuleTaggedText returns [EObject current=null] : iv_ruleTaggedText= ruleTaggedText EOF ;
    public final EObject entryRuleTaggedText() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTaggedText = null;


        try {
            // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:2187:2: (iv_ruleTaggedText= ruleTaggedText EOF )
            // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:2188:2: iv_ruleTaggedText= ruleTaggedText EOF
            {
             newCompositeNode(grammarAccess.getTaggedTextRule()); 
            pushFollow(FOLLOW_ruleTaggedText_in_entryRuleTaggedText5351);
            iv_ruleTaggedText=ruleTaggedText();

            state._fsp--;

             current =iv_ruleTaggedText; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleTaggedText5361); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleTaggedText"


    // $ANTLR start "ruleTaggedText"
    // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:2195:1: ruleTaggedText returns [EObject current=null] : (otherlv_0= '<' ( ( ruleQualifiedName ) ) otherlv_2= '>' ( (lv_dsl_TaggedText_3_0= ruleElementType ) )* otherlv_4= '</>' ) ;
    public final EObject ruleTaggedText() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        EObject lv_dsl_TaggedText_3_0 = null;


         enterRule(); 
            
        try {
            // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:2198:28: ( (otherlv_0= '<' ( ( ruleQualifiedName ) ) otherlv_2= '>' ( (lv_dsl_TaggedText_3_0= ruleElementType ) )* otherlv_4= '</>' ) )
            // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:2199:1: (otherlv_0= '<' ( ( ruleQualifiedName ) ) otherlv_2= '>' ( (lv_dsl_TaggedText_3_0= ruleElementType ) )* otherlv_4= '</>' )
            {
            // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:2199:1: (otherlv_0= '<' ( ( ruleQualifiedName ) ) otherlv_2= '>' ( (lv_dsl_TaggedText_3_0= ruleElementType ) )* otherlv_4= '</>' )
            // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:2199:3: otherlv_0= '<' ( ( ruleQualifiedName ) ) otherlv_2= '>' ( (lv_dsl_TaggedText_3_0= ruleElementType ) )* otherlv_4= '</>'
            {
            otherlv_0=(Token)match(input,56,FOLLOW_56_in_ruleTaggedText5398); 

                	newLeafNode(otherlv_0, grammarAccess.getTaggedTextAccess().getLessThanSignKeyword_0());
                
            // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:2203:1: ( ( ruleQualifiedName ) )
            // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:2204:1: ( ruleQualifiedName )
            {
            // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:2204:1: ( ruleQualifiedName )
            // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:2205:3: ruleQualifiedName
            {

            			if (current==null) {
            	            current = createModelElement(grammarAccess.getTaggedTextRule());
            	        }
                    
             
            	        newCompositeNode(grammarAccess.getTaggedTextAccess().getDsl_TaggedText_tagDefinitionCrossReference_1_0()); 
            	    
            pushFollow(FOLLOW_ruleQualifiedName_in_ruleTaggedText5421);
            ruleQualifiedName();

            state._fsp--;

             
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            otherlv_2=(Token)match(input,57,FOLLOW_57_in_ruleTaggedText5433); 

                	newLeafNode(otherlv_2, grammarAccess.getTaggedTextAccess().getGreaterThanSignKeyword_2());
                
            // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:2222:1: ( (lv_dsl_TaggedText_3_0= ruleElementType ) )*
            loop33:
            do {
                int alt33=2;
                int LA33_0 = input.LA(1);

                if ( (LA33_0==49||LA33_0==52||(LA33_0>=55 && LA33_0<=56)) ) {
                    alt33=1;
                }


                switch (alt33) {
            	case 1 :
            	    // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:2223:1: (lv_dsl_TaggedText_3_0= ruleElementType )
            	    {
            	    // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:2223:1: (lv_dsl_TaggedText_3_0= ruleElementType )
            	    // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:2224:3: lv_dsl_TaggedText_3_0= ruleElementType
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getTaggedTextAccess().getDsl_TaggedTextElementTypeParserRuleCall_3_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleElementType_in_ruleTaggedText5454);
            	    lv_dsl_TaggedText_3_0=ruleElementType();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getTaggedTextRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"dsl_TaggedText",
            	            		lv_dsl_TaggedText_3_0, 
            	            		"ElementType");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }
            	    break;

            	default :
            	    break loop33;
                }
            } while (true);

            otherlv_4=(Token)match(input,58,FOLLOW_58_in_ruleTaggedText5467); 

                	newLeafNode(otherlv_4, grammarAccess.getTaggedTextAccess().getLessThanSignSolidusGreaterThanSignKeyword_4());
                

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleTaggedText"


    // $ANTLR start "entryRuleInfo"
    // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:2252:1: entryRuleInfo returns [EObject current=null] : iv_ruleInfo= ruleInfo EOF ;
    public final EObject entryRuleInfo() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleInfo = null;


        try {
            // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:2253:2: (iv_ruleInfo= ruleInfo EOF )
            // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:2254:2: iv_ruleInfo= ruleInfo EOF
            {
             newCompositeNode(grammarAccess.getInfoRule()); 
            pushFollow(FOLLOW_ruleInfo_in_entryRuleInfo5503);
            iv_ruleInfo=ruleInfo();

            state._fsp--;

             current =iv_ruleInfo; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleInfo5513); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleInfo"


    // $ANTLR start "ruleInfo"
    // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:2261:1: ruleInfo returns [EObject current=null] : (otherlv_0= 'Info' ( (lv_name_1_0= RULE_ID ) ) ( (lv_dsl_Info_Elements_2_0= ruleInfoElementType ) )* otherlv_3= 'End-Info' ) ;
    public final EObject ruleInfo() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_3=null;
        EObject lv_dsl_Info_Elements_2_0 = null;


         enterRule(); 
            
        try {
            // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:2264:28: ( (otherlv_0= 'Info' ( (lv_name_1_0= RULE_ID ) ) ( (lv_dsl_Info_Elements_2_0= ruleInfoElementType ) )* otherlv_3= 'End-Info' ) )
            // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:2265:1: (otherlv_0= 'Info' ( (lv_name_1_0= RULE_ID ) ) ( (lv_dsl_Info_Elements_2_0= ruleInfoElementType ) )* otherlv_3= 'End-Info' )
            {
            // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:2265:1: (otherlv_0= 'Info' ( (lv_name_1_0= RULE_ID ) ) ( (lv_dsl_Info_Elements_2_0= ruleInfoElementType ) )* otherlv_3= 'End-Info' )
            // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:2265:3: otherlv_0= 'Info' ( (lv_name_1_0= RULE_ID ) ) ( (lv_dsl_Info_Elements_2_0= ruleInfoElementType ) )* otherlv_3= 'End-Info'
            {
            otherlv_0=(Token)match(input,59,FOLLOW_59_in_ruleInfo5550); 

                	newLeafNode(otherlv_0, grammarAccess.getInfoAccess().getInfoKeyword_0());
                
            // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:2269:1: ( (lv_name_1_0= RULE_ID ) )
            // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:2270:1: (lv_name_1_0= RULE_ID )
            {
            // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:2270:1: (lv_name_1_0= RULE_ID )
            // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:2271:3: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleInfo5567); 

            			newLeafNode(lv_name_1_0, grammarAccess.getInfoAccess().getNameIDTerminalRuleCall_1_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getInfoRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"name",
                    		lv_name_1_0, 
                    		"ID");
            	    

            }


            }

            // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:2287:2: ( (lv_dsl_Info_Elements_2_0= ruleInfoElementType ) )*
            loop34:
            do {
                int alt34=2;
                int LA34_0 = input.LA(1);

                if ( (LA34_0==47||LA34_0==100||LA34_0==102||LA34_0==104||LA34_0==106) ) {
                    alt34=1;
                }


                switch (alt34) {
            	case 1 :
            	    // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:2288:1: (lv_dsl_Info_Elements_2_0= ruleInfoElementType )
            	    {
            	    // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:2288:1: (lv_dsl_Info_Elements_2_0= ruleInfoElementType )
            	    // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:2289:3: lv_dsl_Info_Elements_2_0= ruleInfoElementType
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getInfoAccess().getDsl_Info_ElementsInfoElementTypeParserRuleCall_2_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleInfoElementType_in_ruleInfo5593);
            	    lv_dsl_Info_Elements_2_0=ruleInfoElementType();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getInfoRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"dsl_Info_Elements",
            	            		lv_dsl_Info_Elements_2_0, 
            	            		"InfoElementType");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }
            	    break;

            	default :
            	    break loop34;
                }
            } while (true);

            otherlv_3=(Token)match(input,60,FOLLOW_60_in_ruleInfo5606); 

                	newLeafNode(otherlv_3, grammarAccess.getInfoAccess().getEndInfoKeyword_3());
                

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleInfo"


    // $ANTLR start "entryRuleInfoElementType"
    // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:2317:1: entryRuleInfoElementType returns [EObject current=null] : iv_ruleInfoElementType= ruleInfoElementType EOF ;
    public final EObject entryRuleInfoElementType() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleInfoElementType = null;


        try {
            // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:2318:2: (iv_ruleInfoElementType= ruleInfoElementType EOF )
            // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:2319:2: iv_ruleInfoElementType= ruleInfoElementType EOF
            {
             newCompositeNode(grammarAccess.getInfoElementTypeRule()); 
            pushFollow(FOLLOW_ruleInfoElementType_in_entryRuleInfoElementType5642);
            iv_ruleInfoElementType=ruleInfoElementType();

            state._fsp--;

             current =iv_ruleInfoElementType; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleInfoElementType5652); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleInfoElementType"


    // $ANTLR start "ruleInfoElementType"
    // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:2326:1: ruleInfoElementType returns [EObject current=null] : (this_VersionSwitch_0= ruleVersionSwitch | this_Block_1= ruleBlock | this_Paragraph_2= ruleParagraph | this_SubTitle_3= ruleSubTitle | this_Title_4= ruleTitle ) ;
    public final EObject ruleInfoElementType() throws RecognitionException {
        EObject current = null;

        EObject this_VersionSwitch_0 = null;

        EObject this_Block_1 = null;

        EObject this_Paragraph_2 = null;

        EObject this_SubTitle_3 = null;

        EObject this_Title_4 = null;


         enterRule(); 
            
        try {
            // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:2329:28: ( (this_VersionSwitch_0= ruleVersionSwitch | this_Block_1= ruleBlock | this_Paragraph_2= ruleParagraph | this_SubTitle_3= ruleSubTitle | this_Title_4= ruleTitle ) )
            // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:2330:1: (this_VersionSwitch_0= ruleVersionSwitch | this_Block_1= ruleBlock | this_Paragraph_2= ruleParagraph | this_SubTitle_3= ruleSubTitle | this_Title_4= ruleTitle )
            {
            // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:2330:1: (this_VersionSwitch_0= ruleVersionSwitch | this_Block_1= ruleBlock | this_Paragraph_2= ruleParagraph | this_SubTitle_3= ruleSubTitle | this_Title_4= ruleTitle )
            int alt35=5;
            switch ( input.LA(1) ) {
            case 47:
                {
                alt35=1;
                }
                break;
            case 106:
                {
                alt35=2;
                }
                break;
            case 104:
                {
                alt35=3;
                }
                break;
            case 102:
                {
                alt35=4;
                }
                break;
            case 100:
                {
                alt35=5;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 35, 0, input);

                throw nvae;
            }

            switch (alt35) {
                case 1 :
                    // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:2331:5: this_VersionSwitch_0= ruleVersionSwitch
                    {
                     
                            newCompositeNode(grammarAccess.getInfoElementTypeAccess().getVersionSwitchParserRuleCall_0()); 
                        
                    pushFollow(FOLLOW_ruleVersionSwitch_in_ruleInfoElementType5699);
                    this_VersionSwitch_0=ruleVersionSwitch();

                    state._fsp--;

                     
                            current = this_VersionSwitch_0; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 2 :
                    // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:2341:5: this_Block_1= ruleBlock
                    {
                     
                            newCompositeNode(grammarAccess.getInfoElementTypeAccess().getBlockParserRuleCall_1()); 
                        
                    pushFollow(FOLLOW_ruleBlock_in_ruleInfoElementType5726);
                    this_Block_1=ruleBlock();

                    state._fsp--;

                     
                            current = this_Block_1; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 3 :
                    // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:2351:5: this_Paragraph_2= ruleParagraph
                    {
                     
                            newCompositeNode(grammarAccess.getInfoElementTypeAccess().getParagraphParserRuleCall_2()); 
                        
                    pushFollow(FOLLOW_ruleParagraph_in_ruleInfoElementType5753);
                    this_Paragraph_2=ruleParagraph();

                    state._fsp--;

                     
                            current = this_Paragraph_2; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 4 :
                    // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:2361:5: this_SubTitle_3= ruleSubTitle
                    {
                     
                            newCompositeNode(grammarAccess.getInfoElementTypeAccess().getSubTitleParserRuleCall_3()); 
                        
                    pushFollow(FOLLOW_ruleSubTitle_in_ruleInfoElementType5780);
                    this_SubTitle_3=ruleSubTitle();

                    state._fsp--;

                     
                            current = this_SubTitle_3; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 5 :
                    // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:2371:5: this_Title_4= ruleTitle
                    {
                     
                            newCompositeNode(grammarAccess.getInfoElementTypeAccess().getTitleParserRuleCall_4()); 
                        
                    pushFollow(FOLLOW_ruleTitle_in_ruleInfoElementType5807);
                    this_Title_4=ruleTitle();

                    state._fsp--;

                     
                            current = this_Title_4; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleInfoElementType"


    // $ANTLR start "entryRuleDate"
    // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:2387:1: entryRuleDate returns [EObject current=null] : iv_ruleDate= ruleDate EOF ;
    public final EObject entryRuleDate() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDate = null;


        try {
            // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:2388:2: (iv_ruleDate= ruleDate EOF )
            // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:2389:2: iv_ruleDate= ruleDate EOF
            {
             newCompositeNode(grammarAccess.getDateRule()); 
            pushFollow(FOLLOW_ruleDate_in_entryRuleDate5842);
            iv_ruleDate=ruleDate();

            state._fsp--;

             current =iv_ruleDate; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleDate5852); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleDate"


    // $ANTLR start "ruleDate"
    // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:2396:1: ruleDate returns [EObject current=null] : (otherlv_0= 'Set_Date' otherlv_1= 'month' ( (lv_dsl_Date_month_2_0= RULE_INT ) ) otherlv_3= 'day' ( (lv_dsl_Date_day_4_0= RULE_INT ) ) (otherlv_5= 'year' ( (lv_dsl_Date_year_6_0= RULE_INT ) ) )? otherlv_7= 'End_Date' ) ;
    public final EObject ruleDate() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token lv_dsl_Date_month_2_0=null;
        Token otherlv_3=null;
        Token lv_dsl_Date_day_4_0=null;
        Token otherlv_5=null;
        Token lv_dsl_Date_year_6_0=null;
        Token otherlv_7=null;

         enterRule(); 
            
        try {
            // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:2399:28: ( (otherlv_0= 'Set_Date' otherlv_1= 'month' ( (lv_dsl_Date_month_2_0= RULE_INT ) ) otherlv_3= 'day' ( (lv_dsl_Date_day_4_0= RULE_INT ) ) (otherlv_5= 'year' ( (lv_dsl_Date_year_6_0= RULE_INT ) ) )? otherlv_7= 'End_Date' ) )
            // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:2400:1: (otherlv_0= 'Set_Date' otherlv_1= 'month' ( (lv_dsl_Date_month_2_0= RULE_INT ) ) otherlv_3= 'day' ( (lv_dsl_Date_day_4_0= RULE_INT ) ) (otherlv_5= 'year' ( (lv_dsl_Date_year_6_0= RULE_INT ) ) )? otherlv_7= 'End_Date' )
            {
            // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:2400:1: (otherlv_0= 'Set_Date' otherlv_1= 'month' ( (lv_dsl_Date_month_2_0= RULE_INT ) ) otherlv_3= 'day' ( (lv_dsl_Date_day_4_0= RULE_INT ) ) (otherlv_5= 'year' ( (lv_dsl_Date_year_6_0= RULE_INT ) ) )? otherlv_7= 'End_Date' )
            // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:2400:3: otherlv_0= 'Set_Date' otherlv_1= 'month' ( (lv_dsl_Date_month_2_0= RULE_INT ) ) otherlv_3= 'day' ( (lv_dsl_Date_day_4_0= RULE_INT ) ) (otherlv_5= 'year' ( (lv_dsl_Date_year_6_0= RULE_INT ) ) )? otherlv_7= 'End_Date'
            {
            otherlv_0=(Token)match(input,61,FOLLOW_61_in_ruleDate5889); 

                	newLeafNode(otherlv_0, grammarAccess.getDateAccess().getSet_DateKeyword_0());
                
            otherlv_1=(Token)match(input,62,FOLLOW_62_in_ruleDate5901); 

                	newLeafNode(otherlv_1, grammarAccess.getDateAccess().getMonthKeyword_1());
                
            // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:2408:1: ( (lv_dsl_Date_month_2_0= RULE_INT ) )
            // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:2409:1: (lv_dsl_Date_month_2_0= RULE_INT )
            {
            // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:2409:1: (lv_dsl_Date_month_2_0= RULE_INT )
            // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:2410:3: lv_dsl_Date_month_2_0= RULE_INT
            {
            lv_dsl_Date_month_2_0=(Token)match(input,RULE_INT,FOLLOW_RULE_INT_in_ruleDate5918); 

            			newLeafNode(lv_dsl_Date_month_2_0, grammarAccess.getDateAccess().getDsl_Date_monthINTTerminalRuleCall_2_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getDateRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"dsl_Date_month",
                    		lv_dsl_Date_month_2_0, 
                    		"INT");
            	    

            }


            }

            otherlv_3=(Token)match(input,63,FOLLOW_63_in_ruleDate5935); 

                	newLeafNode(otherlv_3, grammarAccess.getDateAccess().getDayKeyword_3());
                
            // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:2430:1: ( (lv_dsl_Date_day_4_0= RULE_INT ) )
            // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:2431:1: (lv_dsl_Date_day_4_0= RULE_INT )
            {
            // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:2431:1: (lv_dsl_Date_day_4_0= RULE_INT )
            // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:2432:3: lv_dsl_Date_day_4_0= RULE_INT
            {
            lv_dsl_Date_day_4_0=(Token)match(input,RULE_INT,FOLLOW_RULE_INT_in_ruleDate5952); 

            			newLeafNode(lv_dsl_Date_day_4_0, grammarAccess.getDateAccess().getDsl_Date_dayINTTerminalRuleCall_4_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getDateRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"dsl_Date_day",
                    		lv_dsl_Date_day_4_0, 
                    		"INT");
            	    

            }


            }

            // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:2448:2: (otherlv_5= 'year' ( (lv_dsl_Date_year_6_0= RULE_INT ) ) )?
            int alt36=2;
            int LA36_0 = input.LA(1);

            if ( (LA36_0==64) ) {
                alt36=1;
            }
            switch (alt36) {
                case 1 :
                    // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:2448:4: otherlv_5= 'year' ( (lv_dsl_Date_year_6_0= RULE_INT ) )
                    {
                    otherlv_5=(Token)match(input,64,FOLLOW_64_in_ruleDate5970); 

                        	newLeafNode(otherlv_5, grammarAccess.getDateAccess().getYearKeyword_5_0());
                        
                    // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:2452:1: ( (lv_dsl_Date_year_6_0= RULE_INT ) )
                    // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:2453:1: (lv_dsl_Date_year_6_0= RULE_INT )
                    {
                    // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:2453:1: (lv_dsl_Date_year_6_0= RULE_INT )
                    // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:2454:3: lv_dsl_Date_year_6_0= RULE_INT
                    {
                    lv_dsl_Date_year_6_0=(Token)match(input,RULE_INT,FOLLOW_RULE_INT_in_ruleDate5987); 

                    			newLeafNode(lv_dsl_Date_year_6_0, grammarAccess.getDateAccess().getDsl_Date_yearINTTerminalRuleCall_5_1_0()); 
                    		

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getDateRule());
                    	        }
                           		setWithLastConsumed(
                           			current, 
                           			"dsl_Date_year",
                            		lv_dsl_Date_year_6_0, 
                            		"INT");
                    	    

                    }


                    }


                    }
                    break;

            }

            otherlv_7=(Token)match(input,65,FOLLOW_65_in_ruleDate6006); 

                	newLeafNode(otherlv_7, grammarAccess.getDateAccess().getEnd_DateKeyword_6());
                

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleDate"


    // $ANTLR start "entryRuleMcDay"
    // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:2482:1: entryRuleMcDay returns [EObject current=null] : iv_ruleMcDay= ruleMcDay EOF ;
    public final EObject entryRuleMcDay() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMcDay = null;


        try {
            // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:2483:2: (iv_ruleMcDay= ruleMcDay EOF )
            // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:2484:2: iv_ruleMcDay= ruleMcDay EOF
            {
             newCompositeNode(grammarAccess.getMcDayRule()); 
            pushFollow(FOLLOW_ruleMcDay_in_entryRuleMcDay6042);
            iv_ruleMcDay=ruleMcDay();

            state._fsp--;

             current =iv_ruleMcDay; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleMcDay6052); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleMcDay"


    // $ANTLR start "ruleMcDay"
    // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:2491:1: ruleMcDay returns [EObject current=null] : (otherlv_0= 'Set_mcDay' otherlv_1= 'day' ( (lv_dsl_McDay_val_2_0= RULE_INT ) ) otherlv_3= 'End_mcDay' ) ;
    public final EObject ruleMcDay() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token lv_dsl_McDay_val_2_0=null;
        Token otherlv_3=null;

         enterRule(); 
            
        try {
            // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:2494:28: ( (otherlv_0= 'Set_mcDay' otherlv_1= 'day' ( (lv_dsl_McDay_val_2_0= RULE_INT ) ) otherlv_3= 'End_mcDay' ) )
            // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:2495:1: (otherlv_0= 'Set_mcDay' otherlv_1= 'day' ( (lv_dsl_McDay_val_2_0= RULE_INT ) ) otherlv_3= 'End_mcDay' )
            {
            // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:2495:1: (otherlv_0= 'Set_mcDay' otherlv_1= 'day' ( (lv_dsl_McDay_val_2_0= RULE_INT ) ) otherlv_3= 'End_mcDay' )
            // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:2495:3: otherlv_0= 'Set_mcDay' otherlv_1= 'day' ( (lv_dsl_McDay_val_2_0= RULE_INT ) ) otherlv_3= 'End_mcDay'
            {
            otherlv_0=(Token)match(input,66,FOLLOW_66_in_ruleMcDay6089); 

                	newLeafNode(otherlv_0, grammarAccess.getMcDayAccess().getSet_mcDayKeyword_0());
                
            otherlv_1=(Token)match(input,63,FOLLOW_63_in_ruleMcDay6101); 

                	newLeafNode(otherlv_1, grammarAccess.getMcDayAccess().getDayKeyword_1());
                
            // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:2503:1: ( (lv_dsl_McDay_val_2_0= RULE_INT ) )
            // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:2504:1: (lv_dsl_McDay_val_2_0= RULE_INT )
            {
            // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:2504:1: (lv_dsl_McDay_val_2_0= RULE_INT )
            // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:2505:3: lv_dsl_McDay_val_2_0= RULE_INT
            {
            lv_dsl_McDay_val_2_0=(Token)match(input,RULE_INT,FOLLOW_RULE_INT_in_ruleMcDay6118); 

            			newLeafNode(lv_dsl_McDay_val_2_0, grammarAccess.getMcDayAccess().getDsl_McDay_valINTTerminalRuleCall_2_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getMcDayRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"dsl_McDay_val",
                    		lv_dsl_McDay_val_2_0, 
                    		"INT");
            	    

            }


            }

            otherlv_3=(Token)match(input,67,FOLLOW_67_in_ruleMcDay6135); 

                	newLeafNode(otherlv_3, grammarAccess.getMcDayAccess().getEnd_mcDayKeyword_3());
                

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleMcDay"


    // $ANTLR start "entryRulePreface"
    // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:2533:1: entryRulePreface returns [EObject current=null] : iv_rulePreface= rulePreface EOF ;
    public final EObject entryRulePreface() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePreface = null;


        try {
            // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:2534:2: (iv_rulePreface= rulePreface EOF )
            // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:2535:2: iv_rulePreface= rulePreface EOF
            {
             newCompositeNode(grammarAccess.getPrefaceRule()); 
            pushFollow(FOLLOW_rulePreface_in_entryRulePreface6171);
            iv_rulePreface=rulePreface();

            state._fsp--;

             current =iv_rulePreface; 
            match(input,EOF,FOLLOW_EOF_in_entryRulePreface6181); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRulePreface"


    // $ANTLR start "rulePreface"
    // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:2542:1: rulePreface returns [EObject current=null] : (otherlv_0= 'Preface' ( (lv_name_1_0= RULE_ID ) ) ( (lv_dsl_Preface_Elements_2_0= rulePrefaceElementType ) )* otherlv_3= 'End-Preface' ) ;
    public final EObject rulePreface() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_3=null;
        EObject lv_dsl_Preface_Elements_2_0 = null;


         enterRule(); 
            
        try {
            // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:2545:28: ( (otherlv_0= 'Preface' ( (lv_name_1_0= RULE_ID ) ) ( (lv_dsl_Preface_Elements_2_0= rulePrefaceElementType ) )* otherlv_3= 'End-Preface' ) )
            // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:2546:1: (otherlv_0= 'Preface' ( (lv_name_1_0= RULE_ID ) ) ( (lv_dsl_Preface_Elements_2_0= rulePrefaceElementType ) )* otherlv_3= 'End-Preface' )
            {
            // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:2546:1: (otherlv_0= 'Preface' ( (lv_name_1_0= RULE_ID ) ) ( (lv_dsl_Preface_Elements_2_0= rulePrefaceElementType ) )* otherlv_3= 'End-Preface' )
            // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:2546:3: otherlv_0= 'Preface' ( (lv_name_1_0= RULE_ID ) ) ( (lv_dsl_Preface_Elements_2_0= rulePrefaceElementType ) )* otherlv_3= 'End-Preface'
            {
            otherlv_0=(Token)match(input,68,FOLLOW_68_in_rulePreface6218); 

                	newLeafNode(otherlv_0, grammarAccess.getPrefaceAccess().getPrefaceKeyword_0());
                
            // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:2550:1: ( (lv_name_1_0= RULE_ID ) )
            // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:2551:1: (lv_name_1_0= RULE_ID )
            {
            // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:2551:1: (lv_name_1_0= RULE_ID )
            // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:2552:3: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_rulePreface6235); 

            			newLeafNode(lv_name_1_0, grammarAccess.getPrefaceAccess().getNameIDTerminalRuleCall_1_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getPrefaceRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"name",
                    		lv_name_1_0, 
                    		"ID");
            	    

            }


            }

            // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:2568:2: ( (lv_dsl_Preface_Elements_2_0= rulePrefaceElementType ) )*
            loop37:
            do {
                int alt37=2;
                int LA37_0 = input.LA(1);

                if ( (LA37_0==47||LA37_0==70||LA37_0==90||LA37_0==92||LA37_0==100||LA37_0==102||LA37_0==104||LA37_0==106) ) {
                    alt37=1;
                }


                switch (alt37) {
            	case 1 :
            	    // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:2569:1: (lv_dsl_Preface_Elements_2_0= rulePrefaceElementType )
            	    {
            	    // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:2569:1: (lv_dsl_Preface_Elements_2_0= rulePrefaceElementType )
            	    // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:2570:3: lv_dsl_Preface_Elements_2_0= rulePrefaceElementType
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getPrefaceAccess().getDsl_Preface_ElementsPrefaceElementTypeParserRuleCall_2_0()); 
            	    	    
            	    pushFollow(FOLLOW_rulePrefaceElementType_in_rulePreface6261);
            	    lv_dsl_Preface_Elements_2_0=rulePrefaceElementType();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getPrefaceRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"dsl_Preface_Elements",
            	            		lv_dsl_Preface_Elements_2_0, 
            	            		"PrefaceElementType");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }
            	    break;

            	default :
            	    break loop37;
                }
            } while (true);

            otherlv_3=(Token)match(input,69,FOLLOW_69_in_rulePreface6274); 

                	newLeafNode(otherlv_3, grammarAccess.getPrefaceAccess().getEndPrefaceKeyword_3());
                

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "rulePreface"


    // $ANTLR start "entryRulePrefaceElementType"
    // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:2598:1: entryRulePrefaceElementType returns [EObject current=null] : iv_rulePrefaceElementType= rulePrefaceElementType EOF ;
    public final EObject entryRulePrefaceElementType() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePrefaceElementType = null;


        try {
            // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:2599:2: (iv_rulePrefaceElementType= rulePrefaceElementType EOF )
            // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:2600:2: iv_rulePrefaceElementType= rulePrefaceElementType EOF
            {
             newCompositeNode(grammarAccess.getPrefaceElementTypeRule()); 
            pushFollow(FOLLOW_rulePrefaceElementType_in_entryRulePrefaceElementType6310);
            iv_rulePrefaceElementType=rulePrefaceElementType();

            state._fsp--;

             current =iv_rulePrefaceElementType; 
            match(input,EOF,FOLLOW_EOF_in_entryRulePrefaceElementType6320); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRulePrefaceElementType"


    // $ANTLR start "rulePrefaceElementType"
    // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:2607:1: rulePrefaceElementType returns [EObject current=null] : (this_VersionSwitch_0= ruleVersionSwitch | this_Block_1= ruleBlock | this_Paragraph_2= ruleParagraph | this_Section_3= ruleSection | this_SectionFragment_4= ruleSectionFragment | this_SubTitle_5= ruleSubTitle | this_TemplateFragment_6= ruleTemplateFragment | this_Title_7= ruleTitle ) ;
    public final EObject rulePrefaceElementType() throws RecognitionException {
        EObject current = null;

        EObject this_VersionSwitch_0 = null;

        EObject this_Block_1 = null;

        EObject this_Paragraph_2 = null;

        EObject this_Section_3 = null;

        EObject this_SectionFragment_4 = null;

        EObject this_SubTitle_5 = null;

        EObject this_TemplateFragment_6 = null;

        EObject this_Title_7 = null;


         enterRule(); 
            
        try {
            // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:2610:28: ( (this_VersionSwitch_0= ruleVersionSwitch | this_Block_1= ruleBlock | this_Paragraph_2= ruleParagraph | this_Section_3= ruleSection | this_SectionFragment_4= ruleSectionFragment | this_SubTitle_5= ruleSubTitle | this_TemplateFragment_6= ruleTemplateFragment | this_Title_7= ruleTitle ) )
            // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:2611:1: (this_VersionSwitch_0= ruleVersionSwitch | this_Block_1= ruleBlock | this_Paragraph_2= ruleParagraph | this_Section_3= ruleSection | this_SectionFragment_4= ruleSectionFragment | this_SubTitle_5= ruleSubTitle | this_TemplateFragment_6= ruleTemplateFragment | this_Title_7= ruleTitle )
            {
            // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:2611:1: (this_VersionSwitch_0= ruleVersionSwitch | this_Block_1= ruleBlock | this_Paragraph_2= ruleParagraph | this_Section_3= ruleSection | this_SectionFragment_4= ruleSectionFragment | this_SubTitle_5= ruleSubTitle | this_TemplateFragment_6= ruleTemplateFragment | this_Title_7= ruleTitle )
            int alt38=8;
            switch ( input.LA(1) ) {
            case 47:
                {
                alt38=1;
                }
                break;
            case 106:
                {
                alt38=2;
                }
                break;
            case 104:
                {
                alt38=3;
                }
                break;
            case 70:
                {
                alt38=4;
                }
                break;
            case 92:
                {
                alt38=5;
                }
                break;
            case 102:
                {
                alt38=6;
                }
                break;
            case 90:
                {
                alt38=7;
                }
                break;
            case 100:
                {
                alt38=8;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 38, 0, input);

                throw nvae;
            }

            switch (alt38) {
                case 1 :
                    // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:2612:5: this_VersionSwitch_0= ruleVersionSwitch
                    {
                     
                            newCompositeNode(grammarAccess.getPrefaceElementTypeAccess().getVersionSwitchParserRuleCall_0()); 
                        
                    pushFollow(FOLLOW_ruleVersionSwitch_in_rulePrefaceElementType6367);
                    this_VersionSwitch_0=ruleVersionSwitch();

                    state._fsp--;

                     
                            current = this_VersionSwitch_0; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 2 :
                    // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:2622:5: this_Block_1= ruleBlock
                    {
                     
                            newCompositeNode(grammarAccess.getPrefaceElementTypeAccess().getBlockParserRuleCall_1()); 
                        
                    pushFollow(FOLLOW_ruleBlock_in_rulePrefaceElementType6394);
                    this_Block_1=ruleBlock();

                    state._fsp--;

                     
                            current = this_Block_1; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 3 :
                    // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:2632:5: this_Paragraph_2= ruleParagraph
                    {
                     
                            newCompositeNode(grammarAccess.getPrefaceElementTypeAccess().getParagraphParserRuleCall_2()); 
                        
                    pushFollow(FOLLOW_ruleParagraph_in_rulePrefaceElementType6421);
                    this_Paragraph_2=ruleParagraph();

                    state._fsp--;

                     
                            current = this_Paragraph_2; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 4 :
                    // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:2642:5: this_Section_3= ruleSection
                    {
                     
                            newCompositeNode(grammarAccess.getPrefaceElementTypeAccess().getSectionParserRuleCall_3()); 
                        
                    pushFollow(FOLLOW_ruleSection_in_rulePrefaceElementType6448);
                    this_Section_3=ruleSection();

                    state._fsp--;

                     
                            current = this_Section_3; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 5 :
                    // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:2652:5: this_SectionFragment_4= ruleSectionFragment
                    {
                     
                            newCompositeNode(grammarAccess.getPrefaceElementTypeAccess().getSectionFragmentParserRuleCall_4()); 
                        
                    pushFollow(FOLLOW_ruleSectionFragment_in_rulePrefaceElementType6475);
                    this_SectionFragment_4=ruleSectionFragment();

                    state._fsp--;

                     
                            current = this_SectionFragment_4; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 6 :
                    // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:2662:5: this_SubTitle_5= ruleSubTitle
                    {
                     
                            newCompositeNode(grammarAccess.getPrefaceElementTypeAccess().getSubTitleParserRuleCall_5()); 
                        
                    pushFollow(FOLLOW_ruleSubTitle_in_rulePrefaceElementType6502);
                    this_SubTitle_5=ruleSubTitle();

                    state._fsp--;

                     
                            current = this_SubTitle_5; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 7 :
                    // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:2672:5: this_TemplateFragment_6= ruleTemplateFragment
                    {
                     
                            newCompositeNode(grammarAccess.getPrefaceElementTypeAccess().getTemplateFragmentParserRuleCall_6()); 
                        
                    pushFollow(FOLLOW_ruleTemplateFragment_in_rulePrefaceElementType6529);
                    this_TemplateFragment_6=ruleTemplateFragment();

                    state._fsp--;

                     
                            current = this_TemplateFragment_6; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 8 :
                    // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:2682:5: this_Title_7= ruleTitle
                    {
                     
                            newCompositeNode(grammarAccess.getPrefaceElementTypeAccess().getTitleParserRuleCall_7()); 
                        
                    pushFollow(FOLLOW_ruleTitle_in_rulePrefaceElementType6556);
                    this_Title_7=ruleTitle();

                    state._fsp--;

                     
                            current = this_Title_7; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "rulePrefaceElementType"


    // $ANTLR start "entryRuleSection"
    // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:2698:1: entryRuleSection returns [EObject current=null] : iv_ruleSection= ruleSection EOF ;
    public final EObject entryRuleSection() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSection = null;


        try {
            // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:2699:2: (iv_ruleSection= ruleSection EOF )
            // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:2700:2: iv_ruleSection= ruleSection EOF
            {
             newCompositeNode(grammarAccess.getSectionRule()); 
            pushFollow(FOLLOW_ruleSection_in_entryRuleSection6591);
            iv_ruleSection=ruleSection();

            state._fsp--;

             current =iv_ruleSection; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleSection6601); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleSection"


    // $ANTLR start "ruleSection"
    // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:2707:1: ruleSection returns [EObject current=null] : (otherlv_0= 'Section' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= 'role' ( ( ruleQualifiedName ) ) )? ( (lv_dsl_Section_Elements_4_0= ruleSectionElementType ) )* otherlv_5= 'End-Section' ) ;
    public final EObject ruleSection() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token otherlv_5=null;
        EObject lv_dsl_Section_Elements_4_0 = null;


         enterRule(); 
            
        try {
            // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:2710:28: ( (otherlv_0= 'Section' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= 'role' ( ( ruleQualifiedName ) ) )? ( (lv_dsl_Section_Elements_4_0= ruleSectionElementType ) )* otherlv_5= 'End-Section' ) )
            // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:2711:1: (otherlv_0= 'Section' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= 'role' ( ( ruleQualifiedName ) ) )? ( (lv_dsl_Section_Elements_4_0= ruleSectionElementType ) )* otherlv_5= 'End-Section' )
            {
            // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:2711:1: (otherlv_0= 'Section' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= 'role' ( ( ruleQualifiedName ) ) )? ( (lv_dsl_Section_Elements_4_0= ruleSectionElementType ) )* otherlv_5= 'End-Section' )
            // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:2711:3: otherlv_0= 'Section' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= 'role' ( ( ruleQualifiedName ) ) )? ( (lv_dsl_Section_Elements_4_0= ruleSectionElementType ) )* otherlv_5= 'End-Section'
            {
            otherlv_0=(Token)match(input,70,FOLLOW_70_in_ruleSection6638); 

                	newLeafNode(otherlv_0, grammarAccess.getSectionAccess().getSectionKeyword_0());
                
            // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:2715:1: ( (lv_name_1_0= RULE_ID ) )
            // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:2716:1: (lv_name_1_0= RULE_ID )
            {
            // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:2716:1: (lv_name_1_0= RULE_ID )
            // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:2717:3: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleSection6655); 

            			newLeafNode(lv_name_1_0, grammarAccess.getSectionAccess().getNameIDTerminalRuleCall_1_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getSectionRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"name",
                    		lv_name_1_0, 
                    		"ID");
            	    

            }


            }

            // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:2733:2: (otherlv_2= 'role' ( ( ruleQualifiedName ) ) )?
            int alt39=2;
            int LA39_0 = input.LA(1);

            if ( (LA39_0==71) ) {
                alt39=1;
            }
            switch (alt39) {
                case 1 :
                    // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:2733:4: otherlv_2= 'role' ( ( ruleQualifiedName ) )
                    {
                    otherlv_2=(Token)match(input,71,FOLLOW_71_in_ruleSection6673); 

                        	newLeafNode(otherlv_2, grammarAccess.getSectionAccess().getRoleKeyword_2_0());
                        
                    // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:2737:1: ( ( ruleQualifiedName ) )
                    // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:2738:1: ( ruleQualifiedName )
                    {
                    // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:2738:1: ( ruleQualifiedName )
                    // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:2739:3: ruleQualifiedName
                    {

                    			if (current==null) {
                    	            current = createModelElement(grammarAccess.getSectionRule());
                    	        }
                            
                     
                    	        newCompositeNode(grammarAccess.getSectionAccess().getDsl_Section_RoleDefinitionCrossReference_2_1_0()); 
                    	    
                    pushFollow(FOLLOW_ruleQualifiedName_in_ruleSection6696);
                    ruleQualifiedName();

                    state._fsp--;

                     
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }


                    }
                    break;

            }

            // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:2752:4: ( (lv_dsl_Section_Elements_4_0= ruleSectionElementType ) )*
            loop40:
            do {
                int alt40=2;
                int LA40_0 = input.LA(1);

                if ( (LA40_0==61||LA40_0==66||LA40_0==70||LA40_0==90||(LA40_0>=92 && LA40_0<=93)||LA40_0==97||LA40_0==100||LA40_0==102||LA40_0==104||LA40_0==106||LA40_0==108||LA40_0==110||LA40_0==112||LA40_0==114||LA40_0==116||LA40_0==118||LA40_0==120||LA40_0==122||LA40_0==124||LA40_0==126||LA40_0==131||(LA40_0>=135 && LA40_0<=136)||(LA40_0>=141 && LA40_0<=147)||(LA40_0>=149 && LA40_0<=151)) ) {
                    alt40=1;
                }


                switch (alt40) {
            	case 1 :
            	    // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:2753:1: (lv_dsl_Section_Elements_4_0= ruleSectionElementType )
            	    {
            	    // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:2753:1: (lv_dsl_Section_Elements_4_0= ruleSectionElementType )
            	    // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:2754:3: lv_dsl_Section_Elements_4_0= ruleSectionElementType
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getSectionAccess().getDsl_Section_ElementsSectionElementTypeParserRuleCall_3_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleSectionElementType_in_ruleSection6719);
            	    lv_dsl_Section_Elements_4_0=ruleSectionElementType();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getSectionRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"dsl_Section_Elements",
            	            		lv_dsl_Section_Elements_4_0, 
            	            		"SectionElementType");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }
            	    break;

            	default :
            	    break loop40;
                }
            } while (true);

            otherlv_5=(Token)match(input,72,FOLLOW_72_in_ruleSection6732); 

                	newLeafNode(otherlv_5, grammarAccess.getSectionAccess().getEndSectionKeyword_4());
                

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleSection"


    // $ANTLR start "entryRuleSectionElementType"
    // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:2782:1: entryRuleSectionElementType returns [EObject current=null] : iv_ruleSectionElementType= ruleSectionElementType EOF ;
    public final EObject entryRuleSectionElementType() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSectionElementType = null;


        try {
            // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:2783:2: (iv_ruleSectionElementType= ruleSectionElementType EOF )
            // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:2784:2: iv_ruleSectionElementType= ruleSectionElementType EOF
            {
             newCompositeNode(grammarAccess.getSectionElementTypeRule()); 
            pushFollow(FOLLOW_ruleSectionElementType_in_entryRuleSectionElementType6768);
            iv_ruleSectionElementType=ruleSectionElementType();

            state._fsp--;

             current =iv_ruleSectionElementType; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleSectionElementType6778); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleSectionElementType"


    // $ANTLR start "ruleSectionElementType"
    // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:2791:1: ruleSectionElementType returns [EObject current=null] : (this_Actor_0= ruleActor | this_Block_1= ruleBlock | this_Break_2= ruleBreak | this_Date_3= ruleDate | this_Dialog_4= ruleDialog | this_Heading1_5= ruleHeading1 | this_Heading2_6= ruleHeading2 | this_Heading3_7= ruleHeading3 | this_Hymn_8= ruleHymn | this_McDay_9= ruleMcDay | this_Media_10= ruleMedia | this_Paragraph_11= ruleParagraph | this_PassThroughHtml_12= rulePassThroughHtml | this_PassThroughPdf_13= rulePassThroughPdf | this_Reading_14= ruleReading | this_RestoreLocale_15= ruleRestoreLocale | this_Rubric_16= ruleRubric | this_Section_17= ruleSection | this_SectionFragment_18= ruleSectionFragment | this_SetLocale_19= ruleSetLocale | this_TemplateFragment_20= ruleTemplateFragment | this_Title_21= ruleTitle | this_SubTitle_22= ruleSubTitle | this_Verse_23= ruleVerse | this_WhenDate_24= ruleWhenDate | this_WhenDayName_25= ruleWhenDayName | this_WhenExists_26= ruleWhenExists | this_WhenLukanCycleDay_27= ruleWhenLukanCycleDay | this_WhenModeOfWeek_28= ruleWhenModeOfWeek | this_WhenMovableCycleDay_29= ruleWhenMovableCycleDay | this_WhenPascha_30= ruleWhenPascha | this_WhenPentecostarionDay_31= ruleWhenPentecostarionDay | this_WhenSundayAfterElevationOfCrossDay_32= ruleWhenSundayAfterElevationOfCrossDay | this_WhenTriodionDay_33= ruleWhenTriodionDay | this_WhenSundaysBeforeTriodion_34= ruleWhenSundaysBeforeTriodion ) ;
    public final EObject ruleSectionElementType() throws RecognitionException {
        EObject current = null;

        EObject this_Actor_0 = null;

        EObject this_Block_1 = null;

        EObject this_Break_2 = null;

        EObject this_Date_3 = null;

        EObject this_Dialog_4 = null;

        EObject this_Heading1_5 = null;

        EObject this_Heading2_6 = null;

        EObject this_Heading3_7 = null;

        EObject this_Hymn_8 = null;

        EObject this_McDay_9 = null;

        EObject this_Media_10 = null;

        EObject this_Paragraph_11 = null;

        EObject this_PassThroughHtml_12 = null;

        EObject this_PassThroughPdf_13 = null;

        EObject this_Reading_14 = null;

        EObject this_RestoreLocale_15 = null;

        EObject this_Rubric_16 = null;

        EObject this_Section_17 = null;

        EObject this_SectionFragment_18 = null;

        EObject this_SetLocale_19 = null;

        EObject this_TemplateFragment_20 = null;

        EObject this_Title_21 = null;

        EObject this_SubTitle_22 = null;

        EObject this_Verse_23 = null;

        EObject this_WhenDate_24 = null;

        EObject this_WhenDayName_25 = null;

        EObject this_WhenExists_26 = null;

        EObject this_WhenLukanCycleDay_27 = null;

        EObject this_WhenModeOfWeek_28 = null;

        EObject this_WhenMovableCycleDay_29 = null;

        EObject this_WhenPascha_30 = null;

        EObject this_WhenPentecostarionDay_31 = null;

        EObject this_WhenSundayAfterElevationOfCrossDay_32 = null;

        EObject this_WhenTriodionDay_33 = null;

        EObject this_WhenSundaysBeforeTriodion_34 = null;


         enterRule(); 
            
        try {
            // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:2794:28: ( (this_Actor_0= ruleActor | this_Block_1= ruleBlock | this_Break_2= ruleBreak | this_Date_3= ruleDate | this_Dialog_4= ruleDialog | this_Heading1_5= ruleHeading1 | this_Heading2_6= ruleHeading2 | this_Heading3_7= ruleHeading3 | this_Hymn_8= ruleHymn | this_McDay_9= ruleMcDay | this_Media_10= ruleMedia | this_Paragraph_11= ruleParagraph | this_PassThroughHtml_12= rulePassThroughHtml | this_PassThroughPdf_13= rulePassThroughPdf | this_Reading_14= ruleReading | this_RestoreLocale_15= ruleRestoreLocale | this_Rubric_16= ruleRubric | this_Section_17= ruleSection | this_SectionFragment_18= ruleSectionFragment | this_SetLocale_19= ruleSetLocale | this_TemplateFragment_20= ruleTemplateFragment | this_Title_21= ruleTitle | this_SubTitle_22= ruleSubTitle | this_Verse_23= ruleVerse | this_WhenDate_24= ruleWhenDate | this_WhenDayName_25= ruleWhenDayName | this_WhenExists_26= ruleWhenExists | this_WhenLukanCycleDay_27= ruleWhenLukanCycleDay | this_WhenModeOfWeek_28= ruleWhenModeOfWeek | this_WhenMovableCycleDay_29= ruleWhenMovableCycleDay | this_WhenPascha_30= ruleWhenPascha | this_WhenPentecostarionDay_31= ruleWhenPentecostarionDay | this_WhenSundayAfterElevationOfCrossDay_32= ruleWhenSundayAfterElevationOfCrossDay | this_WhenTriodionDay_33= ruleWhenTriodionDay | this_WhenSundaysBeforeTriodion_34= ruleWhenSundaysBeforeTriodion ) )
            // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:2795:1: (this_Actor_0= ruleActor | this_Block_1= ruleBlock | this_Break_2= ruleBreak | this_Date_3= ruleDate | this_Dialog_4= ruleDialog | this_Heading1_5= ruleHeading1 | this_Heading2_6= ruleHeading2 | this_Heading3_7= ruleHeading3 | this_Hymn_8= ruleHymn | this_McDay_9= ruleMcDay | this_Media_10= ruleMedia | this_Paragraph_11= ruleParagraph | this_PassThroughHtml_12= rulePassThroughHtml | this_PassThroughPdf_13= rulePassThroughPdf | this_Reading_14= ruleReading | this_RestoreLocale_15= ruleRestoreLocale | this_Rubric_16= ruleRubric | this_Section_17= ruleSection | this_SectionFragment_18= ruleSectionFragment | this_SetLocale_19= ruleSetLocale | this_TemplateFragment_20= ruleTemplateFragment | this_Title_21= ruleTitle | this_SubTitle_22= ruleSubTitle | this_Verse_23= ruleVerse | this_WhenDate_24= ruleWhenDate | this_WhenDayName_25= ruleWhenDayName | this_WhenExists_26= ruleWhenExists | this_WhenLukanCycleDay_27= ruleWhenLukanCycleDay | this_WhenModeOfWeek_28= ruleWhenModeOfWeek | this_WhenMovableCycleDay_29= ruleWhenMovableCycleDay | this_WhenPascha_30= ruleWhenPascha | this_WhenPentecostarionDay_31= ruleWhenPentecostarionDay | this_WhenSundayAfterElevationOfCrossDay_32= ruleWhenSundayAfterElevationOfCrossDay | this_WhenTriodionDay_33= ruleWhenTriodionDay | this_WhenSundaysBeforeTriodion_34= ruleWhenSundaysBeforeTriodion )
            {
            // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:2795:1: (this_Actor_0= ruleActor | this_Block_1= ruleBlock | this_Break_2= ruleBreak | this_Date_3= ruleDate | this_Dialog_4= ruleDialog | this_Heading1_5= ruleHeading1 | this_Heading2_6= ruleHeading2 | this_Heading3_7= ruleHeading3 | this_Hymn_8= ruleHymn | this_McDay_9= ruleMcDay | this_Media_10= ruleMedia | this_Paragraph_11= ruleParagraph | this_PassThroughHtml_12= rulePassThroughHtml | this_PassThroughPdf_13= rulePassThroughPdf | this_Reading_14= ruleReading | this_RestoreLocale_15= ruleRestoreLocale | this_Rubric_16= ruleRubric | this_Section_17= ruleSection | this_SectionFragment_18= ruleSectionFragment | this_SetLocale_19= ruleSetLocale | this_TemplateFragment_20= ruleTemplateFragment | this_Title_21= ruleTitle | this_SubTitle_22= ruleSubTitle | this_Verse_23= ruleVerse | this_WhenDate_24= ruleWhenDate | this_WhenDayName_25= ruleWhenDayName | this_WhenExists_26= ruleWhenExists | this_WhenLukanCycleDay_27= ruleWhenLukanCycleDay | this_WhenModeOfWeek_28= ruleWhenModeOfWeek | this_WhenMovableCycleDay_29= ruleWhenMovableCycleDay | this_WhenPascha_30= ruleWhenPascha | this_WhenPentecostarionDay_31= ruleWhenPentecostarionDay | this_WhenSundayAfterElevationOfCrossDay_32= ruleWhenSundayAfterElevationOfCrossDay | this_WhenTriodionDay_33= ruleWhenTriodionDay | this_WhenSundaysBeforeTriodion_34= ruleWhenSundaysBeforeTriodion )
            int alt41=35;
            alt41 = dfa41.predict(input);
            switch (alt41) {
                case 1 :
                    // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:2796:5: this_Actor_0= ruleActor
                    {
                     
                            newCompositeNode(grammarAccess.getSectionElementTypeAccess().getActorParserRuleCall_0()); 
                        
                    pushFollow(FOLLOW_ruleActor_in_ruleSectionElementType6825);
                    this_Actor_0=ruleActor();

                    state._fsp--;

                     
                            current = this_Actor_0; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 2 :
                    // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:2806:5: this_Block_1= ruleBlock
                    {
                     
                            newCompositeNode(grammarAccess.getSectionElementTypeAccess().getBlockParserRuleCall_1()); 
                        
                    pushFollow(FOLLOW_ruleBlock_in_ruleSectionElementType6852);
                    this_Block_1=ruleBlock();

                    state._fsp--;

                     
                            current = this_Block_1; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 3 :
                    // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:2816:5: this_Break_2= ruleBreak
                    {
                     
                            newCompositeNode(grammarAccess.getSectionElementTypeAccess().getBreakParserRuleCall_2()); 
                        
                    pushFollow(FOLLOW_ruleBreak_in_ruleSectionElementType6879);
                    this_Break_2=ruleBreak();

                    state._fsp--;

                     
                            current = this_Break_2; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 4 :
                    // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:2826:5: this_Date_3= ruleDate
                    {
                     
                            newCompositeNode(grammarAccess.getSectionElementTypeAccess().getDateParserRuleCall_3()); 
                        
                    pushFollow(FOLLOW_ruleDate_in_ruleSectionElementType6906);
                    this_Date_3=ruleDate();

                    state._fsp--;

                     
                            current = this_Date_3; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 5 :
                    // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:2836:5: this_Dialog_4= ruleDialog
                    {
                     
                            newCompositeNode(grammarAccess.getSectionElementTypeAccess().getDialogParserRuleCall_4()); 
                        
                    pushFollow(FOLLOW_ruleDialog_in_ruleSectionElementType6933);
                    this_Dialog_4=ruleDialog();

                    state._fsp--;

                     
                            current = this_Dialog_4; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 6 :
                    // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:2846:5: this_Heading1_5= ruleHeading1
                    {
                     
                            newCompositeNode(grammarAccess.getSectionElementTypeAccess().getHeading1ParserRuleCall_5()); 
                        
                    pushFollow(FOLLOW_ruleHeading1_in_ruleSectionElementType6960);
                    this_Heading1_5=ruleHeading1();

                    state._fsp--;

                     
                            current = this_Heading1_5; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 7 :
                    // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:2856:5: this_Heading2_6= ruleHeading2
                    {
                     
                            newCompositeNode(grammarAccess.getSectionElementTypeAccess().getHeading2ParserRuleCall_6()); 
                        
                    pushFollow(FOLLOW_ruleHeading2_in_ruleSectionElementType6987);
                    this_Heading2_6=ruleHeading2();

                    state._fsp--;

                     
                            current = this_Heading2_6; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 8 :
                    // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:2866:5: this_Heading3_7= ruleHeading3
                    {
                     
                            newCompositeNode(grammarAccess.getSectionElementTypeAccess().getHeading3ParserRuleCall_7()); 
                        
                    pushFollow(FOLLOW_ruleHeading3_in_ruleSectionElementType7014);
                    this_Heading3_7=ruleHeading3();

                    state._fsp--;

                     
                            current = this_Heading3_7; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 9 :
                    // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:2876:5: this_Hymn_8= ruleHymn
                    {
                     
                            newCompositeNode(grammarAccess.getSectionElementTypeAccess().getHymnParserRuleCall_8()); 
                        
                    pushFollow(FOLLOW_ruleHymn_in_ruleSectionElementType7041);
                    this_Hymn_8=ruleHymn();

                    state._fsp--;

                     
                            current = this_Hymn_8; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 10 :
                    // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:2886:5: this_McDay_9= ruleMcDay
                    {
                     
                            newCompositeNode(grammarAccess.getSectionElementTypeAccess().getMcDayParserRuleCall_9()); 
                        
                    pushFollow(FOLLOW_ruleMcDay_in_ruleSectionElementType7068);
                    this_McDay_9=ruleMcDay();

                    state._fsp--;

                     
                            current = this_McDay_9; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 11 :
                    // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:2896:5: this_Media_10= ruleMedia
                    {
                     
                            newCompositeNode(grammarAccess.getSectionElementTypeAccess().getMediaParserRuleCall_10()); 
                        
                    pushFollow(FOLLOW_ruleMedia_in_ruleSectionElementType7095);
                    this_Media_10=ruleMedia();

                    state._fsp--;

                     
                            current = this_Media_10; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 12 :
                    // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:2906:5: this_Paragraph_11= ruleParagraph
                    {
                     
                            newCompositeNode(grammarAccess.getSectionElementTypeAccess().getParagraphParserRuleCall_11()); 
                        
                    pushFollow(FOLLOW_ruleParagraph_in_ruleSectionElementType7122);
                    this_Paragraph_11=ruleParagraph();

                    state._fsp--;

                     
                            current = this_Paragraph_11; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 13 :
                    // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:2916:5: this_PassThroughHtml_12= rulePassThroughHtml
                    {
                     
                            newCompositeNode(grammarAccess.getSectionElementTypeAccess().getPassThroughHtmlParserRuleCall_12()); 
                        
                    pushFollow(FOLLOW_rulePassThroughHtml_in_ruleSectionElementType7149);
                    this_PassThroughHtml_12=rulePassThroughHtml();

                    state._fsp--;

                     
                            current = this_PassThroughHtml_12; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 14 :
                    // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:2926:5: this_PassThroughPdf_13= rulePassThroughPdf
                    {
                     
                            newCompositeNode(grammarAccess.getSectionElementTypeAccess().getPassThroughPdfParserRuleCall_13()); 
                        
                    pushFollow(FOLLOW_rulePassThroughPdf_in_ruleSectionElementType7176);
                    this_PassThroughPdf_13=rulePassThroughPdf();

                    state._fsp--;

                     
                            current = this_PassThroughPdf_13; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 15 :
                    // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:2936:5: this_Reading_14= ruleReading
                    {
                     
                            newCompositeNode(grammarAccess.getSectionElementTypeAccess().getReadingParserRuleCall_14()); 
                        
                    pushFollow(FOLLOW_ruleReading_in_ruleSectionElementType7203);
                    this_Reading_14=ruleReading();

                    state._fsp--;

                     
                            current = this_Reading_14; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 16 :
                    // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:2946:5: this_RestoreLocale_15= ruleRestoreLocale
                    {
                     
                            newCompositeNode(grammarAccess.getSectionElementTypeAccess().getRestoreLocaleParserRuleCall_15()); 
                        
                    pushFollow(FOLLOW_ruleRestoreLocale_in_ruleSectionElementType7230);
                    this_RestoreLocale_15=ruleRestoreLocale();

                    state._fsp--;

                     
                            current = this_RestoreLocale_15; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 17 :
                    // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:2956:5: this_Rubric_16= ruleRubric
                    {
                     
                            newCompositeNode(grammarAccess.getSectionElementTypeAccess().getRubricParserRuleCall_16()); 
                        
                    pushFollow(FOLLOW_ruleRubric_in_ruleSectionElementType7257);
                    this_Rubric_16=ruleRubric();

                    state._fsp--;

                     
                            current = this_Rubric_16; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 18 :
                    // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:2966:5: this_Section_17= ruleSection
                    {
                     
                            newCompositeNode(grammarAccess.getSectionElementTypeAccess().getSectionParserRuleCall_17()); 
                        
                    pushFollow(FOLLOW_ruleSection_in_ruleSectionElementType7284);
                    this_Section_17=ruleSection();

                    state._fsp--;

                     
                            current = this_Section_17; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 19 :
                    // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:2976:5: this_SectionFragment_18= ruleSectionFragment
                    {
                     
                            newCompositeNode(grammarAccess.getSectionElementTypeAccess().getSectionFragmentParserRuleCall_18()); 
                        
                    pushFollow(FOLLOW_ruleSectionFragment_in_ruleSectionElementType7311);
                    this_SectionFragment_18=ruleSectionFragment();

                    state._fsp--;

                     
                            current = this_SectionFragment_18; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 20 :
                    // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:2986:5: this_SetLocale_19= ruleSetLocale
                    {
                     
                            newCompositeNode(grammarAccess.getSectionElementTypeAccess().getSetLocaleParserRuleCall_19()); 
                        
                    pushFollow(FOLLOW_ruleSetLocale_in_ruleSectionElementType7338);
                    this_SetLocale_19=ruleSetLocale();

                    state._fsp--;

                     
                            current = this_SetLocale_19; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 21 :
                    // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:2996:5: this_TemplateFragment_20= ruleTemplateFragment
                    {
                     
                            newCompositeNode(grammarAccess.getSectionElementTypeAccess().getTemplateFragmentParserRuleCall_20()); 
                        
                    pushFollow(FOLLOW_ruleTemplateFragment_in_ruleSectionElementType7365);
                    this_TemplateFragment_20=ruleTemplateFragment();

                    state._fsp--;

                     
                            current = this_TemplateFragment_20; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 22 :
                    // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:3006:5: this_Title_21= ruleTitle
                    {
                     
                            newCompositeNode(grammarAccess.getSectionElementTypeAccess().getTitleParserRuleCall_21()); 
                        
                    pushFollow(FOLLOW_ruleTitle_in_ruleSectionElementType7392);
                    this_Title_21=ruleTitle();

                    state._fsp--;

                     
                            current = this_Title_21; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 23 :
                    // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:3016:5: this_SubTitle_22= ruleSubTitle
                    {
                     
                            newCompositeNode(grammarAccess.getSectionElementTypeAccess().getSubTitleParserRuleCall_22()); 
                        
                    pushFollow(FOLLOW_ruleSubTitle_in_ruleSectionElementType7419);
                    this_SubTitle_22=ruleSubTitle();

                    state._fsp--;

                     
                            current = this_SubTitle_22; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 24 :
                    // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:3026:5: this_Verse_23= ruleVerse
                    {
                     
                            newCompositeNode(grammarAccess.getSectionElementTypeAccess().getVerseParserRuleCall_23()); 
                        
                    pushFollow(FOLLOW_ruleVerse_in_ruleSectionElementType7446);
                    this_Verse_23=ruleVerse();

                    state._fsp--;

                     
                            current = this_Verse_23; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 25 :
                    // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:3036:5: this_WhenDate_24= ruleWhenDate
                    {
                     
                            newCompositeNode(grammarAccess.getSectionElementTypeAccess().getWhenDateParserRuleCall_24()); 
                        
                    pushFollow(FOLLOW_ruleWhenDate_in_ruleSectionElementType7473);
                    this_WhenDate_24=ruleWhenDate();

                    state._fsp--;

                     
                            current = this_WhenDate_24; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 26 :
                    // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:3046:5: this_WhenDayName_25= ruleWhenDayName
                    {
                     
                            newCompositeNode(grammarAccess.getSectionElementTypeAccess().getWhenDayNameParserRuleCall_25()); 
                        
                    pushFollow(FOLLOW_ruleWhenDayName_in_ruleSectionElementType7500);
                    this_WhenDayName_25=ruleWhenDayName();

                    state._fsp--;

                     
                            current = this_WhenDayName_25; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 27 :
                    // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:3056:5: this_WhenExists_26= ruleWhenExists
                    {
                     
                            newCompositeNode(grammarAccess.getSectionElementTypeAccess().getWhenExistsParserRuleCall_26()); 
                        
                    pushFollow(FOLLOW_ruleWhenExists_in_ruleSectionElementType7527);
                    this_WhenExists_26=ruleWhenExists();

                    state._fsp--;

                     
                            current = this_WhenExists_26; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 28 :
                    // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:3066:5: this_WhenLukanCycleDay_27= ruleWhenLukanCycleDay
                    {
                     
                            newCompositeNode(grammarAccess.getSectionElementTypeAccess().getWhenLukanCycleDayParserRuleCall_27()); 
                        
                    pushFollow(FOLLOW_ruleWhenLukanCycleDay_in_ruleSectionElementType7554);
                    this_WhenLukanCycleDay_27=ruleWhenLukanCycleDay();

                    state._fsp--;

                     
                            current = this_WhenLukanCycleDay_27; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 29 :
                    // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:3076:5: this_WhenModeOfWeek_28= ruleWhenModeOfWeek
                    {
                     
                            newCompositeNode(grammarAccess.getSectionElementTypeAccess().getWhenModeOfWeekParserRuleCall_28()); 
                        
                    pushFollow(FOLLOW_ruleWhenModeOfWeek_in_ruleSectionElementType7581);
                    this_WhenModeOfWeek_28=ruleWhenModeOfWeek();

                    state._fsp--;

                     
                            current = this_WhenModeOfWeek_28; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 30 :
                    // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:3086:5: this_WhenMovableCycleDay_29= ruleWhenMovableCycleDay
                    {
                     
                            newCompositeNode(grammarAccess.getSectionElementTypeAccess().getWhenMovableCycleDayParserRuleCall_29()); 
                        
                    pushFollow(FOLLOW_ruleWhenMovableCycleDay_in_ruleSectionElementType7608);
                    this_WhenMovableCycleDay_29=ruleWhenMovableCycleDay();

                    state._fsp--;

                     
                            current = this_WhenMovableCycleDay_29; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 31 :
                    // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:3096:5: this_WhenPascha_30= ruleWhenPascha
                    {
                     
                            newCompositeNode(grammarAccess.getSectionElementTypeAccess().getWhenPaschaParserRuleCall_30()); 
                        
                    pushFollow(FOLLOW_ruleWhenPascha_in_ruleSectionElementType7635);
                    this_WhenPascha_30=ruleWhenPascha();

                    state._fsp--;

                     
                            current = this_WhenPascha_30; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 32 :
                    // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:3106:5: this_WhenPentecostarionDay_31= ruleWhenPentecostarionDay
                    {
                     
                            newCompositeNode(grammarAccess.getSectionElementTypeAccess().getWhenPentecostarionDayParserRuleCall_31()); 
                        
                    pushFollow(FOLLOW_ruleWhenPentecostarionDay_in_ruleSectionElementType7662);
                    this_WhenPentecostarionDay_31=ruleWhenPentecostarionDay();

                    state._fsp--;

                     
                            current = this_WhenPentecostarionDay_31; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 33 :
                    // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:3116:5: this_WhenSundayAfterElevationOfCrossDay_32= ruleWhenSundayAfterElevationOfCrossDay
                    {
                     
                            newCompositeNode(grammarAccess.getSectionElementTypeAccess().getWhenSundayAfterElevationOfCrossDayParserRuleCall_32()); 
                        
                    pushFollow(FOLLOW_ruleWhenSundayAfterElevationOfCrossDay_in_ruleSectionElementType7689);
                    this_WhenSundayAfterElevationOfCrossDay_32=ruleWhenSundayAfterElevationOfCrossDay();

                    state._fsp--;

                     
                            current = this_WhenSundayAfterElevationOfCrossDay_32; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 34 :
                    // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:3126:5: this_WhenTriodionDay_33= ruleWhenTriodionDay
                    {
                     
                            newCompositeNode(grammarAccess.getSectionElementTypeAccess().getWhenTriodionDayParserRuleCall_33()); 
                        
                    pushFollow(FOLLOW_ruleWhenTriodionDay_in_ruleSectionElementType7716);
                    this_WhenTriodionDay_33=ruleWhenTriodionDay();

                    state._fsp--;

                     
                            current = this_WhenTriodionDay_33; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 35 :
                    // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:3136:5: this_WhenSundaysBeforeTriodion_34= ruleWhenSundaysBeforeTriodion
                    {
                     
                            newCompositeNode(grammarAccess.getSectionElementTypeAccess().getWhenSundaysBeforeTriodionParserRuleCall_34()); 
                        
                    pushFollow(FOLLOW_ruleWhenSundaysBeforeTriodion_in_ruleSectionElementType7743);
                    this_WhenSundaysBeforeTriodion_34=ruleWhenSundaysBeforeTriodion();

                    state._fsp--;

                     
                            current = this_WhenSundaysBeforeTriodion_34; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleSectionElementType"


    // $ANTLR start "entryRuleLdpType"
    // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:3152:1: entryRuleLdpType returns [EObject current=null] : iv_ruleLdpType= ruleLdpType EOF ;
    public final EObject entryRuleLdpType() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleLdpType = null;


        try {
            // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:3153:2: (iv_ruleLdpType= ruleLdpType EOF )
            // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:3154:2: iv_ruleLdpType= ruleLdpType EOF
            {
             newCompositeNode(grammarAccess.getLdpTypeRule()); 
            pushFollow(FOLLOW_ruleLdpType_in_entryRuleLdpType7778);
            iv_ruleLdpType=ruleLdpType();

            state._fsp--;

             current =iv_ruleLdpType; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleLdpType7788); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleLdpType"


    // $ANTLR start "ruleLdpType"
    // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:3161:1: ruleLdpType returns [EObject current=null] : (this_DOM_0= ruleDOM | this_DOWN_1= ruleDOWN | this_DOWT_2= ruleDOWT | this_EOW_3= ruleEOW | this_All_4= ruleAll | this_GenDate_5= ruleGenDate | this_GenYear_6= ruleGenYear | this_MCD_7= ruleMCD | this_MOW_8= ruleMOW | this_NOP_9= ruleNOP | this_DOP_10= ruleDOP | this_SAEC_11= ruleSAEC | this_SOL_12= ruleSOL | this_DOL_13= ruleDOL | this_WOLC_14= ruleWOLC | this_WDOLC_15= ruleWDOLC | this_SBT_16= ruleSBT ) ;
    public final EObject ruleLdpType() throws RecognitionException {
        EObject current = null;

        EObject this_DOM_0 = null;

        EObject this_DOWN_1 = null;

        EObject this_DOWT_2 = null;

        EObject this_EOW_3 = null;

        EObject this_All_4 = null;

        EObject this_GenDate_5 = null;

        EObject this_GenYear_6 = null;

        EObject this_MCD_7 = null;

        EObject this_MOW_8 = null;

        EObject this_NOP_9 = null;

        EObject this_DOP_10 = null;

        EObject this_SAEC_11 = null;

        EObject this_SOL_12 = null;

        EObject this_DOL_13 = null;

        EObject this_WOLC_14 = null;

        EObject this_WDOLC_15 = null;

        EObject this_SBT_16 = null;


         enterRule(); 
            
        try {
            // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:3164:28: ( (this_DOM_0= ruleDOM | this_DOWN_1= ruleDOWN | this_DOWT_2= ruleDOWT | this_EOW_3= ruleEOW | this_All_4= ruleAll | this_GenDate_5= ruleGenDate | this_GenYear_6= ruleGenYear | this_MCD_7= ruleMCD | this_MOW_8= ruleMOW | this_NOP_9= ruleNOP | this_DOP_10= ruleDOP | this_SAEC_11= ruleSAEC | this_SOL_12= ruleSOL | this_DOL_13= ruleDOL | this_WOLC_14= ruleWOLC | this_WDOLC_15= ruleWDOLC | this_SBT_16= ruleSBT ) )
            // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:3165:1: (this_DOM_0= ruleDOM | this_DOWN_1= ruleDOWN | this_DOWT_2= ruleDOWT | this_EOW_3= ruleEOW | this_All_4= ruleAll | this_GenDate_5= ruleGenDate | this_GenYear_6= ruleGenYear | this_MCD_7= ruleMCD | this_MOW_8= ruleMOW | this_NOP_9= ruleNOP | this_DOP_10= ruleDOP | this_SAEC_11= ruleSAEC | this_SOL_12= ruleSOL | this_DOL_13= ruleDOL | this_WOLC_14= ruleWOLC | this_WDOLC_15= ruleWDOLC | this_SBT_16= ruleSBT )
            {
            // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:3165:1: (this_DOM_0= ruleDOM | this_DOWN_1= ruleDOWN | this_DOWT_2= ruleDOWT | this_EOW_3= ruleEOW | this_All_4= ruleAll | this_GenDate_5= ruleGenDate | this_GenYear_6= ruleGenYear | this_MCD_7= ruleMCD | this_MOW_8= ruleMOW | this_NOP_9= ruleNOP | this_DOP_10= ruleDOP | this_SAEC_11= ruleSAEC | this_SOL_12= ruleSOL | this_DOL_13= ruleDOL | this_WOLC_14= ruleWOLC | this_WDOLC_15= ruleWDOLC | this_SBT_16= ruleSBT )
            int alt42=17;
            switch ( input.LA(1) ) {
            case 79:
                {
                alt42=1;
                }
                break;
            case 81:
                {
                alt42=2;
                }
                break;
            case 82:
                {
                alt42=3;
                }
                break;
            case 83:
                {
                alt42=4;
                }
                break;
            case 73:
                {
                alt42=5;
                }
                break;
            case 74:
                {
                alt42=6;
                }
                break;
            case 75:
                {
                alt42=7;
                }
                break;
            case 76:
                {
                alt42=8;
                }
                break;
            case 77:
                {
                alt42=9;
                }
                break;
            case 78:
                {
                alt42=10;
                }
                break;
            case 80:
                {
                alt42=11;
                }
                break;
            case 84:
                {
                alt42=12;
                }
                break;
            case 85:
                {
                alt42=13;
                }
                break;
            case 86:
                {
                alt42=14;
                }
                break;
            case 87:
                {
                alt42=15;
                }
                break;
            case 88:
                {
                alt42=16;
                }
                break;
            case 89:
                {
                alt42=17;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 42, 0, input);

                throw nvae;
            }

            switch (alt42) {
                case 1 :
                    // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:3166:5: this_DOM_0= ruleDOM
                    {
                     
                            newCompositeNode(grammarAccess.getLdpTypeAccess().getDOMParserRuleCall_0()); 
                        
                    pushFollow(FOLLOW_ruleDOM_in_ruleLdpType7835);
                    this_DOM_0=ruleDOM();

                    state._fsp--;

                     
                            current = this_DOM_0; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 2 :
                    // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:3176:5: this_DOWN_1= ruleDOWN
                    {
                     
                            newCompositeNode(grammarAccess.getLdpTypeAccess().getDOWNParserRuleCall_1()); 
                        
                    pushFollow(FOLLOW_ruleDOWN_in_ruleLdpType7862);
                    this_DOWN_1=ruleDOWN();

                    state._fsp--;

                     
                            current = this_DOWN_1; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 3 :
                    // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:3186:5: this_DOWT_2= ruleDOWT
                    {
                     
                            newCompositeNode(grammarAccess.getLdpTypeAccess().getDOWTParserRuleCall_2()); 
                        
                    pushFollow(FOLLOW_ruleDOWT_in_ruleLdpType7889);
                    this_DOWT_2=ruleDOWT();

                    state._fsp--;

                     
                            current = this_DOWT_2; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 4 :
                    // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:3196:5: this_EOW_3= ruleEOW
                    {
                     
                            newCompositeNode(grammarAccess.getLdpTypeAccess().getEOWParserRuleCall_3()); 
                        
                    pushFollow(FOLLOW_ruleEOW_in_ruleLdpType7916);
                    this_EOW_3=ruleEOW();

                    state._fsp--;

                     
                            current = this_EOW_3; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 5 :
                    // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:3206:5: this_All_4= ruleAll
                    {
                     
                            newCompositeNode(grammarAccess.getLdpTypeAccess().getAllParserRuleCall_4()); 
                        
                    pushFollow(FOLLOW_ruleAll_in_ruleLdpType7943);
                    this_All_4=ruleAll();

                    state._fsp--;

                     
                            current = this_All_4; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 6 :
                    // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:3216:5: this_GenDate_5= ruleGenDate
                    {
                     
                            newCompositeNode(grammarAccess.getLdpTypeAccess().getGenDateParserRuleCall_5()); 
                        
                    pushFollow(FOLLOW_ruleGenDate_in_ruleLdpType7970);
                    this_GenDate_5=ruleGenDate();

                    state._fsp--;

                     
                            current = this_GenDate_5; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 7 :
                    // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:3226:5: this_GenYear_6= ruleGenYear
                    {
                     
                            newCompositeNode(grammarAccess.getLdpTypeAccess().getGenYearParserRuleCall_6()); 
                        
                    pushFollow(FOLLOW_ruleGenYear_in_ruleLdpType7997);
                    this_GenYear_6=ruleGenYear();

                    state._fsp--;

                     
                            current = this_GenYear_6; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 8 :
                    // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:3236:5: this_MCD_7= ruleMCD
                    {
                     
                            newCompositeNode(grammarAccess.getLdpTypeAccess().getMCDParserRuleCall_7()); 
                        
                    pushFollow(FOLLOW_ruleMCD_in_ruleLdpType8024);
                    this_MCD_7=ruleMCD();

                    state._fsp--;

                     
                            current = this_MCD_7; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 9 :
                    // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:3246:5: this_MOW_8= ruleMOW
                    {
                     
                            newCompositeNode(grammarAccess.getLdpTypeAccess().getMOWParserRuleCall_8()); 
                        
                    pushFollow(FOLLOW_ruleMOW_in_ruleLdpType8051);
                    this_MOW_8=ruleMOW();

                    state._fsp--;

                     
                            current = this_MOW_8; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 10 :
                    // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:3256:5: this_NOP_9= ruleNOP
                    {
                     
                            newCompositeNode(grammarAccess.getLdpTypeAccess().getNOPParserRuleCall_9()); 
                        
                    pushFollow(FOLLOW_ruleNOP_in_ruleLdpType8078);
                    this_NOP_9=ruleNOP();

                    state._fsp--;

                     
                            current = this_NOP_9; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 11 :
                    // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:3266:5: this_DOP_10= ruleDOP
                    {
                     
                            newCompositeNode(grammarAccess.getLdpTypeAccess().getDOPParserRuleCall_10()); 
                        
                    pushFollow(FOLLOW_ruleDOP_in_ruleLdpType8105);
                    this_DOP_10=ruleDOP();

                    state._fsp--;

                     
                            current = this_DOP_10; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 12 :
                    // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:3276:5: this_SAEC_11= ruleSAEC
                    {
                     
                            newCompositeNode(grammarAccess.getLdpTypeAccess().getSAECParserRuleCall_11()); 
                        
                    pushFollow(FOLLOW_ruleSAEC_in_ruleLdpType8132);
                    this_SAEC_11=ruleSAEC();

                    state._fsp--;

                     
                            current = this_SAEC_11; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 13 :
                    // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:3286:5: this_SOL_12= ruleSOL
                    {
                     
                            newCompositeNode(grammarAccess.getLdpTypeAccess().getSOLParserRuleCall_12()); 
                        
                    pushFollow(FOLLOW_ruleSOL_in_ruleLdpType8159);
                    this_SOL_12=ruleSOL();

                    state._fsp--;

                     
                            current = this_SOL_12; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 14 :
                    // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:3296:5: this_DOL_13= ruleDOL
                    {
                     
                            newCompositeNode(grammarAccess.getLdpTypeAccess().getDOLParserRuleCall_13()); 
                        
                    pushFollow(FOLLOW_ruleDOL_in_ruleLdpType8186);
                    this_DOL_13=ruleDOL();

                    state._fsp--;

                     
                            current = this_DOL_13; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 15 :
                    // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:3306:5: this_WOLC_14= ruleWOLC
                    {
                     
                            newCompositeNode(grammarAccess.getLdpTypeAccess().getWOLCParserRuleCall_14()); 
                        
                    pushFollow(FOLLOW_ruleWOLC_in_ruleLdpType8213);
                    this_WOLC_14=ruleWOLC();

                    state._fsp--;

                     
                            current = this_WOLC_14; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 16 :
                    // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:3316:5: this_WDOLC_15= ruleWDOLC
                    {
                     
                            newCompositeNode(grammarAccess.getLdpTypeAccess().getWDOLCParserRuleCall_15()); 
                        
                    pushFollow(FOLLOW_ruleWDOLC_in_ruleLdpType8240);
                    this_WDOLC_15=ruleWDOLC();

                    state._fsp--;

                     
                            current = this_WDOLC_15; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 17 :
                    // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:3326:5: this_SBT_16= ruleSBT
                    {
                     
                            newCompositeNode(grammarAccess.getLdpTypeAccess().getSBTParserRuleCall_16()); 
                        
                    pushFollow(FOLLOW_ruleSBT_in_ruleLdpType8267);
                    this_SBT_16=ruleSBT();

                    state._fsp--;

                     
                            current = this_SBT_16; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleLdpType"


    // $ANTLR start "entryRuleAll"
    // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:3342:1: entryRuleAll returns [EObject current=null] : iv_ruleAll= ruleAll EOF ;
    public final EObject entryRuleAll() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAll = null;


        try {
            // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:3343:2: (iv_ruleAll= ruleAll EOF )
            // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:3344:2: iv_ruleAll= ruleAll EOF
            {
             newCompositeNode(grammarAccess.getAllRule()); 
            pushFollow(FOLLOW_ruleAll_in_entryRuleAll8302);
            iv_ruleAll=ruleAll();

            state._fsp--;

             current =iv_ruleAll; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleAll8312); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleAll"


    // $ANTLR start "ruleAll"
    // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:3351:1: ruleAll returns [EObject current=null] : ( (lv_dsl_Display_LiturgicalDayProperties_0_0= '@All_Liturgical_Day_Properties' ) ) ;
    public final EObject ruleAll() throws RecognitionException {
        EObject current = null;

        Token lv_dsl_Display_LiturgicalDayProperties_0_0=null;

         enterRule(); 
            
        try {
            // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:3354:28: ( ( (lv_dsl_Display_LiturgicalDayProperties_0_0= '@All_Liturgical_Day_Properties' ) ) )
            // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:3355:1: ( (lv_dsl_Display_LiturgicalDayProperties_0_0= '@All_Liturgical_Day_Properties' ) )
            {
            // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:3355:1: ( (lv_dsl_Display_LiturgicalDayProperties_0_0= '@All_Liturgical_Day_Properties' ) )
            // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:3356:1: (lv_dsl_Display_LiturgicalDayProperties_0_0= '@All_Liturgical_Day_Properties' )
            {
            // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:3356:1: (lv_dsl_Display_LiturgicalDayProperties_0_0= '@All_Liturgical_Day_Properties' )
            // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:3357:3: lv_dsl_Display_LiturgicalDayProperties_0_0= '@All_Liturgical_Day_Properties'
            {
            lv_dsl_Display_LiturgicalDayProperties_0_0=(Token)match(input,73,FOLLOW_73_in_ruleAll8354); 

                    newLeafNode(lv_dsl_Display_LiturgicalDayProperties_0_0, grammarAccess.getAllAccess().getDsl_Display_LiturgicalDayPropertiesAll_Liturgical_Day_PropertiesKeyword_0());
                

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getAllRule());
            	        }
                   		setWithLastConsumed(current, "dsl_Display_LiturgicalDayProperties", true, "@All_Liturgical_Day_Properties");
            	    

            }


            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleAll"


    // $ANTLR start "entryRuleGenDate"
    // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:3378:1: entryRuleGenDate returns [EObject current=null] : iv_ruleGenDate= ruleGenDate EOF ;
    public final EObject entryRuleGenDate() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleGenDate = null;


        try {
            // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:3379:2: (iv_ruleGenDate= ruleGenDate EOF )
            // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:3380:2: iv_ruleGenDate= ruleGenDate EOF
            {
             newCompositeNode(grammarAccess.getGenDateRule()); 
            pushFollow(FOLLOW_ruleGenDate_in_entryRuleGenDate8402);
            iv_ruleGenDate=ruleGenDate();

            state._fsp--;

             current =iv_ruleGenDate; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleGenDate8412); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleGenDate"


    // $ANTLR start "ruleGenDate"
    // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:3387:1: ruleGenDate returns [EObject current=null] : ( (lv_dsl_Display_Date_0_0= '@Service_Date' ) ) ;
    public final EObject ruleGenDate() throws RecognitionException {
        EObject current = null;

        Token lv_dsl_Display_Date_0_0=null;

         enterRule(); 
            
        try {
            // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:3390:28: ( ( (lv_dsl_Display_Date_0_0= '@Service_Date' ) ) )
            // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:3391:1: ( (lv_dsl_Display_Date_0_0= '@Service_Date' ) )
            {
            // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:3391:1: ( (lv_dsl_Display_Date_0_0= '@Service_Date' ) )
            // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:3392:1: (lv_dsl_Display_Date_0_0= '@Service_Date' )
            {
            // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:3392:1: (lv_dsl_Display_Date_0_0= '@Service_Date' )
            // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:3393:3: lv_dsl_Display_Date_0_0= '@Service_Date'
            {
            lv_dsl_Display_Date_0_0=(Token)match(input,74,FOLLOW_74_in_ruleGenDate8454); 

                    newLeafNode(lv_dsl_Display_Date_0_0, grammarAccess.getGenDateAccess().getDsl_Display_DateService_DateKeyword_0());
                

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getGenDateRule());
            	        }
                   		setWithLastConsumed(current, "dsl_Display_Date", true, "@Service_Date");
            	    

            }


            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleGenDate"


    // $ANTLR start "entryRuleGenYear"
    // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:3414:1: entryRuleGenYear returns [EObject current=null] : iv_ruleGenYear= ruleGenYear EOF ;
    public final EObject entryRuleGenYear() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleGenYear = null;


        try {
            // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:3415:2: (iv_ruleGenYear= ruleGenYear EOF )
            // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:3416:2: iv_ruleGenYear= ruleGenYear EOF
            {
             newCompositeNode(grammarAccess.getGenYearRule()); 
            pushFollow(FOLLOW_ruleGenYear_in_entryRuleGenYear8502);
            iv_ruleGenYear=ruleGenYear();

            state._fsp--;

             current =iv_ruleGenYear; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleGenYear8512); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleGenYear"


    // $ANTLR start "ruleGenYear"
    // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:3423:1: ruleGenYear returns [EObject current=null] : ( (lv_dsl_Display_Year_0_0= '@Service_Year' ) ) ;
    public final EObject ruleGenYear() throws RecognitionException {
        EObject current = null;

        Token lv_dsl_Display_Year_0_0=null;

         enterRule(); 
            
        try {
            // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:3426:28: ( ( (lv_dsl_Display_Year_0_0= '@Service_Year' ) ) )
            // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:3427:1: ( (lv_dsl_Display_Year_0_0= '@Service_Year' ) )
            {
            // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:3427:1: ( (lv_dsl_Display_Year_0_0= '@Service_Year' ) )
            // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:3428:1: (lv_dsl_Display_Year_0_0= '@Service_Year' )
            {
            // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:3428:1: (lv_dsl_Display_Year_0_0= '@Service_Year' )
            // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:3429:3: lv_dsl_Display_Year_0_0= '@Service_Year'
            {
            lv_dsl_Display_Year_0_0=(Token)match(input,75,FOLLOW_75_in_ruleGenYear8554); 

                    newLeafNode(lv_dsl_Display_Year_0_0, grammarAccess.getGenYearAccess().getDsl_Display_YearService_YearKeyword_0());
                

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getGenYearRule());
            	        }
                   		setWithLastConsumed(current, "dsl_Display_Year", true, "@Service_Year");
            	    

            }


            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleGenYear"


    // $ANTLR start "entryRuleMCD"
    // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:3450:1: entryRuleMCD returns [EObject current=null] : iv_ruleMCD= ruleMCD EOF ;
    public final EObject entryRuleMCD() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMCD = null;


        try {
            // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:3451:2: (iv_ruleMCD= ruleMCD EOF )
            // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:3452:2: iv_ruleMCD= ruleMCD EOF
            {
             newCompositeNode(grammarAccess.getMCDRule()); 
            pushFollow(FOLLOW_ruleMCD_in_entryRuleMCD8602);
            iv_ruleMCD=ruleMCD();

            state._fsp--;

             current =iv_ruleMCD; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleMCD8612); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleMCD"


    // $ANTLR start "ruleMCD"
    // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:3459:1: ruleMCD returns [EObject current=null] : ( (lv_dsl_MCD_value_0_0= '@Day_of_Movable_Cycle' ) ) ;
    public final EObject ruleMCD() throws RecognitionException {
        EObject current = null;

        Token lv_dsl_MCD_value_0_0=null;

         enterRule(); 
            
        try {
            // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:3462:28: ( ( (lv_dsl_MCD_value_0_0= '@Day_of_Movable_Cycle' ) ) )
            // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:3463:1: ( (lv_dsl_MCD_value_0_0= '@Day_of_Movable_Cycle' ) )
            {
            // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:3463:1: ( (lv_dsl_MCD_value_0_0= '@Day_of_Movable_Cycle' ) )
            // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:3464:1: (lv_dsl_MCD_value_0_0= '@Day_of_Movable_Cycle' )
            {
            // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:3464:1: (lv_dsl_MCD_value_0_0= '@Day_of_Movable_Cycle' )
            // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:3465:3: lv_dsl_MCD_value_0_0= '@Day_of_Movable_Cycle'
            {
            lv_dsl_MCD_value_0_0=(Token)match(input,76,FOLLOW_76_in_ruleMCD8654); 

                    newLeafNode(lv_dsl_MCD_value_0_0, grammarAccess.getMCDAccess().getDsl_MCD_valueDay_of_Movable_CycleKeyword_0());
                

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getMCDRule());
            	        }
                   		setWithLastConsumed(current, "dsl_MCD_value", true, "@Day_of_Movable_Cycle");
            	    

            }


            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleMCD"


    // $ANTLR start "entryRuleMOW"
    // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:3486:1: entryRuleMOW returns [EObject current=null] : iv_ruleMOW= ruleMOW EOF ;
    public final EObject entryRuleMOW() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMOW = null;


        try {
            // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:3487:2: (iv_ruleMOW= ruleMOW EOF )
            // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:3488:2: iv_ruleMOW= ruleMOW EOF
            {
             newCompositeNode(grammarAccess.getMOWRule()); 
            pushFollow(FOLLOW_ruleMOW_in_entryRuleMOW8702);
            iv_ruleMOW=ruleMOW();

            state._fsp--;

             current =iv_ruleMOW; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleMOW8712); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleMOW"


    // $ANTLR start "ruleMOW"
    // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:3495:1: ruleMOW returns [EObject current=null] : ( (lv_dsl_Display_Mode_0_0= '@Mode_of_Week' ) ) ;
    public final EObject ruleMOW() throws RecognitionException {
        EObject current = null;

        Token lv_dsl_Display_Mode_0_0=null;

         enterRule(); 
            
        try {
            // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:3498:28: ( ( (lv_dsl_Display_Mode_0_0= '@Mode_of_Week' ) ) )
            // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:3499:1: ( (lv_dsl_Display_Mode_0_0= '@Mode_of_Week' ) )
            {
            // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:3499:1: ( (lv_dsl_Display_Mode_0_0= '@Mode_of_Week' ) )
            // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:3500:1: (lv_dsl_Display_Mode_0_0= '@Mode_of_Week' )
            {
            // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:3500:1: (lv_dsl_Display_Mode_0_0= '@Mode_of_Week' )
            // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:3501:3: lv_dsl_Display_Mode_0_0= '@Mode_of_Week'
            {
            lv_dsl_Display_Mode_0_0=(Token)match(input,77,FOLLOW_77_in_ruleMOW8754); 

                    newLeafNode(lv_dsl_Display_Mode_0_0, grammarAccess.getMOWAccess().getDsl_Display_ModeMode_of_WeekKeyword_0());
                

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getMOWRule());
            	        }
                   		setWithLastConsumed(current, "dsl_Display_Mode", true, "@Mode_of_Week");
            	    

            }


            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleMOW"


    // $ANTLR start "entryRuleNOP"
    // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:3522:1: entryRuleNOP returns [EObject current=null] : iv_ruleNOP= ruleNOP EOF ;
    public final EObject entryRuleNOP() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleNOP = null;


        try {
            // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:3523:2: (iv_ruleNOP= ruleNOP EOF )
            // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:3524:2: iv_ruleNOP= ruleNOP EOF
            {
             newCompositeNode(grammarAccess.getNOPRule()); 
            pushFollow(FOLLOW_ruleNOP_in_entryRuleNOP8802);
            iv_ruleNOP=ruleNOP();

            state._fsp--;

             current =iv_ruleNOP; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleNOP8812); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleNOP"


    // $ANTLR start "ruleNOP"
    // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:3531:1: ruleNOP returns [EObject current=null] : ( (lv_dsl_Display_Mode_0_0= '@Name_of_Period' ) ) ;
    public final EObject ruleNOP() throws RecognitionException {
        EObject current = null;

        Token lv_dsl_Display_Mode_0_0=null;

         enterRule(); 
            
        try {
            // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:3534:28: ( ( (lv_dsl_Display_Mode_0_0= '@Name_of_Period' ) ) )
            // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:3535:1: ( (lv_dsl_Display_Mode_0_0= '@Name_of_Period' ) )
            {
            // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:3535:1: ( (lv_dsl_Display_Mode_0_0= '@Name_of_Period' ) )
            // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:3536:1: (lv_dsl_Display_Mode_0_0= '@Name_of_Period' )
            {
            // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:3536:1: (lv_dsl_Display_Mode_0_0= '@Name_of_Period' )
            // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:3537:3: lv_dsl_Display_Mode_0_0= '@Name_of_Period'
            {
            lv_dsl_Display_Mode_0_0=(Token)match(input,78,FOLLOW_78_in_ruleNOP8854); 

                    newLeafNode(lv_dsl_Display_Mode_0_0, grammarAccess.getNOPAccess().getDsl_Display_ModeName_of_PeriodKeyword_0());
                

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getNOPRule());
            	        }
                   		setWithLastConsumed(current, "dsl_Display_Mode", true, "@Name_of_Period");
            	    

            }


            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleNOP"


    // $ANTLR start "entryRuleDOM"
    // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:3558:1: entryRuleDOM returns [EObject current=null] : iv_ruleDOM= ruleDOM EOF ;
    public final EObject entryRuleDOM() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDOM = null;


        try {
            // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:3559:2: (iv_ruleDOM= ruleDOM EOF )
            // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:3560:2: iv_ruleDOM= ruleDOM EOF
            {
             newCompositeNode(grammarAccess.getDOMRule()); 
            pushFollow(FOLLOW_ruleDOM_in_entryRuleDOM8902);
            iv_ruleDOM=ruleDOM();

            state._fsp--;

             current =iv_ruleDOM; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleDOM8912); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleDOM"


    // $ANTLR start "ruleDOM"
    // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:3567:1: ruleDOM returns [EObject current=null] : ( (lv_dsl_Display_Mode_0_0= '@Day_of_Month' ) ) ;
    public final EObject ruleDOM() throws RecognitionException {
        EObject current = null;

        Token lv_dsl_Display_Mode_0_0=null;

         enterRule(); 
            
        try {
            // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:3570:28: ( ( (lv_dsl_Display_Mode_0_0= '@Day_of_Month' ) ) )
            // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:3571:1: ( (lv_dsl_Display_Mode_0_0= '@Day_of_Month' ) )
            {
            // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:3571:1: ( (lv_dsl_Display_Mode_0_0= '@Day_of_Month' ) )
            // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:3572:1: (lv_dsl_Display_Mode_0_0= '@Day_of_Month' )
            {
            // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:3572:1: (lv_dsl_Display_Mode_0_0= '@Day_of_Month' )
            // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:3573:3: lv_dsl_Display_Mode_0_0= '@Day_of_Month'
            {
            lv_dsl_Display_Mode_0_0=(Token)match(input,79,FOLLOW_79_in_ruleDOM8954); 

                    newLeafNode(lv_dsl_Display_Mode_0_0, grammarAccess.getDOMAccess().getDsl_Display_ModeDay_of_MonthKeyword_0());
                

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getDOMRule());
            	        }
                   		setWithLastConsumed(current, "dsl_Display_Mode", true, "@Day_of_Month");
            	    

            }


            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleDOM"


    // $ANTLR start "entryRuleDOP"
    // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:3594:1: entryRuleDOP returns [EObject current=null] : iv_ruleDOP= ruleDOP EOF ;
    public final EObject entryRuleDOP() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDOP = null;


        try {
            // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:3595:2: (iv_ruleDOP= ruleDOP EOF )
            // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:3596:2: iv_ruleDOP= ruleDOP EOF
            {
             newCompositeNode(grammarAccess.getDOPRule()); 
            pushFollow(FOLLOW_ruleDOP_in_entryRuleDOP9002);
            iv_ruleDOP=ruleDOP();

            state._fsp--;

             current =iv_ruleDOP; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleDOP9012); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleDOP"


    // $ANTLR start "ruleDOP"
    // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:3603:1: ruleDOP returns [EObject current=null] : ( (lv_dsl_Display_Mode_0_0= '@Day_of_Period' ) ) ;
    public final EObject ruleDOP() throws RecognitionException {
        EObject current = null;

        Token lv_dsl_Display_Mode_0_0=null;

         enterRule(); 
            
        try {
            // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:3606:28: ( ( (lv_dsl_Display_Mode_0_0= '@Day_of_Period' ) ) )
            // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:3607:1: ( (lv_dsl_Display_Mode_0_0= '@Day_of_Period' ) )
            {
            // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:3607:1: ( (lv_dsl_Display_Mode_0_0= '@Day_of_Period' ) )
            // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:3608:1: (lv_dsl_Display_Mode_0_0= '@Day_of_Period' )
            {
            // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:3608:1: (lv_dsl_Display_Mode_0_0= '@Day_of_Period' )
            // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:3609:3: lv_dsl_Display_Mode_0_0= '@Day_of_Period'
            {
            lv_dsl_Display_Mode_0_0=(Token)match(input,80,FOLLOW_80_in_ruleDOP9054); 

                    newLeafNode(lv_dsl_Display_Mode_0_0, grammarAccess.getDOPAccess().getDsl_Display_ModeDay_of_PeriodKeyword_0());
                

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getDOPRule());
            	        }
                   		setWithLastConsumed(current, "dsl_Display_Mode", true, "@Day_of_Period");
            	    

            }


            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleDOP"


    // $ANTLR start "entryRuleDOWN"
    // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:3630:1: entryRuleDOWN returns [EObject current=null] : iv_ruleDOWN= ruleDOWN EOF ;
    public final EObject entryRuleDOWN() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDOWN = null;


        try {
            // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:3631:2: (iv_ruleDOWN= ruleDOWN EOF )
            // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:3632:2: iv_ruleDOWN= ruleDOWN EOF
            {
             newCompositeNode(grammarAccess.getDOWNRule()); 
            pushFollow(FOLLOW_ruleDOWN_in_entryRuleDOWN9102);
            iv_ruleDOWN=ruleDOWN();

            state._fsp--;

             current =iv_ruleDOWN; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleDOWN9112); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleDOWN"


    // $ANTLR start "ruleDOWN"
    // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:3639:1: ruleDOWN returns [EObject current=null] : ( (lv_dsl_Display_Mode_0_0= '@Day_of_Week_As_Number' ) ) ;
    public final EObject ruleDOWN() throws RecognitionException {
        EObject current = null;

        Token lv_dsl_Display_Mode_0_0=null;

         enterRule(); 
            
        try {
            // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:3642:28: ( ( (lv_dsl_Display_Mode_0_0= '@Day_of_Week_As_Number' ) ) )
            // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:3643:1: ( (lv_dsl_Display_Mode_0_0= '@Day_of_Week_As_Number' ) )
            {
            // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:3643:1: ( (lv_dsl_Display_Mode_0_0= '@Day_of_Week_As_Number' ) )
            // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:3644:1: (lv_dsl_Display_Mode_0_0= '@Day_of_Week_As_Number' )
            {
            // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:3644:1: (lv_dsl_Display_Mode_0_0= '@Day_of_Week_As_Number' )
            // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:3645:3: lv_dsl_Display_Mode_0_0= '@Day_of_Week_As_Number'
            {
            lv_dsl_Display_Mode_0_0=(Token)match(input,81,FOLLOW_81_in_ruleDOWN9154); 

                    newLeafNode(lv_dsl_Display_Mode_0_0, grammarAccess.getDOWNAccess().getDsl_Display_ModeDay_of_Week_As_NumberKeyword_0());
                

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getDOWNRule());
            	        }
                   		setWithLastConsumed(current, "dsl_Display_Mode", true, "@Day_of_Week_As_Number");
            	    

            }


            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleDOWN"


    // $ANTLR start "entryRuleDOWT"
    // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:3666:1: entryRuleDOWT returns [EObject current=null] : iv_ruleDOWT= ruleDOWT EOF ;
    public final EObject entryRuleDOWT() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDOWT = null;


        try {
            // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:3667:2: (iv_ruleDOWT= ruleDOWT EOF )
            // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:3668:2: iv_ruleDOWT= ruleDOWT EOF
            {
             newCompositeNode(grammarAccess.getDOWTRule()); 
            pushFollow(FOLLOW_ruleDOWT_in_entryRuleDOWT9202);
            iv_ruleDOWT=ruleDOWT();

            state._fsp--;

             current =iv_ruleDOWT; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleDOWT9212); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleDOWT"


    // $ANTLR start "ruleDOWT"
    // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:3675:1: ruleDOWT returns [EObject current=null] : ( (lv_dsl_Display_Mode_0_0= '@Day_of_Week_As_Text' ) ) ;
    public final EObject ruleDOWT() throws RecognitionException {
        EObject current = null;

        Token lv_dsl_Display_Mode_0_0=null;

         enterRule(); 
            
        try {
            // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:3678:28: ( ( (lv_dsl_Display_Mode_0_0= '@Day_of_Week_As_Text' ) ) )
            // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:3679:1: ( (lv_dsl_Display_Mode_0_0= '@Day_of_Week_As_Text' ) )
            {
            // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:3679:1: ( (lv_dsl_Display_Mode_0_0= '@Day_of_Week_As_Text' ) )
            // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:3680:1: (lv_dsl_Display_Mode_0_0= '@Day_of_Week_As_Text' )
            {
            // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:3680:1: (lv_dsl_Display_Mode_0_0= '@Day_of_Week_As_Text' )
            // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:3681:3: lv_dsl_Display_Mode_0_0= '@Day_of_Week_As_Text'
            {
            lv_dsl_Display_Mode_0_0=(Token)match(input,82,FOLLOW_82_in_ruleDOWT9254); 

                    newLeafNode(lv_dsl_Display_Mode_0_0, grammarAccess.getDOWTAccess().getDsl_Display_ModeDay_of_Week_As_TextKeyword_0());
                

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getDOWTRule());
            	        }
                   		setWithLastConsumed(current, "dsl_Display_Mode", true, "@Day_of_Week_As_Text");
            	    

            }


            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleDOWT"


    // $ANTLR start "entryRuleEOW"
    // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:3702:1: entryRuleEOW returns [EObject current=null] : iv_ruleEOW= ruleEOW EOF ;
    public final EObject entryRuleEOW() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEOW = null;


        try {
            // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:3703:2: (iv_ruleEOW= ruleEOW EOF )
            // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:3704:2: iv_ruleEOW= ruleEOW EOF
            {
             newCompositeNode(grammarAccess.getEOWRule()); 
            pushFollow(FOLLOW_ruleEOW_in_entryRuleEOW9302);
            iv_ruleEOW=ruleEOW();

            state._fsp--;

             current =iv_ruleEOW; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleEOW9312); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleEOW"


    // $ANTLR start "ruleEOW"
    // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:3711:1: ruleEOW returns [EObject current=null] : ( (lv_dsl_Display_Eothinon_0_0= '@Eothinon' ) ) ;
    public final EObject ruleEOW() throws RecognitionException {
        EObject current = null;

        Token lv_dsl_Display_Eothinon_0_0=null;

         enterRule(); 
            
        try {
            // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:3714:28: ( ( (lv_dsl_Display_Eothinon_0_0= '@Eothinon' ) ) )
            // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:3715:1: ( (lv_dsl_Display_Eothinon_0_0= '@Eothinon' ) )
            {
            // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:3715:1: ( (lv_dsl_Display_Eothinon_0_0= '@Eothinon' ) )
            // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:3716:1: (lv_dsl_Display_Eothinon_0_0= '@Eothinon' )
            {
            // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:3716:1: (lv_dsl_Display_Eothinon_0_0= '@Eothinon' )
            // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:3717:3: lv_dsl_Display_Eothinon_0_0= '@Eothinon'
            {
            lv_dsl_Display_Eothinon_0_0=(Token)match(input,83,FOLLOW_83_in_ruleEOW9354); 

                    newLeafNode(lv_dsl_Display_Eothinon_0_0, grammarAccess.getEOWAccess().getDsl_Display_EothinonEothinonKeyword_0());
                

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getEOWRule());
            	        }
                   		setWithLastConsumed(current, "dsl_Display_Eothinon", true, "@Eothinon");
            	    

            }


            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleEOW"


    // $ANTLR start "entryRuleSAEC"
    // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:3738:1: entryRuleSAEC returns [EObject current=null] : iv_ruleSAEC= ruleSAEC EOF ;
    public final EObject entryRuleSAEC() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSAEC = null;


        try {
            // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:3739:2: (iv_ruleSAEC= ruleSAEC EOF )
            // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:3740:2: iv_ruleSAEC= ruleSAEC EOF
            {
             newCompositeNode(grammarAccess.getSAECRule()); 
            pushFollow(FOLLOW_ruleSAEC_in_entryRuleSAEC9402);
            iv_ruleSAEC=ruleSAEC();

            state._fsp--;

             current =iv_ruleSAEC; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleSAEC9412); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleSAEC"


    // $ANTLR start "ruleSAEC"
    // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:3747:1: ruleSAEC returns [EObject current=null] : ( (lv_dsl_Display_SundayAfterElevationCross_0_0= '@Sunday_After_Elevation_Cross_Date' ) ) ;
    public final EObject ruleSAEC() throws RecognitionException {
        EObject current = null;

        Token lv_dsl_Display_SundayAfterElevationCross_0_0=null;

         enterRule(); 
            
        try {
            // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:3750:28: ( ( (lv_dsl_Display_SundayAfterElevationCross_0_0= '@Sunday_After_Elevation_Cross_Date' ) ) )
            // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:3751:1: ( (lv_dsl_Display_SundayAfterElevationCross_0_0= '@Sunday_After_Elevation_Cross_Date' ) )
            {
            // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:3751:1: ( (lv_dsl_Display_SundayAfterElevationCross_0_0= '@Sunday_After_Elevation_Cross_Date' ) )
            // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:3752:1: (lv_dsl_Display_SundayAfterElevationCross_0_0= '@Sunday_After_Elevation_Cross_Date' )
            {
            // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:3752:1: (lv_dsl_Display_SundayAfterElevationCross_0_0= '@Sunday_After_Elevation_Cross_Date' )
            // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:3753:3: lv_dsl_Display_SundayAfterElevationCross_0_0= '@Sunday_After_Elevation_Cross_Date'
            {
            lv_dsl_Display_SundayAfterElevationCross_0_0=(Token)match(input,84,FOLLOW_84_in_ruleSAEC9454); 

                    newLeafNode(lv_dsl_Display_SundayAfterElevationCross_0_0, grammarAccess.getSAECAccess().getDsl_Display_SundayAfterElevationCrossSunday_After_Elevation_Cross_DateKeyword_0());
                

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getSAECRule());
            	        }
                   		setWithLastConsumed(current, "dsl_Display_SundayAfterElevationCross", true, "@Sunday_After_Elevation_Cross_Date");
            	    

            }


            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleSAEC"


    // $ANTLR start "entryRuleSOL"
    // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:3774:1: entryRuleSOL returns [EObject current=null] : iv_ruleSOL= ruleSOL EOF ;
    public final EObject entryRuleSOL() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSOL = null;


        try {
            // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:3775:2: (iv_ruleSOL= ruleSOL EOF )
            // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:3776:2: iv_ruleSOL= ruleSOL EOF
            {
             newCompositeNode(grammarAccess.getSOLRule()); 
            pushFollow(FOLLOW_ruleSOL_in_entryRuleSOL9502);
            iv_ruleSOL=ruleSOL();

            state._fsp--;

             current =iv_ruleSOL; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleSOL9512); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleSOL"


    // $ANTLR start "ruleSOL"
    // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:3783:1: ruleSOL returns [EObject current=null] : ( (lv_dsl_Display_StartLukan_0_0= '@Lukan_Cycle_Start_Date' ) ) ;
    public final EObject ruleSOL() throws RecognitionException {
        EObject current = null;

        Token lv_dsl_Display_StartLukan_0_0=null;

         enterRule(); 
            
        try {
            // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:3786:28: ( ( (lv_dsl_Display_StartLukan_0_0= '@Lukan_Cycle_Start_Date' ) ) )
            // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:3787:1: ( (lv_dsl_Display_StartLukan_0_0= '@Lukan_Cycle_Start_Date' ) )
            {
            // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:3787:1: ( (lv_dsl_Display_StartLukan_0_0= '@Lukan_Cycle_Start_Date' ) )
            // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:3788:1: (lv_dsl_Display_StartLukan_0_0= '@Lukan_Cycle_Start_Date' )
            {
            // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:3788:1: (lv_dsl_Display_StartLukan_0_0= '@Lukan_Cycle_Start_Date' )
            // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:3789:3: lv_dsl_Display_StartLukan_0_0= '@Lukan_Cycle_Start_Date'
            {
            lv_dsl_Display_StartLukan_0_0=(Token)match(input,85,FOLLOW_85_in_ruleSOL9554); 

                    newLeafNode(lv_dsl_Display_StartLukan_0_0, grammarAccess.getSOLAccess().getDsl_Display_StartLukanLukan_Cycle_Start_DateKeyword_0());
                

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getSOLRule());
            	        }
                   		setWithLastConsumed(current, "dsl_Display_StartLukan", true, "@Lukan_Cycle_Start_Date");
            	    

            }


            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleSOL"


    // $ANTLR start "entryRuleDOL"
    // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:3810:1: entryRuleDOL returns [EObject current=null] : iv_ruleDOL= ruleDOL EOF ;
    public final EObject entryRuleDOL() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDOL = null;


        try {
            // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:3811:2: (iv_ruleDOL= ruleDOL EOF )
            // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:3812:2: iv_ruleDOL= ruleDOL EOF
            {
             newCompositeNode(grammarAccess.getDOLRule()); 
            pushFollow(FOLLOW_ruleDOL_in_entryRuleDOL9602);
            iv_ruleDOL=ruleDOL();

            state._fsp--;

             current =iv_ruleDOL; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleDOL9612); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleDOL"


    // $ANTLR start "ruleDOL"
    // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:3819:1: ruleDOL returns [EObject current=null] : ( (lv_dsl_Display_DayLukan_0_0= '@Lukan_Cycle_Elapsed_Days' ) ) ;
    public final EObject ruleDOL() throws RecognitionException {
        EObject current = null;

        Token lv_dsl_Display_DayLukan_0_0=null;

         enterRule(); 
            
        try {
            // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:3822:28: ( ( (lv_dsl_Display_DayLukan_0_0= '@Lukan_Cycle_Elapsed_Days' ) ) )
            // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:3823:1: ( (lv_dsl_Display_DayLukan_0_0= '@Lukan_Cycle_Elapsed_Days' ) )
            {
            // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:3823:1: ( (lv_dsl_Display_DayLukan_0_0= '@Lukan_Cycle_Elapsed_Days' ) )
            // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:3824:1: (lv_dsl_Display_DayLukan_0_0= '@Lukan_Cycle_Elapsed_Days' )
            {
            // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:3824:1: (lv_dsl_Display_DayLukan_0_0= '@Lukan_Cycle_Elapsed_Days' )
            // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:3825:3: lv_dsl_Display_DayLukan_0_0= '@Lukan_Cycle_Elapsed_Days'
            {
            lv_dsl_Display_DayLukan_0_0=(Token)match(input,86,FOLLOW_86_in_ruleDOL9654); 

                    newLeafNode(lv_dsl_Display_DayLukan_0_0, grammarAccess.getDOLAccess().getDsl_Display_DayLukanLukan_Cycle_Elapsed_DaysKeyword_0());
                

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getDOLRule());
            	        }
                   		setWithLastConsumed(current, "dsl_Display_DayLukan", true, "@Lukan_Cycle_Elapsed_Days");
            	    

            }


            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleDOL"


    // $ANTLR start "entryRuleWOLC"
    // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:3846:1: entryRuleWOLC returns [EObject current=null] : iv_ruleWOLC= ruleWOLC EOF ;
    public final EObject entryRuleWOLC() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleWOLC = null;


        try {
            // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:3847:2: (iv_ruleWOLC= ruleWOLC EOF )
            // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:3848:2: iv_ruleWOLC= ruleWOLC EOF
            {
             newCompositeNode(grammarAccess.getWOLCRule()); 
            pushFollow(FOLLOW_ruleWOLC_in_entryRuleWOLC9702);
            iv_ruleWOLC=ruleWOLC();

            state._fsp--;

             current =iv_ruleWOLC; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleWOLC9712); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleWOLC"


    // $ANTLR start "ruleWOLC"
    // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:3855:1: ruleWOLC returns [EObject current=null] : ( (lv_dsl_Display_DayLukan_0_0= '@Lukan_Cycle_Week' ) ) ;
    public final EObject ruleWOLC() throws RecognitionException {
        EObject current = null;

        Token lv_dsl_Display_DayLukan_0_0=null;

         enterRule(); 
            
        try {
            // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:3858:28: ( ( (lv_dsl_Display_DayLukan_0_0= '@Lukan_Cycle_Week' ) ) )
            // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:3859:1: ( (lv_dsl_Display_DayLukan_0_0= '@Lukan_Cycle_Week' ) )
            {
            // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:3859:1: ( (lv_dsl_Display_DayLukan_0_0= '@Lukan_Cycle_Week' ) )
            // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:3860:1: (lv_dsl_Display_DayLukan_0_0= '@Lukan_Cycle_Week' )
            {
            // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:3860:1: (lv_dsl_Display_DayLukan_0_0= '@Lukan_Cycle_Week' )
            // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:3861:3: lv_dsl_Display_DayLukan_0_0= '@Lukan_Cycle_Week'
            {
            lv_dsl_Display_DayLukan_0_0=(Token)match(input,87,FOLLOW_87_in_ruleWOLC9754); 

                    newLeafNode(lv_dsl_Display_DayLukan_0_0, grammarAccess.getWOLCAccess().getDsl_Display_DayLukanLukan_Cycle_WeekKeyword_0());
                

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getWOLCRule());
            	        }
                   		setWithLastConsumed(current, "dsl_Display_DayLukan", true, "@Lukan_Cycle_Week");
            	    

            }


            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleWOLC"


    // $ANTLR start "entryRuleWDOLC"
    // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:3882:1: entryRuleWDOLC returns [EObject current=null] : iv_ruleWDOLC= ruleWDOLC EOF ;
    public final EObject entryRuleWDOLC() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleWDOLC = null;


        try {
            // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:3883:2: (iv_ruleWDOLC= ruleWDOLC EOF )
            // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:3884:2: iv_ruleWDOLC= ruleWDOLC EOF
            {
             newCompositeNode(grammarAccess.getWDOLCRule()); 
            pushFollow(FOLLOW_ruleWDOLC_in_entryRuleWDOLC9802);
            iv_ruleWDOLC=ruleWDOLC();

            state._fsp--;

             current =iv_ruleWDOLC; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleWDOLC9812); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleWDOLC"


    // $ANTLR start "ruleWDOLC"
    // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:3891:1: ruleWDOLC returns [EObject current=null] : ( (lv_dsl_Display_DayLukan_0_0= '@Lukan_Cycle_Week_Day' ) ) ;
    public final EObject ruleWDOLC() throws RecognitionException {
        EObject current = null;

        Token lv_dsl_Display_DayLukan_0_0=null;

         enterRule(); 
            
        try {
            // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:3894:28: ( ( (lv_dsl_Display_DayLukan_0_0= '@Lukan_Cycle_Week_Day' ) ) )
            // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:3895:1: ( (lv_dsl_Display_DayLukan_0_0= '@Lukan_Cycle_Week_Day' ) )
            {
            // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:3895:1: ( (lv_dsl_Display_DayLukan_0_0= '@Lukan_Cycle_Week_Day' ) )
            // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:3896:1: (lv_dsl_Display_DayLukan_0_0= '@Lukan_Cycle_Week_Day' )
            {
            // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:3896:1: (lv_dsl_Display_DayLukan_0_0= '@Lukan_Cycle_Week_Day' )
            // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:3897:3: lv_dsl_Display_DayLukan_0_0= '@Lukan_Cycle_Week_Day'
            {
            lv_dsl_Display_DayLukan_0_0=(Token)match(input,88,FOLLOW_88_in_ruleWDOLC9854); 

                    newLeafNode(lv_dsl_Display_DayLukan_0_0, grammarAccess.getWDOLCAccess().getDsl_Display_DayLukanLukan_Cycle_Week_DayKeyword_0());
                

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getWDOLCRule());
            	        }
                   		setWithLastConsumed(current, "dsl_Display_DayLukan", true, "@Lukan_Cycle_Week_Day");
            	    

            }


            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleWDOLC"


    // $ANTLR start "entryRuleSBT"
    // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:3918:1: entryRuleSBT returns [EObject current=null] : iv_ruleSBT= ruleSBT EOF ;
    public final EObject entryRuleSBT() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSBT = null;


        try {
            // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:3919:2: (iv_ruleSBT= ruleSBT EOF )
            // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:3920:2: iv_ruleSBT= ruleSBT EOF
            {
             newCompositeNode(grammarAccess.getSBTRule()); 
            pushFollow(FOLLOW_ruleSBT_in_entryRuleSBT9902);
            iv_ruleSBT=ruleSBT();

            state._fsp--;

             current =iv_ruleSBT; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleSBT9912); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleSBT"


    // $ANTLR start "ruleSBT"
    // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:3927:1: ruleSBT returns [EObject current=null] : ( (lv_dsl_Display_SundaysBeforeTriodion_0_0= '@Sundays_Before_Triodion' ) ) ;
    public final EObject ruleSBT() throws RecognitionException {
        EObject current = null;

        Token lv_dsl_Display_SundaysBeforeTriodion_0_0=null;

         enterRule(); 
            
        try {
            // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:3930:28: ( ( (lv_dsl_Display_SundaysBeforeTriodion_0_0= '@Sundays_Before_Triodion' ) ) )
            // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:3931:1: ( (lv_dsl_Display_SundaysBeforeTriodion_0_0= '@Sundays_Before_Triodion' ) )
            {
            // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:3931:1: ( (lv_dsl_Display_SundaysBeforeTriodion_0_0= '@Sundays_Before_Triodion' ) )
            // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:3932:1: (lv_dsl_Display_SundaysBeforeTriodion_0_0= '@Sundays_Before_Triodion' )
            {
            // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:3932:1: (lv_dsl_Display_SundaysBeforeTriodion_0_0= '@Sundays_Before_Triodion' )
            // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:3933:3: lv_dsl_Display_SundaysBeforeTriodion_0_0= '@Sundays_Before_Triodion'
            {
            lv_dsl_Display_SundaysBeforeTriodion_0_0=(Token)match(input,89,FOLLOW_89_in_ruleSBT9954); 

                    newLeafNode(lv_dsl_Display_SundaysBeforeTriodion_0_0, grammarAccess.getSBTAccess().getDsl_Display_SundaysBeforeTriodionSundays_Before_TriodionKeyword_0());
                

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getSBTRule());
            	        }
                   		setWithLastConsumed(current, "dsl_Display_SundaysBeforeTriodion", true, "@Sundays_Before_Triodion");
            	    

            }


            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleSBT"


    // $ANTLR start "entryRuleTemplateFragment"
    // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:3954:1: entryRuleTemplateFragment returns [EObject current=null] : iv_ruleTemplateFragment= ruleTemplateFragment EOF ;
    public final EObject entryRuleTemplateFragment() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTemplateFragment = null;


        try {
            // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:3955:2: (iv_ruleTemplateFragment= ruleTemplateFragment EOF )
            // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:3956:2: iv_ruleTemplateFragment= ruleTemplateFragment EOF
            {
             newCompositeNode(grammarAccess.getTemplateFragmentRule()); 
            pushFollow(FOLLOW_ruleTemplateFragment_in_entryRuleTemplateFragment10002);
            iv_ruleTemplateFragment=ruleTemplateFragment();

            state._fsp--;

             current =iv_ruleTemplateFragment; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleTemplateFragment10012); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleTemplateFragment"


    // $ANTLR start "ruleTemplateFragment"
    // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:3963:1: ruleTemplateFragment returns [EObject current=null] : (otherlv_0= 'Insert_template' ( ( ruleQualifiedName ) ) otherlv_2= 'End-Insert' ) ;
    public final EObject ruleTemplateFragment() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;

         enterRule(); 
            
        try {
            // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:3966:28: ( (otherlv_0= 'Insert_template' ( ( ruleQualifiedName ) ) otherlv_2= 'End-Insert' ) )
            // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:3967:1: (otherlv_0= 'Insert_template' ( ( ruleQualifiedName ) ) otherlv_2= 'End-Insert' )
            {
            // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:3967:1: (otherlv_0= 'Insert_template' ( ( ruleQualifiedName ) ) otherlv_2= 'End-Insert' )
            // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:3967:3: otherlv_0= 'Insert_template' ( ( ruleQualifiedName ) ) otherlv_2= 'End-Insert'
            {
            otherlv_0=(Token)match(input,90,FOLLOW_90_in_ruleTemplateFragment10049); 

                	newLeafNode(otherlv_0, grammarAccess.getTemplateFragmentAccess().getInsert_templateKeyword_0());
                
            // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:3971:1: ( ( ruleQualifiedName ) )
            // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:3972:1: ( ruleQualifiedName )
            {
            // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:3972:1: ( ruleQualifiedName )
            // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:3973:3: ruleQualifiedName
            {

            			if (current==null) {
            	            current = createModelElement(grammarAccess.getTemplateFragmentRule());
            	        }
                    
             
            	        newCompositeNode(grammarAccess.getTemplateFragmentAccess().getNameAtemModelCrossReference_1_0()); 
            	    
            pushFollow(FOLLOW_ruleQualifiedName_in_ruleTemplateFragment10072);
            ruleQualifiedName();

            state._fsp--;

             
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            otherlv_2=(Token)match(input,91,FOLLOW_91_in_ruleTemplateFragment10084); 

                	newLeafNode(otherlv_2, grammarAccess.getTemplateFragmentAccess().getEndInsertKeyword_2());
                

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleTemplateFragment"


    // $ANTLR start "entryRuleSectionFragment"
    // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:4000:1: entryRuleSectionFragment returns [EObject current=null] : iv_ruleSectionFragment= ruleSectionFragment EOF ;
    public final EObject entryRuleSectionFragment() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSectionFragment = null;


        try {
            // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:4001:2: (iv_ruleSectionFragment= ruleSectionFragment EOF )
            // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:4002:2: iv_ruleSectionFragment= ruleSectionFragment EOF
            {
             newCompositeNode(grammarAccess.getSectionFragmentRule()); 
            pushFollow(FOLLOW_ruleSectionFragment_in_entryRuleSectionFragment10122);
            iv_ruleSectionFragment=ruleSectionFragment();

            state._fsp--;

             current =iv_ruleSectionFragment; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleSectionFragment10132); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleSectionFragment"


    // $ANTLR start "ruleSectionFragment"
    // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:4009:1: ruleSectionFragment returns [EObject current=null] : (otherlv_0= 'Insert_section' ( ( ruleQualifiedName ) ) otherlv_2= 'End-Insert' ) ;
    public final EObject ruleSectionFragment() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;

         enterRule(); 
            
        try {
            // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:4012:28: ( (otherlv_0= 'Insert_section' ( ( ruleQualifiedName ) ) otherlv_2= 'End-Insert' ) )
            // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:4013:1: (otherlv_0= 'Insert_section' ( ( ruleQualifiedName ) ) otherlv_2= 'End-Insert' )
            {
            // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:4013:1: (otherlv_0= 'Insert_section' ( ( ruleQualifiedName ) ) otherlv_2= 'End-Insert' )
            // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:4013:3: otherlv_0= 'Insert_section' ( ( ruleQualifiedName ) ) otherlv_2= 'End-Insert'
            {
            otherlv_0=(Token)match(input,92,FOLLOW_92_in_ruleSectionFragment10169); 

                	newLeafNode(otherlv_0, grammarAccess.getSectionFragmentAccess().getInsert_sectionKeyword_0());
                
            // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:4017:1: ( ( ruleQualifiedName ) )
            // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:4018:1: ( ruleQualifiedName )
            {
            // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:4018:1: ( ruleQualifiedName )
            // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:4019:3: ruleQualifiedName
            {

            			if (current==null) {
            	            current = createModelElement(grammarAccess.getSectionFragmentRule());
            	        }
                    
             
            	        newCompositeNode(grammarAccess.getSectionFragmentAccess().getNameSectionCrossReference_1_0()); 
            	    
            pushFollow(FOLLOW_ruleQualifiedName_in_ruleSectionFragment10192);
            ruleQualifiedName();

            state._fsp--;

             
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            otherlv_2=(Token)match(input,91,FOLLOW_91_in_ruleSectionFragment10204); 

                	newLeafNode(otherlv_2, grammarAccess.getSectionFragmentAccess().getEndInsertKeyword_2());
                

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleSectionFragment"


    // $ANTLR start "entryRuleBreak"
    // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:4044:1: entryRuleBreak returns [EObject current=null] : iv_ruleBreak= ruleBreak EOF ;
    public final EObject entryRuleBreak() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleBreak = null;


        try {
            // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:4045:2: (iv_ruleBreak= ruleBreak EOF )
            // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:4046:2: iv_ruleBreak= ruleBreak EOF
            {
             newCompositeNode(grammarAccess.getBreakRule()); 
            pushFollow(FOLLOW_ruleBreak_in_entryRuleBreak10240);
            iv_ruleBreak=ruleBreak();

            state._fsp--;

             current =iv_ruleBreak; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleBreak10250); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleBreak"


    // $ANTLR start "ruleBreak"
    // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:4053:1: ruleBreak returns [EObject current=null] : (otherlv_0= 'Break' ( (lv_dsl_break_type_1_0= ruleBreakType ) ) otherlv_2= 'End_Break' ) ;
    public final EObject ruleBreak() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Enumerator lv_dsl_break_type_1_0 = null;


         enterRule(); 
            
        try {
            // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:4056:28: ( (otherlv_0= 'Break' ( (lv_dsl_break_type_1_0= ruleBreakType ) ) otherlv_2= 'End_Break' ) )
            // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:4057:1: (otherlv_0= 'Break' ( (lv_dsl_break_type_1_0= ruleBreakType ) ) otherlv_2= 'End_Break' )
            {
            // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:4057:1: (otherlv_0= 'Break' ( (lv_dsl_break_type_1_0= ruleBreakType ) ) otherlv_2= 'End_Break' )
            // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:4057:3: otherlv_0= 'Break' ( (lv_dsl_break_type_1_0= ruleBreakType ) ) otherlv_2= 'End_Break'
            {
            otherlv_0=(Token)match(input,93,FOLLOW_93_in_ruleBreak10287); 

                	newLeafNode(otherlv_0, grammarAccess.getBreakAccess().getBreakKeyword_0());
                
            // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:4061:1: ( (lv_dsl_break_type_1_0= ruleBreakType ) )
            // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:4062:1: (lv_dsl_break_type_1_0= ruleBreakType )
            {
            // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:4062:1: (lv_dsl_break_type_1_0= ruleBreakType )
            // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:4063:3: lv_dsl_break_type_1_0= ruleBreakType
            {
             
            	        newCompositeNode(grammarAccess.getBreakAccess().getDsl_break_typeBreakTypeEnumRuleCall_1_0()); 
            	    
            pushFollow(FOLLOW_ruleBreakType_in_ruleBreak10308);
            lv_dsl_break_type_1_0=ruleBreakType();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getBreakRule());
            	        }
                   		set(
                   			current, 
                   			"dsl_break_type",
                    		lv_dsl_break_type_1_0, 
                    		"BreakType");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            otherlv_2=(Token)match(input,94,FOLLOW_94_in_ruleBreak10320); 

                	newLeafNode(otherlv_2, grammarAccess.getBreakAccess().getEnd_BreakKeyword_2());
                

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleBreak"


    // $ANTLR start "entryRulePageNumber"
    // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:4091:1: entryRulePageNumber returns [EObject current=null] : iv_rulePageNumber= rulePageNumber EOF ;
    public final EObject entryRulePageNumber() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePageNumber = null;


        try {
            // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:4092:2: (iv_rulePageNumber= rulePageNumber EOF )
            // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:4093:2: iv_rulePageNumber= rulePageNumber EOF
            {
             newCompositeNode(grammarAccess.getPageNumberRule()); 
            pushFollow(FOLLOW_rulePageNumber_in_entryRulePageNumber10356);
            iv_rulePageNumber=rulePageNumber();

            state._fsp--;

             current =iv_rulePageNumber; 
            match(input,EOF,FOLLOW_EOF_in_entryRulePageNumber10366); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRulePageNumber"


    // $ANTLR start "rulePageNumber"
    // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:4100:1: rulePageNumber returns [EObject current=null] : (otherlv_0= 'Set_Page_Number' ( (lv_dsl_PageNumber_value_1_0= RULE_INT ) ) otherlv_2= 'End_Set_Page_Number' ) ;
    public final EObject rulePageNumber() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_dsl_PageNumber_value_1_0=null;
        Token otherlv_2=null;

         enterRule(); 
            
        try {
            // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:4103:28: ( (otherlv_0= 'Set_Page_Number' ( (lv_dsl_PageNumber_value_1_0= RULE_INT ) ) otherlv_2= 'End_Set_Page_Number' ) )
            // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:4104:1: (otherlv_0= 'Set_Page_Number' ( (lv_dsl_PageNumber_value_1_0= RULE_INT ) ) otherlv_2= 'End_Set_Page_Number' )
            {
            // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:4104:1: (otherlv_0= 'Set_Page_Number' ( (lv_dsl_PageNumber_value_1_0= RULE_INT ) ) otherlv_2= 'End_Set_Page_Number' )
            // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:4104:3: otherlv_0= 'Set_Page_Number' ( (lv_dsl_PageNumber_value_1_0= RULE_INT ) ) otherlv_2= 'End_Set_Page_Number'
            {
            otherlv_0=(Token)match(input,95,FOLLOW_95_in_rulePageNumber10403); 

                	newLeafNode(otherlv_0, grammarAccess.getPageNumberAccess().getSet_Page_NumberKeyword_0());
                
            // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:4108:1: ( (lv_dsl_PageNumber_value_1_0= RULE_INT ) )
            // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:4109:1: (lv_dsl_PageNumber_value_1_0= RULE_INT )
            {
            // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:4109:1: (lv_dsl_PageNumber_value_1_0= RULE_INT )
            // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:4110:3: lv_dsl_PageNumber_value_1_0= RULE_INT
            {
            lv_dsl_PageNumber_value_1_0=(Token)match(input,RULE_INT,FOLLOW_RULE_INT_in_rulePageNumber10420); 

            			newLeafNode(lv_dsl_PageNumber_value_1_0, grammarAccess.getPageNumberAccess().getDsl_PageNumber_valueINTTerminalRuleCall_1_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getPageNumberRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"dsl_PageNumber_value",
                    		lv_dsl_PageNumber_value_1_0, 
                    		"INT");
            	    

            }


            }

            otherlv_2=(Token)match(input,96,FOLLOW_96_in_rulePageNumber10437); 

                	newLeafNode(otherlv_2, grammarAccess.getPageNumberAccess().getEnd_Set_Page_NumberKeyword_2());
                

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "rulePageNumber"


    // $ANTLR start "entryRulePassThroughHtml"
    // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:4138:1: entryRulePassThroughHtml returns [EObject current=null] : iv_rulePassThroughHtml= rulePassThroughHtml EOF ;
    public final EObject entryRulePassThroughHtml() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePassThroughHtml = null;


        try {
            // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:4139:2: (iv_rulePassThroughHtml= rulePassThroughHtml EOF )
            // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:4140:2: iv_rulePassThroughHtml= rulePassThroughHtml EOF
            {
             newCompositeNode(grammarAccess.getPassThroughHtmlRule()); 
            pushFollow(FOLLOW_rulePassThroughHtml_in_entryRulePassThroughHtml10473);
            iv_rulePassThroughHtml=rulePassThroughHtml();

            state._fsp--;

             current =iv_rulePassThroughHtml; 
            match(input,EOF,FOLLOW_EOF_in_entryRulePassThroughHtml10483); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRulePassThroughHtml"


    // $ANTLR start "rulePassThroughHtml"
    // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:4147:1: rulePassThroughHtml returns [EObject current=null] : (otherlv_0= 'Passthrough-Html' ( (lv_dsl_Passthrough_html_text_1_0= RULE_STRING ) ) otherlv_2= 'END-Passthrough-Html' ) ;
    public final EObject rulePassThroughHtml() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_dsl_Passthrough_html_text_1_0=null;
        Token otherlv_2=null;

         enterRule(); 
            
        try {
            // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:4150:28: ( (otherlv_0= 'Passthrough-Html' ( (lv_dsl_Passthrough_html_text_1_0= RULE_STRING ) ) otherlv_2= 'END-Passthrough-Html' ) )
            // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:4151:1: (otherlv_0= 'Passthrough-Html' ( (lv_dsl_Passthrough_html_text_1_0= RULE_STRING ) ) otherlv_2= 'END-Passthrough-Html' )
            {
            // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:4151:1: (otherlv_0= 'Passthrough-Html' ( (lv_dsl_Passthrough_html_text_1_0= RULE_STRING ) ) otherlv_2= 'END-Passthrough-Html' )
            // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:4151:3: otherlv_0= 'Passthrough-Html' ( (lv_dsl_Passthrough_html_text_1_0= RULE_STRING ) ) otherlv_2= 'END-Passthrough-Html'
            {
            otherlv_0=(Token)match(input,97,FOLLOW_97_in_rulePassThroughHtml10520); 

                	newLeafNode(otherlv_0, grammarAccess.getPassThroughHtmlAccess().getPassthroughHtmlKeyword_0());
                
            // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:4155:1: ( (lv_dsl_Passthrough_html_text_1_0= RULE_STRING ) )
            // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:4156:1: (lv_dsl_Passthrough_html_text_1_0= RULE_STRING )
            {
            // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:4156:1: (lv_dsl_Passthrough_html_text_1_0= RULE_STRING )
            // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:4157:3: lv_dsl_Passthrough_html_text_1_0= RULE_STRING
            {
            lv_dsl_Passthrough_html_text_1_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rulePassThroughHtml10537); 

            			newLeafNode(lv_dsl_Passthrough_html_text_1_0, grammarAccess.getPassThroughHtmlAccess().getDsl_Passthrough_html_textSTRINGTerminalRuleCall_1_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getPassThroughHtmlRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"dsl_Passthrough_html_text",
                    		lv_dsl_Passthrough_html_text_1_0, 
                    		"STRING");
            	    

            }


            }

            otherlv_2=(Token)match(input,98,FOLLOW_98_in_rulePassThroughHtml10554); 

                	newLeafNode(otherlv_2, grammarAccess.getPassThroughHtmlAccess().getENDPassthroughHtmlKeyword_2());
                

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "rulePassThroughHtml"


    // $ANTLR start "entryRulePassThroughPdf"
    // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:4185:1: entryRulePassThroughPdf returns [EObject current=null] : iv_rulePassThroughPdf= rulePassThroughPdf EOF ;
    public final EObject entryRulePassThroughPdf() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePassThroughPdf = null;


        try {
            // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:4186:2: (iv_rulePassThroughPdf= rulePassThroughPdf EOF )
            // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:4187:2: iv_rulePassThroughPdf= rulePassThroughPdf EOF
            {
             newCompositeNode(grammarAccess.getPassThroughPdfRule()); 
            pushFollow(FOLLOW_rulePassThroughPdf_in_entryRulePassThroughPdf10590);
            iv_rulePassThroughPdf=rulePassThroughPdf();

            state._fsp--;

             current =iv_rulePassThroughPdf; 
            match(input,EOF,FOLLOW_EOF_in_entryRulePassThroughPdf10600); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRulePassThroughPdf"


    // $ANTLR start "rulePassThroughPdf"
    // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:4194:1: rulePassThroughPdf returns [EObject current=null] : (otherlv_0= 'Passthrough-Html' ( (lv_dsl_Passthrough_pdf_text_1_0= RULE_STRING ) ) otherlv_2= 'END-Passthrough-Pdf' ) ;
    public final EObject rulePassThroughPdf() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_dsl_Passthrough_pdf_text_1_0=null;
        Token otherlv_2=null;

         enterRule(); 
            
        try {
            // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:4197:28: ( (otherlv_0= 'Passthrough-Html' ( (lv_dsl_Passthrough_pdf_text_1_0= RULE_STRING ) ) otherlv_2= 'END-Passthrough-Pdf' ) )
            // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:4198:1: (otherlv_0= 'Passthrough-Html' ( (lv_dsl_Passthrough_pdf_text_1_0= RULE_STRING ) ) otherlv_2= 'END-Passthrough-Pdf' )
            {
            // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:4198:1: (otherlv_0= 'Passthrough-Html' ( (lv_dsl_Passthrough_pdf_text_1_0= RULE_STRING ) ) otherlv_2= 'END-Passthrough-Pdf' )
            // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:4198:3: otherlv_0= 'Passthrough-Html' ( (lv_dsl_Passthrough_pdf_text_1_0= RULE_STRING ) ) otherlv_2= 'END-Passthrough-Pdf'
            {
            otherlv_0=(Token)match(input,97,FOLLOW_97_in_rulePassThroughPdf10637); 

                	newLeafNode(otherlv_0, grammarAccess.getPassThroughPdfAccess().getPassthroughHtmlKeyword_0());
                
            // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:4202:1: ( (lv_dsl_Passthrough_pdf_text_1_0= RULE_STRING ) )
            // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:4203:1: (lv_dsl_Passthrough_pdf_text_1_0= RULE_STRING )
            {
            // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:4203:1: (lv_dsl_Passthrough_pdf_text_1_0= RULE_STRING )
            // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:4204:3: lv_dsl_Passthrough_pdf_text_1_0= RULE_STRING
            {
            lv_dsl_Passthrough_pdf_text_1_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rulePassThroughPdf10654); 

            			newLeafNode(lv_dsl_Passthrough_pdf_text_1_0, grammarAccess.getPassThroughPdfAccess().getDsl_Passthrough_pdf_textSTRINGTerminalRuleCall_1_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getPassThroughPdfRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"dsl_Passthrough_pdf_text",
                    		lv_dsl_Passthrough_pdf_text_1_0, 
                    		"STRING");
            	    

            }


            }

            otherlv_2=(Token)match(input,99,FOLLOW_99_in_rulePassThroughPdf10671); 

                	newLeafNode(otherlv_2, grammarAccess.getPassThroughPdfAccess().getENDPassthroughPdfKeyword_2());
                

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "rulePassThroughPdf"


    // $ANTLR start "entryRuleTitle"
    // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:4232:1: entryRuleTitle returns [EObject current=null] : iv_ruleTitle= ruleTitle EOF ;
    public final EObject entryRuleTitle() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTitle = null;


        try {
            // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:4233:2: (iv_ruleTitle= ruleTitle EOF )
            // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:4234:2: iv_ruleTitle= ruleTitle EOF
            {
             newCompositeNode(grammarAccess.getTitleRule()); 
            pushFollow(FOLLOW_ruleTitle_in_entryRuleTitle10707);
            iv_ruleTitle=ruleTitle();

            state._fsp--;

             current =iv_ruleTitle; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleTitle10717); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleTitle"


    // $ANTLR start "ruleTitle"
    // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:4241:1: ruleTitle returns [EObject current=null] : (otherlv_0= 'Title' (otherlv_1= 'role' ( ( ruleQualifiedName ) ) )? ( (lv_dsl_Elements_3_0= ruleElementType ) )* otherlv_4= 'End-Title' ) ;
    public final EObject ruleTitle() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_4=null;
        EObject lv_dsl_Elements_3_0 = null;


         enterRule(); 
            
        try {
            // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:4244:28: ( (otherlv_0= 'Title' (otherlv_1= 'role' ( ( ruleQualifiedName ) ) )? ( (lv_dsl_Elements_3_0= ruleElementType ) )* otherlv_4= 'End-Title' ) )
            // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:4245:1: (otherlv_0= 'Title' (otherlv_1= 'role' ( ( ruleQualifiedName ) ) )? ( (lv_dsl_Elements_3_0= ruleElementType ) )* otherlv_4= 'End-Title' )
            {
            // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:4245:1: (otherlv_0= 'Title' (otherlv_1= 'role' ( ( ruleQualifiedName ) ) )? ( (lv_dsl_Elements_3_0= ruleElementType ) )* otherlv_4= 'End-Title' )
            // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:4245:3: otherlv_0= 'Title' (otherlv_1= 'role' ( ( ruleQualifiedName ) ) )? ( (lv_dsl_Elements_3_0= ruleElementType ) )* otherlv_4= 'End-Title'
            {
            otherlv_0=(Token)match(input,100,FOLLOW_100_in_ruleTitle10754); 

                	newLeafNode(otherlv_0, grammarAccess.getTitleAccess().getTitleKeyword_0());
                
            // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:4249:1: (otherlv_1= 'role' ( ( ruleQualifiedName ) ) )?
            int alt43=2;
            int LA43_0 = input.LA(1);

            if ( (LA43_0==71) ) {
                alt43=1;
            }
            switch (alt43) {
                case 1 :
                    // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:4249:3: otherlv_1= 'role' ( ( ruleQualifiedName ) )
                    {
                    otherlv_1=(Token)match(input,71,FOLLOW_71_in_ruleTitle10767); 

                        	newLeafNode(otherlv_1, grammarAccess.getTitleAccess().getRoleKeyword_1_0());
                        
                    // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:4253:1: ( ( ruleQualifiedName ) )
                    // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:4254:1: ( ruleQualifiedName )
                    {
                    // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:4254:1: ( ruleQualifiedName )
                    // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:4255:3: ruleQualifiedName
                    {

                    			if (current==null) {
                    	            current = createModelElement(grammarAccess.getTitleRule());
                    	        }
                            
                     
                    	        newCompositeNode(grammarAccess.getTitleAccess().getDsl_Title_RoleDefinitionCrossReference_1_1_0()); 
                    	    
                    pushFollow(FOLLOW_ruleQualifiedName_in_ruleTitle10790);
                    ruleQualifiedName();

                    state._fsp--;

                     
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }


                    }
                    break;

            }

            // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:4268:4: ( (lv_dsl_Elements_3_0= ruleElementType ) )*
            loop44:
            do {
                int alt44=2;
                int LA44_0 = input.LA(1);

                if ( (LA44_0==49||LA44_0==52||(LA44_0>=55 && LA44_0<=56)) ) {
                    alt44=1;
                }


                switch (alt44) {
            	case 1 :
            	    // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:4269:1: (lv_dsl_Elements_3_0= ruleElementType )
            	    {
            	    // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:4269:1: (lv_dsl_Elements_3_0= ruleElementType )
            	    // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:4270:3: lv_dsl_Elements_3_0= ruleElementType
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getTitleAccess().getDsl_ElementsElementTypeParserRuleCall_2_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleElementType_in_ruleTitle10813);
            	    lv_dsl_Elements_3_0=ruleElementType();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getTitleRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"dsl_Elements",
            	            		lv_dsl_Elements_3_0, 
            	            		"ElementType");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }
            	    break;

            	default :
            	    break loop44;
                }
            } while (true);

            otherlv_4=(Token)match(input,101,FOLLOW_101_in_ruleTitle10826); 

                	newLeafNode(otherlv_4, grammarAccess.getTitleAccess().getEndTitleKeyword_3());
                

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleTitle"


    // $ANTLR start "entryRuleSubTitle"
    // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:4298:1: entryRuleSubTitle returns [EObject current=null] : iv_ruleSubTitle= ruleSubTitle EOF ;
    public final EObject entryRuleSubTitle() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSubTitle = null;


        try {
            // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:4299:2: (iv_ruleSubTitle= ruleSubTitle EOF )
            // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:4300:2: iv_ruleSubTitle= ruleSubTitle EOF
            {
             newCompositeNode(grammarAccess.getSubTitleRule()); 
            pushFollow(FOLLOW_ruleSubTitle_in_entryRuleSubTitle10862);
            iv_ruleSubTitle=ruleSubTitle();

            state._fsp--;

             current =iv_ruleSubTitle; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleSubTitle10872); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleSubTitle"


    // $ANTLR start "ruleSubTitle"
    // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:4307:1: ruleSubTitle returns [EObject current=null] : (otherlv_0= 'Sub-Title' (otherlv_1= 'role' ( ( ruleQualifiedName ) ) )? ( (lv_dsl_Elements_3_0= ruleElementType ) )* otherlv_4= 'End-Sub-Title' ) ;
    public final EObject ruleSubTitle() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_4=null;
        EObject lv_dsl_Elements_3_0 = null;


         enterRule(); 
            
        try {
            // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:4310:28: ( (otherlv_0= 'Sub-Title' (otherlv_1= 'role' ( ( ruleQualifiedName ) ) )? ( (lv_dsl_Elements_3_0= ruleElementType ) )* otherlv_4= 'End-Sub-Title' ) )
            // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:4311:1: (otherlv_0= 'Sub-Title' (otherlv_1= 'role' ( ( ruleQualifiedName ) ) )? ( (lv_dsl_Elements_3_0= ruleElementType ) )* otherlv_4= 'End-Sub-Title' )
            {
            // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:4311:1: (otherlv_0= 'Sub-Title' (otherlv_1= 'role' ( ( ruleQualifiedName ) ) )? ( (lv_dsl_Elements_3_0= ruleElementType ) )* otherlv_4= 'End-Sub-Title' )
            // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:4311:3: otherlv_0= 'Sub-Title' (otherlv_1= 'role' ( ( ruleQualifiedName ) ) )? ( (lv_dsl_Elements_3_0= ruleElementType ) )* otherlv_4= 'End-Sub-Title'
            {
            otherlv_0=(Token)match(input,102,FOLLOW_102_in_ruleSubTitle10909); 

                	newLeafNode(otherlv_0, grammarAccess.getSubTitleAccess().getSubTitleKeyword_0());
                
            // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:4315:1: (otherlv_1= 'role' ( ( ruleQualifiedName ) ) )?
            int alt45=2;
            int LA45_0 = input.LA(1);

            if ( (LA45_0==71) ) {
                alt45=1;
            }
            switch (alt45) {
                case 1 :
                    // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:4315:3: otherlv_1= 'role' ( ( ruleQualifiedName ) )
                    {
                    otherlv_1=(Token)match(input,71,FOLLOW_71_in_ruleSubTitle10922); 

                        	newLeafNode(otherlv_1, grammarAccess.getSubTitleAccess().getRoleKeyword_1_0());
                        
                    // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:4319:1: ( ( ruleQualifiedName ) )
                    // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:4320:1: ( ruleQualifiedName )
                    {
                    // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:4320:1: ( ruleQualifiedName )
                    // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:4321:3: ruleQualifiedName
                    {

                    			if (current==null) {
                    	            current = createModelElement(grammarAccess.getSubTitleRule());
                    	        }
                            
                     
                    	        newCompositeNode(grammarAccess.getSubTitleAccess().getDsl_SubTitle_RoleDefinitionCrossReference_1_1_0()); 
                    	    
                    pushFollow(FOLLOW_ruleQualifiedName_in_ruleSubTitle10945);
                    ruleQualifiedName();

                    state._fsp--;

                     
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }


                    }
                    break;

            }

            // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:4334:4: ( (lv_dsl_Elements_3_0= ruleElementType ) )*
            loop46:
            do {
                int alt46=2;
                int LA46_0 = input.LA(1);

                if ( (LA46_0==49||LA46_0==52||(LA46_0>=55 && LA46_0<=56)) ) {
                    alt46=1;
                }


                switch (alt46) {
            	case 1 :
            	    // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:4335:1: (lv_dsl_Elements_3_0= ruleElementType )
            	    {
            	    // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:4335:1: (lv_dsl_Elements_3_0= ruleElementType )
            	    // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:4336:3: lv_dsl_Elements_3_0= ruleElementType
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getSubTitleAccess().getDsl_ElementsElementTypeParserRuleCall_2_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleElementType_in_ruleSubTitle10968);
            	    lv_dsl_Elements_3_0=ruleElementType();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getSubTitleRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"dsl_Elements",
            	            		lv_dsl_Elements_3_0, 
            	            		"ElementType");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }
            	    break;

            	default :
            	    break loop46;
                }
            } while (true);

            otherlv_4=(Token)match(input,103,FOLLOW_103_in_ruleSubTitle10981); 

                	newLeafNode(otherlv_4, grammarAccess.getSubTitleAccess().getEndSubTitleKeyword_3());
                

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleSubTitle"


    // $ANTLR start "entryRuleParagraph"
    // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:4364:1: entryRuleParagraph returns [EObject current=null] : iv_ruleParagraph= ruleParagraph EOF ;
    public final EObject entryRuleParagraph() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleParagraph = null;


        try {
            // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:4365:2: (iv_ruleParagraph= ruleParagraph EOF )
            // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:4366:2: iv_ruleParagraph= ruleParagraph EOF
            {
             newCompositeNode(grammarAccess.getParagraphRule()); 
            pushFollow(FOLLOW_ruleParagraph_in_entryRuleParagraph11017);
            iv_ruleParagraph=ruleParagraph();

            state._fsp--;

             current =iv_ruleParagraph; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleParagraph11027); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleParagraph"


    // $ANTLR start "ruleParagraph"
    // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:4373:1: ruleParagraph returns [EObject current=null] : (otherlv_0= 'Para' (otherlv_1= 'role' ( ( ruleQualifiedName ) ) )? ( (lv_dsl_Elements_3_0= ruleElementType ) )* otherlv_4= 'End-Para' ) ;
    public final EObject ruleParagraph() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_4=null;
        EObject lv_dsl_Elements_3_0 = null;


         enterRule(); 
            
        try {
            // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:4376:28: ( (otherlv_0= 'Para' (otherlv_1= 'role' ( ( ruleQualifiedName ) ) )? ( (lv_dsl_Elements_3_0= ruleElementType ) )* otherlv_4= 'End-Para' ) )
            // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:4377:1: (otherlv_0= 'Para' (otherlv_1= 'role' ( ( ruleQualifiedName ) ) )? ( (lv_dsl_Elements_3_0= ruleElementType ) )* otherlv_4= 'End-Para' )
            {
            // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:4377:1: (otherlv_0= 'Para' (otherlv_1= 'role' ( ( ruleQualifiedName ) ) )? ( (lv_dsl_Elements_3_0= ruleElementType ) )* otherlv_4= 'End-Para' )
            // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:4377:3: otherlv_0= 'Para' (otherlv_1= 'role' ( ( ruleQualifiedName ) ) )? ( (lv_dsl_Elements_3_0= ruleElementType ) )* otherlv_4= 'End-Para'
            {
            otherlv_0=(Token)match(input,104,FOLLOW_104_in_ruleParagraph11064); 

                	newLeafNode(otherlv_0, grammarAccess.getParagraphAccess().getParaKeyword_0());
                
            // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:4381:1: (otherlv_1= 'role' ( ( ruleQualifiedName ) ) )?
            int alt47=2;
            int LA47_0 = input.LA(1);

            if ( (LA47_0==71) ) {
                alt47=1;
            }
            switch (alt47) {
                case 1 :
                    // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:4381:3: otherlv_1= 'role' ( ( ruleQualifiedName ) )
                    {
                    otherlv_1=(Token)match(input,71,FOLLOW_71_in_ruleParagraph11077); 

                        	newLeafNode(otherlv_1, grammarAccess.getParagraphAccess().getRoleKeyword_1_0());
                        
                    // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:4385:1: ( ( ruleQualifiedName ) )
                    // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:4386:1: ( ruleQualifiedName )
                    {
                    // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:4386:1: ( ruleQualifiedName )
                    // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:4387:3: ruleQualifiedName
                    {

                    			if (current==null) {
                    	            current = createModelElement(grammarAccess.getParagraphRule());
                    	        }
                            
                     
                    	        newCompositeNode(grammarAccess.getParagraphAccess().getDsl_Para_RoleDefinitionCrossReference_1_1_0()); 
                    	    
                    pushFollow(FOLLOW_ruleQualifiedName_in_ruleParagraph11100);
                    ruleQualifiedName();

                    state._fsp--;

                     
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }


                    }
                    break;

            }

            // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:4400:4: ( (lv_dsl_Elements_3_0= ruleElementType ) )*
            loop48:
            do {
                int alt48=2;
                int LA48_0 = input.LA(1);

                if ( (LA48_0==49||LA48_0==52||(LA48_0>=55 && LA48_0<=56)) ) {
                    alt48=1;
                }


                switch (alt48) {
            	case 1 :
            	    // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:4401:1: (lv_dsl_Elements_3_0= ruleElementType )
            	    {
            	    // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:4401:1: (lv_dsl_Elements_3_0= ruleElementType )
            	    // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:4402:3: lv_dsl_Elements_3_0= ruleElementType
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getParagraphAccess().getDsl_ElementsElementTypeParserRuleCall_2_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleElementType_in_ruleParagraph11123);
            	    lv_dsl_Elements_3_0=ruleElementType();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getParagraphRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"dsl_Elements",
            	            		lv_dsl_Elements_3_0, 
            	            		"ElementType");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }
            	    break;

            	default :
            	    break loop48;
                }
            } while (true);

            otherlv_4=(Token)match(input,105,FOLLOW_105_in_ruleParagraph11136); 

                	newLeafNode(otherlv_4, grammarAccess.getParagraphAccess().getEndParaKeyword_3());
                

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleParagraph"


    // $ANTLR start "entryRuleBlock"
    // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:4430:1: entryRuleBlock returns [EObject current=null] : iv_ruleBlock= ruleBlock EOF ;
    public final EObject entryRuleBlock() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleBlock = null;


        try {
            // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:4431:2: (iv_ruleBlock= ruleBlock EOF )
            // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:4432:2: iv_ruleBlock= ruleBlock EOF
            {
             newCompositeNode(grammarAccess.getBlockRule()); 
            pushFollow(FOLLOW_ruleBlock_in_entryRuleBlock11172);
            iv_ruleBlock=ruleBlock();

            state._fsp--;

             current =iv_ruleBlock; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleBlock11182); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleBlock"


    // $ANTLR start "ruleBlock"
    // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:4439:1: ruleBlock returns [EObject current=null] : (otherlv_0= 'bTag' ( ( ruleQualifiedName ) ) ( (lv_dsl_Elements_2_0= ruleElementType ) )* otherlv_3= 'End-bTag' ) ;
    public final EObject ruleBlock() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_3=null;
        EObject lv_dsl_Elements_2_0 = null;


         enterRule(); 
            
        try {
            // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:4442:28: ( (otherlv_0= 'bTag' ( ( ruleQualifiedName ) ) ( (lv_dsl_Elements_2_0= ruleElementType ) )* otherlv_3= 'End-bTag' ) )
            // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:4443:1: (otherlv_0= 'bTag' ( ( ruleQualifiedName ) ) ( (lv_dsl_Elements_2_0= ruleElementType ) )* otherlv_3= 'End-bTag' )
            {
            // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:4443:1: (otherlv_0= 'bTag' ( ( ruleQualifiedName ) ) ( (lv_dsl_Elements_2_0= ruleElementType ) )* otherlv_3= 'End-bTag' )
            // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:4443:3: otherlv_0= 'bTag' ( ( ruleQualifiedName ) ) ( (lv_dsl_Elements_2_0= ruleElementType ) )* otherlv_3= 'End-bTag'
            {
            otherlv_0=(Token)match(input,106,FOLLOW_106_in_ruleBlock11219); 

                	newLeafNode(otherlv_0, grammarAccess.getBlockAccess().getBTagKeyword_0());
                
            // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:4447:1: ( ( ruleQualifiedName ) )
            // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:4448:1: ( ruleQualifiedName )
            {
            // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:4448:1: ( ruleQualifiedName )
            // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:4449:3: ruleQualifiedName
            {

            			if (current==null) {
            	            current = createModelElement(grammarAccess.getBlockRule());
            	        }
                    
             
            	        newCompositeNode(grammarAccess.getBlockAccess().getDsl_Block_RoleDefinitionCrossReference_1_0()); 
            	    
            pushFollow(FOLLOW_ruleQualifiedName_in_ruleBlock11242);
            ruleQualifiedName();

            state._fsp--;

             
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:4462:2: ( (lv_dsl_Elements_2_0= ruleElementType ) )*
            loop49:
            do {
                int alt49=2;
                int LA49_0 = input.LA(1);

                if ( (LA49_0==49||LA49_0==52||(LA49_0>=55 && LA49_0<=56)) ) {
                    alt49=1;
                }


                switch (alt49) {
            	case 1 :
            	    // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:4463:1: (lv_dsl_Elements_2_0= ruleElementType )
            	    {
            	    // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:4463:1: (lv_dsl_Elements_2_0= ruleElementType )
            	    // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:4464:3: lv_dsl_Elements_2_0= ruleElementType
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getBlockAccess().getDsl_ElementsElementTypeParserRuleCall_2_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleElementType_in_ruleBlock11263);
            	    lv_dsl_Elements_2_0=ruleElementType();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getBlockRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"dsl_Elements",
            	            		lv_dsl_Elements_2_0, 
            	            		"ElementType");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }
            	    break;

            	default :
            	    break loop49;
                }
            } while (true);

            otherlv_3=(Token)match(input,107,FOLLOW_107_in_ruleBlock11276); 

                	newLeafNode(otherlv_3, grammarAccess.getBlockAccess().getEndBTagKeyword_3());
                

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleBlock"


    // $ANTLR start "entryRuleHymn"
    // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:4492:1: entryRuleHymn returns [EObject current=null] : iv_ruleHymn= ruleHymn EOF ;
    public final EObject entryRuleHymn() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleHymn = null;


        try {
            // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:4493:2: (iv_ruleHymn= ruleHymn EOF )
            // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:4494:2: iv_ruleHymn= ruleHymn EOF
            {
             newCompositeNode(grammarAccess.getHymnRule()); 
            pushFollow(FOLLOW_ruleHymn_in_entryRuleHymn11312);
            iv_ruleHymn=ruleHymn();

            state._fsp--;

             current =iv_ruleHymn; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleHymn11322); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleHymn"


    // $ANTLR start "ruleHymn"
    // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:4501:1: ruleHymn returns [EObject current=null] : (otherlv_0= 'Hymn' ( (lv_dsl_Elements_1_0= ruleElementType ) )* otherlv_2= 'End-Hymn' ) ;
    public final EObject ruleHymn() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        EObject lv_dsl_Elements_1_0 = null;


         enterRule(); 
            
        try {
            // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:4504:28: ( (otherlv_0= 'Hymn' ( (lv_dsl_Elements_1_0= ruleElementType ) )* otherlv_2= 'End-Hymn' ) )
            // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:4505:1: (otherlv_0= 'Hymn' ( (lv_dsl_Elements_1_0= ruleElementType ) )* otherlv_2= 'End-Hymn' )
            {
            // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:4505:1: (otherlv_0= 'Hymn' ( (lv_dsl_Elements_1_0= ruleElementType ) )* otherlv_2= 'End-Hymn' )
            // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:4505:3: otherlv_0= 'Hymn' ( (lv_dsl_Elements_1_0= ruleElementType ) )* otherlv_2= 'End-Hymn'
            {
            otherlv_0=(Token)match(input,108,FOLLOW_108_in_ruleHymn11359); 

                	newLeafNode(otherlv_0, grammarAccess.getHymnAccess().getHymnKeyword_0());
                
            // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:4509:1: ( (lv_dsl_Elements_1_0= ruleElementType ) )*
            loop50:
            do {
                int alt50=2;
                int LA50_0 = input.LA(1);

                if ( (LA50_0==49||LA50_0==52||(LA50_0>=55 && LA50_0<=56)) ) {
                    alt50=1;
                }


                switch (alt50) {
            	case 1 :
            	    // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:4510:1: (lv_dsl_Elements_1_0= ruleElementType )
            	    {
            	    // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:4510:1: (lv_dsl_Elements_1_0= ruleElementType )
            	    // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:4511:3: lv_dsl_Elements_1_0= ruleElementType
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getHymnAccess().getDsl_ElementsElementTypeParserRuleCall_1_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleElementType_in_ruleHymn11380);
            	    lv_dsl_Elements_1_0=ruleElementType();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getHymnRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"dsl_Elements",
            	            		lv_dsl_Elements_1_0, 
            	            		"ElementType");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }
            	    break;

            	default :
            	    break loop50;
                }
            } while (true);

            otherlv_2=(Token)match(input,109,FOLLOW_109_in_ruleHymn11393); 

                	newLeafNode(otherlv_2, grammarAccess.getHymnAccess().getEndHymnKeyword_2());
                

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleHymn"


    // $ANTLR start "entryRuleMedia"
    // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:4539:1: entryRuleMedia returns [EObject current=null] : iv_ruleMedia= ruleMedia EOF ;
    public final EObject entryRuleMedia() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMedia = null;


        try {
            // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:4540:2: (iv_ruleMedia= ruleMedia EOF )
            // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:4541:2: iv_ruleMedia= ruleMedia EOF
            {
             newCompositeNode(grammarAccess.getMediaRule()); 
            pushFollow(FOLLOW_ruleMedia_in_entryRuleMedia11429);
            iv_ruleMedia=ruleMedia();

            state._fsp--;

             current =iv_ruleMedia; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleMedia11439); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleMedia"


    // $ANTLR start "ruleMedia"
    // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:4548:1: ruleMedia returns [EObject current=null] : (otherlv_0= 'Media' ( (lv_dsl_Elements_1_0= ruleElementType ) )* otherlv_2= 'End-Media' ) ;
    public final EObject ruleMedia() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        EObject lv_dsl_Elements_1_0 = null;


         enterRule(); 
            
        try {
            // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:4551:28: ( (otherlv_0= 'Media' ( (lv_dsl_Elements_1_0= ruleElementType ) )* otherlv_2= 'End-Media' ) )
            // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:4552:1: (otherlv_0= 'Media' ( (lv_dsl_Elements_1_0= ruleElementType ) )* otherlv_2= 'End-Media' )
            {
            // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:4552:1: (otherlv_0= 'Media' ( (lv_dsl_Elements_1_0= ruleElementType ) )* otherlv_2= 'End-Media' )
            // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:4552:3: otherlv_0= 'Media' ( (lv_dsl_Elements_1_0= ruleElementType ) )* otherlv_2= 'End-Media'
            {
            otherlv_0=(Token)match(input,110,FOLLOW_110_in_ruleMedia11476); 

                	newLeafNode(otherlv_0, grammarAccess.getMediaAccess().getMediaKeyword_0());
                
            // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:4556:1: ( (lv_dsl_Elements_1_0= ruleElementType ) )*
            loop51:
            do {
                int alt51=2;
                int LA51_0 = input.LA(1);

                if ( (LA51_0==49||LA51_0==52||(LA51_0>=55 && LA51_0<=56)) ) {
                    alt51=1;
                }


                switch (alt51) {
            	case 1 :
            	    // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:4557:1: (lv_dsl_Elements_1_0= ruleElementType )
            	    {
            	    // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:4557:1: (lv_dsl_Elements_1_0= ruleElementType )
            	    // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:4558:3: lv_dsl_Elements_1_0= ruleElementType
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getMediaAccess().getDsl_ElementsElementTypeParserRuleCall_1_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleElementType_in_ruleMedia11497);
            	    lv_dsl_Elements_1_0=ruleElementType();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getMediaRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"dsl_Elements",
            	            		lv_dsl_Elements_1_0, 
            	            		"ElementType");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }
            	    break;

            	default :
            	    break loop51;
                }
            } while (true);

            otherlv_2=(Token)match(input,111,FOLLOW_111_in_ruleMedia11510); 

                	newLeafNode(otherlv_2, grammarAccess.getMediaAccess().getEndMediaKeyword_2());
                

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleMedia"


    // $ANTLR start "entryRuleVerse"
    // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:4586:1: entryRuleVerse returns [EObject current=null] : iv_ruleVerse= ruleVerse EOF ;
    public final EObject entryRuleVerse() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleVerse = null;


        try {
            // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:4587:2: (iv_ruleVerse= ruleVerse EOF )
            // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:4588:2: iv_ruleVerse= ruleVerse EOF
            {
             newCompositeNode(grammarAccess.getVerseRule()); 
            pushFollow(FOLLOW_ruleVerse_in_entryRuleVerse11546);
            iv_ruleVerse=ruleVerse();

            state._fsp--;

             current =iv_ruleVerse; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleVerse11556); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleVerse"


    // $ANTLR start "ruleVerse"
    // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:4595:1: ruleVerse returns [EObject current=null] : (otherlv_0= 'Verse' ( (lv_dsl_Elements_1_0= ruleElementType ) )* otherlv_2= 'End-Verse' ) ;
    public final EObject ruleVerse() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        EObject lv_dsl_Elements_1_0 = null;


         enterRule(); 
            
        try {
            // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:4598:28: ( (otherlv_0= 'Verse' ( (lv_dsl_Elements_1_0= ruleElementType ) )* otherlv_2= 'End-Verse' ) )
            // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:4599:1: (otherlv_0= 'Verse' ( (lv_dsl_Elements_1_0= ruleElementType ) )* otherlv_2= 'End-Verse' )
            {
            // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:4599:1: (otherlv_0= 'Verse' ( (lv_dsl_Elements_1_0= ruleElementType ) )* otherlv_2= 'End-Verse' )
            // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:4599:3: otherlv_0= 'Verse' ( (lv_dsl_Elements_1_0= ruleElementType ) )* otherlv_2= 'End-Verse'
            {
            otherlv_0=(Token)match(input,112,FOLLOW_112_in_ruleVerse11593); 

                	newLeafNode(otherlv_0, grammarAccess.getVerseAccess().getVerseKeyword_0());
                
            // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:4603:1: ( (lv_dsl_Elements_1_0= ruleElementType ) )*
            loop52:
            do {
                int alt52=2;
                int LA52_0 = input.LA(1);

                if ( (LA52_0==49||LA52_0==52||(LA52_0>=55 && LA52_0<=56)) ) {
                    alt52=1;
                }


                switch (alt52) {
            	case 1 :
            	    // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:4604:1: (lv_dsl_Elements_1_0= ruleElementType )
            	    {
            	    // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:4604:1: (lv_dsl_Elements_1_0= ruleElementType )
            	    // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:4605:3: lv_dsl_Elements_1_0= ruleElementType
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getVerseAccess().getDsl_ElementsElementTypeParserRuleCall_1_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleElementType_in_ruleVerse11614);
            	    lv_dsl_Elements_1_0=ruleElementType();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getVerseRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"dsl_Elements",
            	            		lv_dsl_Elements_1_0, 
            	            		"ElementType");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }
            	    break;

            	default :
            	    break loop52;
                }
            } while (true);

            otherlv_2=(Token)match(input,113,FOLLOW_113_in_ruleVerse11627); 

                	newLeafNode(otherlv_2, grammarAccess.getVerseAccess().getEndVerseKeyword_2());
                

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleVerse"


    // $ANTLR start "entryRuleActor"
    // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:4633:1: entryRuleActor returns [EObject current=null] : iv_ruleActor= ruleActor EOF ;
    public final EObject entryRuleActor() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleActor = null;


        try {
            // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:4634:2: (iv_ruleActor= ruleActor EOF )
            // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:4635:2: iv_ruleActor= ruleActor EOF
            {
             newCompositeNode(grammarAccess.getActorRule()); 
            pushFollow(FOLLOW_ruleActor_in_entryRuleActor11663);
            iv_ruleActor=ruleActor();

            state._fsp--;

             current =iv_ruleActor; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleActor11673); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleActor"


    // $ANTLR start "ruleActor"
    // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:4642:1: ruleActor returns [EObject current=null] : (otherlv_0= 'Actor' ( (lv_dsl_Elements_1_0= ruleElementType ) )* otherlv_2= 'End-Actor' ) ;
    public final EObject ruleActor() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        EObject lv_dsl_Elements_1_0 = null;


         enterRule(); 
            
        try {
            // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:4645:28: ( (otherlv_0= 'Actor' ( (lv_dsl_Elements_1_0= ruleElementType ) )* otherlv_2= 'End-Actor' ) )
            // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:4646:1: (otherlv_0= 'Actor' ( (lv_dsl_Elements_1_0= ruleElementType ) )* otherlv_2= 'End-Actor' )
            {
            // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:4646:1: (otherlv_0= 'Actor' ( (lv_dsl_Elements_1_0= ruleElementType ) )* otherlv_2= 'End-Actor' )
            // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:4646:3: otherlv_0= 'Actor' ( (lv_dsl_Elements_1_0= ruleElementType ) )* otherlv_2= 'End-Actor'
            {
            otherlv_0=(Token)match(input,114,FOLLOW_114_in_ruleActor11710); 

                	newLeafNode(otherlv_0, grammarAccess.getActorAccess().getActorKeyword_0());
                
            // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:4650:1: ( (lv_dsl_Elements_1_0= ruleElementType ) )*
            loop53:
            do {
                int alt53=2;
                int LA53_0 = input.LA(1);

                if ( (LA53_0==49||LA53_0==52||(LA53_0>=55 && LA53_0<=56)) ) {
                    alt53=1;
                }


                switch (alt53) {
            	case 1 :
            	    // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:4651:1: (lv_dsl_Elements_1_0= ruleElementType )
            	    {
            	    // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:4651:1: (lv_dsl_Elements_1_0= ruleElementType )
            	    // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:4652:3: lv_dsl_Elements_1_0= ruleElementType
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getActorAccess().getDsl_ElementsElementTypeParserRuleCall_1_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleElementType_in_ruleActor11731);
            	    lv_dsl_Elements_1_0=ruleElementType();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getActorRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"dsl_Elements",
            	            		lv_dsl_Elements_1_0, 
            	            		"ElementType");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }
            	    break;

            	default :
            	    break loop53;
                }
            } while (true);

            otherlv_2=(Token)match(input,115,FOLLOW_115_in_ruleActor11744); 

                	newLeafNode(otherlv_2, grammarAccess.getActorAccess().getEndActorKeyword_2());
                

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleActor"


    // $ANTLR start "entryRuleRubric"
    // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:4680:1: entryRuleRubric returns [EObject current=null] : iv_ruleRubric= ruleRubric EOF ;
    public final EObject entryRuleRubric() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRubric = null;


        try {
            // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:4681:2: (iv_ruleRubric= ruleRubric EOF )
            // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:4682:2: iv_ruleRubric= ruleRubric EOF
            {
             newCompositeNode(grammarAccess.getRubricRule()); 
            pushFollow(FOLLOW_ruleRubric_in_entryRuleRubric11780);
            iv_ruleRubric=ruleRubric();

            state._fsp--;

             current =iv_ruleRubric; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleRubric11790); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleRubric"


    // $ANTLR start "ruleRubric"
    // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:4689:1: ruleRubric returns [EObject current=null] : (otherlv_0= 'Rubric' ( (lv_dsl_Elements_1_0= ruleElementType ) )* otherlv_2= 'End-Rubric' ) ;
    public final EObject ruleRubric() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        EObject lv_dsl_Elements_1_0 = null;


         enterRule(); 
            
        try {
            // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:4692:28: ( (otherlv_0= 'Rubric' ( (lv_dsl_Elements_1_0= ruleElementType ) )* otherlv_2= 'End-Rubric' ) )
            // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:4693:1: (otherlv_0= 'Rubric' ( (lv_dsl_Elements_1_0= ruleElementType ) )* otherlv_2= 'End-Rubric' )
            {
            // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:4693:1: (otherlv_0= 'Rubric' ( (lv_dsl_Elements_1_0= ruleElementType ) )* otherlv_2= 'End-Rubric' )
            // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:4693:3: otherlv_0= 'Rubric' ( (lv_dsl_Elements_1_0= ruleElementType ) )* otherlv_2= 'End-Rubric'
            {
            otherlv_0=(Token)match(input,116,FOLLOW_116_in_ruleRubric11827); 

                	newLeafNode(otherlv_0, grammarAccess.getRubricAccess().getRubricKeyword_0());
                
            // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:4697:1: ( (lv_dsl_Elements_1_0= ruleElementType ) )*
            loop54:
            do {
                int alt54=2;
                int LA54_0 = input.LA(1);

                if ( (LA54_0==49||LA54_0==52||(LA54_0>=55 && LA54_0<=56)) ) {
                    alt54=1;
                }


                switch (alt54) {
            	case 1 :
            	    // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:4698:1: (lv_dsl_Elements_1_0= ruleElementType )
            	    {
            	    // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:4698:1: (lv_dsl_Elements_1_0= ruleElementType )
            	    // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:4699:3: lv_dsl_Elements_1_0= ruleElementType
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getRubricAccess().getDsl_ElementsElementTypeParserRuleCall_1_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleElementType_in_ruleRubric11848);
            	    lv_dsl_Elements_1_0=ruleElementType();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getRubricRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"dsl_Elements",
            	            		lv_dsl_Elements_1_0, 
            	            		"ElementType");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }
            	    break;

            	default :
            	    break loop54;
                }
            } while (true);

            otherlv_2=(Token)match(input,117,FOLLOW_117_in_ruleRubric11861); 

                	newLeafNode(otherlv_2, grammarAccess.getRubricAccess().getEndRubricKeyword_2());
                

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleRubric"


    // $ANTLR start "entryRuleDialog"
    // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:4727:1: entryRuleDialog returns [EObject current=null] : iv_ruleDialog= ruleDialog EOF ;
    public final EObject entryRuleDialog() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDialog = null;


        try {
            // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:4728:2: (iv_ruleDialog= ruleDialog EOF )
            // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:4729:2: iv_ruleDialog= ruleDialog EOF
            {
             newCompositeNode(grammarAccess.getDialogRule()); 
            pushFollow(FOLLOW_ruleDialog_in_entryRuleDialog11897);
            iv_ruleDialog=ruleDialog();

            state._fsp--;

             current =iv_ruleDialog; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleDialog11907); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleDialog"


    // $ANTLR start "ruleDialog"
    // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:4736:1: ruleDialog returns [EObject current=null] : (otherlv_0= 'Dialog' ( (lv_dsl_Elements_1_0= ruleElementType ) )* otherlv_2= 'End-Dialog' ) ;
    public final EObject ruleDialog() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        EObject lv_dsl_Elements_1_0 = null;


         enterRule(); 
            
        try {
            // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:4739:28: ( (otherlv_0= 'Dialog' ( (lv_dsl_Elements_1_0= ruleElementType ) )* otherlv_2= 'End-Dialog' ) )
            // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:4740:1: (otherlv_0= 'Dialog' ( (lv_dsl_Elements_1_0= ruleElementType ) )* otherlv_2= 'End-Dialog' )
            {
            // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:4740:1: (otherlv_0= 'Dialog' ( (lv_dsl_Elements_1_0= ruleElementType ) )* otherlv_2= 'End-Dialog' )
            // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:4740:3: otherlv_0= 'Dialog' ( (lv_dsl_Elements_1_0= ruleElementType ) )* otherlv_2= 'End-Dialog'
            {
            otherlv_0=(Token)match(input,118,FOLLOW_118_in_ruleDialog11944); 

                	newLeafNode(otherlv_0, grammarAccess.getDialogAccess().getDialogKeyword_0());
                
            // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:4744:1: ( (lv_dsl_Elements_1_0= ruleElementType ) )*
            loop55:
            do {
                int alt55=2;
                int LA55_0 = input.LA(1);

                if ( (LA55_0==49||LA55_0==52||(LA55_0>=55 && LA55_0<=56)) ) {
                    alt55=1;
                }


                switch (alt55) {
            	case 1 :
            	    // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:4745:1: (lv_dsl_Elements_1_0= ruleElementType )
            	    {
            	    // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:4745:1: (lv_dsl_Elements_1_0= ruleElementType )
            	    // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:4746:3: lv_dsl_Elements_1_0= ruleElementType
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getDialogAccess().getDsl_ElementsElementTypeParserRuleCall_1_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleElementType_in_ruleDialog11965);
            	    lv_dsl_Elements_1_0=ruleElementType();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getDialogRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"dsl_Elements",
            	            		lv_dsl_Elements_1_0, 
            	            		"ElementType");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }
            	    break;

            	default :
            	    break loop55;
                }
            } while (true);

            otherlv_2=(Token)match(input,119,FOLLOW_119_in_ruleDialog11978); 

                	newLeafNode(otherlv_2, grammarAccess.getDialogAccess().getEndDialogKeyword_2());
                

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleDialog"


    // $ANTLR start "entryRuleReading"
    // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:4774:1: entryRuleReading returns [EObject current=null] : iv_ruleReading= ruleReading EOF ;
    public final EObject entryRuleReading() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleReading = null;


        try {
            // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:4775:2: (iv_ruleReading= ruleReading EOF )
            // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:4776:2: iv_ruleReading= ruleReading EOF
            {
             newCompositeNode(grammarAccess.getReadingRule()); 
            pushFollow(FOLLOW_ruleReading_in_entryRuleReading12014);
            iv_ruleReading=ruleReading();

            state._fsp--;

             current =iv_ruleReading; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleReading12024); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleReading"


    // $ANTLR start "ruleReading"
    // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:4783:1: ruleReading returns [EObject current=null] : (otherlv_0= 'Reading' ( (lv_dsl_Elements_1_0= ruleElementType ) )* otherlv_2= 'End-Reading' ) ;
    public final EObject ruleReading() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        EObject lv_dsl_Elements_1_0 = null;


         enterRule(); 
            
        try {
            // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:4786:28: ( (otherlv_0= 'Reading' ( (lv_dsl_Elements_1_0= ruleElementType ) )* otherlv_2= 'End-Reading' ) )
            // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:4787:1: (otherlv_0= 'Reading' ( (lv_dsl_Elements_1_0= ruleElementType ) )* otherlv_2= 'End-Reading' )
            {
            // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:4787:1: (otherlv_0= 'Reading' ( (lv_dsl_Elements_1_0= ruleElementType ) )* otherlv_2= 'End-Reading' )
            // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:4787:3: otherlv_0= 'Reading' ( (lv_dsl_Elements_1_0= ruleElementType ) )* otherlv_2= 'End-Reading'
            {
            otherlv_0=(Token)match(input,120,FOLLOW_120_in_ruleReading12061); 

                	newLeafNode(otherlv_0, grammarAccess.getReadingAccess().getReadingKeyword_0());
                
            // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:4791:1: ( (lv_dsl_Elements_1_0= ruleElementType ) )*
            loop56:
            do {
                int alt56=2;
                int LA56_0 = input.LA(1);

                if ( (LA56_0==49||LA56_0==52||(LA56_0>=55 && LA56_0<=56)) ) {
                    alt56=1;
                }


                switch (alt56) {
            	case 1 :
            	    // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:4792:1: (lv_dsl_Elements_1_0= ruleElementType )
            	    {
            	    // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:4792:1: (lv_dsl_Elements_1_0= ruleElementType )
            	    // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:4793:3: lv_dsl_Elements_1_0= ruleElementType
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getReadingAccess().getDsl_ElementsElementTypeParserRuleCall_1_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleElementType_in_ruleReading12082);
            	    lv_dsl_Elements_1_0=ruleElementType();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getReadingRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"dsl_Elements",
            	            		lv_dsl_Elements_1_0, 
            	            		"ElementType");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }
            	    break;

            	default :
            	    break loop56;
                }
            } while (true);

            otherlv_2=(Token)match(input,121,FOLLOW_121_in_ruleReading12095); 

                	newLeafNode(otherlv_2, grammarAccess.getReadingAccess().getEndReadingKeyword_2());
                

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleReading"


    // $ANTLR start "entryRuleHeading1"
    // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:4821:1: entryRuleHeading1 returns [EObject current=null] : iv_ruleHeading1= ruleHeading1 EOF ;
    public final EObject entryRuleHeading1() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleHeading1 = null;


        try {
            // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:4822:2: (iv_ruleHeading1= ruleHeading1 EOF )
            // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:4823:2: iv_ruleHeading1= ruleHeading1 EOF
            {
             newCompositeNode(grammarAccess.getHeading1Rule()); 
            pushFollow(FOLLOW_ruleHeading1_in_entryRuleHeading112131);
            iv_ruleHeading1=ruleHeading1();

            state._fsp--;

             current =iv_ruleHeading1; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleHeading112141); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleHeading1"


    // $ANTLR start "ruleHeading1"
    // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:4830:1: ruleHeading1 returns [EObject current=null] : (otherlv_0= 'Heading_1' ( (lv_dsl_Elements_1_0= ruleElementType ) )* otherlv_2= 'End_Heading_1' ) ;
    public final EObject ruleHeading1() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        EObject lv_dsl_Elements_1_0 = null;


         enterRule(); 
            
        try {
            // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:4833:28: ( (otherlv_0= 'Heading_1' ( (lv_dsl_Elements_1_0= ruleElementType ) )* otherlv_2= 'End_Heading_1' ) )
            // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:4834:1: (otherlv_0= 'Heading_1' ( (lv_dsl_Elements_1_0= ruleElementType ) )* otherlv_2= 'End_Heading_1' )
            {
            // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:4834:1: (otherlv_0= 'Heading_1' ( (lv_dsl_Elements_1_0= ruleElementType ) )* otherlv_2= 'End_Heading_1' )
            // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:4834:3: otherlv_0= 'Heading_1' ( (lv_dsl_Elements_1_0= ruleElementType ) )* otherlv_2= 'End_Heading_1'
            {
            otherlv_0=(Token)match(input,122,FOLLOW_122_in_ruleHeading112178); 

                	newLeafNode(otherlv_0, grammarAccess.getHeading1Access().getHeading_1Keyword_0());
                
            // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:4838:1: ( (lv_dsl_Elements_1_0= ruleElementType ) )*
            loop57:
            do {
                int alt57=2;
                int LA57_0 = input.LA(1);

                if ( (LA57_0==49||LA57_0==52||(LA57_0>=55 && LA57_0<=56)) ) {
                    alt57=1;
                }


                switch (alt57) {
            	case 1 :
            	    // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:4839:1: (lv_dsl_Elements_1_0= ruleElementType )
            	    {
            	    // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:4839:1: (lv_dsl_Elements_1_0= ruleElementType )
            	    // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:4840:3: lv_dsl_Elements_1_0= ruleElementType
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getHeading1Access().getDsl_ElementsElementTypeParserRuleCall_1_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleElementType_in_ruleHeading112199);
            	    lv_dsl_Elements_1_0=ruleElementType();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getHeading1Rule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"dsl_Elements",
            	            		lv_dsl_Elements_1_0, 
            	            		"ElementType");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }
            	    break;

            	default :
            	    break loop57;
                }
            } while (true);

            otherlv_2=(Token)match(input,123,FOLLOW_123_in_ruleHeading112212); 

                	newLeafNode(otherlv_2, grammarAccess.getHeading1Access().getEnd_Heading_1Keyword_2());
                

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleHeading1"


    // $ANTLR start "entryRuleHeading2"
    // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:4868:1: entryRuleHeading2 returns [EObject current=null] : iv_ruleHeading2= ruleHeading2 EOF ;
    public final EObject entryRuleHeading2() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleHeading2 = null;


        try {
            // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:4869:2: (iv_ruleHeading2= ruleHeading2 EOF )
            // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:4870:2: iv_ruleHeading2= ruleHeading2 EOF
            {
             newCompositeNode(grammarAccess.getHeading2Rule()); 
            pushFollow(FOLLOW_ruleHeading2_in_entryRuleHeading212248);
            iv_ruleHeading2=ruleHeading2();

            state._fsp--;

             current =iv_ruleHeading2; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleHeading212258); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleHeading2"


    // $ANTLR start "ruleHeading2"
    // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:4877:1: ruleHeading2 returns [EObject current=null] : (otherlv_0= 'Heading_2' ( (lv_dsl_Elements_1_0= ruleElementType ) )* otherlv_2= 'End_Heading_2' ) ;
    public final EObject ruleHeading2() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        EObject lv_dsl_Elements_1_0 = null;


         enterRule(); 
            
        try {
            // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:4880:28: ( (otherlv_0= 'Heading_2' ( (lv_dsl_Elements_1_0= ruleElementType ) )* otherlv_2= 'End_Heading_2' ) )
            // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:4881:1: (otherlv_0= 'Heading_2' ( (lv_dsl_Elements_1_0= ruleElementType ) )* otherlv_2= 'End_Heading_2' )
            {
            // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:4881:1: (otherlv_0= 'Heading_2' ( (lv_dsl_Elements_1_0= ruleElementType ) )* otherlv_2= 'End_Heading_2' )
            // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:4881:3: otherlv_0= 'Heading_2' ( (lv_dsl_Elements_1_0= ruleElementType ) )* otherlv_2= 'End_Heading_2'
            {
            otherlv_0=(Token)match(input,124,FOLLOW_124_in_ruleHeading212295); 

                	newLeafNode(otherlv_0, grammarAccess.getHeading2Access().getHeading_2Keyword_0());
                
            // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:4885:1: ( (lv_dsl_Elements_1_0= ruleElementType ) )*
            loop58:
            do {
                int alt58=2;
                int LA58_0 = input.LA(1);

                if ( (LA58_0==49||LA58_0==52||(LA58_0>=55 && LA58_0<=56)) ) {
                    alt58=1;
                }


                switch (alt58) {
            	case 1 :
            	    // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:4886:1: (lv_dsl_Elements_1_0= ruleElementType )
            	    {
            	    // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:4886:1: (lv_dsl_Elements_1_0= ruleElementType )
            	    // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:4887:3: lv_dsl_Elements_1_0= ruleElementType
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getHeading2Access().getDsl_ElementsElementTypeParserRuleCall_1_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleElementType_in_ruleHeading212316);
            	    lv_dsl_Elements_1_0=ruleElementType();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getHeading2Rule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"dsl_Elements",
            	            		lv_dsl_Elements_1_0, 
            	            		"ElementType");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }
            	    break;

            	default :
            	    break loop58;
                }
            } while (true);

            otherlv_2=(Token)match(input,125,FOLLOW_125_in_ruleHeading212329); 

                	newLeafNode(otherlv_2, grammarAccess.getHeading2Access().getEnd_Heading_2Keyword_2());
                

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleHeading2"


    // $ANTLR start "entryRuleHeading3"
    // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:4915:1: entryRuleHeading3 returns [EObject current=null] : iv_ruleHeading3= ruleHeading3 EOF ;
    public final EObject entryRuleHeading3() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleHeading3 = null;


        try {
            // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:4916:2: (iv_ruleHeading3= ruleHeading3 EOF )
            // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:4917:2: iv_ruleHeading3= ruleHeading3 EOF
            {
             newCompositeNode(grammarAccess.getHeading3Rule()); 
            pushFollow(FOLLOW_ruleHeading3_in_entryRuleHeading312365);
            iv_ruleHeading3=ruleHeading3();

            state._fsp--;

             current =iv_ruleHeading3; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleHeading312375); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleHeading3"


    // $ANTLR start "ruleHeading3"
    // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:4924:1: ruleHeading3 returns [EObject current=null] : (otherlv_0= 'Heading_3' ( (lv_dsl_Elements_1_0= ruleElementType ) )* otherlv_2= 'End_Heading_3' ) ;
    public final EObject ruleHeading3() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        EObject lv_dsl_Elements_1_0 = null;


         enterRule(); 
            
        try {
            // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:4927:28: ( (otherlv_0= 'Heading_3' ( (lv_dsl_Elements_1_0= ruleElementType ) )* otherlv_2= 'End_Heading_3' ) )
            // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:4928:1: (otherlv_0= 'Heading_3' ( (lv_dsl_Elements_1_0= ruleElementType ) )* otherlv_2= 'End_Heading_3' )
            {
            // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:4928:1: (otherlv_0= 'Heading_3' ( (lv_dsl_Elements_1_0= ruleElementType ) )* otherlv_2= 'End_Heading_3' )
            // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:4928:3: otherlv_0= 'Heading_3' ( (lv_dsl_Elements_1_0= ruleElementType ) )* otherlv_2= 'End_Heading_3'
            {
            otherlv_0=(Token)match(input,126,FOLLOW_126_in_ruleHeading312412); 

                	newLeafNode(otherlv_0, grammarAccess.getHeading3Access().getHeading_3Keyword_0());
                
            // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:4932:1: ( (lv_dsl_Elements_1_0= ruleElementType ) )*
            loop59:
            do {
                int alt59=2;
                int LA59_0 = input.LA(1);

                if ( (LA59_0==49||LA59_0==52||(LA59_0>=55 && LA59_0<=56)) ) {
                    alt59=1;
                }


                switch (alt59) {
            	case 1 :
            	    // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:4933:1: (lv_dsl_Elements_1_0= ruleElementType )
            	    {
            	    // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:4933:1: (lv_dsl_Elements_1_0= ruleElementType )
            	    // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:4934:3: lv_dsl_Elements_1_0= ruleElementType
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getHeading3Access().getDsl_ElementsElementTypeParserRuleCall_1_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleElementType_in_ruleHeading312433);
            	    lv_dsl_Elements_1_0=ruleElementType();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getHeading3Rule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"dsl_Elements",
            	            		lv_dsl_Elements_1_0, 
            	            		"ElementType");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }
            	    break;

            	default :
            	    break loop59;
                }
            } while (true);

            otherlv_2=(Token)match(input,127,FOLLOW_127_in_ruleHeading312446); 

                	newLeafNode(otherlv_2, grammarAccess.getHeading3Access().getEnd_Heading_3Keyword_2());
                

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleHeading3"


    // $ANTLR start "entryRuleElementType"
    // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:4962:1: entryRuleElementType returns [EObject current=null] : iv_ruleElementType= ruleElementType EOF ;
    public final EObject entryRuleElementType() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleElementType = null;


        try {
            // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:4963:2: (iv_ruleElementType= ruleElementType EOF )
            // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:4964:2: iv_ruleElementType= ruleElementType EOF
            {
             newCompositeNode(grammarAccess.getElementTypeRule()); 
            pushFollow(FOLLOW_ruleElementType_in_entryRuleElementType12482);
            iv_ruleElementType=ruleElementType();

            state._fsp--;

             current =iv_ruleElementType; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleElementType12492); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleElementType"


    // $ANTLR start "ruleElementType"
    // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:4971:1: ruleElementType returns [EObject current=null] : (this_ResourceText_0= ruleResourceText | this_TaggedText_1= ruleTaggedText | this_Lookup_2= ruleLookup | this_LDP_3= ruleLDP ) ;
    public final EObject ruleElementType() throws RecognitionException {
        EObject current = null;

        EObject this_ResourceText_0 = null;

        EObject this_TaggedText_1 = null;

        EObject this_Lookup_2 = null;

        EObject this_LDP_3 = null;


         enterRule(); 
            
        try {
            // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:4974:28: ( (this_ResourceText_0= ruleResourceText | this_TaggedText_1= ruleTaggedText | this_Lookup_2= ruleLookup | this_LDP_3= ruleLDP ) )
            // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:4975:1: (this_ResourceText_0= ruleResourceText | this_TaggedText_1= ruleTaggedText | this_Lookup_2= ruleLookup | this_LDP_3= ruleLDP )
            {
            // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:4975:1: (this_ResourceText_0= ruleResourceText | this_TaggedText_1= ruleTaggedText | this_Lookup_2= ruleLookup | this_LDP_3= ruleLDP )
            int alt60=4;
            switch ( input.LA(1) ) {
            case 49:
                {
                alt60=1;
                }
                break;
            case 56:
                {
                alt60=2;
                }
                break;
            case 52:
                {
                alt60=3;
                }
                break;
            case 55:
                {
                alt60=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 60, 0, input);

                throw nvae;
            }

            switch (alt60) {
                case 1 :
                    // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:4976:5: this_ResourceText_0= ruleResourceText
                    {
                     
                            newCompositeNode(grammarAccess.getElementTypeAccess().getResourceTextParserRuleCall_0()); 
                        
                    pushFollow(FOLLOW_ruleResourceText_in_ruleElementType12539);
                    this_ResourceText_0=ruleResourceText();

                    state._fsp--;

                     
                            current = this_ResourceText_0; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 2 :
                    // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:4986:5: this_TaggedText_1= ruleTaggedText
                    {
                     
                            newCompositeNode(grammarAccess.getElementTypeAccess().getTaggedTextParserRuleCall_1()); 
                        
                    pushFollow(FOLLOW_ruleTaggedText_in_ruleElementType12566);
                    this_TaggedText_1=ruleTaggedText();

                    state._fsp--;

                     
                            current = this_TaggedText_1; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 3 :
                    // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:4996:5: this_Lookup_2= ruleLookup
                    {
                     
                            newCompositeNode(grammarAccess.getElementTypeAccess().getLookupParserRuleCall_2()); 
                        
                    pushFollow(FOLLOW_ruleLookup_in_ruleElementType12593);
                    this_Lookup_2=ruleLookup();

                    state._fsp--;

                     
                            current = this_Lookup_2; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 4 :
                    // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:5006:5: this_LDP_3= ruleLDP
                    {
                     
                            newCompositeNode(grammarAccess.getElementTypeAccess().getLDPParserRuleCall_3()); 
                        
                    pushFollow(FOLLOW_ruleLDP_in_ruleElementType12620);
                    this_LDP_3=ruleLDP();

                    state._fsp--;

                     
                            current = this_LDP_3; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleElementType"


    // $ANTLR start "entryRuleAid"
    // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:5022:1: entryRuleAid returns [EObject current=null] : iv_ruleAid= ruleAid EOF ;
    public final EObject entryRuleAid() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAid = null;


        try {
            // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:5023:2: (iv_ruleAid= ruleAid EOF )
            // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:5024:2: iv_ruleAid= ruleAid EOF
            {
             newCompositeNode(grammarAccess.getAidRule()); 
            pushFollow(FOLLOW_ruleAid_in_entryRuleAid12655);
            iv_ruleAid=ruleAid();

            state._fsp--;

             current =iv_ruleAid; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleAid12665); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleAid"


    // $ANTLR start "ruleAid"
    // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:5031:1: ruleAid returns [EObject current=null] : (otherlv_0= 'AGES_ID' ( (lv_name_1_0= ruleQualifiedName ) ) ) ;
    public final EObject ruleAid() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        AntlrDatatypeRuleToken lv_name_1_0 = null;


         enterRule(); 
            
        try {
            // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:5034:28: ( (otherlv_0= 'AGES_ID' ( (lv_name_1_0= ruleQualifiedName ) ) ) )
            // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:5035:1: (otherlv_0= 'AGES_ID' ( (lv_name_1_0= ruleQualifiedName ) ) )
            {
            // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:5035:1: (otherlv_0= 'AGES_ID' ( (lv_name_1_0= ruleQualifiedName ) ) )
            // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:5035:3: otherlv_0= 'AGES_ID' ( (lv_name_1_0= ruleQualifiedName ) )
            {
            otherlv_0=(Token)match(input,128,FOLLOW_128_in_ruleAid12702); 

                	newLeafNode(otherlv_0, grammarAccess.getAidAccess().getAGES_IDKeyword_0());
                
            // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:5039:1: ( (lv_name_1_0= ruleQualifiedName ) )
            // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:5040:1: (lv_name_1_0= ruleQualifiedName )
            {
            // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:5040:1: (lv_name_1_0= ruleQualifiedName )
            // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:5041:3: lv_name_1_0= ruleQualifiedName
            {
             
            	        newCompositeNode(grammarAccess.getAidAccess().getNameQualifiedNameParserRuleCall_1_0()); 
            	    
            pushFollow(FOLLOW_ruleQualifiedName_in_ruleAid12723);
            lv_name_1_0=ruleQualifiedName();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getAidRule());
            	        }
                   		set(
                   			current, 
                   			"name",
                    		lv_name_1_0, 
                    		"QualifiedName");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }


            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleAid"


    // $ANTLR start "entryRuleVersion"
    // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:5065:1: entryRuleVersion returns [EObject current=null] : iv_ruleVersion= ruleVersion EOF ;
    public final EObject entryRuleVersion() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleVersion = null;


        try {
            // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:5066:2: (iv_ruleVersion= ruleVersion EOF )
            // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:5067:2: iv_ruleVersion= ruleVersion EOF
            {
             newCompositeNode(grammarAccess.getVersionRule()); 
            pushFollow(FOLLOW_ruleVersion_in_entryRuleVersion12759);
            iv_ruleVersion=ruleVersion();

            state._fsp--;

             current =iv_ruleVersion; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleVersion12769); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleVersion"


    // $ANTLR start "ruleVersion"
    // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:5074:1: ruleVersion returns [EObject current=null] : (otherlv_0= 'Version' ( (lv_name_1_0= ruleQualifiedName ) ) ) ;
    public final EObject ruleVersion() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        AntlrDatatypeRuleToken lv_name_1_0 = null;


         enterRule(); 
            
        try {
            // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:5077:28: ( (otherlv_0= 'Version' ( (lv_name_1_0= ruleQualifiedName ) ) ) )
            // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:5078:1: (otherlv_0= 'Version' ( (lv_name_1_0= ruleQualifiedName ) ) )
            {
            // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:5078:1: (otherlv_0= 'Version' ( (lv_name_1_0= ruleQualifiedName ) ) )
            // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:5078:3: otherlv_0= 'Version' ( (lv_name_1_0= ruleQualifiedName ) )
            {
            otherlv_0=(Token)match(input,129,FOLLOW_129_in_ruleVersion12806); 

                	newLeafNode(otherlv_0, grammarAccess.getVersionAccess().getVersionKeyword_0());
                
            // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:5082:1: ( (lv_name_1_0= ruleQualifiedName ) )
            // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:5083:1: (lv_name_1_0= ruleQualifiedName )
            {
            // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:5083:1: (lv_name_1_0= ruleQualifiedName )
            // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:5084:3: lv_name_1_0= ruleQualifiedName
            {
             
            	        newCompositeNode(grammarAccess.getVersionAccess().getNameQualifiedNameParserRuleCall_1_0()); 
            	    
            pushFollow(FOLLOW_ruleQualifiedName_in_ruleVersion12827);
            lv_name_1_0=ruleQualifiedName();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getVersionRule());
            	        }
                   		set(
                   			current, 
                   			"name",
                    		lv_name_1_0, 
                    		"QualifiedName");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }


            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleVersion"


    // $ANTLR start "entryRuleLitBook"
    // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:5108:1: entryRuleLitBook returns [EObject current=null] : iv_ruleLitBook= ruleLitBook EOF ;
    public final EObject entryRuleLitBook() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleLitBook = null;


        try {
            // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:5109:2: (iv_ruleLitBook= ruleLitBook EOF )
            // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:5110:2: iv_ruleLitBook= ruleLitBook EOF
            {
             newCompositeNode(grammarAccess.getLitBookRule()); 
            pushFollow(FOLLOW_ruleLitBook_in_entryRuleLitBook12863);
            iv_ruleLitBook=ruleLitBook();

            state._fsp--;

             current =iv_ruleLitBook; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleLitBook12873); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleLitBook"


    // $ANTLR start "ruleLitBook"
    // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:5117:1: ruleLitBook returns [EObject current=null] : (otherlv_0= 'LiturgicalBook' ( (lv_name_1_0= ruleQualifiedName ) ) ) ;
    public final EObject ruleLitBook() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        AntlrDatatypeRuleToken lv_name_1_0 = null;


         enterRule(); 
            
        try {
            // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:5120:28: ( (otherlv_0= 'LiturgicalBook' ( (lv_name_1_0= ruleQualifiedName ) ) ) )
            // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:5121:1: (otherlv_0= 'LiturgicalBook' ( (lv_name_1_0= ruleQualifiedName ) ) )
            {
            // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:5121:1: (otherlv_0= 'LiturgicalBook' ( (lv_name_1_0= ruleQualifiedName ) ) )
            // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:5121:3: otherlv_0= 'LiturgicalBook' ( (lv_name_1_0= ruleQualifiedName ) )
            {
            otherlv_0=(Token)match(input,130,FOLLOW_130_in_ruleLitBook12910); 

                	newLeafNode(otherlv_0, grammarAccess.getLitBookAccess().getLiturgicalBookKeyword_0());
                
            // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:5125:1: ( (lv_name_1_0= ruleQualifiedName ) )
            // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:5126:1: (lv_name_1_0= ruleQualifiedName )
            {
            // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:5126:1: (lv_name_1_0= ruleQualifiedName )
            // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:5127:3: lv_name_1_0= ruleQualifiedName
            {
             
            	        newCompositeNode(grammarAccess.getLitBookAccess().getNameQualifiedNameParserRuleCall_1_0()); 
            	    
            pushFollow(FOLLOW_ruleQualifiedName_in_ruleLitBook12931);
            lv_name_1_0=ruleQualifiedName();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getLitBookRule());
            	        }
                   		set(
                   			current, 
                   			"name",
                    		lv_name_1_0, 
                    		"QualifiedName");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }


            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleLitBook"


    // $ANTLR start "entryRuleSetLocale"
    // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:5151:1: entryRuleSetLocale returns [EObject current=null] : iv_ruleSetLocale= ruleSetLocale EOF ;
    public final EObject entryRuleSetLocale() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSetLocale = null;


        try {
            // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:5152:2: (iv_ruleSetLocale= ruleSetLocale EOF )
            // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:5153:2: iv_ruleSetLocale= ruleSetLocale EOF
            {
             newCompositeNode(grammarAccess.getSetLocaleRule()); 
            pushFollow(FOLLOW_ruleSetLocale_in_entryRuleSetLocale12967);
            iv_ruleSetLocale=ruleSetLocale();

            state._fsp--;

             current =iv_ruleSetLocale; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleSetLocale12977); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleSetLocale"


    // $ANTLR start "ruleSetLocale"
    // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:5160:1: ruleSetLocale returns [EObject current=null] : (otherlv_0= 'Set_Locale' otherlv_1= 'locale_1' ( (lv_dsl_SetLocale_V1_2_0= RULE_STRING ) ) otherlv_3= 'locale_2' ( (lv_dsl_SetLocale_V2_4_0= RULE_STRING ) ) otherlv_5= 'End_Set_Locale' ) ;
    public final EObject ruleSetLocale() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token lv_dsl_SetLocale_V1_2_0=null;
        Token otherlv_3=null;
        Token lv_dsl_SetLocale_V2_4_0=null;
        Token otherlv_5=null;

         enterRule(); 
            
        try {
            // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:5163:28: ( (otherlv_0= 'Set_Locale' otherlv_1= 'locale_1' ( (lv_dsl_SetLocale_V1_2_0= RULE_STRING ) ) otherlv_3= 'locale_2' ( (lv_dsl_SetLocale_V2_4_0= RULE_STRING ) ) otherlv_5= 'End_Set_Locale' ) )
            // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:5164:1: (otherlv_0= 'Set_Locale' otherlv_1= 'locale_1' ( (lv_dsl_SetLocale_V1_2_0= RULE_STRING ) ) otherlv_3= 'locale_2' ( (lv_dsl_SetLocale_V2_4_0= RULE_STRING ) ) otherlv_5= 'End_Set_Locale' )
            {
            // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:5164:1: (otherlv_0= 'Set_Locale' otherlv_1= 'locale_1' ( (lv_dsl_SetLocale_V1_2_0= RULE_STRING ) ) otherlv_3= 'locale_2' ( (lv_dsl_SetLocale_V2_4_0= RULE_STRING ) ) otherlv_5= 'End_Set_Locale' )
            // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:5164:3: otherlv_0= 'Set_Locale' otherlv_1= 'locale_1' ( (lv_dsl_SetLocale_V1_2_0= RULE_STRING ) ) otherlv_3= 'locale_2' ( (lv_dsl_SetLocale_V2_4_0= RULE_STRING ) ) otherlv_5= 'End_Set_Locale'
            {
            otherlv_0=(Token)match(input,131,FOLLOW_131_in_ruleSetLocale13014); 

                	newLeafNode(otherlv_0, grammarAccess.getSetLocaleAccess().getSet_LocaleKeyword_0());
                
            otherlv_1=(Token)match(input,132,FOLLOW_132_in_ruleSetLocale13026); 

                	newLeafNode(otherlv_1, grammarAccess.getSetLocaleAccess().getLocale_1Keyword_1());
                
            // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:5172:1: ( (lv_dsl_SetLocale_V1_2_0= RULE_STRING ) )
            // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:5173:1: (lv_dsl_SetLocale_V1_2_0= RULE_STRING )
            {
            // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:5173:1: (lv_dsl_SetLocale_V1_2_0= RULE_STRING )
            // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:5174:3: lv_dsl_SetLocale_V1_2_0= RULE_STRING
            {
            lv_dsl_SetLocale_V1_2_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleSetLocale13043); 

            			newLeafNode(lv_dsl_SetLocale_V1_2_0, grammarAccess.getSetLocaleAccess().getDsl_SetLocale_V1STRINGTerminalRuleCall_2_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getSetLocaleRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"dsl_SetLocale_V1",
                    		lv_dsl_SetLocale_V1_2_0, 
                    		"STRING");
            	    

            }


            }

            otherlv_3=(Token)match(input,133,FOLLOW_133_in_ruleSetLocale13060); 

                	newLeafNode(otherlv_3, grammarAccess.getSetLocaleAccess().getLocale_2Keyword_3());
                
            // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:5194:1: ( (lv_dsl_SetLocale_V2_4_0= RULE_STRING ) )
            // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:5195:1: (lv_dsl_SetLocale_V2_4_0= RULE_STRING )
            {
            // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:5195:1: (lv_dsl_SetLocale_V2_4_0= RULE_STRING )
            // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:5196:3: lv_dsl_SetLocale_V2_4_0= RULE_STRING
            {
            lv_dsl_SetLocale_V2_4_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleSetLocale13077); 

            			newLeafNode(lv_dsl_SetLocale_V2_4_0, grammarAccess.getSetLocaleAccess().getDsl_SetLocale_V2STRINGTerminalRuleCall_4_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getSetLocaleRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"dsl_SetLocale_V2",
                    		lv_dsl_SetLocale_V2_4_0, 
                    		"STRING");
            	    

            }


            }

            otherlv_5=(Token)match(input,134,FOLLOW_134_in_ruleSetLocale13094); 

                	newLeafNode(otherlv_5, grammarAccess.getSetLocaleAccess().getEnd_Set_LocaleKeyword_5());
                

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleSetLocale"


    // $ANTLR start "entryRuleRestoreLocale"
    // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:5224:1: entryRuleRestoreLocale returns [EObject current=null] : iv_ruleRestoreLocale= ruleRestoreLocale EOF ;
    public final EObject entryRuleRestoreLocale() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRestoreLocale = null;


        try {
            // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:5225:2: (iv_ruleRestoreLocale= ruleRestoreLocale EOF )
            // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:5226:2: iv_ruleRestoreLocale= ruleRestoreLocale EOF
            {
             newCompositeNode(grammarAccess.getRestoreLocaleRule()); 
            pushFollow(FOLLOW_ruleRestoreLocale_in_entryRuleRestoreLocale13130);
            iv_ruleRestoreLocale=ruleRestoreLocale();

            state._fsp--;

             current =iv_ruleRestoreLocale; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleRestoreLocale13140); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleRestoreLocale"


    // $ANTLR start "ruleRestoreLocale"
    // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:5233:1: ruleRestoreLocale returns [EObject current=null] : ( (lv_dsl_RestoreLocale_0_0= '@restoreLocale' ) ) ;
    public final EObject ruleRestoreLocale() throws RecognitionException {
        EObject current = null;

        Token lv_dsl_RestoreLocale_0_0=null;

         enterRule(); 
            
        try {
            // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:5236:28: ( ( (lv_dsl_RestoreLocale_0_0= '@restoreLocale' ) ) )
            // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:5237:1: ( (lv_dsl_RestoreLocale_0_0= '@restoreLocale' ) )
            {
            // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:5237:1: ( (lv_dsl_RestoreLocale_0_0= '@restoreLocale' ) )
            // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:5238:1: (lv_dsl_RestoreLocale_0_0= '@restoreLocale' )
            {
            // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:5238:1: (lv_dsl_RestoreLocale_0_0= '@restoreLocale' )
            // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:5239:3: lv_dsl_RestoreLocale_0_0= '@restoreLocale'
            {
            lv_dsl_RestoreLocale_0_0=(Token)match(input,135,FOLLOW_135_in_ruleRestoreLocale13182); 

                    newLeafNode(lv_dsl_RestoreLocale_0_0, grammarAccess.getRestoreLocaleAccess().getDsl_RestoreLocaleRestoreLocaleKeyword_0());
                

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getRestoreLocaleRule());
            	        }
                   		setWithLastConsumed(current, "dsl_RestoreLocale", true, "@restoreLocale");
            	    

            }


            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleRestoreLocale"


    // $ANTLR start "entryRuleWhenDate"
    // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:5260:1: entryRuleWhenDate returns [EObject current=null] : iv_ruleWhenDate= ruleWhenDate EOF ;
    public final EObject entryRuleWhenDate() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleWhenDate = null;


        try {
            // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:5261:2: (iv_ruleWhenDate= ruleWhenDate EOF )
            // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:5262:2: iv_ruleWhenDate= ruleWhenDate EOF
            {
             newCompositeNode(grammarAccess.getWhenDateRule()); 
            pushFollow(FOLLOW_ruleWhenDate_in_entryRuleWhenDate13230);
            iv_ruleWhenDate=ruleWhenDate();

            state._fsp--;

             current =iv_ruleWhenDate; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleWhenDate13240); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleWhenDate"


    // $ANTLR start "ruleWhenDate"
    // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:5269:1: ruleWhenDate returns [EObject current=null] : (otherlv_0= 'when-date-is' ( (lv_dsl_WhenDate_Cases_1_0= ruleWhenDateCase ) )+ ( (lv_dsl_WhenDate_Other_2_0= ruleWhenOther ) )? otherlv_3= 'end-when' ) ;
    public final EObject ruleWhenDate() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_3=null;
        EObject lv_dsl_WhenDate_Cases_1_0 = null;

        EObject lv_dsl_WhenDate_Other_2_0 = null;


         enterRule(); 
            
        try {
            // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:5272:28: ( (otherlv_0= 'when-date-is' ( (lv_dsl_WhenDate_Cases_1_0= ruleWhenDateCase ) )+ ( (lv_dsl_WhenDate_Other_2_0= ruleWhenOther ) )? otherlv_3= 'end-when' ) )
            // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:5273:1: (otherlv_0= 'when-date-is' ( (lv_dsl_WhenDate_Cases_1_0= ruleWhenDateCase ) )+ ( (lv_dsl_WhenDate_Other_2_0= ruleWhenOther ) )? otherlv_3= 'end-when' )
            {
            // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:5273:1: (otherlv_0= 'when-date-is' ( (lv_dsl_WhenDate_Cases_1_0= ruleWhenDateCase ) )+ ( (lv_dsl_WhenDate_Other_2_0= ruleWhenOther ) )? otherlv_3= 'end-when' )
            // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:5273:3: otherlv_0= 'when-date-is' ( (lv_dsl_WhenDate_Cases_1_0= ruleWhenDateCase ) )+ ( (lv_dsl_WhenDate_Other_2_0= ruleWhenOther ) )? otherlv_3= 'end-when'
            {
            otherlv_0=(Token)match(input,136,FOLLOW_136_in_ruleWhenDate13277); 

                	newLeafNode(otherlv_0, grammarAccess.getWhenDateAccess().getWhenDateIsKeyword_0());
                
            // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:5277:1: ( (lv_dsl_WhenDate_Cases_1_0= ruleWhenDateCase ) )+
            int cnt61=0;
            loop61:
            do {
                int alt61=2;
                int LA61_0 = input.LA(1);

                if ( ((LA61_0>=183 && LA61_0<=194)) ) {
                    alt61=1;
                }


                switch (alt61) {
            	case 1 :
            	    // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:5278:1: (lv_dsl_WhenDate_Cases_1_0= ruleWhenDateCase )
            	    {
            	    // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:5278:1: (lv_dsl_WhenDate_Cases_1_0= ruleWhenDateCase )
            	    // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:5279:3: lv_dsl_WhenDate_Cases_1_0= ruleWhenDateCase
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getWhenDateAccess().getDsl_WhenDate_CasesWhenDateCaseParserRuleCall_1_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleWhenDateCase_in_ruleWhenDate13298);
            	    lv_dsl_WhenDate_Cases_1_0=ruleWhenDateCase();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getWhenDateRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"dsl_WhenDate_Cases",
            	            		lv_dsl_WhenDate_Cases_1_0, 
            	            		"WhenDateCase");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }
            	    break;

            	default :
            	    if ( cnt61 >= 1 ) break loop61;
                        EarlyExitException eee =
                            new EarlyExitException(61, input);
                        throw eee;
                }
                cnt61++;
            } while (true);

            // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:5295:3: ( (lv_dsl_WhenDate_Other_2_0= ruleWhenOther ) )?
            int alt62=2;
            int LA62_0 = input.LA(1);

            if ( (LA62_0==148) ) {
                alt62=1;
            }
            switch (alt62) {
                case 1 :
                    // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:5296:1: (lv_dsl_WhenDate_Other_2_0= ruleWhenOther )
                    {
                    // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:5296:1: (lv_dsl_WhenDate_Other_2_0= ruleWhenOther )
                    // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:5297:3: lv_dsl_WhenDate_Other_2_0= ruleWhenOther
                    {
                     
                    	        newCompositeNode(grammarAccess.getWhenDateAccess().getDsl_WhenDate_OtherWhenOtherParserRuleCall_2_0()); 
                    	    
                    pushFollow(FOLLOW_ruleWhenOther_in_ruleWhenDate13320);
                    lv_dsl_WhenDate_Other_2_0=ruleWhenOther();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getWhenDateRule());
                    	        }
                           		set(
                           			current, 
                           			"dsl_WhenDate_Other",
                            		lv_dsl_WhenDate_Other_2_0, 
                            		"WhenOther");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }
                    break;

            }

            otherlv_3=(Token)match(input,137,FOLLOW_137_in_ruleWhenDate13333); 

                	newLeafNode(otherlv_3, grammarAccess.getWhenDateAccess().getEndWhenKeyword_3());
                

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleWhenDate"


    // $ANTLR start "entryRuleWhenDateCase"
    // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:5325:1: entryRuleWhenDateCase returns [EObject current=null] : iv_ruleWhenDateCase= ruleWhenDateCase EOF ;
    public final EObject entryRuleWhenDateCase() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleWhenDateCase = null;


        try {
            // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:5326:2: (iv_ruleWhenDateCase= ruleWhenDateCase EOF )
            // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:5327:2: iv_ruleWhenDateCase= ruleWhenDateCase EOF
            {
             newCompositeNode(grammarAccess.getWhenDateCaseRule()); 
            pushFollow(FOLLOW_ruleWhenDateCase_in_entryRuleWhenDateCase13369);
            iv_ruleWhenDateCase=ruleWhenDateCase();

            state._fsp--;

             current =iv_ruleWhenDateCase; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleWhenDateCase13379); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleWhenDateCase"


    // $ANTLR start "ruleWhenDateCase"
    // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:5334:1: ruleWhenDateCase returns [EObject current=null] : ( ( (lv_dsl_WhenDate_Case_Month_0_0= ruleMonthName ) ) ( (lv_dsl_WhenDateCase_Days_1_0= ruleAbstractDateCase ) ) otherlv_2= 'use:' ( (lv_dsl_WhenDateCase_True_actions_3_0= ruleAbstractComponent ) )* ) ;
    public final EObject ruleWhenDateCase() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        Enumerator lv_dsl_WhenDate_Case_Month_0_0 = null;

        EObject lv_dsl_WhenDateCase_Days_1_0 = null;

        EObject lv_dsl_WhenDateCase_True_actions_3_0 = null;


         enterRule(); 
            
        try {
            // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:5337:28: ( ( ( (lv_dsl_WhenDate_Case_Month_0_0= ruleMonthName ) ) ( (lv_dsl_WhenDateCase_Days_1_0= ruleAbstractDateCase ) ) otherlv_2= 'use:' ( (lv_dsl_WhenDateCase_True_actions_3_0= ruleAbstractComponent ) )* ) )
            // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:5338:1: ( ( (lv_dsl_WhenDate_Case_Month_0_0= ruleMonthName ) ) ( (lv_dsl_WhenDateCase_Days_1_0= ruleAbstractDateCase ) ) otherlv_2= 'use:' ( (lv_dsl_WhenDateCase_True_actions_3_0= ruleAbstractComponent ) )* )
            {
            // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:5338:1: ( ( (lv_dsl_WhenDate_Case_Month_0_0= ruleMonthName ) ) ( (lv_dsl_WhenDateCase_Days_1_0= ruleAbstractDateCase ) ) otherlv_2= 'use:' ( (lv_dsl_WhenDateCase_True_actions_3_0= ruleAbstractComponent ) )* )
            // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:5338:2: ( (lv_dsl_WhenDate_Case_Month_0_0= ruleMonthName ) ) ( (lv_dsl_WhenDateCase_Days_1_0= ruleAbstractDateCase ) ) otherlv_2= 'use:' ( (lv_dsl_WhenDateCase_True_actions_3_0= ruleAbstractComponent ) )*
            {
            // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:5338:2: ( (lv_dsl_WhenDate_Case_Month_0_0= ruleMonthName ) )
            // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:5339:1: (lv_dsl_WhenDate_Case_Month_0_0= ruleMonthName )
            {
            // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:5339:1: (lv_dsl_WhenDate_Case_Month_0_0= ruleMonthName )
            // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:5340:3: lv_dsl_WhenDate_Case_Month_0_0= ruleMonthName
            {
             
            	        newCompositeNode(grammarAccess.getWhenDateCaseAccess().getDsl_WhenDate_Case_MonthMonthNameEnumRuleCall_0_0()); 
            	    
            pushFollow(FOLLOW_ruleMonthName_in_ruleWhenDateCase13425);
            lv_dsl_WhenDate_Case_Month_0_0=ruleMonthName();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getWhenDateCaseRule());
            	        }
                   		set(
                   			current, 
                   			"dsl_WhenDate_Case_Month",
                    		lv_dsl_WhenDate_Case_Month_0_0, 
                    		"MonthName");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:5356:2: ( (lv_dsl_WhenDateCase_Days_1_0= ruleAbstractDateCase ) )
            // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:5357:1: (lv_dsl_WhenDateCase_Days_1_0= ruleAbstractDateCase )
            {
            // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:5357:1: (lv_dsl_WhenDateCase_Days_1_0= ruleAbstractDateCase )
            // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:5358:3: lv_dsl_WhenDateCase_Days_1_0= ruleAbstractDateCase
            {
             
            	        newCompositeNode(grammarAccess.getWhenDateCaseAccess().getDsl_WhenDateCase_DaysAbstractDateCaseParserRuleCall_1_0()); 
            	    
            pushFollow(FOLLOW_ruleAbstractDateCase_in_ruleWhenDateCase13446);
            lv_dsl_WhenDateCase_Days_1_0=ruleAbstractDateCase();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getWhenDateCaseRule());
            	        }
                   		set(
                   			current, 
                   			"dsl_WhenDateCase_Days",
                    		lv_dsl_WhenDateCase_Days_1_0, 
                    		"AbstractDateCase");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            otherlv_2=(Token)match(input,138,FOLLOW_138_in_ruleWhenDateCase13458); 

                	newLeafNode(otherlv_2, grammarAccess.getWhenDateCaseAccess().getUseKeyword_2());
                
            // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:5378:1: ( (lv_dsl_WhenDateCase_True_actions_3_0= ruleAbstractComponent ) )*
            loop63:
            do {
                int alt63=2;
                int LA63_0 = input.LA(1);

                if ( (LA63_0==47||LA63_0==59||LA63_0==70||LA63_0==90||(LA63_0>=92 && LA63_0<=93)||LA63_0==97||LA63_0==100||LA63_0==102||LA63_0==104||LA63_0==106||LA63_0==108||LA63_0==110||LA63_0==112||LA63_0==114||LA63_0==116||LA63_0==118||LA63_0==120||LA63_0==122||LA63_0==124||LA63_0==126||(LA63_0>=128 && LA63_0<=131)||(LA63_0>=135 && LA63_0<=136)||(LA63_0>=141 && LA63_0<=147)||(LA63_0>=149 && LA63_0<=151)) ) {
                    alt63=1;
                }


                switch (alt63) {
            	case 1 :
            	    // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:5379:1: (lv_dsl_WhenDateCase_True_actions_3_0= ruleAbstractComponent )
            	    {
            	    // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:5379:1: (lv_dsl_WhenDateCase_True_actions_3_0= ruleAbstractComponent )
            	    // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:5380:3: lv_dsl_WhenDateCase_True_actions_3_0= ruleAbstractComponent
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getWhenDateCaseAccess().getDsl_WhenDateCase_True_actionsAbstractComponentParserRuleCall_3_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleAbstractComponent_in_ruleWhenDateCase13479);
            	    lv_dsl_WhenDateCase_True_actions_3_0=ruleAbstractComponent();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getWhenDateCaseRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"dsl_WhenDateCase_True_actions",
            	            		lv_dsl_WhenDateCase_True_actions_3_0, 
            	            		"AbstractComponent");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }
            	    break;

            	default :
            	    break loop63;
                }
            } while (true);


            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleWhenDateCase"


    // $ANTLR start "entryRuleAbstractDateCase"
    // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:5404:1: entryRuleAbstractDateCase returns [EObject current=null] : iv_ruleAbstractDateCase= ruleAbstractDateCase EOF ;
    public final EObject entryRuleAbstractDateCase() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAbstractDateCase = null;


        try {
            // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:5405:2: (iv_ruleAbstractDateCase= ruleAbstractDateCase EOF )
            // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:5406:2: iv_ruleAbstractDateCase= ruleAbstractDateCase EOF
            {
             newCompositeNode(grammarAccess.getAbstractDateCaseRule()); 
            pushFollow(FOLLOW_ruleAbstractDateCase_in_entryRuleAbstractDateCase13516);
            iv_ruleAbstractDateCase=ruleAbstractDateCase();

            state._fsp--;

             current =iv_ruleAbstractDateCase; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleAbstractDateCase13526); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleAbstractDateCase"


    // $ANTLR start "ruleAbstractDateCase"
    // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:5413:1: ruleAbstractDateCase returns [EObject current=null] : (this_DateRange_0= ruleDateRange | this_DateSet_1= ruleDateSet ) ;
    public final EObject ruleAbstractDateCase() throws RecognitionException {
        EObject current = null;

        EObject this_DateRange_0 = null;

        EObject this_DateSet_1 = null;


         enterRule(); 
            
        try {
            // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:5416:28: ( (this_DateRange_0= ruleDateRange | this_DateSet_1= ruleDateSet ) )
            // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:5417:1: (this_DateRange_0= ruleDateRange | this_DateSet_1= ruleDateSet )
            {
            // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:5417:1: (this_DateRange_0= ruleDateRange | this_DateSet_1= ruleDateSet )
            int alt64=2;
            int LA64_0 = input.LA(1);

            if ( (LA64_0==RULE_INT) ) {
                int LA64_1 = input.LA(2);

                if ( (LA64_1==EOF||LA64_1==138||LA64_1==140) ) {
                    alt64=2;
                }
                else if ( (LA64_1==139) ) {
                    alt64=1;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 64, 1, input);

                    throw nvae;
                }
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 64, 0, input);

                throw nvae;
            }
            switch (alt64) {
                case 1 :
                    // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:5418:5: this_DateRange_0= ruleDateRange
                    {
                     
                            newCompositeNode(grammarAccess.getAbstractDateCaseAccess().getDateRangeParserRuleCall_0()); 
                        
                    pushFollow(FOLLOW_ruleDateRange_in_ruleAbstractDateCase13573);
                    this_DateRange_0=ruleDateRange();

                    state._fsp--;

                     
                            current = this_DateRange_0; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 2 :
                    // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:5428:5: this_DateSet_1= ruleDateSet
                    {
                     
                            newCompositeNode(grammarAccess.getAbstractDateCaseAccess().getDateSetParserRuleCall_1()); 
                        
                    pushFollow(FOLLOW_ruleDateSet_in_ruleAbstractDateCase13600);
                    this_DateSet_1=ruleDateSet();

                    state._fsp--;

                     
                            current = this_DateSet_1; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleAbstractDateCase"


    // $ANTLR start "entryRuleDateRange"
    // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:5444:1: entryRuleDateRange returns [EObject current=null] : iv_ruleDateRange= ruleDateRange EOF ;
    public final EObject entryRuleDateRange() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDateRange = null;


        try {
            // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:5445:2: (iv_ruleDateRange= ruleDateRange EOF )
            // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:5446:2: iv_ruleDateRange= ruleDateRange EOF
            {
             newCompositeNode(grammarAccess.getDateRangeRule()); 
            pushFollow(FOLLOW_ruleDateRange_in_entryRuleDateRange13635);
            iv_ruleDateRange=ruleDateRange();

            state._fsp--;

             current =iv_ruleDateRange; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleDateRange13645); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleDateRange"


    // $ANTLR start "ruleDateRange"
    // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:5453:1: ruleDateRange returns [EObject current=null] : ( ( (lv_dsl_DateRange_from_0_0= RULE_INT ) ) otherlv_1= 'thru' ( (lv_dsl_DateRange_To_2_0= RULE_INT ) ) ) ;
    public final EObject ruleDateRange() throws RecognitionException {
        EObject current = null;

        Token lv_dsl_DateRange_from_0_0=null;
        Token otherlv_1=null;
        Token lv_dsl_DateRange_To_2_0=null;

         enterRule(); 
            
        try {
            // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:5456:28: ( ( ( (lv_dsl_DateRange_from_0_0= RULE_INT ) ) otherlv_1= 'thru' ( (lv_dsl_DateRange_To_2_0= RULE_INT ) ) ) )
            // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:5457:1: ( ( (lv_dsl_DateRange_from_0_0= RULE_INT ) ) otherlv_1= 'thru' ( (lv_dsl_DateRange_To_2_0= RULE_INT ) ) )
            {
            // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:5457:1: ( ( (lv_dsl_DateRange_from_0_0= RULE_INT ) ) otherlv_1= 'thru' ( (lv_dsl_DateRange_To_2_0= RULE_INT ) ) )
            // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:5457:2: ( (lv_dsl_DateRange_from_0_0= RULE_INT ) ) otherlv_1= 'thru' ( (lv_dsl_DateRange_To_2_0= RULE_INT ) )
            {
            // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:5457:2: ( (lv_dsl_DateRange_from_0_0= RULE_INT ) )
            // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:5458:1: (lv_dsl_DateRange_from_0_0= RULE_INT )
            {
            // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:5458:1: (lv_dsl_DateRange_from_0_0= RULE_INT )
            // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:5459:3: lv_dsl_DateRange_from_0_0= RULE_INT
            {
            lv_dsl_DateRange_from_0_0=(Token)match(input,RULE_INT,FOLLOW_RULE_INT_in_ruleDateRange13687); 

            			newLeafNode(lv_dsl_DateRange_from_0_0, grammarAccess.getDateRangeAccess().getDsl_DateRange_fromINTTerminalRuleCall_0_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getDateRangeRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"dsl_DateRange_from",
                    		lv_dsl_DateRange_from_0_0, 
                    		"INT");
            	    

            }


            }

            otherlv_1=(Token)match(input,139,FOLLOW_139_in_ruleDateRange13704); 

                	newLeafNode(otherlv_1, grammarAccess.getDateRangeAccess().getThruKeyword_1());
                
            // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:5479:1: ( (lv_dsl_DateRange_To_2_0= RULE_INT ) )
            // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:5480:1: (lv_dsl_DateRange_To_2_0= RULE_INT )
            {
            // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:5480:1: (lv_dsl_DateRange_To_2_0= RULE_INT )
            // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:5481:3: lv_dsl_DateRange_To_2_0= RULE_INT
            {
            lv_dsl_DateRange_To_2_0=(Token)match(input,RULE_INT,FOLLOW_RULE_INT_in_ruleDateRange13721); 

            			newLeafNode(lv_dsl_DateRange_To_2_0, grammarAccess.getDateRangeAccess().getDsl_DateRange_ToINTTerminalRuleCall_2_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getDateRangeRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"dsl_DateRange_To",
                    		lv_dsl_DateRange_To_2_0, 
                    		"INT");
            	    

            }


            }


            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleDateRange"


    // $ANTLR start "entryRuleDateSet"
    // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:5505:1: entryRuleDateSet returns [EObject current=null] : iv_ruleDateSet= ruleDateSet EOF ;
    public final EObject entryRuleDateSet() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDateSet = null;


        try {
            // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:5506:2: (iv_ruleDateSet= ruleDateSet EOF )
            // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:5507:2: iv_ruleDateSet= ruleDateSet EOF
            {
             newCompositeNode(grammarAccess.getDateSetRule()); 
            pushFollow(FOLLOW_ruleDateSet_in_entryRuleDateSet13762);
            iv_ruleDateSet=ruleDateSet();

            state._fsp--;

             current =iv_ruleDateSet; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleDateSet13772); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleDateSet"


    // $ANTLR start "ruleDateSet"
    // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:5514:1: ruleDateSet returns [EObject current=null] : ( ( (lv_dslDateSet_Values_0_0= RULE_INT ) ) (otherlv_1= ',' ( (lv_dslDateSet_Values_2_0= RULE_INT ) ) )* ) ;
    public final EObject ruleDateSet() throws RecognitionException {
        EObject current = null;

        Token lv_dslDateSet_Values_0_0=null;
        Token otherlv_1=null;
        Token lv_dslDateSet_Values_2_0=null;

         enterRule(); 
            
        try {
            // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:5517:28: ( ( ( (lv_dslDateSet_Values_0_0= RULE_INT ) ) (otherlv_1= ',' ( (lv_dslDateSet_Values_2_0= RULE_INT ) ) )* ) )
            // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:5518:1: ( ( (lv_dslDateSet_Values_0_0= RULE_INT ) ) (otherlv_1= ',' ( (lv_dslDateSet_Values_2_0= RULE_INT ) ) )* )
            {
            // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:5518:1: ( ( (lv_dslDateSet_Values_0_0= RULE_INT ) ) (otherlv_1= ',' ( (lv_dslDateSet_Values_2_0= RULE_INT ) ) )* )
            // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:5518:2: ( (lv_dslDateSet_Values_0_0= RULE_INT ) ) (otherlv_1= ',' ( (lv_dslDateSet_Values_2_0= RULE_INT ) ) )*
            {
            // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:5518:2: ( (lv_dslDateSet_Values_0_0= RULE_INT ) )
            // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:5519:1: (lv_dslDateSet_Values_0_0= RULE_INT )
            {
            // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:5519:1: (lv_dslDateSet_Values_0_0= RULE_INT )
            // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:5520:3: lv_dslDateSet_Values_0_0= RULE_INT
            {
            lv_dslDateSet_Values_0_0=(Token)match(input,RULE_INT,FOLLOW_RULE_INT_in_ruleDateSet13814); 

            			newLeafNode(lv_dslDateSet_Values_0_0, grammarAccess.getDateSetAccess().getDslDateSet_ValuesINTTerminalRuleCall_0_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getDateSetRule());
            	        }
                   		addWithLastConsumed(
                   			current, 
                   			"dslDateSet_Values",
                    		lv_dslDateSet_Values_0_0, 
                    		"INT");
            	    

            }


            }

            // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:5536:2: (otherlv_1= ',' ( (lv_dslDateSet_Values_2_0= RULE_INT ) ) )*
            loop65:
            do {
                int alt65=2;
                int LA65_0 = input.LA(1);

                if ( (LA65_0==140) ) {
                    alt65=1;
                }


                switch (alt65) {
            	case 1 :
            	    // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:5536:4: otherlv_1= ',' ( (lv_dslDateSet_Values_2_0= RULE_INT ) )
            	    {
            	    otherlv_1=(Token)match(input,140,FOLLOW_140_in_ruleDateSet13832); 

            	        	newLeafNode(otherlv_1, grammarAccess.getDateSetAccess().getCommaKeyword_1_0());
            	        
            	    // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:5540:1: ( (lv_dslDateSet_Values_2_0= RULE_INT ) )
            	    // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:5541:1: (lv_dslDateSet_Values_2_0= RULE_INT )
            	    {
            	    // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:5541:1: (lv_dslDateSet_Values_2_0= RULE_INT )
            	    // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:5542:3: lv_dslDateSet_Values_2_0= RULE_INT
            	    {
            	    lv_dslDateSet_Values_2_0=(Token)match(input,RULE_INT,FOLLOW_RULE_INT_in_ruleDateSet13849); 

            	    			newLeafNode(lv_dslDateSet_Values_2_0, grammarAccess.getDateSetAccess().getDslDateSet_ValuesINTTerminalRuleCall_1_1_0()); 
            	    		

            	    	        if (current==null) {
            	    	            current = createModelElement(grammarAccess.getDateSetRule());
            	    	        }
            	           		addWithLastConsumed(
            	           			current, 
            	           			"dslDateSet_Values",
            	            		lv_dslDateSet_Values_2_0, 
            	            		"INT");
            	    	    

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop65;
                }
            } while (true);


            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleDateSet"


    // $ANTLR start "entryRuleWhenDayName"
    // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:5566:1: entryRuleWhenDayName returns [EObject current=null] : iv_ruleWhenDayName= ruleWhenDayName EOF ;
    public final EObject entryRuleWhenDayName() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleWhenDayName = null;


        try {
            // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:5567:2: (iv_ruleWhenDayName= ruleWhenDayName EOF )
            // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:5568:2: iv_ruleWhenDayName= ruleWhenDayName EOF
            {
             newCompositeNode(grammarAccess.getWhenDayNameRule()); 
            pushFollow(FOLLOW_ruleWhenDayName_in_entryRuleWhenDayName13892);
            iv_ruleWhenDayName=ruleWhenDayName();

            state._fsp--;

             current =iv_ruleWhenDayName; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleWhenDayName13902); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleWhenDayName"


    // $ANTLR start "ruleWhenDayName"
    // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:5575:1: ruleWhenDayName returns [EObject current=null] : (otherlv_0= 'when-name-of-day-is' ( (lv_dsl_WhenDayName_Cases_1_0= ruleWhenDayNameCase ) )+ ( (lv_dsl_WhenDayName_Other_2_0= ruleWhenOther ) )? otherlv_3= 'end-when' ) ;
    public final EObject ruleWhenDayName() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_3=null;
        EObject lv_dsl_WhenDayName_Cases_1_0 = null;

        EObject lv_dsl_WhenDayName_Other_2_0 = null;


         enterRule(); 
            
        try {
            // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:5578:28: ( (otherlv_0= 'when-name-of-day-is' ( (lv_dsl_WhenDayName_Cases_1_0= ruleWhenDayNameCase ) )+ ( (lv_dsl_WhenDayName_Other_2_0= ruleWhenOther ) )? otherlv_3= 'end-when' ) )
            // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:5579:1: (otherlv_0= 'when-name-of-day-is' ( (lv_dsl_WhenDayName_Cases_1_0= ruleWhenDayNameCase ) )+ ( (lv_dsl_WhenDayName_Other_2_0= ruleWhenOther ) )? otherlv_3= 'end-when' )
            {
            // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:5579:1: (otherlv_0= 'when-name-of-day-is' ( (lv_dsl_WhenDayName_Cases_1_0= ruleWhenDayNameCase ) )+ ( (lv_dsl_WhenDayName_Other_2_0= ruleWhenOther ) )? otherlv_3= 'end-when' )
            // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:5579:3: otherlv_0= 'when-name-of-day-is' ( (lv_dsl_WhenDayName_Cases_1_0= ruleWhenDayNameCase ) )+ ( (lv_dsl_WhenDayName_Other_2_0= ruleWhenOther ) )? otherlv_3= 'end-when'
            {
            otherlv_0=(Token)match(input,141,FOLLOW_141_in_ruleWhenDayName13939); 

                	newLeafNode(otherlv_0, grammarAccess.getWhenDayNameAccess().getWhenNameOfDayIsKeyword_0());
                
            // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:5583:1: ( (lv_dsl_WhenDayName_Cases_1_0= ruleWhenDayNameCase ) )+
            int cnt66=0;
            loop66:
            do {
                int alt66=2;
                int LA66_0 = input.LA(1);

                if ( ((LA66_0>=176 && LA66_0<=182)) ) {
                    alt66=1;
                }


                switch (alt66) {
            	case 1 :
            	    // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:5584:1: (lv_dsl_WhenDayName_Cases_1_0= ruleWhenDayNameCase )
            	    {
            	    // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:5584:1: (lv_dsl_WhenDayName_Cases_1_0= ruleWhenDayNameCase )
            	    // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:5585:3: lv_dsl_WhenDayName_Cases_1_0= ruleWhenDayNameCase
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getWhenDayNameAccess().getDsl_WhenDayName_CasesWhenDayNameCaseParserRuleCall_1_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleWhenDayNameCase_in_ruleWhenDayName13960);
            	    lv_dsl_WhenDayName_Cases_1_0=ruleWhenDayNameCase();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getWhenDayNameRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"dsl_WhenDayName_Cases",
            	            		lv_dsl_WhenDayName_Cases_1_0, 
            	            		"WhenDayNameCase");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }
            	    break;

            	default :
            	    if ( cnt66 >= 1 ) break loop66;
                        EarlyExitException eee =
                            new EarlyExitException(66, input);
                        throw eee;
                }
                cnt66++;
            } while (true);

            // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:5601:3: ( (lv_dsl_WhenDayName_Other_2_0= ruleWhenOther ) )?
            int alt67=2;
            int LA67_0 = input.LA(1);

            if ( (LA67_0==148) ) {
                alt67=1;
            }
            switch (alt67) {
                case 1 :
                    // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:5602:1: (lv_dsl_WhenDayName_Other_2_0= ruleWhenOther )
                    {
                    // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:5602:1: (lv_dsl_WhenDayName_Other_2_0= ruleWhenOther )
                    // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:5603:3: lv_dsl_WhenDayName_Other_2_0= ruleWhenOther
                    {
                     
                    	        newCompositeNode(grammarAccess.getWhenDayNameAccess().getDsl_WhenDayName_OtherWhenOtherParserRuleCall_2_0()); 
                    	    
                    pushFollow(FOLLOW_ruleWhenOther_in_ruleWhenDayName13982);
                    lv_dsl_WhenDayName_Other_2_0=ruleWhenOther();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getWhenDayNameRule());
                    	        }
                           		set(
                           			current, 
                           			"dsl_WhenDayName_Other",
                            		lv_dsl_WhenDayName_Other_2_0, 
                            		"WhenOther");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }
                    break;

            }

            otherlv_3=(Token)match(input,137,FOLLOW_137_in_ruleWhenDayName13995); 

                	newLeafNode(otherlv_3, grammarAccess.getWhenDayNameAccess().getEndWhenKeyword_3());
                

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleWhenDayName"


    // $ANTLR start "entryRuleWhenDayNameCase"
    // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:5631:1: entryRuleWhenDayNameCase returns [EObject current=null] : iv_ruleWhenDayNameCase= ruleWhenDayNameCase EOF ;
    public final EObject entryRuleWhenDayNameCase() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleWhenDayNameCase = null;


        try {
            // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:5632:2: (iv_ruleWhenDayNameCase= ruleWhenDayNameCase EOF )
            // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:5633:2: iv_ruleWhenDayNameCase= ruleWhenDayNameCase EOF
            {
             newCompositeNode(grammarAccess.getWhenDayNameCaseRule()); 
            pushFollow(FOLLOW_ruleWhenDayNameCase_in_entryRuleWhenDayNameCase14031);
            iv_ruleWhenDayNameCase=ruleWhenDayNameCase();

            state._fsp--;

             current =iv_ruleWhenDayNameCase; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleWhenDayNameCase14041); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleWhenDayNameCase"


    // $ANTLR start "ruleWhenDayNameCase"
    // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:5640:1: ruleWhenDayNameCase returns [EObject current=null] : ( ( (lv_dsl_WhenDayNameCase_Days_0_0= ruleAbstractDayNameCase ) ) otherlv_1= 'use:' ( (lv_dsl_WhenDayNameCase_True_actions_2_0= ruleAbstractComponent ) )* ) ;
    public final EObject ruleWhenDayNameCase() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        EObject lv_dsl_WhenDayNameCase_Days_0_0 = null;

        EObject lv_dsl_WhenDayNameCase_True_actions_2_0 = null;


         enterRule(); 
            
        try {
            // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:5643:28: ( ( ( (lv_dsl_WhenDayNameCase_Days_0_0= ruleAbstractDayNameCase ) ) otherlv_1= 'use:' ( (lv_dsl_WhenDayNameCase_True_actions_2_0= ruleAbstractComponent ) )* ) )
            // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:5644:1: ( ( (lv_dsl_WhenDayNameCase_Days_0_0= ruleAbstractDayNameCase ) ) otherlv_1= 'use:' ( (lv_dsl_WhenDayNameCase_True_actions_2_0= ruleAbstractComponent ) )* )
            {
            // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:5644:1: ( ( (lv_dsl_WhenDayNameCase_Days_0_0= ruleAbstractDayNameCase ) ) otherlv_1= 'use:' ( (lv_dsl_WhenDayNameCase_True_actions_2_0= ruleAbstractComponent ) )* )
            // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:5644:2: ( (lv_dsl_WhenDayNameCase_Days_0_0= ruleAbstractDayNameCase ) ) otherlv_1= 'use:' ( (lv_dsl_WhenDayNameCase_True_actions_2_0= ruleAbstractComponent ) )*
            {
            // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:5644:2: ( (lv_dsl_WhenDayNameCase_Days_0_0= ruleAbstractDayNameCase ) )
            // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:5645:1: (lv_dsl_WhenDayNameCase_Days_0_0= ruleAbstractDayNameCase )
            {
            // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:5645:1: (lv_dsl_WhenDayNameCase_Days_0_0= ruleAbstractDayNameCase )
            // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:5646:3: lv_dsl_WhenDayNameCase_Days_0_0= ruleAbstractDayNameCase
            {
             
            	        newCompositeNode(grammarAccess.getWhenDayNameCaseAccess().getDsl_WhenDayNameCase_DaysAbstractDayNameCaseParserRuleCall_0_0()); 
            	    
            pushFollow(FOLLOW_ruleAbstractDayNameCase_in_ruleWhenDayNameCase14087);
            lv_dsl_WhenDayNameCase_Days_0_0=ruleAbstractDayNameCase();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getWhenDayNameCaseRule());
            	        }
                   		set(
                   			current, 
                   			"dsl_WhenDayNameCase_Days",
                    		lv_dsl_WhenDayNameCase_Days_0_0, 
                    		"AbstractDayNameCase");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            otherlv_1=(Token)match(input,138,FOLLOW_138_in_ruleWhenDayNameCase14099); 

                	newLeafNode(otherlv_1, grammarAccess.getWhenDayNameCaseAccess().getUseKeyword_1());
                
            // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:5666:1: ( (lv_dsl_WhenDayNameCase_True_actions_2_0= ruleAbstractComponent ) )*
            loop68:
            do {
                int alt68=2;
                int LA68_0 = input.LA(1);

                if ( (LA68_0==47||LA68_0==59||LA68_0==70||LA68_0==90||(LA68_0>=92 && LA68_0<=93)||LA68_0==97||LA68_0==100||LA68_0==102||LA68_0==104||LA68_0==106||LA68_0==108||LA68_0==110||LA68_0==112||LA68_0==114||LA68_0==116||LA68_0==118||LA68_0==120||LA68_0==122||LA68_0==124||LA68_0==126||(LA68_0>=128 && LA68_0<=131)||(LA68_0>=135 && LA68_0<=136)||(LA68_0>=141 && LA68_0<=147)||(LA68_0>=149 && LA68_0<=151)) ) {
                    alt68=1;
                }


                switch (alt68) {
            	case 1 :
            	    // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:5667:1: (lv_dsl_WhenDayNameCase_True_actions_2_0= ruleAbstractComponent )
            	    {
            	    // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:5667:1: (lv_dsl_WhenDayNameCase_True_actions_2_0= ruleAbstractComponent )
            	    // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:5668:3: lv_dsl_WhenDayNameCase_True_actions_2_0= ruleAbstractComponent
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getWhenDayNameCaseAccess().getDsl_WhenDayNameCase_True_actionsAbstractComponentParserRuleCall_2_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleAbstractComponent_in_ruleWhenDayNameCase14120);
            	    lv_dsl_WhenDayNameCase_True_actions_2_0=ruleAbstractComponent();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getWhenDayNameCaseRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"dsl_WhenDayNameCase_True_actions",
            	            		lv_dsl_WhenDayNameCase_True_actions_2_0, 
            	            		"AbstractComponent");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }
            	    break;

            	default :
            	    break loop68;
                }
            } while (true);


            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleWhenDayNameCase"


    // $ANTLR start "entryRuleAbstractDayNameCase"
    // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:5692:1: entryRuleAbstractDayNameCase returns [EObject current=null] : iv_ruleAbstractDayNameCase= ruleAbstractDayNameCase EOF ;
    public final EObject entryRuleAbstractDayNameCase() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAbstractDayNameCase = null;


        try {
            // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:5693:2: (iv_ruleAbstractDayNameCase= ruleAbstractDayNameCase EOF )
            // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:5694:2: iv_ruleAbstractDayNameCase= ruleAbstractDayNameCase EOF
            {
             newCompositeNode(grammarAccess.getAbstractDayNameCaseRule()); 
            pushFollow(FOLLOW_ruleAbstractDayNameCase_in_entryRuleAbstractDayNameCase14157);
            iv_ruleAbstractDayNameCase=ruleAbstractDayNameCase();

            state._fsp--;

             current =iv_ruleAbstractDayNameCase; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleAbstractDayNameCase14167); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleAbstractDayNameCase"


    // $ANTLR start "ruleAbstractDayNameCase"
    // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:5701:1: ruleAbstractDayNameCase returns [EObject current=null] : (this_DayNameRange_0= ruleDayNameRange | this_DayNameSet_1= ruleDayNameSet ) ;
    public final EObject ruleAbstractDayNameCase() throws RecognitionException {
        EObject current = null;

        EObject this_DayNameRange_0 = null;

        EObject this_DayNameSet_1 = null;


         enterRule(); 
            
        try {
            // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:5704:28: ( (this_DayNameRange_0= ruleDayNameRange | this_DayNameSet_1= ruleDayNameSet ) )
            // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:5705:1: (this_DayNameRange_0= ruleDayNameRange | this_DayNameSet_1= ruleDayNameSet )
            {
            // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:5705:1: (this_DayNameRange_0= ruleDayNameRange | this_DayNameSet_1= ruleDayNameSet )
            int alt69=2;
            alt69 = dfa69.predict(input);
            switch (alt69) {
                case 1 :
                    // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:5706:5: this_DayNameRange_0= ruleDayNameRange
                    {
                     
                            newCompositeNode(grammarAccess.getAbstractDayNameCaseAccess().getDayNameRangeParserRuleCall_0()); 
                        
                    pushFollow(FOLLOW_ruleDayNameRange_in_ruleAbstractDayNameCase14214);
                    this_DayNameRange_0=ruleDayNameRange();

                    state._fsp--;

                     
                            current = this_DayNameRange_0; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 2 :
                    // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:5716:5: this_DayNameSet_1= ruleDayNameSet
                    {
                     
                            newCompositeNode(grammarAccess.getAbstractDayNameCaseAccess().getDayNameSetParserRuleCall_1()); 
                        
                    pushFollow(FOLLOW_ruleDayNameSet_in_ruleAbstractDayNameCase14241);
                    this_DayNameSet_1=ruleDayNameSet();

                    state._fsp--;

                     
                            current = this_DayNameSet_1; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleAbstractDayNameCase"


    // $ANTLR start "entryRuleDayNameRange"
    // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:5732:1: entryRuleDayNameRange returns [EObject current=null] : iv_ruleDayNameRange= ruleDayNameRange EOF ;
    public final EObject entryRuleDayNameRange() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDayNameRange = null;


        try {
            // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:5733:2: (iv_ruleDayNameRange= ruleDayNameRange EOF )
            // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:5734:2: iv_ruleDayNameRange= ruleDayNameRange EOF
            {
             newCompositeNode(grammarAccess.getDayNameRangeRule()); 
            pushFollow(FOLLOW_ruleDayNameRange_in_entryRuleDayNameRange14276);
            iv_ruleDayNameRange=ruleDayNameRange();

            state._fsp--;

             current =iv_ruleDayNameRange; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleDayNameRange14286); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleDayNameRange"


    // $ANTLR start "ruleDayNameRange"
    // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:5741:1: ruleDayNameRange returns [EObject current=null] : ( ( (lv_dsl_DayNameRange_from_0_0= ruleDayOfWeek ) ) otherlv_1= 'thru' ( (lv_dsl_DayNameRange_To_2_0= ruleDayOfWeek ) ) ) ;
    public final EObject ruleDayNameRange() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Enumerator lv_dsl_DayNameRange_from_0_0 = null;

        Enumerator lv_dsl_DayNameRange_To_2_0 = null;


         enterRule(); 
            
        try {
            // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:5744:28: ( ( ( (lv_dsl_DayNameRange_from_0_0= ruleDayOfWeek ) ) otherlv_1= 'thru' ( (lv_dsl_DayNameRange_To_2_0= ruleDayOfWeek ) ) ) )
            // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:5745:1: ( ( (lv_dsl_DayNameRange_from_0_0= ruleDayOfWeek ) ) otherlv_1= 'thru' ( (lv_dsl_DayNameRange_To_2_0= ruleDayOfWeek ) ) )
            {
            // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:5745:1: ( ( (lv_dsl_DayNameRange_from_0_0= ruleDayOfWeek ) ) otherlv_1= 'thru' ( (lv_dsl_DayNameRange_To_2_0= ruleDayOfWeek ) ) )
            // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:5745:2: ( (lv_dsl_DayNameRange_from_0_0= ruleDayOfWeek ) ) otherlv_1= 'thru' ( (lv_dsl_DayNameRange_To_2_0= ruleDayOfWeek ) )
            {
            // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:5745:2: ( (lv_dsl_DayNameRange_from_0_0= ruleDayOfWeek ) )
            // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:5746:1: (lv_dsl_DayNameRange_from_0_0= ruleDayOfWeek )
            {
            // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:5746:1: (lv_dsl_DayNameRange_from_0_0= ruleDayOfWeek )
            // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:5747:3: lv_dsl_DayNameRange_from_0_0= ruleDayOfWeek
            {
             
            	        newCompositeNode(grammarAccess.getDayNameRangeAccess().getDsl_DayNameRange_fromDayOfWeekEnumRuleCall_0_0()); 
            	    
            pushFollow(FOLLOW_ruleDayOfWeek_in_ruleDayNameRange14332);
            lv_dsl_DayNameRange_from_0_0=ruleDayOfWeek();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getDayNameRangeRule());
            	        }
                   		set(
                   			current, 
                   			"dsl_DayNameRange_from",
                    		lv_dsl_DayNameRange_from_0_0, 
                    		"DayOfWeek");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            otherlv_1=(Token)match(input,139,FOLLOW_139_in_ruleDayNameRange14344); 

                	newLeafNode(otherlv_1, grammarAccess.getDayNameRangeAccess().getThruKeyword_1());
                
            // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:5767:1: ( (lv_dsl_DayNameRange_To_2_0= ruleDayOfWeek ) )
            // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:5768:1: (lv_dsl_DayNameRange_To_2_0= ruleDayOfWeek )
            {
            // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:5768:1: (lv_dsl_DayNameRange_To_2_0= ruleDayOfWeek )
            // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:5769:3: lv_dsl_DayNameRange_To_2_0= ruleDayOfWeek
            {
             
            	        newCompositeNode(grammarAccess.getDayNameRangeAccess().getDsl_DayNameRange_ToDayOfWeekEnumRuleCall_2_0()); 
            	    
            pushFollow(FOLLOW_ruleDayOfWeek_in_ruleDayNameRange14365);
            lv_dsl_DayNameRange_To_2_0=ruleDayOfWeek();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getDayNameRangeRule());
            	        }
                   		set(
                   			current, 
                   			"dsl_DayNameRange_To",
                    		lv_dsl_DayNameRange_To_2_0, 
                    		"DayOfWeek");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }


            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleDayNameRange"


    // $ANTLR start "entryRuleDayNameSet"
    // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:5793:1: entryRuleDayNameSet returns [EObject current=null] : iv_ruleDayNameSet= ruleDayNameSet EOF ;
    public final EObject entryRuleDayNameSet() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDayNameSet = null;


        try {
            // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:5794:2: (iv_ruleDayNameSet= ruleDayNameSet EOF )
            // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:5795:2: iv_ruleDayNameSet= ruleDayNameSet EOF
            {
             newCompositeNode(grammarAccess.getDayNameSetRule()); 
            pushFollow(FOLLOW_ruleDayNameSet_in_entryRuleDayNameSet14401);
            iv_ruleDayNameSet=ruleDayNameSet();

            state._fsp--;

             current =iv_ruleDayNameSet; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleDayNameSet14411); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleDayNameSet"


    // $ANTLR start "ruleDayNameSet"
    // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:5802:1: ruleDayNameSet returns [EObject current=null] : ( ( (lv_dslDayNameSet_Values_0_0= ruleDayOfWeek ) ) (otherlv_1= ',' ( (lv_dslDayNameSet_Values_2_0= ruleDayOfWeek ) ) )* ) ;
    public final EObject ruleDayNameSet() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Enumerator lv_dslDayNameSet_Values_0_0 = null;

        Enumerator lv_dslDayNameSet_Values_2_0 = null;


         enterRule(); 
            
        try {
            // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:5805:28: ( ( ( (lv_dslDayNameSet_Values_0_0= ruleDayOfWeek ) ) (otherlv_1= ',' ( (lv_dslDayNameSet_Values_2_0= ruleDayOfWeek ) ) )* ) )
            // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:5806:1: ( ( (lv_dslDayNameSet_Values_0_0= ruleDayOfWeek ) ) (otherlv_1= ',' ( (lv_dslDayNameSet_Values_2_0= ruleDayOfWeek ) ) )* )
            {
            // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:5806:1: ( ( (lv_dslDayNameSet_Values_0_0= ruleDayOfWeek ) ) (otherlv_1= ',' ( (lv_dslDayNameSet_Values_2_0= ruleDayOfWeek ) ) )* )
            // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:5806:2: ( (lv_dslDayNameSet_Values_0_0= ruleDayOfWeek ) ) (otherlv_1= ',' ( (lv_dslDayNameSet_Values_2_0= ruleDayOfWeek ) ) )*
            {
            // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:5806:2: ( (lv_dslDayNameSet_Values_0_0= ruleDayOfWeek ) )
            // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:5807:1: (lv_dslDayNameSet_Values_0_0= ruleDayOfWeek )
            {
            // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:5807:1: (lv_dslDayNameSet_Values_0_0= ruleDayOfWeek )
            // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:5808:3: lv_dslDayNameSet_Values_0_0= ruleDayOfWeek
            {
             
            	        newCompositeNode(grammarAccess.getDayNameSetAccess().getDslDayNameSet_ValuesDayOfWeekEnumRuleCall_0_0()); 
            	    
            pushFollow(FOLLOW_ruleDayOfWeek_in_ruleDayNameSet14457);
            lv_dslDayNameSet_Values_0_0=ruleDayOfWeek();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getDayNameSetRule());
            	        }
                   		add(
                   			current, 
                   			"dslDayNameSet_Values",
                    		lv_dslDayNameSet_Values_0_0, 
                    		"DayOfWeek");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:5824:2: (otherlv_1= ',' ( (lv_dslDayNameSet_Values_2_0= ruleDayOfWeek ) ) )*
            loop70:
            do {
                int alt70=2;
                int LA70_0 = input.LA(1);

                if ( (LA70_0==140) ) {
                    alt70=1;
                }


                switch (alt70) {
            	case 1 :
            	    // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:5824:4: otherlv_1= ',' ( (lv_dslDayNameSet_Values_2_0= ruleDayOfWeek ) )
            	    {
            	    otherlv_1=(Token)match(input,140,FOLLOW_140_in_ruleDayNameSet14470); 

            	        	newLeafNode(otherlv_1, grammarAccess.getDayNameSetAccess().getCommaKeyword_1_0());
            	        
            	    // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:5828:1: ( (lv_dslDayNameSet_Values_2_0= ruleDayOfWeek ) )
            	    // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:5829:1: (lv_dslDayNameSet_Values_2_0= ruleDayOfWeek )
            	    {
            	    // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:5829:1: (lv_dslDayNameSet_Values_2_0= ruleDayOfWeek )
            	    // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:5830:3: lv_dslDayNameSet_Values_2_0= ruleDayOfWeek
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getDayNameSetAccess().getDslDayNameSet_ValuesDayOfWeekEnumRuleCall_1_1_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleDayOfWeek_in_ruleDayNameSet14491);
            	    lv_dslDayNameSet_Values_2_0=ruleDayOfWeek();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getDayNameSetRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"dslDayNameSet_Values",
            	            		lv_dslDayNameSet_Values_2_0, 
            	            		"DayOfWeek");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop70;
                }
            } while (true);


            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleDayNameSet"


    // $ANTLR start "entryRuleWhenPentecostarionDay"
    // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:5854:1: entryRuleWhenPentecostarionDay returns [EObject current=null] : iv_ruleWhenPentecostarionDay= ruleWhenPentecostarionDay EOF ;
    public final EObject entryRuleWhenPentecostarionDay() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleWhenPentecostarionDay = null;


        try {
            // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:5855:2: (iv_ruleWhenPentecostarionDay= ruleWhenPentecostarionDay EOF )
            // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:5856:2: iv_ruleWhenPentecostarionDay= ruleWhenPentecostarionDay EOF
            {
             newCompositeNode(grammarAccess.getWhenPentecostarionDayRule()); 
            pushFollow(FOLLOW_ruleWhenPentecostarionDay_in_entryRuleWhenPentecostarionDay14529);
            iv_ruleWhenPentecostarionDay=ruleWhenPentecostarionDay();

            state._fsp--;

             current =iv_ruleWhenPentecostarionDay; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleWhenPentecostarionDay14539); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleWhenPentecostarionDay"


    // $ANTLR start "ruleWhenPentecostarionDay"
    // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:5863:1: ruleWhenPentecostarionDay returns [EObject current=null] : (otherlv_0= 'when-pentecostarion-day-is' ( (lv_dsl_WhenPentecostarionDay_Cases_1_0= ruleWhenPeriodCase ) )+ ( (lv_dsl_WhenPentecostarionDay_Other_2_0= ruleWhenOther ) )? otherlv_3= 'end-when' ) ;
    public final EObject ruleWhenPentecostarionDay() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_3=null;
        EObject lv_dsl_WhenPentecostarionDay_Cases_1_0 = null;

        EObject lv_dsl_WhenPentecostarionDay_Other_2_0 = null;


         enterRule(); 
            
        try {
            // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:5866:28: ( (otherlv_0= 'when-pentecostarion-day-is' ( (lv_dsl_WhenPentecostarionDay_Cases_1_0= ruleWhenPeriodCase ) )+ ( (lv_dsl_WhenPentecostarionDay_Other_2_0= ruleWhenOther ) )? otherlv_3= 'end-when' ) )
            // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:5867:1: (otherlv_0= 'when-pentecostarion-day-is' ( (lv_dsl_WhenPentecostarionDay_Cases_1_0= ruleWhenPeriodCase ) )+ ( (lv_dsl_WhenPentecostarionDay_Other_2_0= ruleWhenOther ) )? otherlv_3= 'end-when' )
            {
            // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:5867:1: (otherlv_0= 'when-pentecostarion-day-is' ( (lv_dsl_WhenPentecostarionDay_Cases_1_0= ruleWhenPeriodCase ) )+ ( (lv_dsl_WhenPentecostarionDay_Other_2_0= ruleWhenOther ) )? otherlv_3= 'end-when' )
            // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:5867:3: otherlv_0= 'when-pentecostarion-day-is' ( (lv_dsl_WhenPentecostarionDay_Cases_1_0= ruleWhenPeriodCase ) )+ ( (lv_dsl_WhenPentecostarionDay_Other_2_0= ruleWhenOther ) )? otherlv_3= 'end-when'
            {
            otherlv_0=(Token)match(input,142,FOLLOW_142_in_ruleWhenPentecostarionDay14576); 

                	newLeafNode(otherlv_0, grammarAccess.getWhenPentecostarionDayAccess().getWhenPentecostarionDayIsKeyword_0());
                
            // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:5871:1: ( (lv_dsl_WhenPentecostarionDay_Cases_1_0= ruleWhenPeriodCase ) )+
            int cnt71=0;
            loop71:
            do {
                int alt71=2;
                int LA71_0 = input.LA(1);

                if ( (LA71_0==RULE_INT) ) {
                    alt71=1;
                }


                switch (alt71) {
            	case 1 :
            	    // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:5872:1: (lv_dsl_WhenPentecostarionDay_Cases_1_0= ruleWhenPeriodCase )
            	    {
            	    // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:5872:1: (lv_dsl_WhenPentecostarionDay_Cases_1_0= ruleWhenPeriodCase )
            	    // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:5873:3: lv_dsl_WhenPentecostarionDay_Cases_1_0= ruleWhenPeriodCase
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getWhenPentecostarionDayAccess().getDsl_WhenPentecostarionDay_CasesWhenPeriodCaseParserRuleCall_1_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleWhenPeriodCase_in_ruleWhenPentecostarionDay14597);
            	    lv_dsl_WhenPentecostarionDay_Cases_1_0=ruleWhenPeriodCase();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getWhenPentecostarionDayRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"dsl_WhenPentecostarionDay_Cases",
            	            		lv_dsl_WhenPentecostarionDay_Cases_1_0, 
            	            		"WhenPeriodCase");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }
            	    break;

            	default :
            	    if ( cnt71 >= 1 ) break loop71;
                        EarlyExitException eee =
                            new EarlyExitException(71, input);
                        throw eee;
                }
                cnt71++;
            } while (true);

            // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:5889:3: ( (lv_dsl_WhenPentecostarionDay_Other_2_0= ruleWhenOther ) )?
            int alt72=2;
            int LA72_0 = input.LA(1);

            if ( (LA72_0==148) ) {
                alt72=1;
            }
            switch (alt72) {
                case 1 :
                    // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:5890:1: (lv_dsl_WhenPentecostarionDay_Other_2_0= ruleWhenOther )
                    {
                    // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:5890:1: (lv_dsl_WhenPentecostarionDay_Other_2_0= ruleWhenOther )
                    // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:5891:3: lv_dsl_WhenPentecostarionDay_Other_2_0= ruleWhenOther
                    {
                     
                    	        newCompositeNode(grammarAccess.getWhenPentecostarionDayAccess().getDsl_WhenPentecostarionDay_OtherWhenOtherParserRuleCall_2_0()); 
                    	    
                    pushFollow(FOLLOW_ruleWhenOther_in_ruleWhenPentecostarionDay14619);
                    lv_dsl_WhenPentecostarionDay_Other_2_0=ruleWhenOther();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getWhenPentecostarionDayRule());
                    	        }
                           		set(
                           			current, 
                           			"dsl_WhenPentecostarionDay_Other",
                            		lv_dsl_WhenPentecostarionDay_Other_2_0, 
                            		"WhenOther");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }
                    break;

            }

            otherlv_3=(Token)match(input,137,FOLLOW_137_in_ruleWhenPentecostarionDay14632); 

                	newLeafNode(otherlv_3, grammarAccess.getWhenPentecostarionDayAccess().getEndWhenKeyword_3());
                

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleWhenPentecostarionDay"


    // $ANTLR start "entryRuleWhenTriodionDay"
    // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:5919:1: entryRuleWhenTriodionDay returns [EObject current=null] : iv_ruleWhenTriodionDay= ruleWhenTriodionDay EOF ;
    public final EObject entryRuleWhenTriodionDay() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleWhenTriodionDay = null;


        try {
            // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:5920:2: (iv_ruleWhenTriodionDay= ruleWhenTriodionDay EOF )
            // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:5921:2: iv_ruleWhenTriodionDay= ruleWhenTriodionDay EOF
            {
             newCompositeNode(grammarAccess.getWhenTriodionDayRule()); 
            pushFollow(FOLLOW_ruleWhenTriodionDay_in_entryRuleWhenTriodionDay14668);
            iv_ruleWhenTriodionDay=ruleWhenTriodionDay();

            state._fsp--;

             current =iv_ruleWhenTriodionDay; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleWhenTriodionDay14678); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleWhenTriodionDay"


    // $ANTLR start "ruleWhenTriodionDay"
    // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:5928:1: ruleWhenTriodionDay returns [EObject current=null] : (otherlv_0= 'when-triodion-day-is' ( (lv_dsl_WhenTriodionDay_Cases_1_0= ruleWhenPeriodCase ) )+ ( (lv_dsl_WhenTriodionDay_Other_2_0= ruleWhenOther ) )? otherlv_3= 'end-when' ) ;
    public final EObject ruleWhenTriodionDay() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_3=null;
        EObject lv_dsl_WhenTriodionDay_Cases_1_0 = null;

        EObject lv_dsl_WhenTriodionDay_Other_2_0 = null;


         enterRule(); 
            
        try {
            // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:5931:28: ( (otherlv_0= 'when-triodion-day-is' ( (lv_dsl_WhenTriodionDay_Cases_1_0= ruleWhenPeriodCase ) )+ ( (lv_dsl_WhenTriodionDay_Other_2_0= ruleWhenOther ) )? otherlv_3= 'end-when' ) )
            // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:5932:1: (otherlv_0= 'when-triodion-day-is' ( (lv_dsl_WhenTriodionDay_Cases_1_0= ruleWhenPeriodCase ) )+ ( (lv_dsl_WhenTriodionDay_Other_2_0= ruleWhenOther ) )? otherlv_3= 'end-when' )
            {
            // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:5932:1: (otherlv_0= 'when-triodion-day-is' ( (lv_dsl_WhenTriodionDay_Cases_1_0= ruleWhenPeriodCase ) )+ ( (lv_dsl_WhenTriodionDay_Other_2_0= ruleWhenOther ) )? otherlv_3= 'end-when' )
            // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:5932:3: otherlv_0= 'when-triodion-day-is' ( (lv_dsl_WhenTriodionDay_Cases_1_0= ruleWhenPeriodCase ) )+ ( (lv_dsl_WhenTriodionDay_Other_2_0= ruleWhenOther ) )? otherlv_3= 'end-when'
            {
            otherlv_0=(Token)match(input,143,FOLLOW_143_in_ruleWhenTriodionDay14715); 

                	newLeafNode(otherlv_0, grammarAccess.getWhenTriodionDayAccess().getWhenTriodionDayIsKeyword_0());
                
            // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:5936:1: ( (lv_dsl_WhenTriodionDay_Cases_1_0= ruleWhenPeriodCase ) )+
            int cnt73=0;
            loop73:
            do {
                int alt73=2;
                int LA73_0 = input.LA(1);

                if ( (LA73_0==RULE_INT) ) {
                    alt73=1;
                }


                switch (alt73) {
            	case 1 :
            	    // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:5937:1: (lv_dsl_WhenTriodionDay_Cases_1_0= ruleWhenPeriodCase )
            	    {
            	    // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:5937:1: (lv_dsl_WhenTriodionDay_Cases_1_0= ruleWhenPeriodCase )
            	    // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:5938:3: lv_dsl_WhenTriodionDay_Cases_1_0= ruleWhenPeriodCase
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getWhenTriodionDayAccess().getDsl_WhenTriodionDay_CasesWhenPeriodCaseParserRuleCall_1_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleWhenPeriodCase_in_ruleWhenTriodionDay14736);
            	    lv_dsl_WhenTriodionDay_Cases_1_0=ruleWhenPeriodCase();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getWhenTriodionDayRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"dsl_WhenTriodionDay_Cases",
            	            		lv_dsl_WhenTriodionDay_Cases_1_0, 
            	            		"WhenPeriodCase");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }
            	    break;

            	default :
            	    if ( cnt73 >= 1 ) break loop73;
                        EarlyExitException eee =
                            new EarlyExitException(73, input);
                        throw eee;
                }
                cnt73++;
            } while (true);

            // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:5954:3: ( (lv_dsl_WhenTriodionDay_Other_2_0= ruleWhenOther ) )?
            int alt74=2;
            int LA74_0 = input.LA(1);

            if ( (LA74_0==148) ) {
                alt74=1;
            }
            switch (alt74) {
                case 1 :
                    // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:5955:1: (lv_dsl_WhenTriodionDay_Other_2_0= ruleWhenOther )
                    {
                    // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:5955:1: (lv_dsl_WhenTriodionDay_Other_2_0= ruleWhenOther )
                    // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:5956:3: lv_dsl_WhenTriodionDay_Other_2_0= ruleWhenOther
                    {
                     
                    	        newCompositeNode(grammarAccess.getWhenTriodionDayAccess().getDsl_WhenTriodionDay_OtherWhenOtherParserRuleCall_2_0()); 
                    	    
                    pushFollow(FOLLOW_ruleWhenOther_in_ruleWhenTriodionDay14758);
                    lv_dsl_WhenTriodionDay_Other_2_0=ruleWhenOther();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getWhenTriodionDayRule());
                    	        }
                           		set(
                           			current, 
                           			"dsl_WhenTriodionDay_Other",
                            		lv_dsl_WhenTriodionDay_Other_2_0, 
                            		"WhenOther");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }
                    break;

            }

            otherlv_3=(Token)match(input,137,FOLLOW_137_in_ruleWhenTriodionDay14771); 

                	newLeafNode(otherlv_3, grammarAccess.getWhenTriodionDayAccess().getEndWhenKeyword_3());
                

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleWhenTriodionDay"


    // $ANTLR start "entryRuleWhenMovableCycleDay"
    // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:5984:1: entryRuleWhenMovableCycleDay returns [EObject current=null] : iv_ruleWhenMovableCycleDay= ruleWhenMovableCycleDay EOF ;
    public final EObject entryRuleWhenMovableCycleDay() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleWhenMovableCycleDay = null;


        try {
            // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:5985:2: (iv_ruleWhenMovableCycleDay= ruleWhenMovableCycleDay EOF )
            // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:5986:2: iv_ruleWhenMovableCycleDay= ruleWhenMovableCycleDay EOF
            {
             newCompositeNode(grammarAccess.getWhenMovableCycleDayRule()); 
            pushFollow(FOLLOW_ruleWhenMovableCycleDay_in_entryRuleWhenMovableCycleDay14807);
            iv_ruleWhenMovableCycleDay=ruleWhenMovableCycleDay();

            state._fsp--;

             current =iv_ruleWhenMovableCycleDay; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleWhenMovableCycleDay14817); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleWhenMovableCycleDay"


    // $ANTLR start "ruleWhenMovableCycleDay"
    // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:5993:1: ruleWhenMovableCycleDay returns [EObject current=null] : (otherlv_0= 'when-movable-cycle-day-is' ( (lv_dsl_WhenMovableCycleDay_Cases_1_0= ruleWhenPeriodCase ) )+ ( (lv_dsl_WhenMovableCycleDay_Other_2_0= ruleWhenOther ) )? otherlv_3= 'end-when' ) ;
    public final EObject ruleWhenMovableCycleDay() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_3=null;
        EObject lv_dsl_WhenMovableCycleDay_Cases_1_0 = null;

        EObject lv_dsl_WhenMovableCycleDay_Other_2_0 = null;


         enterRule(); 
            
        try {
            // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:5996:28: ( (otherlv_0= 'when-movable-cycle-day-is' ( (lv_dsl_WhenMovableCycleDay_Cases_1_0= ruleWhenPeriodCase ) )+ ( (lv_dsl_WhenMovableCycleDay_Other_2_0= ruleWhenOther ) )? otherlv_3= 'end-when' ) )
            // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:5997:1: (otherlv_0= 'when-movable-cycle-day-is' ( (lv_dsl_WhenMovableCycleDay_Cases_1_0= ruleWhenPeriodCase ) )+ ( (lv_dsl_WhenMovableCycleDay_Other_2_0= ruleWhenOther ) )? otherlv_3= 'end-when' )
            {
            // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:5997:1: (otherlv_0= 'when-movable-cycle-day-is' ( (lv_dsl_WhenMovableCycleDay_Cases_1_0= ruleWhenPeriodCase ) )+ ( (lv_dsl_WhenMovableCycleDay_Other_2_0= ruleWhenOther ) )? otherlv_3= 'end-when' )
            // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:5997:3: otherlv_0= 'when-movable-cycle-day-is' ( (lv_dsl_WhenMovableCycleDay_Cases_1_0= ruleWhenPeriodCase ) )+ ( (lv_dsl_WhenMovableCycleDay_Other_2_0= ruleWhenOther ) )? otherlv_3= 'end-when'
            {
            otherlv_0=(Token)match(input,144,FOLLOW_144_in_ruleWhenMovableCycleDay14854); 

                	newLeafNode(otherlv_0, grammarAccess.getWhenMovableCycleDayAccess().getWhenMovableCycleDayIsKeyword_0());
                
            // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:6001:1: ( (lv_dsl_WhenMovableCycleDay_Cases_1_0= ruleWhenPeriodCase ) )+
            int cnt75=0;
            loop75:
            do {
                int alt75=2;
                int LA75_0 = input.LA(1);

                if ( (LA75_0==RULE_INT) ) {
                    alt75=1;
                }


                switch (alt75) {
            	case 1 :
            	    // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:6002:1: (lv_dsl_WhenMovableCycleDay_Cases_1_0= ruleWhenPeriodCase )
            	    {
            	    // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:6002:1: (lv_dsl_WhenMovableCycleDay_Cases_1_0= ruleWhenPeriodCase )
            	    // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:6003:3: lv_dsl_WhenMovableCycleDay_Cases_1_0= ruleWhenPeriodCase
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getWhenMovableCycleDayAccess().getDsl_WhenMovableCycleDay_CasesWhenPeriodCaseParserRuleCall_1_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleWhenPeriodCase_in_ruleWhenMovableCycleDay14875);
            	    lv_dsl_WhenMovableCycleDay_Cases_1_0=ruleWhenPeriodCase();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getWhenMovableCycleDayRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"dsl_WhenMovableCycleDay_Cases",
            	            		lv_dsl_WhenMovableCycleDay_Cases_1_0, 
            	            		"WhenPeriodCase");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }
            	    break;

            	default :
            	    if ( cnt75 >= 1 ) break loop75;
                        EarlyExitException eee =
                            new EarlyExitException(75, input);
                        throw eee;
                }
                cnt75++;
            } while (true);

            // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:6019:3: ( (lv_dsl_WhenMovableCycleDay_Other_2_0= ruleWhenOther ) )?
            int alt76=2;
            int LA76_0 = input.LA(1);

            if ( (LA76_0==148) ) {
                alt76=1;
            }
            switch (alt76) {
                case 1 :
                    // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:6020:1: (lv_dsl_WhenMovableCycleDay_Other_2_0= ruleWhenOther )
                    {
                    // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:6020:1: (lv_dsl_WhenMovableCycleDay_Other_2_0= ruleWhenOther )
                    // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:6021:3: lv_dsl_WhenMovableCycleDay_Other_2_0= ruleWhenOther
                    {
                     
                    	        newCompositeNode(grammarAccess.getWhenMovableCycleDayAccess().getDsl_WhenMovableCycleDay_OtherWhenOtherParserRuleCall_2_0()); 
                    	    
                    pushFollow(FOLLOW_ruleWhenOther_in_ruleWhenMovableCycleDay14897);
                    lv_dsl_WhenMovableCycleDay_Other_2_0=ruleWhenOther();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getWhenMovableCycleDayRule());
                    	        }
                           		set(
                           			current, 
                           			"dsl_WhenMovableCycleDay_Other",
                            		lv_dsl_WhenMovableCycleDay_Other_2_0, 
                            		"WhenOther");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }
                    break;

            }

            otherlv_3=(Token)match(input,137,FOLLOW_137_in_ruleWhenMovableCycleDay14910); 

                	newLeafNode(otherlv_3, grammarAccess.getWhenMovableCycleDayAccess().getEndWhenKeyword_3());
                

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleWhenMovableCycleDay"


    // $ANTLR start "entryRuleWhenSundayAfterElevationOfCrossDay"
    // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:6049:1: entryRuleWhenSundayAfterElevationOfCrossDay returns [EObject current=null] : iv_ruleWhenSundayAfterElevationOfCrossDay= ruleWhenSundayAfterElevationOfCrossDay EOF ;
    public final EObject entryRuleWhenSundayAfterElevationOfCrossDay() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleWhenSundayAfterElevationOfCrossDay = null;


        try {
            // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:6050:2: (iv_ruleWhenSundayAfterElevationOfCrossDay= ruleWhenSundayAfterElevationOfCrossDay EOF )
            // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:6051:2: iv_ruleWhenSundayAfterElevationOfCrossDay= ruleWhenSundayAfterElevationOfCrossDay EOF
            {
             newCompositeNode(grammarAccess.getWhenSundayAfterElevationOfCrossDayRule()); 
            pushFollow(FOLLOW_ruleWhenSundayAfterElevationOfCrossDay_in_entryRuleWhenSundayAfterElevationOfCrossDay14946);
            iv_ruleWhenSundayAfterElevationOfCrossDay=ruleWhenSundayAfterElevationOfCrossDay();

            state._fsp--;

             current =iv_ruleWhenSundayAfterElevationOfCrossDay; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleWhenSundayAfterElevationOfCrossDay14956); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleWhenSundayAfterElevationOfCrossDay"


    // $ANTLR start "ruleWhenSundayAfterElevationOfCrossDay"
    // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:6058:1: ruleWhenSundayAfterElevationOfCrossDay returns [EObject current=null] : (otherlv_0= 'when-Sunday-after-Elevation-of-Cross-is' ( (lv_dsl_WhenSundayAfterElevationOfCrossDay_Cases_1_0= ruleWhenDateCase ) )+ ( (lv_dsl_WhenSundayAfterElevationOfCrossDay_Other_2_0= ruleWhenOther ) )? otherlv_3= 'end-when' ) ;
    public final EObject ruleWhenSundayAfterElevationOfCrossDay() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_3=null;
        EObject lv_dsl_WhenSundayAfterElevationOfCrossDay_Cases_1_0 = null;

        EObject lv_dsl_WhenSundayAfterElevationOfCrossDay_Other_2_0 = null;


         enterRule(); 
            
        try {
            // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:6061:28: ( (otherlv_0= 'when-Sunday-after-Elevation-of-Cross-is' ( (lv_dsl_WhenSundayAfterElevationOfCrossDay_Cases_1_0= ruleWhenDateCase ) )+ ( (lv_dsl_WhenSundayAfterElevationOfCrossDay_Other_2_0= ruleWhenOther ) )? otherlv_3= 'end-when' ) )
            // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:6062:1: (otherlv_0= 'when-Sunday-after-Elevation-of-Cross-is' ( (lv_dsl_WhenSundayAfterElevationOfCrossDay_Cases_1_0= ruleWhenDateCase ) )+ ( (lv_dsl_WhenSundayAfterElevationOfCrossDay_Other_2_0= ruleWhenOther ) )? otherlv_3= 'end-when' )
            {
            // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:6062:1: (otherlv_0= 'when-Sunday-after-Elevation-of-Cross-is' ( (lv_dsl_WhenSundayAfterElevationOfCrossDay_Cases_1_0= ruleWhenDateCase ) )+ ( (lv_dsl_WhenSundayAfterElevationOfCrossDay_Other_2_0= ruleWhenOther ) )? otherlv_3= 'end-when' )
            // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:6062:3: otherlv_0= 'when-Sunday-after-Elevation-of-Cross-is' ( (lv_dsl_WhenSundayAfterElevationOfCrossDay_Cases_1_0= ruleWhenDateCase ) )+ ( (lv_dsl_WhenSundayAfterElevationOfCrossDay_Other_2_0= ruleWhenOther ) )? otherlv_3= 'end-when'
            {
            otherlv_0=(Token)match(input,145,FOLLOW_145_in_ruleWhenSundayAfterElevationOfCrossDay14993); 

                	newLeafNode(otherlv_0, grammarAccess.getWhenSundayAfterElevationOfCrossDayAccess().getWhenSundayAfterElevationOfCrossIsKeyword_0());
                
            // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:6066:1: ( (lv_dsl_WhenSundayAfterElevationOfCrossDay_Cases_1_0= ruleWhenDateCase ) )+
            int cnt77=0;
            loop77:
            do {
                int alt77=2;
                int LA77_0 = input.LA(1);

                if ( ((LA77_0>=183 && LA77_0<=194)) ) {
                    alt77=1;
                }


                switch (alt77) {
            	case 1 :
            	    // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:6067:1: (lv_dsl_WhenSundayAfterElevationOfCrossDay_Cases_1_0= ruleWhenDateCase )
            	    {
            	    // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:6067:1: (lv_dsl_WhenSundayAfterElevationOfCrossDay_Cases_1_0= ruleWhenDateCase )
            	    // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:6068:3: lv_dsl_WhenSundayAfterElevationOfCrossDay_Cases_1_0= ruleWhenDateCase
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getWhenSundayAfterElevationOfCrossDayAccess().getDsl_WhenSundayAfterElevationOfCrossDay_CasesWhenDateCaseParserRuleCall_1_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleWhenDateCase_in_ruleWhenSundayAfterElevationOfCrossDay15014);
            	    lv_dsl_WhenSundayAfterElevationOfCrossDay_Cases_1_0=ruleWhenDateCase();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getWhenSundayAfterElevationOfCrossDayRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"dsl_WhenSundayAfterElevationOfCrossDay_Cases",
            	            		lv_dsl_WhenSundayAfterElevationOfCrossDay_Cases_1_0, 
            	            		"WhenDateCase");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }
            	    break;

            	default :
            	    if ( cnt77 >= 1 ) break loop77;
                        EarlyExitException eee =
                            new EarlyExitException(77, input);
                        throw eee;
                }
                cnt77++;
            } while (true);

            // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:6084:3: ( (lv_dsl_WhenSundayAfterElevationOfCrossDay_Other_2_0= ruleWhenOther ) )?
            int alt78=2;
            int LA78_0 = input.LA(1);

            if ( (LA78_0==148) ) {
                alt78=1;
            }
            switch (alt78) {
                case 1 :
                    // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:6085:1: (lv_dsl_WhenSundayAfterElevationOfCrossDay_Other_2_0= ruleWhenOther )
                    {
                    // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:6085:1: (lv_dsl_WhenSundayAfterElevationOfCrossDay_Other_2_0= ruleWhenOther )
                    // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:6086:3: lv_dsl_WhenSundayAfterElevationOfCrossDay_Other_2_0= ruleWhenOther
                    {
                     
                    	        newCompositeNode(grammarAccess.getWhenSundayAfterElevationOfCrossDayAccess().getDsl_WhenSundayAfterElevationOfCrossDay_OtherWhenOtherParserRuleCall_2_0()); 
                    	    
                    pushFollow(FOLLOW_ruleWhenOther_in_ruleWhenSundayAfterElevationOfCrossDay15036);
                    lv_dsl_WhenSundayAfterElevationOfCrossDay_Other_2_0=ruleWhenOther();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getWhenSundayAfterElevationOfCrossDayRule());
                    	        }
                           		set(
                           			current, 
                           			"dsl_WhenSundayAfterElevationOfCrossDay_Other",
                            		lv_dsl_WhenSundayAfterElevationOfCrossDay_Other_2_0, 
                            		"WhenOther");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }
                    break;

            }

            otherlv_3=(Token)match(input,137,FOLLOW_137_in_ruleWhenSundayAfterElevationOfCrossDay15049); 

                	newLeafNode(otherlv_3, grammarAccess.getWhenSundayAfterElevationOfCrossDayAccess().getEndWhenKeyword_3());
                

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleWhenSundayAfterElevationOfCrossDay"


    // $ANTLR start "entryRuleWhenLukanCycleDay"
    // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:6114:1: entryRuleWhenLukanCycleDay returns [EObject current=null] : iv_ruleWhenLukanCycleDay= ruleWhenLukanCycleDay EOF ;
    public final EObject entryRuleWhenLukanCycleDay() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleWhenLukanCycleDay = null;


        try {
            // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:6115:2: (iv_ruleWhenLukanCycleDay= ruleWhenLukanCycleDay EOF )
            // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:6116:2: iv_ruleWhenLukanCycleDay= ruleWhenLukanCycleDay EOF
            {
             newCompositeNode(grammarAccess.getWhenLukanCycleDayRule()); 
            pushFollow(FOLLOW_ruleWhenLukanCycleDay_in_entryRuleWhenLukanCycleDay15085);
            iv_ruleWhenLukanCycleDay=ruleWhenLukanCycleDay();

            state._fsp--;

             current =iv_ruleWhenLukanCycleDay; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleWhenLukanCycleDay15095); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleWhenLukanCycleDay"


    // $ANTLR start "ruleWhenLukanCycleDay"
    // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:6123:1: ruleWhenLukanCycleDay returns [EObject current=null] : (otherlv_0= 'when-Lukan-Cycle-Day-is' ( (lv_dsl_WhenLukanCycleDay_Cases_1_0= ruleWhenPeriodCase ) )+ ( (lv_dsl_WhenLukanCycleDay_Other_2_0= ruleWhenOther ) )? otherlv_3= 'end-when' ) ;
    public final EObject ruleWhenLukanCycleDay() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_3=null;
        EObject lv_dsl_WhenLukanCycleDay_Cases_1_0 = null;

        EObject lv_dsl_WhenLukanCycleDay_Other_2_0 = null;


         enterRule(); 
            
        try {
            // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:6126:28: ( (otherlv_0= 'when-Lukan-Cycle-Day-is' ( (lv_dsl_WhenLukanCycleDay_Cases_1_0= ruleWhenPeriodCase ) )+ ( (lv_dsl_WhenLukanCycleDay_Other_2_0= ruleWhenOther ) )? otherlv_3= 'end-when' ) )
            // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:6127:1: (otherlv_0= 'when-Lukan-Cycle-Day-is' ( (lv_dsl_WhenLukanCycleDay_Cases_1_0= ruleWhenPeriodCase ) )+ ( (lv_dsl_WhenLukanCycleDay_Other_2_0= ruleWhenOther ) )? otherlv_3= 'end-when' )
            {
            // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:6127:1: (otherlv_0= 'when-Lukan-Cycle-Day-is' ( (lv_dsl_WhenLukanCycleDay_Cases_1_0= ruleWhenPeriodCase ) )+ ( (lv_dsl_WhenLukanCycleDay_Other_2_0= ruleWhenOther ) )? otherlv_3= 'end-when' )
            // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:6127:3: otherlv_0= 'when-Lukan-Cycle-Day-is' ( (lv_dsl_WhenLukanCycleDay_Cases_1_0= ruleWhenPeriodCase ) )+ ( (lv_dsl_WhenLukanCycleDay_Other_2_0= ruleWhenOther ) )? otherlv_3= 'end-when'
            {
            otherlv_0=(Token)match(input,146,FOLLOW_146_in_ruleWhenLukanCycleDay15132); 

                	newLeafNode(otherlv_0, grammarAccess.getWhenLukanCycleDayAccess().getWhenLukanCycleDayIsKeyword_0());
                
            // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:6131:1: ( (lv_dsl_WhenLukanCycleDay_Cases_1_0= ruleWhenPeriodCase ) )+
            int cnt79=0;
            loop79:
            do {
                int alt79=2;
                int LA79_0 = input.LA(1);

                if ( (LA79_0==RULE_INT) ) {
                    alt79=1;
                }


                switch (alt79) {
            	case 1 :
            	    // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:6132:1: (lv_dsl_WhenLukanCycleDay_Cases_1_0= ruleWhenPeriodCase )
            	    {
            	    // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:6132:1: (lv_dsl_WhenLukanCycleDay_Cases_1_0= ruleWhenPeriodCase )
            	    // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:6133:3: lv_dsl_WhenLukanCycleDay_Cases_1_0= ruleWhenPeriodCase
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getWhenLukanCycleDayAccess().getDsl_WhenLukanCycleDay_CasesWhenPeriodCaseParserRuleCall_1_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleWhenPeriodCase_in_ruleWhenLukanCycleDay15153);
            	    lv_dsl_WhenLukanCycleDay_Cases_1_0=ruleWhenPeriodCase();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getWhenLukanCycleDayRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"dsl_WhenLukanCycleDay_Cases",
            	            		lv_dsl_WhenLukanCycleDay_Cases_1_0, 
            	            		"WhenPeriodCase");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }
            	    break;

            	default :
            	    if ( cnt79 >= 1 ) break loop79;
                        EarlyExitException eee =
                            new EarlyExitException(79, input);
                        throw eee;
                }
                cnt79++;
            } while (true);

            // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:6149:3: ( (lv_dsl_WhenLukanCycleDay_Other_2_0= ruleWhenOther ) )?
            int alt80=2;
            int LA80_0 = input.LA(1);

            if ( (LA80_0==148) ) {
                alt80=1;
            }
            switch (alt80) {
                case 1 :
                    // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:6150:1: (lv_dsl_WhenLukanCycleDay_Other_2_0= ruleWhenOther )
                    {
                    // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:6150:1: (lv_dsl_WhenLukanCycleDay_Other_2_0= ruleWhenOther )
                    // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:6151:3: lv_dsl_WhenLukanCycleDay_Other_2_0= ruleWhenOther
                    {
                     
                    	        newCompositeNode(grammarAccess.getWhenLukanCycleDayAccess().getDsl_WhenLukanCycleDay_OtherWhenOtherParserRuleCall_2_0()); 
                    	    
                    pushFollow(FOLLOW_ruleWhenOther_in_ruleWhenLukanCycleDay15175);
                    lv_dsl_WhenLukanCycleDay_Other_2_0=ruleWhenOther();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getWhenLukanCycleDayRule());
                    	        }
                           		set(
                           			current, 
                           			"dsl_WhenLukanCycleDay_Other",
                            		lv_dsl_WhenLukanCycleDay_Other_2_0, 
                            		"WhenOther");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }
                    break;

            }

            otherlv_3=(Token)match(input,137,FOLLOW_137_in_ruleWhenLukanCycleDay15188); 

                	newLeafNode(otherlv_3, grammarAccess.getWhenLukanCycleDayAccess().getEndWhenKeyword_3());
                

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleWhenLukanCycleDay"


    // $ANTLR start "entryRuleWhenPascha"
    // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:6179:1: entryRuleWhenPascha returns [EObject current=null] : iv_ruleWhenPascha= ruleWhenPascha EOF ;
    public final EObject entryRuleWhenPascha() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleWhenPascha = null;


        try {
            // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:6180:2: (iv_ruleWhenPascha= ruleWhenPascha EOF )
            // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:6181:2: iv_ruleWhenPascha= ruleWhenPascha EOF
            {
             newCompositeNode(grammarAccess.getWhenPaschaRule()); 
            pushFollow(FOLLOW_ruleWhenPascha_in_entryRuleWhenPascha15224);
            iv_ruleWhenPascha=ruleWhenPascha();

            state._fsp--;

             current =iv_ruleWhenPascha; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleWhenPascha15234); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleWhenPascha"


    // $ANTLR start "ruleWhenPascha"
    // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:6188:1: ruleWhenPascha returns [EObject current=null] : (otherlv_0= 'when-pascha use:' ( (lv_dsl_WhenPascha_true_actions_1_0= ruleAbstractComponent ) )* (otherlv_2= 'otherwise use:' ( (lv_dsl_WhenPascha_Other_actions_3_0= ruleAbstractComponent ) )* )? otherlv_4= 'end-when' ) ;
    public final EObject ruleWhenPascha() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        EObject lv_dsl_WhenPascha_true_actions_1_0 = null;

        EObject lv_dsl_WhenPascha_Other_actions_3_0 = null;


         enterRule(); 
            
        try {
            // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:6191:28: ( (otherlv_0= 'when-pascha use:' ( (lv_dsl_WhenPascha_true_actions_1_0= ruleAbstractComponent ) )* (otherlv_2= 'otherwise use:' ( (lv_dsl_WhenPascha_Other_actions_3_0= ruleAbstractComponent ) )* )? otherlv_4= 'end-when' ) )
            // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:6192:1: (otherlv_0= 'when-pascha use:' ( (lv_dsl_WhenPascha_true_actions_1_0= ruleAbstractComponent ) )* (otherlv_2= 'otherwise use:' ( (lv_dsl_WhenPascha_Other_actions_3_0= ruleAbstractComponent ) )* )? otherlv_4= 'end-when' )
            {
            // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:6192:1: (otherlv_0= 'when-pascha use:' ( (lv_dsl_WhenPascha_true_actions_1_0= ruleAbstractComponent ) )* (otherlv_2= 'otherwise use:' ( (lv_dsl_WhenPascha_Other_actions_3_0= ruleAbstractComponent ) )* )? otherlv_4= 'end-when' )
            // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:6192:3: otherlv_0= 'when-pascha use:' ( (lv_dsl_WhenPascha_true_actions_1_0= ruleAbstractComponent ) )* (otherlv_2= 'otherwise use:' ( (lv_dsl_WhenPascha_Other_actions_3_0= ruleAbstractComponent ) )* )? otherlv_4= 'end-when'
            {
            otherlv_0=(Token)match(input,147,FOLLOW_147_in_ruleWhenPascha15271); 

                	newLeafNode(otherlv_0, grammarAccess.getWhenPaschaAccess().getWhenPaschaUseKeyword_0());
                
            // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:6196:1: ( (lv_dsl_WhenPascha_true_actions_1_0= ruleAbstractComponent ) )*
            loop81:
            do {
                int alt81=2;
                int LA81_0 = input.LA(1);

                if ( (LA81_0==47||LA81_0==59||LA81_0==70||LA81_0==90||(LA81_0>=92 && LA81_0<=93)||LA81_0==97||LA81_0==100||LA81_0==102||LA81_0==104||LA81_0==106||LA81_0==108||LA81_0==110||LA81_0==112||LA81_0==114||LA81_0==116||LA81_0==118||LA81_0==120||LA81_0==122||LA81_0==124||LA81_0==126||(LA81_0>=128 && LA81_0<=131)||(LA81_0>=135 && LA81_0<=136)||(LA81_0>=141 && LA81_0<=147)||(LA81_0>=149 && LA81_0<=151)) ) {
                    alt81=1;
                }


                switch (alt81) {
            	case 1 :
            	    // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:6197:1: (lv_dsl_WhenPascha_true_actions_1_0= ruleAbstractComponent )
            	    {
            	    // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:6197:1: (lv_dsl_WhenPascha_true_actions_1_0= ruleAbstractComponent )
            	    // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:6198:3: lv_dsl_WhenPascha_true_actions_1_0= ruleAbstractComponent
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getWhenPaschaAccess().getDsl_WhenPascha_true_actionsAbstractComponentParserRuleCall_1_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleAbstractComponent_in_ruleWhenPascha15292);
            	    lv_dsl_WhenPascha_true_actions_1_0=ruleAbstractComponent();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getWhenPaschaRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"dsl_WhenPascha_true_actions",
            	            		lv_dsl_WhenPascha_true_actions_1_0, 
            	            		"AbstractComponent");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }
            	    break;

            	default :
            	    break loop81;
                }
            } while (true);

            // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:6214:3: (otherlv_2= 'otherwise use:' ( (lv_dsl_WhenPascha_Other_actions_3_0= ruleAbstractComponent ) )* )?
            int alt83=2;
            int LA83_0 = input.LA(1);

            if ( (LA83_0==148) ) {
                alt83=1;
            }
            switch (alt83) {
                case 1 :
                    // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:6214:5: otherlv_2= 'otherwise use:' ( (lv_dsl_WhenPascha_Other_actions_3_0= ruleAbstractComponent ) )*
                    {
                    otherlv_2=(Token)match(input,148,FOLLOW_148_in_ruleWhenPascha15306); 

                        	newLeafNode(otherlv_2, grammarAccess.getWhenPaschaAccess().getOtherwiseUseKeyword_2_0());
                        
                    // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:6218:1: ( (lv_dsl_WhenPascha_Other_actions_3_0= ruleAbstractComponent ) )*
                    loop82:
                    do {
                        int alt82=2;
                        int LA82_0 = input.LA(1);

                        if ( (LA82_0==47||LA82_0==59||LA82_0==70||LA82_0==90||(LA82_0>=92 && LA82_0<=93)||LA82_0==97||LA82_0==100||LA82_0==102||LA82_0==104||LA82_0==106||LA82_0==108||LA82_0==110||LA82_0==112||LA82_0==114||LA82_0==116||LA82_0==118||LA82_0==120||LA82_0==122||LA82_0==124||LA82_0==126||(LA82_0>=128 && LA82_0<=131)||(LA82_0>=135 && LA82_0<=136)||(LA82_0>=141 && LA82_0<=147)||(LA82_0>=149 && LA82_0<=151)) ) {
                            alt82=1;
                        }


                        switch (alt82) {
                    	case 1 :
                    	    // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:6219:1: (lv_dsl_WhenPascha_Other_actions_3_0= ruleAbstractComponent )
                    	    {
                    	    // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:6219:1: (lv_dsl_WhenPascha_Other_actions_3_0= ruleAbstractComponent )
                    	    // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:6220:3: lv_dsl_WhenPascha_Other_actions_3_0= ruleAbstractComponent
                    	    {
                    	     
                    	    	        newCompositeNode(grammarAccess.getWhenPaschaAccess().getDsl_WhenPascha_Other_actionsAbstractComponentParserRuleCall_2_1_0()); 
                    	    	    
                    	    pushFollow(FOLLOW_ruleAbstractComponent_in_ruleWhenPascha15327);
                    	    lv_dsl_WhenPascha_Other_actions_3_0=ruleAbstractComponent();

                    	    state._fsp--;


                    	    	        if (current==null) {
                    	    	            current = createModelElementForParent(grammarAccess.getWhenPaschaRule());
                    	    	        }
                    	           		add(
                    	           			current, 
                    	           			"dsl_WhenPascha_Other_actions",
                    	            		lv_dsl_WhenPascha_Other_actions_3_0, 
                    	            		"AbstractComponent");
                    	    	        afterParserOrEnumRuleCall();
                    	    	    

                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop82;
                        }
                    } while (true);


                    }
                    break;

            }

            otherlv_4=(Token)match(input,137,FOLLOW_137_in_ruleWhenPascha15342); 

                	newLeafNode(otherlv_4, grammarAccess.getWhenPaschaAccess().getEndWhenKeyword_3());
                

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleWhenPascha"


    // $ANTLR start "entryRuleWhenOther"
    // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:6248:1: entryRuleWhenOther returns [EObject current=null] : iv_ruleWhenOther= ruleWhenOther EOF ;
    public final EObject entryRuleWhenOther() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleWhenOther = null;


        try {
            // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:6249:2: (iv_ruleWhenOther= ruleWhenOther EOF )
            // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:6250:2: iv_ruleWhenOther= ruleWhenOther EOF
            {
             newCompositeNode(grammarAccess.getWhenOtherRule()); 
            pushFollow(FOLLOW_ruleWhenOther_in_entryRuleWhenOther15378);
            iv_ruleWhenOther=ruleWhenOther();

            state._fsp--;

             current =iv_ruleWhenOther; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleWhenOther15388); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleWhenOther"


    // $ANTLR start "ruleWhenOther"
    // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:6257:1: ruleWhenOther returns [EObject current=null] : (otherlv_0= 'otherwise use:' ( (lv_dsl_WhenCase_Other_actions_1_0= ruleAbstractComponent ) )* ) ;
    public final EObject ruleWhenOther() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        EObject lv_dsl_WhenCase_Other_actions_1_0 = null;


         enterRule(); 
            
        try {
            // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:6260:28: ( (otherlv_0= 'otherwise use:' ( (lv_dsl_WhenCase_Other_actions_1_0= ruleAbstractComponent ) )* ) )
            // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:6261:1: (otherlv_0= 'otherwise use:' ( (lv_dsl_WhenCase_Other_actions_1_0= ruleAbstractComponent ) )* )
            {
            // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:6261:1: (otherlv_0= 'otherwise use:' ( (lv_dsl_WhenCase_Other_actions_1_0= ruleAbstractComponent ) )* )
            // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:6261:3: otherlv_0= 'otherwise use:' ( (lv_dsl_WhenCase_Other_actions_1_0= ruleAbstractComponent ) )*
            {
            otherlv_0=(Token)match(input,148,FOLLOW_148_in_ruleWhenOther15425); 

                	newLeafNode(otherlv_0, grammarAccess.getWhenOtherAccess().getOtherwiseUseKeyword_0());
                
            // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:6265:1: ( (lv_dsl_WhenCase_Other_actions_1_0= ruleAbstractComponent ) )*
            loop84:
            do {
                int alt84=2;
                int LA84_0 = input.LA(1);

                if ( (LA84_0==47||LA84_0==59||LA84_0==70||LA84_0==90||(LA84_0>=92 && LA84_0<=93)||LA84_0==97||LA84_0==100||LA84_0==102||LA84_0==104||LA84_0==106||LA84_0==108||LA84_0==110||LA84_0==112||LA84_0==114||LA84_0==116||LA84_0==118||LA84_0==120||LA84_0==122||LA84_0==124||LA84_0==126||(LA84_0>=128 && LA84_0<=131)||(LA84_0>=135 && LA84_0<=136)||(LA84_0>=141 && LA84_0<=147)||(LA84_0>=149 && LA84_0<=151)) ) {
                    alt84=1;
                }


                switch (alt84) {
            	case 1 :
            	    // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:6266:1: (lv_dsl_WhenCase_Other_actions_1_0= ruleAbstractComponent )
            	    {
            	    // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:6266:1: (lv_dsl_WhenCase_Other_actions_1_0= ruleAbstractComponent )
            	    // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:6267:3: lv_dsl_WhenCase_Other_actions_1_0= ruleAbstractComponent
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getWhenOtherAccess().getDsl_WhenCase_Other_actionsAbstractComponentParserRuleCall_1_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleAbstractComponent_in_ruleWhenOther15446);
            	    lv_dsl_WhenCase_Other_actions_1_0=ruleAbstractComponent();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getWhenOtherRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"dsl_WhenCase_Other_actions",
            	            		lv_dsl_WhenCase_Other_actions_1_0, 
            	            		"AbstractComponent");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }
            	    break;

            	default :
            	    break loop84;
                }
            } while (true);


            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleWhenOther"


    // $ANTLR start "entryRuleWhenPeriodCase"
    // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:6291:1: entryRuleWhenPeriodCase returns [EObject current=null] : iv_ruleWhenPeriodCase= ruleWhenPeriodCase EOF ;
    public final EObject entryRuleWhenPeriodCase() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleWhenPeriodCase = null;


        try {
            // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:6292:2: (iv_ruleWhenPeriodCase= ruleWhenPeriodCase EOF )
            // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:6293:2: iv_ruleWhenPeriodCase= ruleWhenPeriodCase EOF
            {
             newCompositeNode(grammarAccess.getWhenPeriodCaseRule()); 
            pushFollow(FOLLOW_ruleWhenPeriodCase_in_entryRuleWhenPeriodCase15483);
            iv_ruleWhenPeriodCase=ruleWhenPeriodCase();

            state._fsp--;

             current =iv_ruleWhenPeriodCase; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleWhenPeriodCase15493); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleWhenPeriodCase"


    // $ANTLR start "ruleWhenPeriodCase"
    // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:6300:1: ruleWhenPeriodCase returns [EObject current=null] : ( ( (lv_dsl_WhenPeriodCase_Days_0_0= ruleAbstractDayCase ) ) otherlv_1= 'use:' ( (lv_dsl_WhenPeriodCase_True_actions_2_0= ruleAbstractComponent ) )* ) ;
    public final EObject ruleWhenPeriodCase() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        EObject lv_dsl_WhenPeriodCase_Days_0_0 = null;

        EObject lv_dsl_WhenPeriodCase_True_actions_2_0 = null;


         enterRule(); 
            
        try {
            // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:6303:28: ( ( ( (lv_dsl_WhenPeriodCase_Days_0_0= ruleAbstractDayCase ) ) otherlv_1= 'use:' ( (lv_dsl_WhenPeriodCase_True_actions_2_0= ruleAbstractComponent ) )* ) )
            // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:6304:1: ( ( (lv_dsl_WhenPeriodCase_Days_0_0= ruleAbstractDayCase ) ) otherlv_1= 'use:' ( (lv_dsl_WhenPeriodCase_True_actions_2_0= ruleAbstractComponent ) )* )
            {
            // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:6304:1: ( ( (lv_dsl_WhenPeriodCase_Days_0_0= ruleAbstractDayCase ) ) otherlv_1= 'use:' ( (lv_dsl_WhenPeriodCase_True_actions_2_0= ruleAbstractComponent ) )* )
            // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:6304:2: ( (lv_dsl_WhenPeriodCase_Days_0_0= ruleAbstractDayCase ) ) otherlv_1= 'use:' ( (lv_dsl_WhenPeriodCase_True_actions_2_0= ruleAbstractComponent ) )*
            {
            // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:6304:2: ( (lv_dsl_WhenPeriodCase_Days_0_0= ruleAbstractDayCase ) )
            // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:6305:1: (lv_dsl_WhenPeriodCase_Days_0_0= ruleAbstractDayCase )
            {
            // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:6305:1: (lv_dsl_WhenPeriodCase_Days_0_0= ruleAbstractDayCase )
            // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:6306:3: lv_dsl_WhenPeriodCase_Days_0_0= ruleAbstractDayCase
            {
             
            	        newCompositeNode(grammarAccess.getWhenPeriodCaseAccess().getDsl_WhenPeriodCase_DaysAbstractDayCaseParserRuleCall_0_0()); 
            	    
            pushFollow(FOLLOW_ruleAbstractDayCase_in_ruleWhenPeriodCase15539);
            lv_dsl_WhenPeriodCase_Days_0_0=ruleAbstractDayCase();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getWhenPeriodCaseRule());
            	        }
                   		set(
                   			current, 
                   			"dsl_WhenPeriodCase_Days",
                    		lv_dsl_WhenPeriodCase_Days_0_0, 
                    		"AbstractDayCase");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            otherlv_1=(Token)match(input,138,FOLLOW_138_in_ruleWhenPeriodCase15551); 

                	newLeafNode(otherlv_1, grammarAccess.getWhenPeriodCaseAccess().getUseKeyword_1());
                
            // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:6326:1: ( (lv_dsl_WhenPeriodCase_True_actions_2_0= ruleAbstractComponent ) )*
            loop85:
            do {
                int alt85=2;
                int LA85_0 = input.LA(1);

                if ( (LA85_0==47||LA85_0==59||LA85_0==70||LA85_0==90||(LA85_0>=92 && LA85_0<=93)||LA85_0==97||LA85_0==100||LA85_0==102||LA85_0==104||LA85_0==106||LA85_0==108||LA85_0==110||LA85_0==112||LA85_0==114||LA85_0==116||LA85_0==118||LA85_0==120||LA85_0==122||LA85_0==124||LA85_0==126||(LA85_0>=128 && LA85_0<=131)||(LA85_0>=135 && LA85_0<=136)||(LA85_0>=141 && LA85_0<=147)||(LA85_0>=149 && LA85_0<=151)) ) {
                    alt85=1;
                }


                switch (alt85) {
            	case 1 :
            	    // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:6327:1: (lv_dsl_WhenPeriodCase_True_actions_2_0= ruleAbstractComponent )
            	    {
            	    // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:6327:1: (lv_dsl_WhenPeriodCase_True_actions_2_0= ruleAbstractComponent )
            	    // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:6328:3: lv_dsl_WhenPeriodCase_True_actions_2_0= ruleAbstractComponent
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getWhenPeriodCaseAccess().getDsl_WhenPeriodCase_True_actionsAbstractComponentParserRuleCall_2_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleAbstractComponent_in_ruleWhenPeriodCase15572);
            	    lv_dsl_WhenPeriodCase_True_actions_2_0=ruleAbstractComponent();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getWhenPeriodCaseRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"dsl_WhenPeriodCase_True_actions",
            	            		lv_dsl_WhenPeriodCase_True_actions_2_0, 
            	            		"AbstractComponent");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }
            	    break;

            	default :
            	    break loop85;
                }
            } while (true);


            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleWhenPeriodCase"


    // $ANTLR start "entryRuleAbstractDayCase"
    // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:6352:1: entryRuleAbstractDayCase returns [EObject current=null] : iv_ruleAbstractDayCase= ruleAbstractDayCase EOF ;
    public final EObject entryRuleAbstractDayCase() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAbstractDayCase = null;


        try {
            // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:6353:2: (iv_ruleAbstractDayCase= ruleAbstractDayCase EOF )
            // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:6354:2: iv_ruleAbstractDayCase= ruleAbstractDayCase EOF
            {
             newCompositeNode(grammarAccess.getAbstractDayCaseRule()); 
            pushFollow(FOLLOW_ruleAbstractDayCase_in_entryRuleAbstractDayCase15609);
            iv_ruleAbstractDayCase=ruleAbstractDayCase();

            state._fsp--;

             current =iv_ruleAbstractDayCase; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleAbstractDayCase15619); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleAbstractDayCase"


    // $ANTLR start "ruleAbstractDayCase"
    // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:6361:1: ruleAbstractDayCase returns [EObject current=null] : (this_DayRange_0= ruleDayRange | this_DaySet_1= ruleDaySet ) ;
    public final EObject ruleAbstractDayCase() throws RecognitionException {
        EObject current = null;

        EObject this_DayRange_0 = null;

        EObject this_DaySet_1 = null;


         enterRule(); 
            
        try {
            // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:6364:28: ( (this_DayRange_0= ruleDayRange | this_DaySet_1= ruleDaySet ) )
            // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:6365:1: (this_DayRange_0= ruleDayRange | this_DaySet_1= ruleDaySet )
            {
            // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:6365:1: (this_DayRange_0= ruleDayRange | this_DaySet_1= ruleDaySet )
            int alt86=2;
            int LA86_0 = input.LA(1);

            if ( (LA86_0==RULE_INT) ) {
                int LA86_1 = input.LA(2);

                if ( (LA86_1==EOF||LA86_1==138||LA86_1==140) ) {
                    alt86=2;
                }
                else if ( (LA86_1==139) ) {
                    alt86=1;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 86, 1, input);

                    throw nvae;
                }
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 86, 0, input);

                throw nvae;
            }
            switch (alt86) {
                case 1 :
                    // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:6366:5: this_DayRange_0= ruleDayRange
                    {
                     
                            newCompositeNode(grammarAccess.getAbstractDayCaseAccess().getDayRangeParserRuleCall_0()); 
                        
                    pushFollow(FOLLOW_ruleDayRange_in_ruleAbstractDayCase15666);
                    this_DayRange_0=ruleDayRange();

                    state._fsp--;

                     
                            current = this_DayRange_0; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 2 :
                    // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:6376:5: this_DaySet_1= ruleDaySet
                    {
                     
                            newCompositeNode(grammarAccess.getAbstractDayCaseAccess().getDaySetParserRuleCall_1()); 
                        
                    pushFollow(FOLLOW_ruleDaySet_in_ruleAbstractDayCase15693);
                    this_DaySet_1=ruleDaySet();

                    state._fsp--;

                     
                            current = this_DaySet_1; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleAbstractDayCase"


    // $ANTLR start "entryRuleDayRange"
    // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:6392:1: entryRuleDayRange returns [EObject current=null] : iv_ruleDayRange= ruleDayRange EOF ;
    public final EObject entryRuleDayRange() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDayRange = null;


        try {
            // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:6393:2: (iv_ruleDayRange= ruleDayRange EOF )
            // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:6394:2: iv_ruleDayRange= ruleDayRange EOF
            {
             newCompositeNode(grammarAccess.getDayRangeRule()); 
            pushFollow(FOLLOW_ruleDayRange_in_entryRuleDayRange15728);
            iv_ruleDayRange=ruleDayRange();

            state._fsp--;

             current =iv_ruleDayRange; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleDayRange15738); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleDayRange"


    // $ANTLR start "ruleDayRange"
    // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:6401:1: ruleDayRange returns [EObject current=null] : ( ( (lv_dsl_DayRange_from_0_0= RULE_INT ) ) otherlv_1= 'thru' ( (lv_dsl_Range_To_2_0= RULE_INT ) ) ) ;
    public final EObject ruleDayRange() throws RecognitionException {
        EObject current = null;

        Token lv_dsl_DayRange_from_0_0=null;
        Token otherlv_1=null;
        Token lv_dsl_Range_To_2_0=null;

         enterRule(); 
            
        try {
            // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:6404:28: ( ( ( (lv_dsl_DayRange_from_0_0= RULE_INT ) ) otherlv_1= 'thru' ( (lv_dsl_Range_To_2_0= RULE_INT ) ) ) )
            // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:6405:1: ( ( (lv_dsl_DayRange_from_0_0= RULE_INT ) ) otherlv_1= 'thru' ( (lv_dsl_Range_To_2_0= RULE_INT ) ) )
            {
            // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:6405:1: ( ( (lv_dsl_DayRange_from_0_0= RULE_INT ) ) otherlv_1= 'thru' ( (lv_dsl_Range_To_2_0= RULE_INT ) ) )
            // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:6405:2: ( (lv_dsl_DayRange_from_0_0= RULE_INT ) ) otherlv_1= 'thru' ( (lv_dsl_Range_To_2_0= RULE_INT ) )
            {
            // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:6405:2: ( (lv_dsl_DayRange_from_0_0= RULE_INT ) )
            // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:6406:1: (lv_dsl_DayRange_from_0_0= RULE_INT )
            {
            // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:6406:1: (lv_dsl_DayRange_from_0_0= RULE_INT )
            // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:6407:3: lv_dsl_DayRange_from_0_0= RULE_INT
            {
            lv_dsl_DayRange_from_0_0=(Token)match(input,RULE_INT,FOLLOW_RULE_INT_in_ruleDayRange15780); 

            			newLeafNode(lv_dsl_DayRange_from_0_0, grammarAccess.getDayRangeAccess().getDsl_DayRange_fromINTTerminalRuleCall_0_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getDayRangeRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"dsl_DayRange_from",
                    		lv_dsl_DayRange_from_0_0, 
                    		"INT");
            	    

            }


            }

            otherlv_1=(Token)match(input,139,FOLLOW_139_in_ruleDayRange15797); 

                	newLeafNode(otherlv_1, grammarAccess.getDayRangeAccess().getThruKeyword_1());
                
            // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:6427:1: ( (lv_dsl_Range_To_2_0= RULE_INT ) )
            // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:6428:1: (lv_dsl_Range_To_2_0= RULE_INT )
            {
            // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:6428:1: (lv_dsl_Range_To_2_0= RULE_INT )
            // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:6429:3: lv_dsl_Range_To_2_0= RULE_INT
            {
            lv_dsl_Range_To_2_0=(Token)match(input,RULE_INT,FOLLOW_RULE_INT_in_ruleDayRange15814); 

            			newLeafNode(lv_dsl_Range_To_2_0, grammarAccess.getDayRangeAccess().getDsl_Range_ToINTTerminalRuleCall_2_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getDayRangeRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"dsl_Range_To",
                    		lv_dsl_Range_To_2_0, 
                    		"INT");
            	    

            }


            }


            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleDayRange"


    // $ANTLR start "entryRuleDaySet"
    // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:6453:1: entryRuleDaySet returns [EObject current=null] : iv_ruleDaySet= ruleDaySet EOF ;
    public final EObject entryRuleDaySet() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDaySet = null;


        try {
            // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:6454:2: (iv_ruleDaySet= ruleDaySet EOF )
            // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:6455:2: iv_ruleDaySet= ruleDaySet EOF
            {
             newCompositeNode(grammarAccess.getDaySetRule()); 
            pushFollow(FOLLOW_ruleDaySet_in_entryRuleDaySet15855);
            iv_ruleDaySet=ruleDaySet();

            state._fsp--;

             current =iv_ruleDaySet; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleDaySet15865); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleDaySet"


    // $ANTLR start "ruleDaySet"
    // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:6462:1: ruleDaySet returns [EObject current=null] : ( ( (lv_dslSetValue_Days_0_0= RULE_INT ) ) (otherlv_1= ',' ( (lv_dslSetValue_Days_2_0= RULE_INT ) ) )* ) ;
    public final EObject ruleDaySet() throws RecognitionException {
        EObject current = null;

        Token lv_dslSetValue_Days_0_0=null;
        Token otherlv_1=null;
        Token lv_dslSetValue_Days_2_0=null;

         enterRule(); 
            
        try {
            // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:6465:28: ( ( ( (lv_dslSetValue_Days_0_0= RULE_INT ) ) (otherlv_1= ',' ( (lv_dslSetValue_Days_2_0= RULE_INT ) ) )* ) )
            // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:6466:1: ( ( (lv_dslSetValue_Days_0_0= RULE_INT ) ) (otherlv_1= ',' ( (lv_dslSetValue_Days_2_0= RULE_INT ) ) )* )
            {
            // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:6466:1: ( ( (lv_dslSetValue_Days_0_0= RULE_INT ) ) (otherlv_1= ',' ( (lv_dslSetValue_Days_2_0= RULE_INT ) ) )* )
            // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:6466:2: ( (lv_dslSetValue_Days_0_0= RULE_INT ) ) (otherlv_1= ',' ( (lv_dslSetValue_Days_2_0= RULE_INT ) ) )*
            {
            // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:6466:2: ( (lv_dslSetValue_Days_0_0= RULE_INT ) )
            // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:6467:1: (lv_dslSetValue_Days_0_0= RULE_INT )
            {
            // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:6467:1: (lv_dslSetValue_Days_0_0= RULE_INT )
            // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:6468:3: lv_dslSetValue_Days_0_0= RULE_INT
            {
            lv_dslSetValue_Days_0_0=(Token)match(input,RULE_INT,FOLLOW_RULE_INT_in_ruleDaySet15907); 

            			newLeafNode(lv_dslSetValue_Days_0_0, grammarAccess.getDaySetAccess().getDslSetValue_DaysINTTerminalRuleCall_0_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getDaySetRule());
            	        }
                   		addWithLastConsumed(
                   			current, 
                   			"dslSetValue_Days",
                    		lv_dslSetValue_Days_0_0, 
                    		"INT");
            	    

            }


            }

            // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:6484:2: (otherlv_1= ',' ( (lv_dslSetValue_Days_2_0= RULE_INT ) ) )*
            loop87:
            do {
                int alt87=2;
                int LA87_0 = input.LA(1);

                if ( (LA87_0==140) ) {
                    alt87=1;
                }


                switch (alt87) {
            	case 1 :
            	    // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:6484:4: otherlv_1= ',' ( (lv_dslSetValue_Days_2_0= RULE_INT ) )
            	    {
            	    otherlv_1=(Token)match(input,140,FOLLOW_140_in_ruleDaySet15925); 

            	        	newLeafNode(otherlv_1, grammarAccess.getDaySetAccess().getCommaKeyword_1_0());
            	        
            	    // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:6488:1: ( (lv_dslSetValue_Days_2_0= RULE_INT ) )
            	    // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:6489:1: (lv_dslSetValue_Days_2_0= RULE_INT )
            	    {
            	    // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:6489:1: (lv_dslSetValue_Days_2_0= RULE_INT )
            	    // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:6490:3: lv_dslSetValue_Days_2_0= RULE_INT
            	    {
            	    lv_dslSetValue_Days_2_0=(Token)match(input,RULE_INT,FOLLOW_RULE_INT_in_ruleDaySet15942); 

            	    			newLeafNode(lv_dslSetValue_Days_2_0, grammarAccess.getDaySetAccess().getDslSetValue_DaysINTTerminalRuleCall_1_1_0()); 
            	    		

            	    	        if (current==null) {
            	    	            current = createModelElement(grammarAccess.getDaySetRule());
            	    	        }
            	           		addWithLastConsumed(
            	           			current, 
            	           			"dslSetValue_Days",
            	            		lv_dslSetValue_Days_2_0, 
            	            		"INT");
            	    	    

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop87;
                }
            } while (true);


            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleDaySet"


    // $ANTLR start "entryRuleWhenModeOfWeek"
    // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:6514:1: entryRuleWhenModeOfWeek returns [EObject current=null] : iv_ruleWhenModeOfWeek= ruleWhenModeOfWeek EOF ;
    public final EObject entryRuleWhenModeOfWeek() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleWhenModeOfWeek = null;


        try {
            // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:6515:2: (iv_ruleWhenModeOfWeek= ruleWhenModeOfWeek EOF )
            // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:6516:2: iv_ruleWhenModeOfWeek= ruleWhenModeOfWeek EOF
            {
             newCompositeNode(grammarAccess.getWhenModeOfWeekRule()); 
            pushFollow(FOLLOW_ruleWhenModeOfWeek_in_entryRuleWhenModeOfWeek15985);
            iv_ruleWhenModeOfWeek=ruleWhenModeOfWeek();

            state._fsp--;

             current =iv_ruleWhenModeOfWeek; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleWhenModeOfWeek15995); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleWhenModeOfWeek"


    // $ANTLR start "ruleWhenModeOfWeek"
    // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:6523:1: ruleWhenModeOfWeek returns [EObject current=null] : (otherlv_0= 'when-mode-of-week-is' ( (lv_dsl_WhenModeOfWeek_Cases_1_0= ruleWhenModeOfWeekCase ) )+ ( (lv_dsl_WhenModeOfWeek_Other_2_0= ruleWhenOther ) )? otherlv_3= 'end-when' ) ;
    public final EObject ruleWhenModeOfWeek() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_3=null;
        EObject lv_dsl_WhenModeOfWeek_Cases_1_0 = null;

        EObject lv_dsl_WhenModeOfWeek_Other_2_0 = null;


         enterRule(); 
            
        try {
            // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:6526:28: ( (otherlv_0= 'when-mode-of-week-is' ( (lv_dsl_WhenModeOfWeek_Cases_1_0= ruleWhenModeOfWeekCase ) )+ ( (lv_dsl_WhenModeOfWeek_Other_2_0= ruleWhenOther ) )? otherlv_3= 'end-when' ) )
            // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:6527:1: (otherlv_0= 'when-mode-of-week-is' ( (lv_dsl_WhenModeOfWeek_Cases_1_0= ruleWhenModeOfWeekCase ) )+ ( (lv_dsl_WhenModeOfWeek_Other_2_0= ruleWhenOther ) )? otherlv_3= 'end-when' )
            {
            // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:6527:1: (otherlv_0= 'when-mode-of-week-is' ( (lv_dsl_WhenModeOfWeek_Cases_1_0= ruleWhenModeOfWeekCase ) )+ ( (lv_dsl_WhenModeOfWeek_Other_2_0= ruleWhenOther ) )? otherlv_3= 'end-when' )
            // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:6527:3: otherlv_0= 'when-mode-of-week-is' ( (lv_dsl_WhenModeOfWeek_Cases_1_0= ruleWhenModeOfWeekCase ) )+ ( (lv_dsl_WhenModeOfWeek_Other_2_0= ruleWhenOther ) )? otherlv_3= 'end-when'
            {
            otherlv_0=(Token)match(input,149,FOLLOW_149_in_ruleWhenModeOfWeek16032); 

                	newLeafNode(otherlv_0, grammarAccess.getWhenModeOfWeekAccess().getWhenModeOfWeekIsKeyword_0());
                
            // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:6531:1: ( (lv_dsl_WhenModeOfWeek_Cases_1_0= ruleWhenModeOfWeekCase ) )+
            int cnt88=0;
            loop88:
            do {
                int alt88=2;
                int LA88_0 = input.LA(1);

                if ( ((LA88_0>=161 && LA88_0<=168)) ) {
                    alt88=1;
                }


                switch (alt88) {
            	case 1 :
            	    // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:6532:1: (lv_dsl_WhenModeOfWeek_Cases_1_0= ruleWhenModeOfWeekCase )
            	    {
            	    // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:6532:1: (lv_dsl_WhenModeOfWeek_Cases_1_0= ruleWhenModeOfWeekCase )
            	    // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:6533:3: lv_dsl_WhenModeOfWeek_Cases_1_0= ruleWhenModeOfWeekCase
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getWhenModeOfWeekAccess().getDsl_WhenModeOfWeek_CasesWhenModeOfWeekCaseParserRuleCall_1_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleWhenModeOfWeekCase_in_ruleWhenModeOfWeek16053);
            	    lv_dsl_WhenModeOfWeek_Cases_1_0=ruleWhenModeOfWeekCase();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getWhenModeOfWeekRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"dsl_WhenModeOfWeek_Cases",
            	            		lv_dsl_WhenModeOfWeek_Cases_1_0, 
            	            		"WhenModeOfWeekCase");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }
            	    break;

            	default :
            	    if ( cnt88 >= 1 ) break loop88;
                        EarlyExitException eee =
                            new EarlyExitException(88, input);
                        throw eee;
                }
                cnt88++;
            } while (true);

            // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:6549:3: ( (lv_dsl_WhenModeOfWeek_Other_2_0= ruleWhenOther ) )?
            int alt89=2;
            int LA89_0 = input.LA(1);

            if ( (LA89_0==148) ) {
                alt89=1;
            }
            switch (alt89) {
                case 1 :
                    // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:6550:1: (lv_dsl_WhenModeOfWeek_Other_2_0= ruleWhenOther )
                    {
                    // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:6550:1: (lv_dsl_WhenModeOfWeek_Other_2_0= ruleWhenOther )
                    // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:6551:3: lv_dsl_WhenModeOfWeek_Other_2_0= ruleWhenOther
                    {
                     
                    	        newCompositeNode(grammarAccess.getWhenModeOfWeekAccess().getDsl_WhenModeOfWeek_OtherWhenOtherParserRuleCall_2_0()); 
                    	    
                    pushFollow(FOLLOW_ruleWhenOther_in_ruleWhenModeOfWeek16075);
                    lv_dsl_WhenModeOfWeek_Other_2_0=ruleWhenOther();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getWhenModeOfWeekRule());
                    	        }
                           		set(
                           			current, 
                           			"dsl_WhenModeOfWeek_Other",
                            		lv_dsl_WhenModeOfWeek_Other_2_0, 
                            		"WhenOther");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }
                    break;

            }

            otherlv_3=(Token)match(input,137,FOLLOW_137_in_ruleWhenModeOfWeek16088); 

                	newLeafNode(otherlv_3, grammarAccess.getWhenModeOfWeekAccess().getEndWhenKeyword_3());
                

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleWhenModeOfWeek"


    // $ANTLR start "entryRuleWhenModeOfWeekCase"
    // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:6579:1: entryRuleWhenModeOfWeekCase returns [EObject current=null] : iv_ruleWhenModeOfWeekCase= ruleWhenModeOfWeekCase EOF ;
    public final EObject entryRuleWhenModeOfWeekCase() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleWhenModeOfWeekCase = null;


        try {
            // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:6580:2: (iv_ruleWhenModeOfWeekCase= ruleWhenModeOfWeekCase EOF )
            // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:6581:2: iv_ruleWhenModeOfWeekCase= ruleWhenModeOfWeekCase EOF
            {
             newCompositeNode(grammarAccess.getWhenModeOfWeekCaseRule()); 
            pushFollow(FOLLOW_ruleWhenModeOfWeekCase_in_entryRuleWhenModeOfWeekCase16124);
            iv_ruleWhenModeOfWeekCase=ruleWhenModeOfWeekCase();

            state._fsp--;

             current =iv_ruleWhenModeOfWeekCase; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleWhenModeOfWeekCase16134); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleWhenModeOfWeekCase"


    // $ANTLR start "ruleWhenModeOfWeekCase"
    // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:6588:1: ruleWhenModeOfWeekCase returns [EObject current=null] : ( ( (lv_dsl_WhenModeOfWeekCase_Days_0_0= ruleModeOfWeekSet ) ) otherlv_1= 'use:' ( (lv_dsl_WhenModeOfWeekCase_True_actions_2_0= ruleAbstractComponent ) )* ) ;
    public final EObject ruleWhenModeOfWeekCase() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        EObject lv_dsl_WhenModeOfWeekCase_Days_0_0 = null;

        EObject lv_dsl_WhenModeOfWeekCase_True_actions_2_0 = null;


         enterRule(); 
            
        try {
            // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:6591:28: ( ( ( (lv_dsl_WhenModeOfWeekCase_Days_0_0= ruleModeOfWeekSet ) ) otherlv_1= 'use:' ( (lv_dsl_WhenModeOfWeekCase_True_actions_2_0= ruleAbstractComponent ) )* ) )
            // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:6592:1: ( ( (lv_dsl_WhenModeOfWeekCase_Days_0_0= ruleModeOfWeekSet ) ) otherlv_1= 'use:' ( (lv_dsl_WhenModeOfWeekCase_True_actions_2_0= ruleAbstractComponent ) )* )
            {
            // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:6592:1: ( ( (lv_dsl_WhenModeOfWeekCase_Days_0_0= ruleModeOfWeekSet ) ) otherlv_1= 'use:' ( (lv_dsl_WhenModeOfWeekCase_True_actions_2_0= ruleAbstractComponent ) )* )
            // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:6592:2: ( (lv_dsl_WhenModeOfWeekCase_Days_0_0= ruleModeOfWeekSet ) ) otherlv_1= 'use:' ( (lv_dsl_WhenModeOfWeekCase_True_actions_2_0= ruleAbstractComponent ) )*
            {
            // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:6592:2: ( (lv_dsl_WhenModeOfWeekCase_Days_0_0= ruleModeOfWeekSet ) )
            // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:6593:1: (lv_dsl_WhenModeOfWeekCase_Days_0_0= ruleModeOfWeekSet )
            {
            // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:6593:1: (lv_dsl_WhenModeOfWeekCase_Days_0_0= ruleModeOfWeekSet )
            // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:6594:3: lv_dsl_WhenModeOfWeekCase_Days_0_0= ruleModeOfWeekSet
            {
             
            	        newCompositeNode(grammarAccess.getWhenModeOfWeekCaseAccess().getDsl_WhenModeOfWeekCase_DaysModeOfWeekSetParserRuleCall_0_0()); 
            	    
            pushFollow(FOLLOW_ruleModeOfWeekSet_in_ruleWhenModeOfWeekCase16180);
            lv_dsl_WhenModeOfWeekCase_Days_0_0=ruleModeOfWeekSet();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getWhenModeOfWeekCaseRule());
            	        }
                   		set(
                   			current, 
                   			"dsl_WhenModeOfWeekCase_Days",
                    		lv_dsl_WhenModeOfWeekCase_Days_0_0, 
                    		"ModeOfWeekSet");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            otherlv_1=(Token)match(input,138,FOLLOW_138_in_ruleWhenModeOfWeekCase16192); 

                	newLeafNode(otherlv_1, grammarAccess.getWhenModeOfWeekCaseAccess().getUseKeyword_1());
                
            // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:6614:1: ( (lv_dsl_WhenModeOfWeekCase_True_actions_2_0= ruleAbstractComponent ) )*
            loop90:
            do {
                int alt90=2;
                int LA90_0 = input.LA(1);

                if ( (LA90_0==47||LA90_0==59||LA90_0==70||LA90_0==90||(LA90_0>=92 && LA90_0<=93)||LA90_0==97||LA90_0==100||LA90_0==102||LA90_0==104||LA90_0==106||LA90_0==108||LA90_0==110||LA90_0==112||LA90_0==114||LA90_0==116||LA90_0==118||LA90_0==120||LA90_0==122||LA90_0==124||LA90_0==126||(LA90_0>=128 && LA90_0<=131)||(LA90_0>=135 && LA90_0<=136)||(LA90_0>=141 && LA90_0<=147)||(LA90_0>=149 && LA90_0<=151)) ) {
                    alt90=1;
                }


                switch (alt90) {
            	case 1 :
            	    // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:6615:1: (lv_dsl_WhenModeOfWeekCase_True_actions_2_0= ruleAbstractComponent )
            	    {
            	    // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:6615:1: (lv_dsl_WhenModeOfWeekCase_True_actions_2_0= ruleAbstractComponent )
            	    // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:6616:3: lv_dsl_WhenModeOfWeekCase_True_actions_2_0= ruleAbstractComponent
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getWhenModeOfWeekCaseAccess().getDsl_WhenModeOfWeekCase_True_actionsAbstractComponentParserRuleCall_2_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleAbstractComponent_in_ruleWhenModeOfWeekCase16213);
            	    lv_dsl_WhenModeOfWeekCase_True_actions_2_0=ruleAbstractComponent();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getWhenModeOfWeekCaseRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"dsl_WhenModeOfWeekCase_True_actions",
            	            		lv_dsl_WhenModeOfWeekCase_True_actions_2_0, 
            	            		"AbstractComponent");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }
            	    break;

            	default :
            	    break loop90;
                }
            } while (true);


            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleWhenModeOfWeekCase"


    // $ANTLR start "entryRuleModeOfWeekSet"
    // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:6640:1: entryRuleModeOfWeekSet returns [EObject current=null] : iv_ruleModeOfWeekSet= ruleModeOfWeekSet EOF ;
    public final EObject entryRuleModeOfWeekSet() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleModeOfWeekSet = null;


        try {
            // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:6641:2: (iv_ruleModeOfWeekSet= ruleModeOfWeekSet EOF )
            // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:6642:2: iv_ruleModeOfWeekSet= ruleModeOfWeekSet EOF
            {
             newCompositeNode(grammarAccess.getModeOfWeekSetRule()); 
            pushFollow(FOLLOW_ruleModeOfWeekSet_in_entryRuleModeOfWeekSet16250);
            iv_ruleModeOfWeekSet=ruleModeOfWeekSet();

            state._fsp--;

             current =iv_ruleModeOfWeekSet; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleModeOfWeekSet16260); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleModeOfWeekSet"


    // $ANTLR start "ruleModeOfWeekSet"
    // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:6649:1: ruleModeOfWeekSet returns [EObject current=null] : ( ( (lv_dsl_ModeOfWeekSet_MOWs_0_0= ruleModeTypes ) ) (otherlv_1= ',' ( (lv_dsl_ModeOfWeekSet_MOWs_2_0= ruleModeTypes ) ) )* ) ;
    public final EObject ruleModeOfWeekSet() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Enumerator lv_dsl_ModeOfWeekSet_MOWs_0_0 = null;

        Enumerator lv_dsl_ModeOfWeekSet_MOWs_2_0 = null;


         enterRule(); 
            
        try {
            // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:6652:28: ( ( ( (lv_dsl_ModeOfWeekSet_MOWs_0_0= ruleModeTypes ) ) (otherlv_1= ',' ( (lv_dsl_ModeOfWeekSet_MOWs_2_0= ruleModeTypes ) ) )* ) )
            // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:6653:1: ( ( (lv_dsl_ModeOfWeekSet_MOWs_0_0= ruleModeTypes ) ) (otherlv_1= ',' ( (lv_dsl_ModeOfWeekSet_MOWs_2_0= ruleModeTypes ) ) )* )
            {
            // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:6653:1: ( ( (lv_dsl_ModeOfWeekSet_MOWs_0_0= ruleModeTypes ) ) (otherlv_1= ',' ( (lv_dsl_ModeOfWeekSet_MOWs_2_0= ruleModeTypes ) ) )* )
            // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:6653:2: ( (lv_dsl_ModeOfWeekSet_MOWs_0_0= ruleModeTypes ) ) (otherlv_1= ',' ( (lv_dsl_ModeOfWeekSet_MOWs_2_0= ruleModeTypes ) ) )*
            {
            // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:6653:2: ( (lv_dsl_ModeOfWeekSet_MOWs_0_0= ruleModeTypes ) )
            // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:6654:1: (lv_dsl_ModeOfWeekSet_MOWs_0_0= ruleModeTypes )
            {
            // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:6654:1: (lv_dsl_ModeOfWeekSet_MOWs_0_0= ruleModeTypes )
            // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:6655:3: lv_dsl_ModeOfWeekSet_MOWs_0_0= ruleModeTypes
            {
             
            	        newCompositeNode(grammarAccess.getModeOfWeekSetAccess().getDsl_ModeOfWeekSet_MOWsModeTypesEnumRuleCall_0_0()); 
            	    
            pushFollow(FOLLOW_ruleModeTypes_in_ruleModeOfWeekSet16306);
            lv_dsl_ModeOfWeekSet_MOWs_0_0=ruleModeTypes();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getModeOfWeekSetRule());
            	        }
                   		add(
                   			current, 
                   			"dsl_ModeOfWeekSet_MOWs",
                    		lv_dsl_ModeOfWeekSet_MOWs_0_0, 
                    		"ModeTypes");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:6671:2: (otherlv_1= ',' ( (lv_dsl_ModeOfWeekSet_MOWs_2_0= ruleModeTypes ) ) )*
            loop91:
            do {
                int alt91=2;
                int LA91_0 = input.LA(1);

                if ( (LA91_0==140) ) {
                    alt91=1;
                }


                switch (alt91) {
            	case 1 :
            	    // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:6671:4: otherlv_1= ',' ( (lv_dsl_ModeOfWeekSet_MOWs_2_0= ruleModeTypes ) )
            	    {
            	    otherlv_1=(Token)match(input,140,FOLLOW_140_in_ruleModeOfWeekSet16319); 

            	        	newLeafNode(otherlv_1, grammarAccess.getModeOfWeekSetAccess().getCommaKeyword_1_0());
            	        
            	    // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:6675:1: ( (lv_dsl_ModeOfWeekSet_MOWs_2_0= ruleModeTypes ) )
            	    // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:6676:1: (lv_dsl_ModeOfWeekSet_MOWs_2_0= ruleModeTypes )
            	    {
            	    // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:6676:1: (lv_dsl_ModeOfWeekSet_MOWs_2_0= ruleModeTypes )
            	    // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:6677:3: lv_dsl_ModeOfWeekSet_MOWs_2_0= ruleModeTypes
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getModeOfWeekSetAccess().getDsl_ModeOfWeekSet_MOWsModeTypesEnumRuleCall_1_1_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleModeTypes_in_ruleModeOfWeekSet16340);
            	    lv_dsl_ModeOfWeekSet_MOWs_2_0=ruleModeTypes();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getModeOfWeekSetRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"dsl_ModeOfWeekSet_MOWs",
            	            		lv_dsl_ModeOfWeekSet_MOWs_2_0, 
            	            		"ModeTypes");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop91;
                }
            } while (true);


            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleModeOfWeekSet"


    // $ANTLR start "entryRuleWhenSundaysBeforeTriodion"
    // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:6701:1: entryRuleWhenSundaysBeforeTriodion returns [EObject current=null] : iv_ruleWhenSundaysBeforeTriodion= ruleWhenSundaysBeforeTriodion EOF ;
    public final EObject entryRuleWhenSundaysBeforeTriodion() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleWhenSundaysBeforeTriodion = null;


        try {
            // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:6702:2: (iv_ruleWhenSundaysBeforeTriodion= ruleWhenSundaysBeforeTriodion EOF )
            // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:6703:2: iv_ruleWhenSundaysBeforeTriodion= ruleWhenSundaysBeforeTriodion EOF
            {
             newCompositeNode(grammarAccess.getWhenSundaysBeforeTriodionRule()); 
            pushFollow(FOLLOW_ruleWhenSundaysBeforeTriodion_in_entryRuleWhenSundaysBeforeTriodion16378);
            iv_ruleWhenSundaysBeforeTriodion=ruleWhenSundaysBeforeTriodion();

            state._fsp--;

             current =iv_ruleWhenSundaysBeforeTriodion; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleWhenSundaysBeforeTriodion16388); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleWhenSundaysBeforeTriodion"


    // $ANTLR start "ruleWhenSundaysBeforeTriodion"
    // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:6710:1: ruleWhenSundaysBeforeTriodion returns [EObject current=null] : (otherlv_0= 'when-sundays-before-triodion-is' ( (lv_dsl_WhenSundaysBeforeTriodion_Cases_1_0= ruleSundaysBeforeTriodionCase ) )+ ( (lv_dsl_SundaysBeforeTriodion_Other_2_0= ruleWhenOther ) )? otherlv_3= 'end-when' ) ;
    public final EObject ruleWhenSundaysBeforeTriodion() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_3=null;
        EObject lv_dsl_WhenSundaysBeforeTriodion_Cases_1_0 = null;

        EObject lv_dsl_SundaysBeforeTriodion_Other_2_0 = null;


         enterRule(); 
            
        try {
            // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:6713:28: ( (otherlv_0= 'when-sundays-before-triodion-is' ( (lv_dsl_WhenSundaysBeforeTriodion_Cases_1_0= ruleSundaysBeforeTriodionCase ) )+ ( (lv_dsl_SundaysBeforeTriodion_Other_2_0= ruleWhenOther ) )? otherlv_3= 'end-when' ) )
            // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:6714:1: (otherlv_0= 'when-sundays-before-triodion-is' ( (lv_dsl_WhenSundaysBeforeTriodion_Cases_1_0= ruleSundaysBeforeTriodionCase ) )+ ( (lv_dsl_SundaysBeforeTriodion_Other_2_0= ruleWhenOther ) )? otherlv_3= 'end-when' )
            {
            // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:6714:1: (otherlv_0= 'when-sundays-before-triodion-is' ( (lv_dsl_WhenSundaysBeforeTriodion_Cases_1_0= ruleSundaysBeforeTriodionCase ) )+ ( (lv_dsl_SundaysBeforeTriodion_Other_2_0= ruleWhenOther ) )? otherlv_3= 'end-when' )
            // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:6714:3: otherlv_0= 'when-sundays-before-triodion-is' ( (lv_dsl_WhenSundaysBeforeTriodion_Cases_1_0= ruleSundaysBeforeTriodionCase ) )+ ( (lv_dsl_SundaysBeforeTriodion_Other_2_0= ruleWhenOther ) )? otherlv_3= 'end-when'
            {
            otherlv_0=(Token)match(input,150,FOLLOW_150_in_ruleWhenSundaysBeforeTriodion16425); 

                	newLeafNode(otherlv_0, grammarAccess.getWhenSundaysBeforeTriodionAccess().getWhenSundaysBeforeTriodionIsKeyword_0());
                
            // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:6718:1: ( (lv_dsl_WhenSundaysBeforeTriodion_Cases_1_0= ruleSundaysBeforeTriodionCase ) )+
            int cnt92=0;
            loop92:
            do {
                int alt92=2;
                int LA92_0 = input.LA(1);

                if ( (LA92_0==RULE_INT) ) {
                    alt92=1;
                }


                switch (alt92) {
            	case 1 :
            	    // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:6719:1: (lv_dsl_WhenSundaysBeforeTriodion_Cases_1_0= ruleSundaysBeforeTriodionCase )
            	    {
            	    // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:6719:1: (lv_dsl_WhenSundaysBeforeTriodion_Cases_1_0= ruleSundaysBeforeTriodionCase )
            	    // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:6720:3: lv_dsl_WhenSundaysBeforeTriodion_Cases_1_0= ruleSundaysBeforeTriodionCase
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getWhenSundaysBeforeTriodionAccess().getDsl_WhenSundaysBeforeTriodion_CasesSundaysBeforeTriodionCaseParserRuleCall_1_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleSundaysBeforeTriodionCase_in_ruleWhenSundaysBeforeTriodion16446);
            	    lv_dsl_WhenSundaysBeforeTriodion_Cases_1_0=ruleSundaysBeforeTriodionCase();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getWhenSundaysBeforeTriodionRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"dsl_WhenSundaysBeforeTriodion_Cases",
            	            		lv_dsl_WhenSundaysBeforeTriodion_Cases_1_0, 
            	            		"SundaysBeforeTriodionCase");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }
            	    break;

            	default :
            	    if ( cnt92 >= 1 ) break loop92;
                        EarlyExitException eee =
                            new EarlyExitException(92, input);
                        throw eee;
                }
                cnt92++;
            } while (true);

            // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:6736:3: ( (lv_dsl_SundaysBeforeTriodion_Other_2_0= ruleWhenOther ) )?
            int alt93=2;
            int LA93_0 = input.LA(1);

            if ( (LA93_0==148) ) {
                alt93=1;
            }
            switch (alt93) {
                case 1 :
                    // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:6737:1: (lv_dsl_SundaysBeforeTriodion_Other_2_0= ruleWhenOther )
                    {
                    // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:6737:1: (lv_dsl_SundaysBeforeTriodion_Other_2_0= ruleWhenOther )
                    // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:6738:3: lv_dsl_SundaysBeforeTriodion_Other_2_0= ruleWhenOther
                    {
                     
                    	        newCompositeNode(grammarAccess.getWhenSundaysBeforeTriodionAccess().getDsl_SundaysBeforeTriodion_OtherWhenOtherParserRuleCall_2_0()); 
                    	    
                    pushFollow(FOLLOW_ruleWhenOther_in_ruleWhenSundaysBeforeTriodion16468);
                    lv_dsl_SundaysBeforeTriodion_Other_2_0=ruleWhenOther();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getWhenSundaysBeforeTriodionRule());
                    	        }
                           		set(
                           			current, 
                           			"dsl_SundaysBeforeTriodion_Other",
                            		lv_dsl_SundaysBeforeTriodion_Other_2_0, 
                            		"WhenOther");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }
                    break;

            }

            otherlv_3=(Token)match(input,137,FOLLOW_137_in_ruleWhenSundaysBeforeTriodion16481); 

                	newLeafNode(otherlv_3, grammarAccess.getWhenSundaysBeforeTriodionAccess().getEndWhenKeyword_3());
                

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleWhenSundaysBeforeTriodion"


    // $ANTLR start "entryRuleSundaysBeforeTriodionCase"
    // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:6766:1: entryRuleSundaysBeforeTriodionCase returns [EObject current=null] : iv_ruleSundaysBeforeTriodionCase= ruleSundaysBeforeTriodionCase EOF ;
    public final EObject entryRuleSundaysBeforeTriodionCase() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSundaysBeforeTriodionCase = null;


        try {
            // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:6767:2: (iv_ruleSundaysBeforeTriodionCase= ruleSundaysBeforeTriodionCase EOF )
            // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:6768:2: iv_ruleSundaysBeforeTriodionCase= ruleSundaysBeforeTriodionCase EOF
            {
             newCompositeNode(grammarAccess.getSundaysBeforeTriodionCaseRule()); 
            pushFollow(FOLLOW_ruleSundaysBeforeTriodionCase_in_entryRuleSundaysBeforeTriodionCase16517);
            iv_ruleSundaysBeforeTriodionCase=ruleSundaysBeforeTriodionCase();

            state._fsp--;

             current =iv_ruleSundaysBeforeTriodionCase; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleSundaysBeforeTriodionCase16527); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleSundaysBeforeTriodionCase"


    // $ANTLR start "ruleSundaysBeforeTriodionCase"
    // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:6775:1: ruleSundaysBeforeTriodionCase returns [EObject current=null] : ( ( (lv_dsl_SundaysBeforeTriodionCase_Days_0_0= RULE_INT ) ) otherlv_1= 'use:' ( (lv_dsl_SundaysBeforeTriodionCase_True_actions_2_0= ruleAbstractComponent ) )* ) ;
    public final EObject ruleSundaysBeforeTriodionCase() throws RecognitionException {
        EObject current = null;

        Token lv_dsl_SundaysBeforeTriodionCase_Days_0_0=null;
        Token otherlv_1=null;
        EObject lv_dsl_SundaysBeforeTriodionCase_True_actions_2_0 = null;


         enterRule(); 
            
        try {
            // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:6778:28: ( ( ( (lv_dsl_SundaysBeforeTriodionCase_Days_0_0= RULE_INT ) ) otherlv_1= 'use:' ( (lv_dsl_SundaysBeforeTriodionCase_True_actions_2_0= ruleAbstractComponent ) )* ) )
            // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:6779:1: ( ( (lv_dsl_SundaysBeforeTriodionCase_Days_0_0= RULE_INT ) ) otherlv_1= 'use:' ( (lv_dsl_SundaysBeforeTriodionCase_True_actions_2_0= ruleAbstractComponent ) )* )
            {
            // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:6779:1: ( ( (lv_dsl_SundaysBeforeTriodionCase_Days_0_0= RULE_INT ) ) otherlv_1= 'use:' ( (lv_dsl_SundaysBeforeTriodionCase_True_actions_2_0= ruleAbstractComponent ) )* )
            // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:6779:2: ( (lv_dsl_SundaysBeforeTriodionCase_Days_0_0= RULE_INT ) ) otherlv_1= 'use:' ( (lv_dsl_SundaysBeforeTriodionCase_True_actions_2_0= ruleAbstractComponent ) )*
            {
            // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:6779:2: ( (lv_dsl_SundaysBeforeTriodionCase_Days_0_0= RULE_INT ) )
            // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:6780:1: (lv_dsl_SundaysBeforeTriodionCase_Days_0_0= RULE_INT )
            {
            // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:6780:1: (lv_dsl_SundaysBeforeTriodionCase_Days_0_0= RULE_INT )
            // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:6781:3: lv_dsl_SundaysBeforeTriodionCase_Days_0_0= RULE_INT
            {
            lv_dsl_SundaysBeforeTriodionCase_Days_0_0=(Token)match(input,RULE_INT,FOLLOW_RULE_INT_in_ruleSundaysBeforeTriodionCase16569); 

            			newLeafNode(lv_dsl_SundaysBeforeTriodionCase_Days_0_0, grammarAccess.getSundaysBeforeTriodionCaseAccess().getDsl_SundaysBeforeTriodionCase_DaysINTTerminalRuleCall_0_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getSundaysBeforeTriodionCaseRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"dsl_SundaysBeforeTriodionCase_Days",
                    		lv_dsl_SundaysBeforeTriodionCase_Days_0_0, 
                    		"INT");
            	    

            }


            }

            otherlv_1=(Token)match(input,138,FOLLOW_138_in_ruleSundaysBeforeTriodionCase16586); 

                	newLeafNode(otherlv_1, grammarAccess.getSundaysBeforeTriodionCaseAccess().getUseKeyword_1());
                
            // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:6801:1: ( (lv_dsl_SundaysBeforeTriodionCase_True_actions_2_0= ruleAbstractComponent ) )*
            loop94:
            do {
                int alt94=2;
                int LA94_0 = input.LA(1);

                if ( (LA94_0==47||LA94_0==59||LA94_0==70||LA94_0==90||(LA94_0>=92 && LA94_0<=93)||LA94_0==97||LA94_0==100||LA94_0==102||LA94_0==104||LA94_0==106||LA94_0==108||LA94_0==110||LA94_0==112||LA94_0==114||LA94_0==116||LA94_0==118||LA94_0==120||LA94_0==122||LA94_0==124||LA94_0==126||(LA94_0>=128 && LA94_0<=131)||(LA94_0>=135 && LA94_0<=136)||(LA94_0>=141 && LA94_0<=147)||(LA94_0>=149 && LA94_0<=151)) ) {
                    alt94=1;
                }


                switch (alt94) {
            	case 1 :
            	    // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:6802:1: (lv_dsl_SundaysBeforeTriodionCase_True_actions_2_0= ruleAbstractComponent )
            	    {
            	    // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:6802:1: (lv_dsl_SundaysBeforeTriodionCase_True_actions_2_0= ruleAbstractComponent )
            	    // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:6803:3: lv_dsl_SundaysBeforeTriodionCase_True_actions_2_0= ruleAbstractComponent
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getSundaysBeforeTriodionCaseAccess().getDsl_SundaysBeforeTriodionCase_True_actionsAbstractComponentParserRuleCall_2_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleAbstractComponent_in_ruleSundaysBeforeTriodionCase16607);
            	    lv_dsl_SundaysBeforeTriodionCase_True_actions_2_0=ruleAbstractComponent();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getSundaysBeforeTriodionCaseRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"dsl_SundaysBeforeTriodionCase_True_actions",
            	            		lv_dsl_SundaysBeforeTriodionCase_True_actions_2_0, 
            	            		"AbstractComponent");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }
            	    break;

            	default :
            	    break loop94;
                }
            } while (true);


            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleSundaysBeforeTriodionCase"


    // $ANTLR start "entryRuleWhenExists"
    // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:6827:1: entryRuleWhenExists returns [EObject current=null] : iv_ruleWhenExists= ruleWhenExists EOF ;
    public final EObject entryRuleWhenExists() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleWhenExists = null;


        try {
            // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:6828:2: (iv_ruleWhenExists= ruleWhenExists EOF )
            // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:6829:2: iv_ruleWhenExists= ruleWhenExists EOF
            {
             newCompositeNode(grammarAccess.getWhenExistsRule()); 
            pushFollow(FOLLOW_ruleWhenExists_in_entryRuleWhenExists16644);
            iv_ruleWhenExists=ruleWhenExists();

            state._fsp--;

             current =iv_ruleWhenExists; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleWhenExists16654); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleWhenExists"


    // $ANTLR start "ruleWhenExists"
    // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:6836:1: ruleWhenExists returns [EObject current=null] : (otherlv_0= 'when-exists' ( (lv_dsl_WhenExists_Cases_1_0= ruleWhenExistsCase ) )+ ( (lv_dsl_WhenExists_Other_2_0= ruleWhenOther ) )? otherlv_3= 'end-when' ) ;
    public final EObject ruleWhenExists() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_3=null;
        EObject lv_dsl_WhenExists_Cases_1_0 = null;

        EObject lv_dsl_WhenExists_Other_2_0 = null;


         enterRule(); 
            
        try {
            // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:6839:28: ( (otherlv_0= 'when-exists' ( (lv_dsl_WhenExists_Cases_1_0= ruleWhenExistsCase ) )+ ( (lv_dsl_WhenExists_Other_2_0= ruleWhenOther ) )? otherlv_3= 'end-when' ) )
            // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:6840:1: (otherlv_0= 'when-exists' ( (lv_dsl_WhenExists_Cases_1_0= ruleWhenExistsCase ) )+ ( (lv_dsl_WhenExists_Other_2_0= ruleWhenOther ) )? otherlv_3= 'end-when' )
            {
            // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:6840:1: (otherlv_0= 'when-exists' ( (lv_dsl_WhenExists_Cases_1_0= ruleWhenExistsCase ) )+ ( (lv_dsl_WhenExists_Other_2_0= ruleWhenOther ) )? otherlv_3= 'end-when' )
            // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:6840:3: otherlv_0= 'when-exists' ( (lv_dsl_WhenExists_Cases_1_0= ruleWhenExistsCase ) )+ ( (lv_dsl_WhenExists_Other_2_0= ruleWhenOther ) )? otherlv_3= 'end-when'
            {
            otherlv_0=(Token)match(input,151,FOLLOW_151_in_ruleWhenExists16691); 

                	newLeafNode(otherlv_0, grammarAccess.getWhenExistsAccess().getWhenExistsKeyword_0());
                
            // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:6844:1: ( (lv_dsl_WhenExists_Cases_1_0= ruleWhenExistsCase ) )+
            int cnt95=0;
            loop95:
            do {
                int alt95=2;
                int LA95_0 = input.LA(1);

                if ( (LA95_0==52) ) {
                    alt95=1;
                }


                switch (alt95) {
            	case 1 :
            	    // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:6845:1: (lv_dsl_WhenExists_Cases_1_0= ruleWhenExistsCase )
            	    {
            	    // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:6845:1: (lv_dsl_WhenExists_Cases_1_0= ruleWhenExistsCase )
            	    // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:6846:3: lv_dsl_WhenExists_Cases_1_0= ruleWhenExistsCase
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getWhenExistsAccess().getDsl_WhenExists_CasesWhenExistsCaseParserRuleCall_1_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleWhenExistsCase_in_ruleWhenExists16712);
            	    lv_dsl_WhenExists_Cases_1_0=ruleWhenExistsCase();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getWhenExistsRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"dsl_WhenExists_Cases",
            	            		lv_dsl_WhenExists_Cases_1_0, 
            	            		"WhenExistsCase");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }
            	    break;

            	default :
            	    if ( cnt95 >= 1 ) break loop95;
                        EarlyExitException eee =
                            new EarlyExitException(95, input);
                        throw eee;
                }
                cnt95++;
            } while (true);

            // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:6862:3: ( (lv_dsl_WhenExists_Other_2_0= ruleWhenOther ) )?
            int alt96=2;
            int LA96_0 = input.LA(1);

            if ( (LA96_0==148) ) {
                alt96=1;
            }
            switch (alt96) {
                case 1 :
                    // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:6863:1: (lv_dsl_WhenExists_Other_2_0= ruleWhenOther )
                    {
                    // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:6863:1: (lv_dsl_WhenExists_Other_2_0= ruleWhenOther )
                    // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:6864:3: lv_dsl_WhenExists_Other_2_0= ruleWhenOther
                    {
                     
                    	        newCompositeNode(grammarAccess.getWhenExistsAccess().getDsl_WhenExists_OtherWhenOtherParserRuleCall_2_0()); 
                    	    
                    pushFollow(FOLLOW_ruleWhenOther_in_ruleWhenExists16734);
                    lv_dsl_WhenExists_Other_2_0=ruleWhenOther();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getWhenExistsRule());
                    	        }
                           		set(
                           			current, 
                           			"dsl_WhenExists_Other",
                            		lv_dsl_WhenExists_Other_2_0, 
                            		"WhenOther");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }
                    break;

            }

            otherlv_3=(Token)match(input,137,FOLLOW_137_in_ruleWhenExists16747); 

                	newLeafNode(otherlv_3, grammarAccess.getWhenExistsAccess().getEndWhenKeyword_3());
                

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleWhenExists"


    // $ANTLR start "entryRuleWhenExistsCase"
    // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:6892:1: entryRuleWhenExistsCase returns [EObject current=null] : iv_ruleWhenExistsCase= ruleWhenExistsCase EOF ;
    public final EObject entryRuleWhenExistsCase() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleWhenExistsCase = null;


        try {
            // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:6893:2: (iv_ruleWhenExistsCase= ruleWhenExistsCase EOF )
            // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:6894:2: iv_ruleWhenExistsCase= ruleWhenExistsCase EOF
            {
             newCompositeNode(grammarAccess.getWhenExistsCaseRule()); 
            pushFollow(FOLLOW_ruleWhenExistsCase_in_entryRuleWhenExistsCase16783);
            iv_ruleWhenExistsCase=ruleWhenExistsCase();

            state._fsp--;

             current =iv_ruleWhenExistsCase; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleWhenExistsCase16793); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleWhenExistsCase"


    // $ANTLR start "ruleWhenExistsCase"
    // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:6901:1: ruleWhenExistsCase returns [EObject current=null] : (otherlv_0= 'rid' ( ( ruleQualifiedName ) ) otherlv_2= 'use:' ( (lv_dsl_WhenExistsCase_True_actions_3_0= ruleAbstractComponent ) )* ) ;
    public final EObject ruleWhenExistsCase() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        EObject lv_dsl_WhenExistsCase_True_actions_3_0 = null;


         enterRule(); 
            
        try {
            // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:6904:28: ( (otherlv_0= 'rid' ( ( ruleQualifiedName ) ) otherlv_2= 'use:' ( (lv_dsl_WhenExistsCase_True_actions_3_0= ruleAbstractComponent ) )* ) )
            // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:6905:1: (otherlv_0= 'rid' ( ( ruleQualifiedName ) ) otherlv_2= 'use:' ( (lv_dsl_WhenExistsCase_True_actions_3_0= ruleAbstractComponent ) )* )
            {
            // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:6905:1: (otherlv_0= 'rid' ( ( ruleQualifiedName ) ) otherlv_2= 'use:' ( (lv_dsl_WhenExistsCase_True_actions_3_0= ruleAbstractComponent ) )* )
            // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:6905:3: otherlv_0= 'rid' ( ( ruleQualifiedName ) ) otherlv_2= 'use:' ( (lv_dsl_WhenExistsCase_True_actions_3_0= ruleAbstractComponent ) )*
            {
            otherlv_0=(Token)match(input,52,FOLLOW_52_in_ruleWhenExistsCase16830); 

                	newLeafNode(otherlv_0, grammarAccess.getWhenExistsCaseAccess().getRidKeyword_0());
                
            // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:6909:1: ( ( ruleQualifiedName ) )
            // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:6910:1: ( ruleQualifiedName )
            {
            // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:6910:1: ( ruleQualifiedName )
            // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:6911:3: ruleQualifiedName
            {

            			if (current==null) {
            	            current = createModelElement(grammarAccess.getWhenExistsCaseRule());
            	        }
                    
             
            	        newCompositeNode(grammarAccess.getWhenExistsCaseAccess().getDsl_WhenExistsCase_RefDefinitionCrossReference_1_0()); 
            	    
            pushFollow(FOLLOW_ruleQualifiedName_in_ruleWhenExistsCase16853);
            ruleQualifiedName();

            state._fsp--;

             
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            otherlv_2=(Token)match(input,138,FOLLOW_138_in_ruleWhenExistsCase16865); 

                	newLeafNode(otherlv_2, grammarAccess.getWhenExistsCaseAccess().getUseKeyword_2());
                
            // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:6928:1: ( (lv_dsl_WhenExistsCase_True_actions_3_0= ruleAbstractComponent ) )*
            loop97:
            do {
                int alt97=2;
                int LA97_0 = input.LA(1);

                if ( (LA97_0==47||LA97_0==59||LA97_0==70||LA97_0==90||(LA97_0>=92 && LA97_0<=93)||LA97_0==97||LA97_0==100||LA97_0==102||LA97_0==104||LA97_0==106||LA97_0==108||LA97_0==110||LA97_0==112||LA97_0==114||LA97_0==116||LA97_0==118||LA97_0==120||LA97_0==122||LA97_0==124||LA97_0==126||(LA97_0>=128 && LA97_0<=131)||(LA97_0>=135 && LA97_0<=136)||(LA97_0>=141 && LA97_0<=147)||(LA97_0>=149 && LA97_0<=151)) ) {
                    alt97=1;
                }


                switch (alt97) {
            	case 1 :
            	    // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:6929:1: (lv_dsl_WhenExistsCase_True_actions_3_0= ruleAbstractComponent )
            	    {
            	    // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:6929:1: (lv_dsl_WhenExistsCase_True_actions_3_0= ruleAbstractComponent )
            	    // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:6930:3: lv_dsl_WhenExistsCase_True_actions_3_0= ruleAbstractComponent
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getWhenExistsCaseAccess().getDsl_WhenExistsCase_True_actionsAbstractComponentParserRuleCall_3_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleAbstractComponent_in_ruleWhenExistsCase16886);
            	    lv_dsl_WhenExistsCase_True_actions_3_0=ruleAbstractComponent();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getWhenExistsCaseRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"dsl_WhenExistsCase_True_actions",
            	            		lv_dsl_WhenExistsCase_True_actions_3_0, 
            	            		"AbstractComponent");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }
            	    break;

            	default :
            	    break loop97;
                }
            } while (true);


            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleWhenExistsCase"


    // $ANTLR start "ruleVersionSwitchType"
    // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:6954:1: ruleVersionSwitchType returns [Enumerator current=null] : ( (enumLiteral_0= 'L1' ) | (enumLiteral_1= 'L2' ) | (enumLiteral_2= 'Both' ) ) ;
    public final Enumerator ruleVersionSwitchType() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;
        Token enumLiteral_2=null;

         enterRule(); 
        try {
            // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:6956:28: ( ( (enumLiteral_0= 'L1' ) | (enumLiteral_1= 'L2' ) | (enumLiteral_2= 'Both' ) ) )
            // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:6957:1: ( (enumLiteral_0= 'L1' ) | (enumLiteral_1= 'L2' ) | (enumLiteral_2= 'Both' ) )
            {
            // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:6957:1: ( (enumLiteral_0= 'L1' ) | (enumLiteral_1= 'L2' ) | (enumLiteral_2= 'Both' ) )
            int alt98=3;
            switch ( input.LA(1) ) {
            case 152:
                {
                alt98=1;
                }
                break;
            case 153:
                {
                alt98=2;
                }
                break;
            case 154:
                {
                alt98=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 98, 0, input);

                throw nvae;
            }

            switch (alt98) {
                case 1 :
                    // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:6957:2: (enumLiteral_0= 'L1' )
                    {
                    // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:6957:2: (enumLiteral_0= 'L1' )
                    // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:6957:4: enumLiteral_0= 'L1'
                    {
                    enumLiteral_0=(Token)match(input,152,FOLLOW_152_in_ruleVersionSwitchType16937); 

                            current = grammarAccess.getVersionSwitchTypeAccess().getL1EnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_0, grammarAccess.getVersionSwitchTypeAccess().getL1EnumLiteralDeclaration_0()); 
                        

                    }


                    }
                    break;
                case 2 :
                    // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:6963:6: (enumLiteral_1= 'L2' )
                    {
                    // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:6963:6: (enumLiteral_1= 'L2' )
                    // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:6963:8: enumLiteral_1= 'L2'
                    {
                    enumLiteral_1=(Token)match(input,153,FOLLOW_153_in_ruleVersionSwitchType16954); 

                            current = grammarAccess.getVersionSwitchTypeAccess().getL2EnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_1, grammarAccess.getVersionSwitchTypeAccess().getL2EnumLiteralDeclaration_1()); 
                        

                    }


                    }
                    break;
                case 3 :
                    // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:6969:6: (enumLiteral_2= 'Both' )
                    {
                    // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:6969:6: (enumLiteral_2= 'Both' )
                    // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:6969:8: enumLiteral_2= 'Both'
                    {
                    enumLiteral_2=(Token)match(input,154,FOLLOW_154_in_ruleVersionSwitchType16971); 

                            current = grammarAccess.getVersionSwitchTypeAccess().getBothEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_2, grammarAccess.getVersionSwitchTypeAccess().getBothEnumLiteralDeclaration_2()); 
                        

                    }


                    }
                    break;

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleVersionSwitchType"


    // $ANTLR start "ruleLanguage"
    // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:6979:1: ruleLanguage returns [Enumerator current=null] : ( (enumLiteral_0= 'L1' ) | (enumLiteral_1= 'L2' ) ) ;
    public final Enumerator ruleLanguage() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;

         enterRule(); 
        try {
            // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:6981:28: ( ( (enumLiteral_0= 'L1' ) | (enumLiteral_1= 'L2' ) ) )
            // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:6982:1: ( (enumLiteral_0= 'L1' ) | (enumLiteral_1= 'L2' ) )
            {
            // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:6982:1: ( (enumLiteral_0= 'L1' ) | (enumLiteral_1= 'L2' ) )
            int alt99=2;
            int LA99_0 = input.LA(1);

            if ( (LA99_0==152) ) {
                alt99=1;
            }
            else if ( (LA99_0==153) ) {
                alt99=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 99, 0, input);

                throw nvae;
            }
            switch (alt99) {
                case 1 :
                    // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:6982:2: (enumLiteral_0= 'L1' )
                    {
                    // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:6982:2: (enumLiteral_0= 'L1' )
                    // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:6982:4: enumLiteral_0= 'L1'
                    {
                    enumLiteral_0=(Token)match(input,152,FOLLOW_152_in_ruleLanguage17016); 

                            current = grammarAccess.getLanguageAccess().getL1EnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_0, grammarAccess.getLanguageAccess().getL1EnumLiteralDeclaration_0()); 
                        

                    }


                    }
                    break;
                case 2 :
                    // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:6988:6: (enumLiteral_1= 'L2' )
                    {
                    // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:6988:6: (enumLiteral_1= 'L2' )
                    // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:6988:8: enumLiteral_1= 'L2'
                    {
                    enumLiteral_1=(Token)match(input,153,FOLLOW_153_in_ruleLanguage17033); 

                            current = grammarAccess.getLanguageAccess().getL2EnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_1, grammarAccess.getLanguageAccess().getL2EnumLiteralDeclaration_1()); 
                        

                    }


                    }
                    break;

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleLanguage"


    // $ANTLR start "ruleBreakType"
    // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:6998:1: ruleBreakType returns [Enumerator current=null] : ( (enumLiteral_0= 'line' ) | (enumLiteral_1= 'page' ) ) ;
    public final Enumerator ruleBreakType() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;

         enterRule(); 
        try {
            // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:7000:28: ( ( (enumLiteral_0= 'line' ) | (enumLiteral_1= 'page' ) ) )
            // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:7001:1: ( (enumLiteral_0= 'line' ) | (enumLiteral_1= 'page' ) )
            {
            // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:7001:1: ( (enumLiteral_0= 'line' ) | (enumLiteral_1= 'page' ) )
            int alt100=2;
            int LA100_0 = input.LA(1);

            if ( (LA100_0==155) ) {
                alt100=1;
            }
            else if ( (LA100_0==156) ) {
                alt100=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 100, 0, input);

                throw nvae;
            }
            switch (alt100) {
                case 1 :
                    // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:7001:2: (enumLiteral_0= 'line' )
                    {
                    // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:7001:2: (enumLiteral_0= 'line' )
                    // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:7001:4: enumLiteral_0= 'line'
                    {
                    enumLiteral_0=(Token)match(input,155,FOLLOW_155_in_ruleBreakType17078); 

                            current = grammarAccess.getBreakTypeAccess().getLineEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_0, grammarAccess.getBreakTypeAccess().getLineEnumLiteralDeclaration_0()); 
                        

                    }


                    }
                    break;
                case 2 :
                    // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:7007:6: (enumLiteral_1= 'page' )
                    {
                    // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:7007:6: (enumLiteral_1= 'page' )
                    // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:7007:8: enumLiteral_1= 'page'
                    {
                    enumLiteral_1=(Token)match(input,156,FOLLOW_156_in_ruleBreakType17095); 

                            current = grammarAccess.getBreakTypeAccess().getPageEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_1, grammarAccess.getBreakTypeAccess().getPageEnumLiteralDeclaration_1()); 
                        

                    }


                    }
                    break;

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleBreakType"


    // $ANTLR start "ruleTemplateStatuses"
    // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:7017:1: ruleTemplateStatuses returns [Enumerator current=null] : ( (enumLiteral_0= 'NA' ) | (enumLiteral_1= 'Draft' ) | (enumLiteral_2= 'Review' ) | (enumLiteral_3= 'Final' ) ) ;
    public final Enumerator ruleTemplateStatuses() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;
        Token enumLiteral_2=null;
        Token enumLiteral_3=null;

         enterRule(); 
        try {
            // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:7019:28: ( ( (enumLiteral_0= 'NA' ) | (enumLiteral_1= 'Draft' ) | (enumLiteral_2= 'Review' ) | (enumLiteral_3= 'Final' ) ) )
            // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:7020:1: ( (enumLiteral_0= 'NA' ) | (enumLiteral_1= 'Draft' ) | (enumLiteral_2= 'Review' ) | (enumLiteral_3= 'Final' ) )
            {
            // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:7020:1: ( (enumLiteral_0= 'NA' ) | (enumLiteral_1= 'Draft' ) | (enumLiteral_2= 'Review' ) | (enumLiteral_3= 'Final' ) )
            int alt101=4;
            switch ( input.LA(1) ) {
            case 157:
                {
                alt101=1;
                }
                break;
            case 158:
                {
                alt101=2;
                }
                break;
            case 159:
                {
                alt101=3;
                }
                break;
            case 160:
                {
                alt101=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 101, 0, input);

                throw nvae;
            }

            switch (alt101) {
                case 1 :
                    // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:7020:2: (enumLiteral_0= 'NA' )
                    {
                    // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:7020:2: (enumLiteral_0= 'NA' )
                    // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:7020:4: enumLiteral_0= 'NA'
                    {
                    enumLiteral_0=(Token)match(input,157,FOLLOW_157_in_ruleTemplateStatuses17140); 

                            current = grammarAccess.getTemplateStatusesAccess().getNAEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_0, grammarAccess.getTemplateStatusesAccess().getNAEnumLiteralDeclaration_0()); 
                        

                    }


                    }
                    break;
                case 2 :
                    // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:7026:6: (enumLiteral_1= 'Draft' )
                    {
                    // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:7026:6: (enumLiteral_1= 'Draft' )
                    // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:7026:8: enumLiteral_1= 'Draft'
                    {
                    enumLiteral_1=(Token)match(input,158,FOLLOW_158_in_ruleTemplateStatuses17157); 

                            current = grammarAccess.getTemplateStatusesAccess().getDraftEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_1, grammarAccess.getTemplateStatusesAccess().getDraftEnumLiteralDeclaration_1()); 
                        

                    }


                    }
                    break;
                case 3 :
                    // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:7032:6: (enumLiteral_2= 'Review' )
                    {
                    // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:7032:6: (enumLiteral_2= 'Review' )
                    // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:7032:8: enumLiteral_2= 'Review'
                    {
                    enumLiteral_2=(Token)match(input,159,FOLLOW_159_in_ruleTemplateStatuses17174); 

                            current = grammarAccess.getTemplateStatusesAccess().getReviewEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_2, grammarAccess.getTemplateStatusesAccess().getReviewEnumLiteralDeclaration_2()); 
                        

                    }


                    }
                    break;
                case 4 :
                    // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:7038:6: (enumLiteral_3= 'Final' )
                    {
                    // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:7038:6: (enumLiteral_3= 'Final' )
                    // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:7038:8: enumLiteral_3= 'Final'
                    {
                    enumLiteral_3=(Token)match(input,160,FOLLOW_160_in_ruleTemplateStatuses17191); 

                            current = grammarAccess.getTemplateStatusesAccess().getFinalEnumLiteralDeclaration_3().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_3, grammarAccess.getTemplateStatusesAccess().getFinalEnumLiteralDeclaration_3()); 
                        

                    }


                    }
                    break;

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleTemplateStatuses"


    // $ANTLR start "ruleModeTypes"
    // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:7050:1: ruleModeTypes returns [Enumerator current=null] : ( (enumLiteral_0= 'M1' ) | (enumLiteral_1= 'M2' ) | (enumLiteral_2= 'M3' ) | (enumLiteral_3= 'M4' ) | (enumLiteral_4= 'M5' ) | (enumLiteral_5= 'M6' ) | (enumLiteral_6= 'M7' ) | (enumLiteral_7= 'M8' ) ) ;
    public final Enumerator ruleModeTypes() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;
        Token enumLiteral_2=null;
        Token enumLiteral_3=null;
        Token enumLiteral_4=null;
        Token enumLiteral_5=null;
        Token enumLiteral_6=null;
        Token enumLiteral_7=null;

         enterRule(); 
        try {
            // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:7052:28: ( ( (enumLiteral_0= 'M1' ) | (enumLiteral_1= 'M2' ) | (enumLiteral_2= 'M3' ) | (enumLiteral_3= 'M4' ) | (enumLiteral_4= 'M5' ) | (enumLiteral_5= 'M6' ) | (enumLiteral_6= 'M7' ) | (enumLiteral_7= 'M8' ) ) )
            // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:7053:1: ( (enumLiteral_0= 'M1' ) | (enumLiteral_1= 'M2' ) | (enumLiteral_2= 'M3' ) | (enumLiteral_3= 'M4' ) | (enumLiteral_4= 'M5' ) | (enumLiteral_5= 'M6' ) | (enumLiteral_6= 'M7' ) | (enumLiteral_7= 'M8' ) )
            {
            // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:7053:1: ( (enumLiteral_0= 'M1' ) | (enumLiteral_1= 'M2' ) | (enumLiteral_2= 'M3' ) | (enumLiteral_3= 'M4' ) | (enumLiteral_4= 'M5' ) | (enumLiteral_5= 'M6' ) | (enumLiteral_6= 'M7' ) | (enumLiteral_7= 'M8' ) )
            int alt102=8;
            switch ( input.LA(1) ) {
            case 161:
                {
                alt102=1;
                }
                break;
            case 162:
                {
                alt102=2;
                }
                break;
            case 163:
                {
                alt102=3;
                }
                break;
            case 164:
                {
                alt102=4;
                }
                break;
            case 165:
                {
                alt102=5;
                }
                break;
            case 166:
                {
                alt102=6;
                }
                break;
            case 167:
                {
                alt102=7;
                }
                break;
            case 168:
                {
                alt102=8;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 102, 0, input);

                throw nvae;
            }

            switch (alt102) {
                case 1 :
                    // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:7053:2: (enumLiteral_0= 'M1' )
                    {
                    // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:7053:2: (enumLiteral_0= 'M1' )
                    // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:7053:4: enumLiteral_0= 'M1'
                    {
                    enumLiteral_0=(Token)match(input,161,FOLLOW_161_in_ruleModeTypes17238); 

                            current = grammarAccess.getModeTypesAccess().getM1EnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_0, grammarAccess.getModeTypesAccess().getM1EnumLiteralDeclaration_0()); 
                        

                    }


                    }
                    break;
                case 2 :
                    // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:7059:6: (enumLiteral_1= 'M2' )
                    {
                    // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:7059:6: (enumLiteral_1= 'M2' )
                    // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:7059:8: enumLiteral_1= 'M2'
                    {
                    enumLiteral_1=(Token)match(input,162,FOLLOW_162_in_ruleModeTypes17255); 

                            current = grammarAccess.getModeTypesAccess().getM2EnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_1, grammarAccess.getModeTypesAccess().getM2EnumLiteralDeclaration_1()); 
                        

                    }


                    }
                    break;
                case 3 :
                    // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:7065:6: (enumLiteral_2= 'M3' )
                    {
                    // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:7065:6: (enumLiteral_2= 'M3' )
                    // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:7065:8: enumLiteral_2= 'M3'
                    {
                    enumLiteral_2=(Token)match(input,163,FOLLOW_163_in_ruleModeTypes17272); 

                            current = grammarAccess.getModeTypesAccess().getM3EnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_2, grammarAccess.getModeTypesAccess().getM3EnumLiteralDeclaration_2()); 
                        

                    }


                    }
                    break;
                case 4 :
                    // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:7071:6: (enumLiteral_3= 'M4' )
                    {
                    // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:7071:6: (enumLiteral_3= 'M4' )
                    // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:7071:8: enumLiteral_3= 'M4'
                    {
                    enumLiteral_3=(Token)match(input,164,FOLLOW_164_in_ruleModeTypes17289); 

                            current = grammarAccess.getModeTypesAccess().getM4EnumLiteralDeclaration_3().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_3, grammarAccess.getModeTypesAccess().getM4EnumLiteralDeclaration_3()); 
                        

                    }


                    }
                    break;
                case 5 :
                    // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:7077:6: (enumLiteral_4= 'M5' )
                    {
                    // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:7077:6: (enumLiteral_4= 'M5' )
                    // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:7077:8: enumLiteral_4= 'M5'
                    {
                    enumLiteral_4=(Token)match(input,165,FOLLOW_165_in_ruleModeTypes17306); 

                            current = grammarAccess.getModeTypesAccess().getM5EnumLiteralDeclaration_4().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_4, grammarAccess.getModeTypesAccess().getM5EnumLiteralDeclaration_4()); 
                        

                    }


                    }
                    break;
                case 6 :
                    // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:7083:6: (enumLiteral_5= 'M6' )
                    {
                    // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:7083:6: (enumLiteral_5= 'M6' )
                    // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:7083:8: enumLiteral_5= 'M6'
                    {
                    enumLiteral_5=(Token)match(input,166,FOLLOW_166_in_ruleModeTypes17323); 

                            current = grammarAccess.getModeTypesAccess().getM6EnumLiteralDeclaration_5().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_5, grammarAccess.getModeTypesAccess().getM6EnumLiteralDeclaration_5()); 
                        

                    }


                    }
                    break;
                case 7 :
                    // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:7089:6: (enumLiteral_6= 'M7' )
                    {
                    // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:7089:6: (enumLiteral_6= 'M7' )
                    // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:7089:8: enumLiteral_6= 'M7'
                    {
                    enumLiteral_6=(Token)match(input,167,FOLLOW_167_in_ruleModeTypes17340); 

                            current = grammarAccess.getModeTypesAccess().getM7EnumLiteralDeclaration_6().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_6, grammarAccess.getModeTypesAccess().getM7EnumLiteralDeclaration_6()); 
                        

                    }


                    }
                    break;
                case 8 :
                    // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:7095:6: (enumLiteral_7= 'M8' )
                    {
                    // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:7095:6: (enumLiteral_7= 'M8' )
                    // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:7095:8: enumLiteral_7= 'M8'
                    {
                    enumLiteral_7=(Token)match(input,168,FOLLOW_168_in_ruleModeTypes17357); 

                            current = grammarAccess.getModeTypesAccess().getM8EnumLiteralDeclaration_7().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_7, grammarAccess.getModeTypesAccess().getM8EnumLiteralDeclaration_7()); 
                        

                    }


                    }
                    break;

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleModeTypes"


    // $ANTLR start "ruleDowTypes"
    // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:7105:1: ruleDowTypes returns [Enumerator current=null] : ( (enumLiteral_0= 'D1' ) | (enumLiteral_1= 'D2' ) | (enumLiteral_2= 'D3' ) | (enumLiteral_3= 'D4' ) | (enumLiteral_4= 'D5' ) | (enumLiteral_5= 'D6' ) | (enumLiteral_6= 'D7' ) ) ;
    public final Enumerator ruleDowTypes() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;
        Token enumLiteral_2=null;
        Token enumLiteral_3=null;
        Token enumLiteral_4=null;
        Token enumLiteral_5=null;
        Token enumLiteral_6=null;

         enterRule(); 
        try {
            // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:7107:28: ( ( (enumLiteral_0= 'D1' ) | (enumLiteral_1= 'D2' ) | (enumLiteral_2= 'D3' ) | (enumLiteral_3= 'D4' ) | (enumLiteral_4= 'D5' ) | (enumLiteral_5= 'D6' ) | (enumLiteral_6= 'D7' ) ) )
            // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:7108:1: ( (enumLiteral_0= 'D1' ) | (enumLiteral_1= 'D2' ) | (enumLiteral_2= 'D3' ) | (enumLiteral_3= 'D4' ) | (enumLiteral_4= 'D5' ) | (enumLiteral_5= 'D6' ) | (enumLiteral_6= 'D7' ) )
            {
            // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:7108:1: ( (enumLiteral_0= 'D1' ) | (enumLiteral_1= 'D2' ) | (enumLiteral_2= 'D3' ) | (enumLiteral_3= 'D4' ) | (enumLiteral_4= 'D5' ) | (enumLiteral_5= 'D6' ) | (enumLiteral_6= 'D7' ) )
            int alt103=7;
            switch ( input.LA(1) ) {
            case 169:
                {
                alt103=1;
                }
                break;
            case 170:
                {
                alt103=2;
                }
                break;
            case 171:
                {
                alt103=3;
                }
                break;
            case 172:
                {
                alt103=4;
                }
                break;
            case 173:
                {
                alt103=5;
                }
                break;
            case 174:
                {
                alt103=6;
                }
                break;
            case 175:
                {
                alt103=7;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 103, 0, input);

                throw nvae;
            }

            switch (alt103) {
                case 1 :
                    // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:7108:2: (enumLiteral_0= 'D1' )
                    {
                    // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:7108:2: (enumLiteral_0= 'D1' )
                    // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:7108:4: enumLiteral_0= 'D1'
                    {
                    enumLiteral_0=(Token)match(input,169,FOLLOW_169_in_ruleDowTypes17402); 

                            current = grammarAccess.getDowTypesAccess().getD1EnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_0, grammarAccess.getDowTypesAccess().getD1EnumLiteralDeclaration_0()); 
                        

                    }


                    }
                    break;
                case 2 :
                    // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:7114:6: (enumLiteral_1= 'D2' )
                    {
                    // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:7114:6: (enumLiteral_1= 'D2' )
                    // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:7114:8: enumLiteral_1= 'D2'
                    {
                    enumLiteral_1=(Token)match(input,170,FOLLOW_170_in_ruleDowTypes17419); 

                            current = grammarAccess.getDowTypesAccess().getD2EnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_1, grammarAccess.getDowTypesAccess().getD2EnumLiteralDeclaration_1()); 
                        

                    }


                    }
                    break;
                case 3 :
                    // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:7120:6: (enumLiteral_2= 'D3' )
                    {
                    // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:7120:6: (enumLiteral_2= 'D3' )
                    // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:7120:8: enumLiteral_2= 'D3'
                    {
                    enumLiteral_2=(Token)match(input,171,FOLLOW_171_in_ruleDowTypes17436); 

                            current = grammarAccess.getDowTypesAccess().getD3EnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_2, grammarAccess.getDowTypesAccess().getD3EnumLiteralDeclaration_2()); 
                        

                    }


                    }
                    break;
                case 4 :
                    // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:7126:6: (enumLiteral_3= 'D4' )
                    {
                    // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:7126:6: (enumLiteral_3= 'D4' )
                    // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:7126:8: enumLiteral_3= 'D4'
                    {
                    enumLiteral_3=(Token)match(input,172,FOLLOW_172_in_ruleDowTypes17453); 

                            current = grammarAccess.getDowTypesAccess().getD4EnumLiteralDeclaration_3().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_3, grammarAccess.getDowTypesAccess().getD4EnumLiteralDeclaration_3()); 
                        

                    }


                    }
                    break;
                case 5 :
                    // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:7132:6: (enumLiteral_4= 'D5' )
                    {
                    // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:7132:6: (enumLiteral_4= 'D5' )
                    // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:7132:8: enumLiteral_4= 'D5'
                    {
                    enumLiteral_4=(Token)match(input,173,FOLLOW_173_in_ruleDowTypes17470); 

                            current = grammarAccess.getDowTypesAccess().getD5EnumLiteralDeclaration_4().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_4, grammarAccess.getDowTypesAccess().getD5EnumLiteralDeclaration_4()); 
                        

                    }


                    }
                    break;
                case 6 :
                    // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:7138:6: (enumLiteral_5= 'D6' )
                    {
                    // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:7138:6: (enumLiteral_5= 'D6' )
                    // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:7138:8: enumLiteral_5= 'D6'
                    {
                    enumLiteral_5=(Token)match(input,174,FOLLOW_174_in_ruleDowTypes17487); 

                            current = grammarAccess.getDowTypesAccess().getD6EnumLiteralDeclaration_5().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_5, grammarAccess.getDowTypesAccess().getD6EnumLiteralDeclaration_5()); 
                        

                    }


                    }
                    break;
                case 7 :
                    // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:7144:6: (enumLiteral_6= 'D7' )
                    {
                    // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:7144:6: (enumLiteral_6= 'D7' )
                    // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:7144:8: enumLiteral_6= 'D7'
                    {
                    enumLiteral_6=(Token)match(input,175,FOLLOW_175_in_ruleDowTypes17504); 

                            current = grammarAccess.getDowTypesAccess().getD7EnumLiteralDeclaration_6().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_6, grammarAccess.getDowTypesAccess().getD7EnumLiteralDeclaration_6()); 
                        

                    }


                    }
                    break;

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleDowTypes"


    // $ANTLR start "ruleDayOfWeek"
    // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:7162:1: ruleDayOfWeek returns [Enumerator current=null] : ( (enumLiteral_0= 'Sunday' ) | (enumLiteral_1= 'Monday' ) | (enumLiteral_2= 'Tuesday' ) | (enumLiteral_3= 'Wednesday' ) | (enumLiteral_4= 'Thursday' ) | (enumLiteral_5= 'Friday' ) | (enumLiteral_6= 'Saturday' ) ) ;
    public final Enumerator ruleDayOfWeek() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;
        Token enumLiteral_2=null;
        Token enumLiteral_3=null;
        Token enumLiteral_4=null;
        Token enumLiteral_5=null;
        Token enumLiteral_6=null;

         enterRule(); 
        try {
            // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:7164:28: ( ( (enumLiteral_0= 'Sunday' ) | (enumLiteral_1= 'Monday' ) | (enumLiteral_2= 'Tuesday' ) | (enumLiteral_3= 'Wednesday' ) | (enumLiteral_4= 'Thursday' ) | (enumLiteral_5= 'Friday' ) | (enumLiteral_6= 'Saturday' ) ) )
            // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:7165:1: ( (enumLiteral_0= 'Sunday' ) | (enumLiteral_1= 'Monday' ) | (enumLiteral_2= 'Tuesday' ) | (enumLiteral_3= 'Wednesday' ) | (enumLiteral_4= 'Thursday' ) | (enumLiteral_5= 'Friday' ) | (enumLiteral_6= 'Saturday' ) )
            {
            // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:7165:1: ( (enumLiteral_0= 'Sunday' ) | (enumLiteral_1= 'Monday' ) | (enumLiteral_2= 'Tuesday' ) | (enumLiteral_3= 'Wednesday' ) | (enumLiteral_4= 'Thursday' ) | (enumLiteral_5= 'Friday' ) | (enumLiteral_6= 'Saturday' ) )
            int alt104=7;
            switch ( input.LA(1) ) {
            case 176:
                {
                alt104=1;
                }
                break;
            case 177:
                {
                alt104=2;
                }
                break;
            case 178:
                {
                alt104=3;
                }
                break;
            case 179:
                {
                alt104=4;
                }
                break;
            case 180:
                {
                alt104=5;
                }
                break;
            case 181:
                {
                alt104=6;
                }
                break;
            case 182:
                {
                alt104=7;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 104, 0, input);

                throw nvae;
            }

            switch (alt104) {
                case 1 :
                    // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:7165:2: (enumLiteral_0= 'Sunday' )
                    {
                    // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:7165:2: (enumLiteral_0= 'Sunday' )
                    // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:7165:4: enumLiteral_0= 'Sunday'
                    {
                    enumLiteral_0=(Token)match(input,176,FOLLOW_176_in_ruleDayOfWeek17557); 

                            current = grammarAccess.getDayOfWeekAccess().getSundayEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_0, grammarAccess.getDayOfWeekAccess().getSundayEnumLiteralDeclaration_0()); 
                        

                    }


                    }
                    break;
                case 2 :
                    // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:7171:6: (enumLiteral_1= 'Monday' )
                    {
                    // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:7171:6: (enumLiteral_1= 'Monday' )
                    // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:7171:8: enumLiteral_1= 'Monday'
                    {
                    enumLiteral_1=(Token)match(input,177,FOLLOW_177_in_ruleDayOfWeek17574); 

                            current = grammarAccess.getDayOfWeekAccess().getMondayEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_1, grammarAccess.getDayOfWeekAccess().getMondayEnumLiteralDeclaration_1()); 
                        

                    }


                    }
                    break;
                case 3 :
                    // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:7177:6: (enumLiteral_2= 'Tuesday' )
                    {
                    // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:7177:6: (enumLiteral_2= 'Tuesday' )
                    // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:7177:8: enumLiteral_2= 'Tuesday'
                    {
                    enumLiteral_2=(Token)match(input,178,FOLLOW_178_in_ruleDayOfWeek17591); 

                            current = grammarAccess.getDayOfWeekAccess().getTuesdayEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_2, grammarAccess.getDayOfWeekAccess().getTuesdayEnumLiteralDeclaration_2()); 
                        

                    }


                    }
                    break;
                case 4 :
                    // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:7183:6: (enumLiteral_3= 'Wednesday' )
                    {
                    // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:7183:6: (enumLiteral_3= 'Wednesday' )
                    // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:7183:8: enumLiteral_3= 'Wednesday'
                    {
                    enumLiteral_3=(Token)match(input,179,FOLLOW_179_in_ruleDayOfWeek17608); 

                            current = grammarAccess.getDayOfWeekAccess().getWednesdayEnumLiteralDeclaration_3().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_3, grammarAccess.getDayOfWeekAccess().getWednesdayEnumLiteralDeclaration_3()); 
                        

                    }


                    }
                    break;
                case 5 :
                    // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:7189:6: (enumLiteral_4= 'Thursday' )
                    {
                    // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:7189:6: (enumLiteral_4= 'Thursday' )
                    // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:7189:8: enumLiteral_4= 'Thursday'
                    {
                    enumLiteral_4=(Token)match(input,180,FOLLOW_180_in_ruleDayOfWeek17625); 

                            current = grammarAccess.getDayOfWeekAccess().getThursdayEnumLiteralDeclaration_4().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_4, grammarAccess.getDayOfWeekAccess().getThursdayEnumLiteralDeclaration_4()); 
                        

                    }


                    }
                    break;
                case 6 :
                    // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:7195:6: (enumLiteral_5= 'Friday' )
                    {
                    // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:7195:6: (enumLiteral_5= 'Friday' )
                    // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:7195:8: enumLiteral_5= 'Friday'
                    {
                    enumLiteral_5=(Token)match(input,181,FOLLOW_181_in_ruleDayOfWeek17642); 

                            current = grammarAccess.getDayOfWeekAccess().getFridayEnumLiteralDeclaration_5().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_5, grammarAccess.getDayOfWeekAccess().getFridayEnumLiteralDeclaration_5()); 
                        

                    }


                    }
                    break;
                case 7 :
                    // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:7201:6: (enumLiteral_6= 'Saturday' )
                    {
                    // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:7201:6: (enumLiteral_6= 'Saturday' )
                    // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:7201:8: enumLiteral_6= 'Saturday'
                    {
                    enumLiteral_6=(Token)match(input,182,FOLLOW_182_in_ruleDayOfWeek17659); 

                            current = grammarAccess.getDayOfWeekAccess().getSaturdayEnumLiteralDeclaration_6().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_6, grammarAccess.getDayOfWeekAccess().getSaturdayEnumLiteralDeclaration_6()); 
                        

                    }


                    }
                    break;

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleDayOfWeek"


    // $ANTLR start "ruleMonthName"
    // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:7211:1: ruleMonthName returns [Enumerator current=null] : ( (enumLiteral_0= 'Jan' ) | (enumLiteral_1= 'Feb' ) | (enumLiteral_2= 'Mar' ) | (enumLiteral_3= 'Apr' ) | (enumLiteral_4= 'May' ) | (enumLiteral_5= 'Jun' ) | (enumLiteral_6= 'Jul' ) | (enumLiteral_7= 'Aug' ) | (enumLiteral_8= 'Sep' ) | (enumLiteral_9= 'Oct' ) | (enumLiteral_10= 'Nov' ) | (enumLiteral_11= 'Dec' ) ) ;
    public final Enumerator ruleMonthName() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;
        Token enumLiteral_2=null;
        Token enumLiteral_3=null;
        Token enumLiteral_4=null;
        Token enumLiteral_5=null;
        Token enumLiteral_6=null;
        Token enumLiteral_7=null;
        Token enumLiteral_8=null;
        Token enumLiteral_9=null;
        Token enumLiteral_10=null;
        Token enumLiteral_11=null;

         enterRule(); 
        try {
            // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:7213:28: ( ( (enumLiteral_0= 'Jan' ) | (enumLiteral_1= 'Feb' ) | (enumLiteral_2= 'Mar' ) | (enumLiteral_3= 'Apr' ) | (enumLiteral_4= 'May' ) | (enumLiteral_5= 'Jun' ) | (enumLiteral_6= 'Jul' ) | (enumLiteral_7= 'Aug' ) | (enumLiteral_8= 'Sep' ) | (enumLiteral_9= 'Oct' ) | (enumLiteral_10= 'Nov' ) | (enumLiteral_11= 'Dec' ) ) )
            // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:7214:1: ( (enumLiteral_0= 'Jan' ) | (enumLiteral_1= 'Feb' ) | (enumLiteral_2= 'Mar' ) | (enumLiteral_3= 'Apr' ) | (enumLiteral_4= 'May' ) | (enumLiteral_5= 'Jun' ) | (enumLiteral_6= 'Jul' ) | (enumLiteral_7= 'Aug' ) | (enumLiteral_8= 'Sep' ) | (enumLiteral_9= 'Oct' ) | (enumLiteral_10= 'Nov' ) | (enumLiteral_11= 'Dec' ) )
            {
            // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:7214:1: ( (enumLiteral_0= 'Jan' ) | (enumLiteral_1= 'Feb' ) | (enumLiteral_2= 'Mar' ) | (enumLiteral_3= 'Apr' ) | (enumLiteral_4= 'May' ) | (enumLiteral_5= 'Jun' ) | (enumLiteral_6= 'Jul' ) | (enumLiteral_7= 'Aug' ) | (enumLiteral_8= 'Sep' ) | (enumLiteral_9= 'Oct' ) | (enumLiteral_10= 'Nov' ) | (enumLiteral_11= 'Dec' ) )
            int alt105=12;
            switch ( input.LA(1) ) {
            case 183:
                {
                alt105=1;
                }
                break;
            case 184:
                {
                alt105=2;
                }
                break;
            case 185:
                {
                alt105=3;
                }
                break;
            case 186:
                {
                alt105=4;
                }
                break;
            case 187:
                {
                alt105=5;
                }
                break;
            case 188:
                {
                alt105=6;
                }
                break;
            case 189:
                {
                alt105=7;
                }
                break;
            case 190:
                {
                alt105=8;
                }
                break;
            case 191:
                {
                alt105=9;
                }
                break;
            case 192:
                {
                alt105=10;
                }
                break;
            case 193:
                {
                alt105=11;
                }
                break;
            case 194:
                {
                alt105=12;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 105, 0, input);

                throw nvae;
            }

            switch (alt105) {
                case 1 :
                    // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:7214:2: (enumLiteral_0= 'Jan' )
                    {
                    // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:7214:2: (enumLiteral_0= 'Jan' )
                    // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:7214:4: enumLiteral_0= 'Jan'
                    {
                    enumLiteral_0=(Token)match(input,183,FOLLOW_183_in_ruleMonthName17704); 

                            current = grammarAccess.getMonthNameAccess().getJanEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_0, grammarAccess.getMonthNameAccess().getJanEnumLiteralDeclaration_0()); 
                        

                    }


                    }
                    break;
                case 2 :
                    // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:7220:6: (enumLiteral_1= 'Feb' )
                    {
                    // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:7220:6: (enumLiteral_1= 'Feb' )
                    // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:7220:8: enumLiteral_1= 'Feb'
                    {
                    enumLiteral_1=(Token)match(input,184,FOLLOW_184_in_ruleMonthName17721); 

                            current = grammarAccess.getMonthNameAccess().getFebEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_1, grammarAccess.getMonthNameAccess().getFebEnumLiteralDeclaration_1()); 
                        

                    }


                    }
                    break;
                case 3 :
                    // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:7226:6: (enumLiteral_2= 'Mar' )
                    {
                    // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:7226:6: (enumLiteral_2= 'Mar' )
                    // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:7226:8: enumLiteral_2= 'Mar'
                    {
                    enumLiteral_2=(Token)match(input,185,FOLLOW_185_in_ruleMonthName17738); 

                            current = grammarAccess.getMonthNameAccess().getMarEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_2, grammarAccess.getMonthNameAccess().getMarEnumLiteralDeclaration_2()); 
                        

                    }


                    }
                    break;
                case 4 :
                    // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:7232:6: (enumLiteral_3= 'Apr' )
                    {
                    // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:7232:6: (enumLiteral_3= 'Apr' )
                    // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:7232:8: enumLiteral_3= 'Apr'
                    {
                    enumLiteral_3=(Token)match(input,186,FOLLOW_186_in_ruleMonthName17755); 

                            current = grammarAccess.getMonthNameAccess().getAprEnumLiteralDeclaration_3().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_3, grammarAccess.getMonthNameAccess().getAprEnumLiteralDeclaration_3()); 
                        

                    }


                    }
                    break;
                case 5 :
                    // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:7238:6: (enumLiteral_4= 'May' )
                    {
                    // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:7238:6: (enumLiteral_4= 'May' )
                    // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:7238:8: enumLiteral_4= 'May'
                    {
                    enumLiteral_4=(Token)match(input,187,FOLLOW_187_in_ruleMonthName17772); 

                            current = grammarAccess.getMonthNameAccess().getMayEnumLiteralDeclaration_4().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_4, grammarAccess.getMonthNameAccess().getMayEnumLiteralDeclaration_4()); 
                        

                    }


                    }
                    break;
                case 6 :
                    // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:7244:6: (enumLiteral_5= 'Jun' )
                    {
                    // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:7244:6: (enumLiteral_5= 'Jun' )
                    // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:7244:8: enumLiteral_5= 'Jun'
                    {
                    enumLiteral_5=(Token)match(input,188,FOLLOW_188_in_ruleMonthName17789); 

                            current = grammarAccess.getMonthNameAccess().getJunEnumLiteralDeclaration_5().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_5, grammarAccess.getMonthNameAccess().getJunEnumLiteralDeclaration_5()); 
                        

                    }


                    }
                    break;
                case 7 :
                    // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:7250:6: (enumLiteral_6= 'Jul' )
                    {
                    // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:7250:6: (enumLiteral_6= 'Jul' )
                    // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:7250:8: enumLiteral_6= 'Jul'
                    {
                    enumLiteral_6=(Token)match(input,189,FOLLOW_189_in_ruleMonthName17806); 

                            current = grammarAccess.getMonthNameAccess().getJulEnumLiteralDeclaration_6().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_6, grammarAccess.getMonthNameAccess().getJulEnumLiteralDeclaration_6()); 
                        

                    }


                    }
                    break;
                case 8 :
                    // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:7256:6: (enumLiteral_7= 'Aug' )
                    {
                    // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:7256:6: (enumLiteral_7= 'Aug' )
                    // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:7256:8: enumLiteral_7= 'Aug'
                    {
                    enumLiteral_7=(Token)match(input,190,FOLLOW_190_in_ruleMonthName17823); 

                            current = grammarAccess.getMonthNameAccess().getAugEnumLiteralDeclaration_7().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_7, grammarAccess.getMonthNameAccess().getAugEnumLiteralDeclaration_7()); 
                        

                    }


                    }
                    break;
                case 9 :
                    // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:7262:6: (enumLiteral_8= 'Sep' )
                    {
                    // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:7262:6: (enumLiteral_8= 'Sep' )
                    // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:7262:8: enumLiteral_8= 'Sep'
                    {
                    enumLiteral_8=(Token)match(input,191,FOLLOW_191_in_ruleMonthName17840); 

                            current = grammarAccess.getMonthNameAccess().getSepEnumLiteralDeclaration_8().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_8, grammarAccess.getMonthNameAccess().getSepEnumLiteralDeclaration_8()); 
                        

                    }


                    }
                    break;
                case 10 :
                    // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:7268:6: (enumLiteral_9= 'Oct' )
                    {
                    // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:7268:6: (enumLiteral_9= 'Oct' )
                    // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:7268:8: enumLiteral_9= 'Oct'
                    {
                    enumLiteral_9=(Token)match(input,192,FOLLOW_192_in_ruleMonthName17857); 

                            current = grammarAccess.getMonthNameAccess().getOctEnumLiteralDeclaration_9().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_9, grammarAccess.getMonthNameAccess().getOctEnumLiteralDeclaration_9()); 
                        

                    }


                    }
                    break;
                case 11 :
                    // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:7274:6: (enumLiteral_10= 'Nov' )
                    {
                    // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:7274:6: (enumLiteral_10= 'Nov' )
                    // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:7274:8: enumLiteral_10= 'Nov'
                    {
                    enumLiteral_10=(Token)match(input,193,FOLLOW_193_in_ruleMonthName17874); 

                            current = grammarAccess.getMonthNameAccess().getNovEnumLiteralDeclaration_10().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_10, grammarAccess.getMonthNameAccess().getNovEnumLiteralDeclaration_10()); 
                        

                    }


                    }
                    break;
                case 12 :
                    // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:7280:6: (enumLiteral_11= 'Dec' )
                    {
                    // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:7280:6: (enumLiteral_11= 'Dec' )
                    // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:7280:8: enumLiteral_11= 'Dec'
                    {
                    enumLiteral_11=(Token)match(input,194,FOLLOW_194_in_ruleMonthName17891); 

                            current = grammarAccess.getMonthNameAccess().getDecEnumLiteralDeclaration_11().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_11, grammarAccess.getMonthNameAccess().getDecEnumLiteralDeclaration_11()); 
                        

                    }


                    }
                    break;

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleMonthName"

    // Delegated rules


    protected DFA23 dfa23 = new DFA23(this);
    protected DFA41 dfa41 = new DFA41(this);
    protected DFA69 dfa69 = new DFA69(this);
    static final String DFA23_eotS =
        "\51\uffff";
    static final String DFA23_eofS =
        "\51\uffff";
    static final String DFA23_minS =
        "\1\57\16\uffff\1\4\26\uffff\1\142\2\uffff";
    static final String DFA23_maxS =
        "\1\u0097\16\uffff\1\4\26\uffff\1\143\2\uffff";
    static final String DFA23_acceptS =
        "\1\uffff\1\1\1\2\1\3\1\4\1\5\1\6\1\7\1\10\1\11\1\12\1\13\1\14\1\15\1\16\1\uffff\1\21\1\22\1\23\1\24\1\25\1\26\1\27\1\30\1\31\1\32\1\33\1\34\1\35\1\36\1\37\1\40\1\41\1\42\1\43\1\44\1\45\1\46\1\uffff\1\17\1\20";
    static final String DFA23_specialS =
        "\51\uffff}>";
    static final String[] DFA23_transitionS = {
            "\1\32\13\uffff\1\14\12\uffff\1\23\23\uffff\1\26\1\uffff\1\24\1\4\3\uffff\1\17\2\uffff\1\6\1\uffff\1\27\1\uffff\1\16\1\uffff\1\3\1\uffff\1\12\1\uffff\1\13\1\uffff\1\30\1\uffff\1\1\1\uffff\1\22\1\uffff\1\5\1\uffff\1\20\1\uffff\1\7\1\uffff\1\10\1\uffff\1\11\1\uffff\1\2\1\31\1\15\1\25\3\uffff\1\21\1\33\4\uffff\1\34\1\42\1\44\1\41\1\43\1\36\1\40\1\uffff\1\37\1\45\1\35",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "\1\46",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "\1\47\1\50",
            "",
            ""
    };

    static final short[] DFA23_eot = DFA.unpackEncodedString(DFA23_eotS);
    static final short[] DFA23_eof = DFA.unpackEncodedString(DFA23_eofS);
    static final char[] DFA23_min = DFA.unpackEncodedStringToUnsignedChars(DFA23_minS);
    static final char[] DFA23_max = DFA.unpackEncodedStringToUnsignedChars(DFA23_maxS);
    static final short[] DFA23_accept = DFA.unpackEncodedString(DFA23_acceptS);
    static final short[] DFA23_special = DFA.unpackEncodedString(DFA23_specialS);
    static final short[][] DFA23_transition;

    static {
        int numStates = DFA23_transitionS.length;
        DFA23_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA23_transition[i] = DFA.unpackEncodedString(DFA23_transitionS[i]);
        }
    }

    class DFA23 extends DFA {

        public DFA23(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 23;
            this.eot = DFA23_eot;
            this.eof = DFA23_eof;
            this.min = DFA23_min;
            this.max = DFA23_max;
            this.accept = DFA23_accept;
            this.special = DFA23_special;
            this.transition = DFA23_transition;
        }
        public String getDescription() {
            return "1381:1: (this_Actor_0= ruleActor | this_Aid_1= ruleAid | this_Block_2= ruleBlock | this_Break_3= ruleBreak | this_Dialog_4= ruleDialog | this_Title_5= ruleTitle | this_Heading1_6= ruleHeading1 | this_Heading2_7= ruleHeading2 | this_Heading3_8= ruleHeading3 | this_Hymn_9= ruleHymn | this_Media_10= ruleMedia | this_Info_11= ruleInfo | this_LitBook_12= ruleLitBook | this_Paragraph_13= ruleParagraph | this_PassThroughHtml_14= rulePassThroughHtml | this_PassThroughPdf_15= rulePassThroughPdf | this_Reading_16= ruleReading | this_RestoreLocale_17= ruleRestoreLocale | this_Rubric_18= ruleRubric | this_Section_19= ruleSection | this_SectionFragment_20= ruleSectionFragment | this_SetLocale_21= ruleSetLocale | this_TemplateFragment_22= ruleTemplateFragment | this_SubTitle_23= ruleSubTitle | this_Verse_24= ruleVerse | this_Version_25= ruleVersion | this_VersionSwitch_26= ruleVersionSwitch | this_WhenDate_27= ruleWhenDate | this_WhenDayName_28= ruleWhenDayName | this_WhenExists_29= ruleWhenExists | this_WhenLukanCycleDay_30= ruleWhenLukanCycleDay | this_WhenModeOfWeek_31= ruleWhenModeOfWeek | this_WhenPascha_32= ruleWhenPascha | this_WhenMovableCycleDay_33= ruleWhenMovableCycleDay | this_WhenPentecostarionDay_34= ruleWhenPentecostarionDay | this_WhenSundayAfterElevationOfCrossDay_35= ruleWhenSundayAfterElevationOfCrossDay | this_WhenTriodionDay_36= ruleWhenTriodionDay | this_WhenSundaysBeforeTriodion_37= ruleWhenSundaysBeforeTriodion )";
        }
    }
    static final String DFA41_eotS =
        "\46\uffff";
    static final String DFA41_eofS =
        "\46\uffff";
    static final String DFA41_minS =
        "\1\75\14\uffff\1\4\25\uffff\1\142\2\uffff";
    static final String DFA41_maxS =
        "\1\u0097\14\uffff\1\4\25\uffff\1\143\2\uffff";
    static final String DFA41_acceptS =
        "\1\uffff\1\1\1\2\1\3\1\4\1\5\1\6\1\7\1\10\1\11\1\12\1\13\1\14\1\uffff\1\17\1\20\1\21\1\22\1\23\1\24\1\25\1\26\1\27\1\30\1\31\1\32\1\33\1\34\1\35\1\36\1\37\1\40\1\41\1\42\1\43\1\uffff\1\15\1\16";
    static final String DFA41_specialS =
        "\46\uffff}>";
    static final String[] DFA41_transitionS = {
            "\1\4\4\uffff\1\12\3\uffff\1\21\23\uffff\1\24\1\uffff\1\22\1\3\3\uffff\1\15\2\uffff\1\25\1\uffff\1\26\1\uffff\1\14\1\uffff\1\2\1\uffff\1\11\1\uffff\1\13\1\uffff\1\27\1\uffff\1\1\1\uffff\1\20\1\uffff\1\5\1\uffff\1\16\1\uffff\1\6\1\uffff\1\7\1\uffff\1\10\4\uffff\1\23\3\uffff\1\17\1\30\4\uffff\1\31\1\37\1\41\1\35\1\40\1\33\1\36\1\uffff\1\34\1\42\1\32",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "\1\43",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "\1\44\1\45",
            "",
            ""
    };

    static final short[] DFA41_eot = DFA.unpackEncodedString(DFA41_eotS);
    static final short[] DFA41_eof = DFA.unpackEncodedString(DFA41_eofS);
    static final char[] DFA41_min = DFA.unpackEncodedStringToUnsignedChars(DFA41_minS);
    static final char[] DFA41_max = DFA.unpackEncodedStringToUnsignedChars(DFA41_maxS);
    static final short[] DFA41_accept = DFA.unpackEncodedString(DFA41_acceptS);
    static final short[] DFA41_special = DFA.unpackEncodedString(DFA41_specialS);
    static final short[][] DFA41_transition;

    static {
        int numStates = DFA41_transitionS.length;
        DFA41_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA41_transition[i] = DFA.unpackEncodedString(DFA41_transitionS[i]);
        }
    }

    class DFA41 extends DFA {

        public DFA41(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 41;
            this.eot = DFA41_eot;
            this.eof = DFA41_eof;
            this.min = DFA41_min;
            this.max = DFA41_max;
            this.accept = DFA41_accept;
            this.special = DFA41_special;
            this.transition = DFA41_transition;
        }
        public String getDescription() {
            return "2795:1: (this_Actor_0= ruleActor | this_Block_1= ruleBlock | this_Break_2= ruleBreak | this_Date_3= ruleDate | this_Dialog_4= ruleDialog | this_Heading1_5= ruleHeading1 | this_Heading2_6= ruleHeading2 | this_Heading3_7= ruleHeading3 | this_Hymn_8= ruleHymn | this_McDay_9= ruleMcDay | this_Media_10= ruleMedia | this_Paragraph_11= ruleParagraph | this_PassThroughHtml_12= rulePassThroughHtml | this_PassThroughPdf_13= rulePassThroughPdf | this_Reading_14= ruleReading | this_RestoreLocale_15= ruleRestoreLocale | this_Rubric_16= ruleRubric | this_Section_17= ruleSection | this_SectionFragment_18= ruleSectionFragment | this_SetLocale_19= ruleSetLocale | this_TemplateFragment_20= ruleTemplateFragment | this_Title_21= ruleTitle | this_SubTitle_22= ruleSubTitle | this_Verse_23= ruleVerse | this_WhenDate_24= ruleWhenDate | this_WhenDayName_25= ruleWhenDayName | this_WhenExists_26= ruleWhenExists | this_WhenLukanCycleDay_27= ruleWhenLukanCycleDay | this_WhenModeOfWeek_28= ruleWhenModeOfWeek | this_WhenMovableCycleDay_29= ruleWhenMovableCycleDay | this_WhenPascha_30= ruleWhenPascha | this_WhenPentecostarionDay_31= ruleWhenPentecostarionDay | this_WhenSundayAfterElevationOfCrossDay_32= ruleWhenSundayAfterElevationOfCrossDay | this_WhenTriodionDay_33= ruleWhenTriodionDay | this_WhenSundaysBeforeTriodion_34= ruleWhenSundaysBeforeTriodion )";
        }
    }
    static final String DFA69_eotS =
        "\12\uffff";
    static final String DFA69_eofS =
        "\1\uffff\7\11\2\uffff";
    static final String DFA69_minS =
        "\1\u00b0\7\u008a\2\uffff";
    static final String DFA69_maxS =
        "\1\u00b6\7\u008c\2\uffff";
    static final String DFA69_acceptS =
        "\10\uffff\1\1\1\2";
    static final String DFA69_specialS =
        "\12\uffff}>";
    static final String[] DFA69_transitionS = {
            "\1\1\1\2\1\3\1\4\1\5\1\6\1\7",
            "\1\11\1\10\1\11",
            "\1\11\1\10\1\11",
            "\1\11\1\10\1\11",
            "\1\11\1\10\1\11",
            "\1\11\1\10\1\11",
            "\1\11\1\10\1\11",
            "\1\11\1\10\1\11",
            "",
            ""
    };

    static final short[] DFA69_eot = DFA.unpackEncodedString(DFA69_eotS);
    static final short[] DFA69_eof = DFA.unpackEncodedString(DFA69_eofS);
    static final char[] DFA69_min = DFA.unpackEncodedStringToUnsignedChars(DFA69_minS);
    static final char[] DFA69_max = DFA.unpackEncodedStringToUnsignedChars(DFA69_maxS);
    static final short[] DFA69_accept = DFA.unpackEncodedString(DFA69_acceptS);
    static final short[] DFA69_special = DFA.unpackEncodedString(DFA69_specialS);
    static final short[][] DFA69_transition;

    static {
        int numStates = DFA69_transitionS.length;
        DFA69_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA69_transition[i] = DFA.unpackEncodedString(DFA69_transitionS[i]);
        }
    }

    class DFA69 extends DFA {

        public DFA69(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 69;
            this.eot = DFA69_eot;
            this.eof = DFA69_eof;
            this.min = DFA69_min;
            this.max = DFA69_max;
            this.accept = DFA69_accept;
            this.special = DFA69_special;
            this.transition = DFA69_transition;
        }
        public String getDescription() {
            return "5705:1: (this_DayNameRange_0= ruleDayNameRange | this_DayNameSet_1= ruleDayNameSet )";
        }
    }
 

    public static final BitSet FOLLOW_ruleAtemModel_in_entryRuleAtemModel75 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleAtemModel85 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_11_in_ruleAtemModel122 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_ruleQualifiedName_in_ruleAtemModel143 = new BitSet(new long[]{0x0800C8000000B000L,0x5555555234000050L,0x0000000000EFE18FL});
    public static final BitSet FOLLOW_ruleTemplateStatus_in_ruleAtemModel164 = new BitSet(new long[]{0x0800C0000000B000L,0x5555555234000050L,0x0000000000EFE18FL});
    public static final BitSet FOLLOW_ruleImport_in_ruleAtemModel186 = new BitSet(new long[]{0x0800C0000000B000L,0x5555555234000050L,0x0000000000EFE18FL});
    public static final BitSet FOLLOW_ruleDriver_in_ruleAtemModel208 = new BitSet(new long[]{0x0800800000003000L,0x5555555234000050L,0x0000000000EFE18FL});
    public static final BitSet FOLLOW_ruleHead_in_ruleAtemModel230 = new BitSet(new long[]{0x0800800000001000L,0x5555555234000050L,0x0000000000EFE18FL});
    public static final BitSet FOLLOW_rulePreface_in_ruleAtemModel252 = new BitSet(new long[]{0x0800800000001000L,0x5555555234000040L,0x0000000000EFE18FL});
    public static final BitSet FOLLOW_ruleAbstractComponent_in_ruleAtemModel274 = new BitSet(new long[]{0x0800800000001000L,0x5555555234000040L,0x0000000000EFE18FL});
    public static final BitSet FOLLOW_12_in_ruleAtemModel287 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleHead_in_entryRuleHead323 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleHead333 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_13_in_ruleHead370 = new BitSet(new long[]{0x200002002AA80000L,0x0000000080000004L});
    public static final BitSet FOLLOW_ruleHeadComponent_in_ruleHead391 = new BitSet(new long[]{0x200002002AA84000L,0x0000000080000004L});
    public static final BitSet FOLLOW_14_in_ruleHead404 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleHeadComponent_in_entryRuleHeadComponent440 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleHeadComponent450 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCommemoration_in_ruleHeadComponent497 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDate_in_ruleHeadComponent524 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleMcDay_in_ruleHeadComponent551 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePageHeaderEven_in_ruleHeadComponent578 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePageHeaderOdd_in_ruleHeadComponent605 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePageFooterEven_in_ruleHeadComponent632 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePageFooterOdd_in_ruleHeadComponent659 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePageKeepWithNext_in_ruleHeadComponent686 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePageNumber_in_ruleHeadComponent713 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTemplateTitle_in_ruleHeadComponent740 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDriver_in_entryRuleDriver775 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleDriver785 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_15_in_ruleDriver822 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_16_in_ruleDriver834 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleDriver851 = new BitSet(new long[]{0x0000000000060000L});
    public static final BitSet FOLLOW_17_in_ruleDriver869 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x00000001E0000000L});
    public static final BitSet FOLLOW_ruleTemplateStatuses_in_ruleDriver890 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_18_in_ruleDriver904 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTemplateTitle_in_entryRuleTemplateTitle940 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleTemplateTitle950 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_19_in_ruleTemplateTitle987 = new BitSet(new long[]{0x000001EC00000000L});
    public static final BitSet FOLLOW_ruleHeaderFooterFragment_in_ruleTemplateTitle1008 = new BitSet(new long[]{0x000001EC00100000L});
    public static final BitSet FOLLOW_20_in_ruleTemplateTitle1021 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePageKeepWithNext_in_entryRulePageKeepWithNext1057 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulePageKeepWithNext1067 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_21_in_rulePageKeepWithNext1104 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_STRING_in_rulePageKeepWithNext1121 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_22_in_rulePageKeepWithNext1138 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePageHeaderEven_in_entryRulePageHeaderEven1174 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulePageHeaderEven1184 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_23_in_rulePageHeaderEven1221 = new BitSet(new long[]{0x0000000380000000L});
    public static final BitSet FOLLOW_ruleHeaderFooterColumn_in_rulePageHeaderEven1242 = new BitSet(new long[]{0x0000000381000000L});
    public static final BitSet FOLLOW_24_in_rulePageHeaderEven1255 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePageHeaderOdd_in_entryRulePageHeaderOdd1291 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulePageHeaderOdd1301 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_25_in_rulePageHeaderOdd1338 = new BitSet(new long[]{0x0000000380000000L});
    public static final BitSet FOLLOW_ruleHeaderFooterColumn_in_rulePageHeaderOdd1359 = new BitSet(new long[]{0x0000000384000000L});
    public static final BitSet FOLLOW_26_in_rulePageHeaderOdd1372 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePageFooterEven_in_entryRulePageFooterEven1408 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulePageFooterEven1418 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_27_in_rulePageFooterEven1455 = new BitSet(new long[]{0x0000000380000000L});
    public static final BitSet FOLLOW_ruleHeaderFooterColumn_in_rulePageFooterEven1476 = new BitSet(new long[]{0x0000000390000000L});
    public static final BitSet FOLLOW_28_in_rulePageFooterEven1489 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePageFooterOdd_in_entryRulePageFooterOdd1525 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulePageFooterOdd1535 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_29_in_rulePageFooterOdd1572 = new BitSet(new long[]{0x0000000380000000L});
    public static final BitSet FOLLOW_ruleHeaderFooterColumn_in_rulePageFooterOdd1593 = new BitSet(new long[]{0x00000003C0000000L});
    public static final BitSet FOLLOW_30_in_rulePageFooterOdd1606 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleHeaderFooterColumn_in_entryRuleHeaderFooterColumn1642 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleHeaderFooterColumn1652 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleHeaderFooterColumnLeft_in_ruleHeaderFooterColumn1699 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleHeaderFooterColumnCenter_in_ruleHeaderFooterColumn1726 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleHeaderFooterColumnRight_in_ruleHeaderFooterColumn1753 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleHeaderFooterColumnLeft_in_entryRuleHeaderFooterColumnLeft1788 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleHeaderFooterColumnLeft1798 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_31_in_ruleHeaderFooterColumnLeft1835 = new BitSet(new long[]{0x000001EC00000000L});
    public static final BitSet FOLLOW_ruleHeaderFooterFragment_in_ruleHeaderFooterColumnLeft1856 = new BitSet(new long[]{0x000001EC00000002L});
    public static final BitSet FOLLOW_ruleHeaderFooterColumnCenter_in_entryRuleHeaderFooterColumnCenter1893 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleHeaderFooterColumnCenter1903 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_32_in_ruleHeaderFooterColumnCenter1940 = new BitSet(new long[]{0x000001EC00000000L});
    public static final BitSet FOLLOW_ruleHeaderFooterFragment_in_ruleHeaderFooterColumnCenter1961 = new BitSet(new long[]{0x000001EC00000002L});
    public static final BitSet FOLLOW_ruleHeaderFooterColumnRight_in_entryRuleHeaderFooterColumnRight1998 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleHeaderFooterColumnRight2008 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_33_in_ruleHeaderFooterColumnRight2045 = new BitSet(new long[]{0x000001EC00000000L});
    public static final BitSet FOLLOW_ruleHeaderFooterFragment_in_ruleHeaderFooterColumnRight2066 = new BitSet(new long[]{0x000001EC00000002L});
    public static final BitSet FOLLOW_ruleHeaderFooterFragment_in_entryRuleHeaderFooterFragment2103 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleHeaderFooterFragment2113 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleHeaderFooterText_in_ruleHeaderFooterFragment2160 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleHeaderFooterDate_in_ruleHeaderFooterFragment2187 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleHeaderFooterPageNumber_in_ruleHeaderFooterFragment2214 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleHeaderFooterLookup_in_ruleHeaderFooterFragment2241 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleHeaderFooterTitle_in_ruleHeaderFooterFragment2268 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleHeaderFooterCommemoration_in_ruleHeaderFooterFragment2295 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleHeaderFooterText_in_entryRuleHeaderFooterText2330 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleHeaderFooterText2340 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_34_in_ruleHeaderFooterText2377 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleHeaderFooterText2394 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleHeaderFooterDate_in_entryRuleHeaderFooterDate2435 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleHeaderFooterDate2445 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_35_in_ruleHeaderFooterDate2488 = new BitSet(new long[]{0x0000001000000002L});
    public static final BitSet FOLLOW_36_in_ruleHeaderFooterDate2514 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000003000000L});
    public static final BitSet FOLLOW_ruleLanguage_in_ruleHeaderFooterDate2535 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleHeaderFooterPageNumber_in_entryRuleHeaderFooterPageNumber2573 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleHeaderFooterPageNumber2583 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_37_in_ruleHeaderFooterPageNumber2625 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleHeaderFooterLookup_in_entryRuleHeaderFooterLookup2673 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleHeaderFooterLookup2683 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_38_in_ruleHeaderFooterLookup2720 = new BitSet(new long[]{0x0192001000000000L});
    public static final BitSet FOLLOW_ruleElementType_in_ruleHeaderFooterLookup2741 = new BitSet(new long[]{0x0192001000000000L});
    public static final BitSet FOLLOW_36_in_ruleHeaderFooterLookup2754 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000003000000L});
    public static final BitSet FOLLOW_ruleLanguage_in_ruleHeaderFooterLookup2775 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleHeaderFooterTitle_in_entryRuleHeaderFooterTitle2811 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleHeaderFooterTitle2821 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_39_in_ruleHeaderFooterTitle2863 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleHeaderFooterCommemoration_in_entryRuleHeaderFooterCommemoration2911 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleHeaderFooterCommemoration2921 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_40_in_ruleHeaderFooterCommemoration2963 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCommemoration_in_entryRuleCommemoration3011 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleCommemoration3021 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_41_in_ruleCommemoration3058 = new BitSet(new long[]{0x000001EC00000000L});
    public static final BitSet FOLLOW_ruleHeaderFooterFragment_in_ruleCommemoration3079 = new BitSet(new long[]{0x000005EC00000000L});
    public static final BitSet FOLLOW_42_in_ruleCommemoration3092 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTemplateStatus_in_entryRuleTemplateStatus3128 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleTemplateStatus3138 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_43_in_ruleTemplateStatus3175 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x00000001E0000000L});
    public static final BitSet FOLLOW_ruleTemplateStatuses_in_ruleTemplateStatus3196 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAbstractComponent_in_entryRuleAbstractComponent3232 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleAbstractComponent3242 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleActor_in_ruleAbstractComponent3289 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAid_in_ruleAbstractComponent3316 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBlock_in_ruleAbstractComponent3343 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBreak_in_ruleAbstractComponent3370 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDialog_in_ruleAbstractComponent3397 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTitle_in_ruleAbstractComponent3424 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleHeading1_in_ruleAbstractComponent3451 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleHeading2_in_ruleAbstractComponent3478 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleHeading3_in_ruleAbstractComponent3505 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleHymn_in_ruleAbstractComponent3532 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleMedia_in_ruleAbstractComponent3559 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleInfo_in_ruleAbstractComponent3586 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleLitBook_in_ruleAbstractComponent3613 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleParagraph_in_ruleAbstractComponent3640 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePassThroughHtml_in_ruleAbstractComponent3667 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePassThroughPdf_in_ruleAbstractComponent3694 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleReading_in_ruleAbstractComponent3721 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleRestoreLocale_in_ruleAbstractComponent3748 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleRubric_in_ruleAbstractComponent3775 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSection_in_ruleAbstractComponent3802 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSectionFragment_in_ruleAbstractComponent3829 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSetLocale_in_ruleAbstractComponent3856 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTemplateFragment_in_ruleAbstractComponent3883 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSubTitle_in_ruleAbstractComponent3910 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleVerse_in_ruleAbstractComponent3937 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleVersion_in_ruleAbstractComponent3964 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleVersionSwitch_in_ruleAbstractComponent3991 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleWhenDate_in_ruleAbstractComponent4018 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleWhenDayName_in_ruleAbstractComponent4045 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleWhenExists_in_ruleAbstractComponent4072 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleWhenLukanCycleDay_in_ruleAbstractComponent4099 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleWhenModeOfWeek_in_ruleAbstractComponent4126 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleWhenPascha_in_ruleAbstractComponent4153 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleWhenMovableCycleDay_in_ruleAbstractComponent4180 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleWhenPentecostarionDay_in_ruleAbstractComponent4207 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleWhenSundayAfterElevationOfCrossDay_in_ruleAbstractComponent4234 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleWhenTriodionDay_in_ruleAbstractComponent4261 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleWhenSundaysBeforeTriodion_in_ruleAbstractComponent4288 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleQualifiedName_in_entryRuleQualifiedName4324 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleQualifiedName4335 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleQualifiedName4375 = new BitSet(new long[]{0x0000100000000002L});
    public static final BitSet FOLLOW_44_in_ruleQualifiedName4394 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleQualifiedName4409 = new BitSet(new long[]{0x0000100000000002L});
    public static final BitSet FOLLOW_ruleQualifiedNameWithWildCard_in_entryRuleQualifiedNameWithWildCard4457 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleQualifiedNameWithWildCard4468 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleQualifiedName_in_ruleQualifiedNameWithWildCard4515 = new BitSet(new long[]{0x0000200000000002L});
    public static final BitSet FOLLOW_45_in_ruleQualifiedNameWithWildCard4534 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleImport_in_entryRuleImport4576 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleImport4586 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_46_in_ruleImport4623 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_ruleQualifiedNameWithWildCard_in_ruleImport4644 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleVersionSwitch_in_entryRuleVersionSwitch4680 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleVersionSwitch4690 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_47_in_ruleVersionSwitch4727 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000007000000L});
    public static final BitSet FOLLOW_ruleVersionSwitchType_in_ruleVersionSwitch4748 = new BitSet(new long[]{0x0001000000000000L});
    public static final BitSet FOLLOW_48_in_ruleVersionSwitch4760 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleResourceText_in_entryRuleResourceText4796 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleResourceText4806 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_49_in_ruleResourceText4843 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_ruleQualifiedName_in_ruleResourceText4866 = new BitSet(new long[]{0x000C000000000002L});
    public static final BitSet FOLLOW_50_in_ruleResourceText4884 = new BitSet(new long[]{0x0008000000000002L});
    public static final BitSet FOLLOW_51_in_ruleResourceText4916 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleLookup_in_entryRuleLookup4966 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleLookup4976 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_52_in_ruleLookup5013 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_ruleQualifiedName_in_ruleLookup5036 = new BitSet(new long[]{0x006C000000000002L});
    public static final BitSet FOLLOW_50_in_ruleLookup5054 = new BitSet(new long[]{0x0068000000000002L});
    public static final BitSet FOLLOW_51_in_ruleLookup5086 = new BitSet(new long[]{0x0060000000000002L});
    public static final BitSet FOLLOW_53_in_ruleLookup5119 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x000001FE00000000L});
    public static final BitSet FOLLOW_ruleModeTypes_in_ruleLookup5153 = new BitSet(new long[]{0x0040000000000002L});
    public static final BitSet FOLLOW_54_in_ruleLookup5174 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000FE0000000000L});
    public static final BitSet FOLLOW_ruleDowTypes_in_ruleLookup5208 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleLDP_in_entryRuleLDP5246 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleLDP5256 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_55_in_ruleLDP5293 = new BitSet(new long[]{0x0000000000000002L,0x0000000003FFFE00L});
    public static final BitSet FOLLOW_ruleLdpType_in_ruleLDP5314 = new BitSet(new long[]{0x0000000000000002L,0x0000000003FFFE00L});
    public static final BitSet FOLLOW_ruleTaggedText_in_entryRuleTaggedText5351 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleTaggedText5361 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_56_in_ruleTaggedText5398 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_ruleQualifiedName_in_ruleTaggedText5421 = new BitSet(new long[]{0x0200000000000000L});
    public static final BitSet FOLLOW_57_in_ruleTaggedText5433 = new BitSet(new long[]{0x0592000000000000L});
    public static final BitSet FOLLOW_ruleElementType_in_ruleTaggedText5454 = new BitSet(new long[]{0x0592000000000000L});
    public static final BitSet FOLLOW_58_in_ruleTaggedText5467 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleInfo_in_entryRuleInfo5503 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleInfo5513 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_59_in_ruleInfo5550 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleInfo5567 = new BitSet(new long[]{0x1000800000000000L,0x0000055000000000L});
    public static final BitSet FOLLOW_ruleInfoElementType_in_ruleInfo5593 = new BitSet(new long[]{0x1000800000000000L,0x0000055000000000L});
    public static final BitSet FOLLOW_60_in_ruleInfo5606 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleInfoElementType_in_entryRuleInfoElementType5642 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleInfoElementType5652 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleVersionSwitch_in_ruleInfoElementType5699 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBlock_in_ruleInfoElementType5726 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleParagraph_in_ruleInfoElementType5753 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSubTitle_in_ruleInfoElementType5780 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTitle_in_ruleInfoElementType5807 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDate_in_entryRuleDate5842 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleDate5852 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_61_in_ruleDate5889 = new BitSet(new long[]{0x4000000000000000L});
    public static final BitSet FOLLOW_62_in_ruleDate5901 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_RULE_INT_in_ruleDate5918 = new BitSet(new long[]{0x8000000000000000L});
    public static final BitSet FOLLOW_63_in_ruleDate5935 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_RULE_INT_in_ruleDate5952 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000003L});
    public static final BitSet FOLLOW_64_in_ruleDate5970 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_RULE_INT_in_ruleDate5987 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000002L});
    public static final BitSet FOLLOW_65_in_ruleDate6006 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleMcDay_in_entryRuleMcDay6042 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleMcDay6052 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_66_in_ruleMcDay6089 = new BitSet(new long[]{0x8000000000000000L});
    public static final BitSet FOLLOW_63_in_ruleMcDay6101 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_RULE_INT_in_ruleMcDay6118 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000008L});
    public static final BitSet FOLLOW_67_in_ruleMcDay6135 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePreface_in_entryRulePreface6171 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulePreface6181 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_68_in_rulePreface6218 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_ID_in_rulePreface6235 = new BitSet(new long[]{0x0000800000000000L,0x0000055014000060L});
    public static final BitSet FOLLOW_rulePrefaceElementType_in_rulePreface6261 = new BitSet(new long[]{0x0000800000000000L,0x0000055014000060L});
    public static final BitSet FOLLOW_69_in_rulePreface6274 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePrefaceElementType_in_entryRulePrefaceElementType6310 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulePrefaceElementType6320 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleVersionSwitch_in_rulePrefaceElementType6367 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBlock_in_rulePrefaceElementType6394 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleParagraph_in_rulePrefaceElementType6421 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSection_in_rulePrefaceElementType6448 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSectionFragment_in_rulePrefaceElementType6475 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSubTitle_in_rulePrefaceElementType6502 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTemplateFragment_in_rulePrefaceElementType6529 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTitle_in_rulePrefaceElementType6556 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSection_in_entryRuleSection6591 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleSection6601 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_70_in_ruleSection6638 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleSection6655 = new BitSet(new long[]{0x2800800000000000L,0x55555552340001C4L,0x0000000000EFE18FL});
    public static final BitSet FOLLOW_71_in_ruleSection6673 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_ruleQualifiedName_in_ruleSection6696 = new BitSet(new long[]{0x2800800000000000L,0x5555555234000144L,0x0000000000EFE18FL});
    public static final BitSet FOLLOW_ruleSectionElementType_in_ruleSection6719 = new BitSet(new long[]{0x2800800000000000L,0x5555555234000144L,0x0000000000EFE18FL});
    public static final BitSet FOLLOW_72_in_ruleSection6732 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSectionElementType_in_entryRuleSectionElementType6768 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleSectionElementType6778 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleActor_in_ruleSectionElementType6825 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBlock_in_ruleSectionElementType6852 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBreak_in_ruleSectionElementType6879 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDate_in_ruleSectionElementType6906 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDialog_in_ruleSectionElementType6933 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleHeading1_in_ruleSectionElementType6960 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleHeading2_in_ruleSectionElementType6987 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleHeading3_in_ruleSectionElementType7014 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleHymn_in_ruleSectionElementType7041 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleMcDay_in_ruleSectionElementType7068 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleMedia_in_ruleSectionElementType7095 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleParagraph_in_ruleSectionElementType7122 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePassThroughHtml_in_ruleSectionElementType7149 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePassThroughPdf_in_ruleSectionElementType7176 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleReading_in_ruleSectionElementType7203 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleRestoreLocale_in_ruleSectionElementType7230 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleRubric_in_ruleSectionElementType7257 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSection_in_ruleSectionElementType7284 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSectionFragment_in_ruleSectionElementType7311 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSetLocale_in_ruleSectionElementType7338 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTemplateFragment_in_ruleSectionElementType7365 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTitle_in_ruleSectionElementType7392 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSubTitle_in_ruleSectionElementType7419 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleVerse_in_ruleSectionElementType7446 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleWhenDate_in_ruleSectionElementType7473 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleWhenDayName_in_ruleSectionElementType7500 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleWhenExists_in_ruleSectionElementType7527 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleWhenLukanCycleDay_in_ruleSectionElementType7554 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleWhenModeOfWeek_in_ruleSectionElementType7581 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleWhenMovableCycleDay_in_ruleSectionElementType7608 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleWhenPascha_in_ruleSectionElementType7635 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleWhenPentecostarionDay_in_ruleSectionElementType7662 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleWhenSundayAfterElevationOfCrossDay_in_ruleSectionElementType7689 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleWhenTriodionDay_in_ruleSectionElementType7716 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleWhenSundaysBeforeTriodion_in_ruleSectionElementType7743 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleLdpType_in_entryRuleLdpType7778 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleLdpType7788 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDOM_in_ruleLdpType7835 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDOWN_in_ruleLdpType7862 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDOWT_in_ruleLdpType7889 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEOW_in_ruleLdpType7916 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAll_in_ruleLdpType7943 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleGenDate_in_ruleLdpType7970 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleGenYear_in_ruleLdpType7997 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleMCD_in_ruleLdpType8024 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleMOW_in_ruleLdpType8051 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleNOP_in_ruleLdpType8078 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDOP_in_ruleLdpType8105 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSAEC_in_ruleLdpType8132 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSOL_in_ruleLdpType8159 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDOL_in_ruleLdpType8186 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleWOLC_in_ruleLdpType8213 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleWDOLC_in_ruleLdpType8240 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSBT_in_ruleLdpType8267 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAll_in_entryRuleAll8302 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleAll8312 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_73_in_ruleAll8354 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleGenDate_in_entryRuleGenDate8402 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleGenDate8412 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_74_in_ruleGenDate8454 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleGenYear_in_entryRuleGenYear8502 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleGenYear8512 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_75_in_ruleGenYear8554 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleMCD_in_entryRuleMCD8602 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleMCD8612 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_76_in_ruleMCD8654 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleMOW_in_entryRuleMOW8702 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleMOW8712 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_77_in_ruleMOW8754 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleNOP_in_entryRuleNOP8802 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleNOP8812 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_78_in_ruleNOP8854 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDOM_in_entryRuleDOM8902 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleDOM8912 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_79_in_ruleDOM8954 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDOP_in_entryRuleDOP9002 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleDOP9012 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_80_in_ruleDOP9054 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDOWN_in_entryRuleDOWN9102 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleDOWN9112 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_81_in_ruleDOWN9154 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDOWT_in_entryRuleDOWT9202 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleDOWT9212 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_82_in_ruleDOWT9254 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEOW_in_entryRuleEOW9302 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleEOW9312 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_83_in_ruleEOW9354 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSAEC_in_entryRuleSAEC9402 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleSAEC9412 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_84_in_ruleSAEC9454 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSOL_in_entryRuleSOL9502 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleSOL9512 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_85_in_ruleSOL9554 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDOL_in_entryRuleDOL9602 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleDOL9612 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_86_in_ruleDOL9654 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleWOLC_in_entryRuleWOLC9702 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleWOLC9712 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_87_in_ruleWOLC9754 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleWDOLC_in_entryRuleWDOLC9802 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleWDOLC9812 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_88_in_ruleWDOLC9854 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSBT_in_entryRuleSBT9902 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleSBT9912 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_89_in_ruleSBT9954 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTemplateFragment_in_entryRuleTemplateFragment10002 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleTemplateFragment10012 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_90_in_ruleTemplateFragment10049 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_ruleQualifiedName_in_ruleTemplateFragment10072 = new BitSet(new long[]{0x0000000000000000L,0x0000000008000000L});
    public static final BitSet FOLLOW_91_in_ruleTemplateFragment10084 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSectionFragment_in_entryRuleSectionFragment10122 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleSectionFragment10132 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_92_in_ruleSectionFragment10169 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_ruleQualifiedName_in_ruleSectionFragment10192 = new BitSet(new long[]{0x0000000000000000L,0x0000000008000000L});
    public static final BitSet FOLLOW_91_in_ruleSectionFragment10204 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBreak_in_entryRuleBreak10240 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleBreak10250 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_93_in_ruleBreak10287 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000018000000L});
    public static final BitSet FOLLOW_ruleBreakType_in_ruleBreak10308 = new BitSet(new long[]{0x0000000000000000L,0x0000000040000000L});
    public static final BitSet FOLLOW_94_in_ruleBreak10320 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePageNumber_in_entryRulePageNumber10356 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulePageNumber10366 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_95_in_rulePageNumber10403 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_RULE_INT_in_rulePageNumber10420 = new BitSet(new long[]{0x0000000000000000L,0x0000000100000000L});
    public static final BitSet FOLLOW_96_in_rulePageNumber10437 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePassThroughHtml_in_entryRulePassThroughHtml10473 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulePassThroughHtml10483 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_97_in_rulePassThroughHtml10520 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_STRING_in_rulePassThroughHtml10537 = new BitSet(new long[]{0x0000000000000000L,0x0000000400000000L});
    public static final BitSet FOLLOW_98_in_rulePassThroughHtml10554 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePassThroughPdf_in_entryRulePassThroughPdf10590 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulePassThroughPdf10600 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_97_in_rulePassThroughPdf10637 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_STRING_in_rulePassThroughPdf10654 = new BitSet(new long[]{0x0000000000000000L,0x0000000800000000L});
    public static final BitSet FOLLOW_99_in_rulePassThroughPdf10671 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTitle_in_entryRuleTitle10707 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleTitle10717 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_100_in_ruleTitle10754 = new BitSet(new long[]{0x0192000000000000L,0x0000002000000080L});
    public static final BitSet FOLLOW_71_in_ruleTitle10767 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_ruleQualifiedName_in_ruleTitle10790 = new BitSet(new long[]{0x0192000000000000L,0x0000002000000000L});
    public static final BitSet FOLLOW_ruleElementType_in_ruleTitle10813 = new BitSet(new long[]{0x0192000000000000L,0x0000002000000000L});
    public static final BitSet FOLLOW_101_in_ruleTitle10826 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSubTitle_in_entryRuleSubTitle10862 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleSubTitle10872 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_102_in_ruleSubTitle10909 = new BitSet(new long[]{0x0192000000000000L,0x0000008000000080L});
    public static final BitSet FOLLOW_71_in_ruleSubTitle10922 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_ruleQualifiedName_in_ruleSubTitle10945 = new BitSet(new long[]{0x0192000000000000L,0x0000008000000000L});
    public static final BitSet FOLLOW_ruleElementType_in_ruleSubTitle10968 = new BitSet(new long[]{0x0192000000000000L,0x0000008000000000L});
    public static final BitSet FOLLOW_103_in_ruleSubTitle10981 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleParagraph_in_entryRuleParagraph11017 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleParagraph11027 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_104_in_ruleParagraph11064 = new BitSet(new long[]{0x0192000000000000L,0x0000020000000080L});
    public static final BitSet FOLLOW_71_in_ruleParagraph11077 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_ruleQualifiedName_in_ruleParagraph11100 = new BitSet(new long[]{0x0192000000000000L,0x0000020000000000L});
    public static final BitSet FOLLOW_ruleElementType_in_ruleParagraph11123 = new BitSet(new long[]{0x0192000000000000L,0x0000020000000000L});
    public static final BitSet FOLLOW_105_in_ruleParagraph11136 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBlock_in_entryRuleBlock11172 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleBlock11182 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_106_in_ruleBlock11219 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_ruleQualifiedName_in_ruleBlock11242 = new BitSet(new long[]{0x0192000000000000L,0x0000080000000000L});
    public static final BitSet FOLLOW_ruleElementType_in_ruleBlock11263 = new BitSet(new long[]{0x0192000000000000L,0x0000080000000000L});
    public static final BitSet FOLLOW_107_in_ruleBlock11276 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleHymn_in_entryRuleHymn11312 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleHymn11322 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_108_in_ruleHymn11359 = new BitSet(new long[]{0x0192000000000000L,0x0000200000000000L});
    public static final BitSet FOLLOW_ruleElementType_in_ruleHymn11380 = new BitSet(new long[]{0x0192000000000000L,0x0000200000000000L});
    public static final BitSet FOLLOW_109_in_ruleHymn11393 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleMedia_in_entryRuleMedia11429 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleMedia11439 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_110_in_ruleMedia11476 = new BitSet(new long[]{0x0192000000000000L,0x0000800000000000L});
    public static final BitSet FOLLOW_ruleElementType_in_ruleMedia11497 = new BitSet(new long[]{0x0192000000000000L,0x0000800000000000L});
    public static final BitSet FOLLOW_111_in_ruleMedia11510 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleVerse_in_entryRuleVerse11546 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleVerse11556 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_112_in_ruleVerse11593 = new BitSet(new long[]{0x0192000000000000L,0x0002000000000000L});
    public static final BitSet FOLLOW_ruleElementType_in_ruleVerse11614 = new BitSet(new long[]{0x0192000000000000L,0x0002000000000000L});
    public static final BitSet FOLLOW_113_in_ruleVerse11627 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleActor_in_entryRuleActor11663 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleActor11673 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_114_in_ruleActor11710 = new BitSet(new long[]{0x0192000000000000L,0x0008000000000000L});
    public static final BitSet FOLLOW_ruleElementType_in_ruleActor11731 = new BitSet(new long[]{0x0192000000000000L,0x0008000000000000L});
    public static final BitSet FOLLOW_115_in_ruleActor11744 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleRubric_in_entryRuleRubric11780 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleRubric11790 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_116_in_ruleRubric11827 = new BitSet(new long[]{0x0192000000000000L,0x0020000000000000L});
    public static final BitSet FOLLOW_ruleElementType_in_ruleRubric11848 = new BitSet(new long[]{0x0192000000000000L,0x0020000000000000L});
    public static final BitSet FOLLOW_117_in_ruleRubric11861 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDialog_in_entryRuleDialog11897 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleDialog11907 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_118_in_ruleDialog11944 = new BitSet(new long[]{0x0192000000000000L,0x0080000000000000L});
    public static final BitSet FOLLOW_ruleElementType_in_ruleDialog11965 = new BitSet(new long[]{0x0192000000000000L,0x0080000000000000L});
    public static final BitSet FOLLOW_119_in_ruleDialog11978 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleReading_in_entryRuleReading12014 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleReading12024 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_120_in_ruleReading12061 = new BitSet(new long[]{0x0192000000000000L,0x0200000000000000L});
    public static final BitSet FOLLOW_ruleElementType_in_ruleReading12082 = new BitSet(new long[]{0x0192000000000000L,0x0200000000000000L});
    public static final BitSet FOLLOW_121_in_ruleReading12095 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleHeading1_in_entryRuleHeading112131 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleHeading112141 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_122_in_ruleHeading112178 = new BitSet(new long[]{0x0192000000000000L,0x0800000000000000L});
    public static final BitSet FOLLOW_ruleElementType_in_ruleHeading112199 = new BitSet(new long[]{0x0192000000000000L,0x0800000000000000L});
    public static final BitSet FOLLOW_123_in_ruleHeading112212 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleHeading2_in_entryRuleHeading212248 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleHeading212258 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_124_in_ruleHeading212295 = new BitSet(new long[]{0x0192000000000000L,0x2000000000000000L});
    public static final BitSet FOLLOW_ruleElementType_in_ruleHeading212316 = new BitSet(new long[]{0x0192000000000000L,0x2000000000000000L});
    public static final BitSet FOLLOW_125_in_ruleHeading212329 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleHeading3_in_entryRuleHeading312365 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleHeading312375 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_126_in_ruleHeading312412 = new BitSet(new long[]{0x0192000000000000L,0x8000000000000000L});
    public static final BitSet FOLLOW_ruleElementType_in_ruleHeading312433 = new BitSet(new long[]{0x0192000000000000L,0x8000000000000000L});
    public static final BitSet FOLLOW_127_in_ruleHeading312446 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleElementType_in_entryRuleElementType12482 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleElementType12492 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleResourceText_in_ruleElementType12539 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTaggedText_in_ruleElementType12566 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleLookup_in_ruleElementType12593 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleLDP_in_ruleElementType12620 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAid_in_entryRuleAid12655 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleAid12665 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_128_in_ruleAid12702 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_ruleQualifiedName_in_ruleAid12723 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleVersion_in_entryRuleVersion12759 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleVersion12769 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_129_in_ruleVersion12806 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_ruleQualifiedName_in_ruleVersion12827 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleLitBook_in_entryRuleLitBook12863 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleLitBook12873 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_130_in_ruleLitBook12910 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_ruleQualifiedName_in_ruleLitBook12931 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSetLocale_in_entryRuleSetLocale12967 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleSetLocale12977 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_131_in_ruleSetLocale13014 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000010L});
    public static final BitSet FOLLOW_132_in_ruleSetLocale13026 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleSetLocale13043 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000020L});
    public static final BitSet FOLLOW_133_in_ruleSetLocale13060 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleSetLocale13077 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000040L});
    public static final BitSet FOLLOW_134_in_ruleSetLocale13094 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleRestoreLocale_in_entryRuleRestoreLocale13130 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleRestoreLocale13140 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_135_in_ruleRestoreLocale13182 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleWhenDate_in_entryRuleWhenDate13230 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleWhenDate13240 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_136_in_ruleWhenDate13277 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0xFF80000000000000L,0x0000000000000007L});
    public static final BitSet FOLLOW_ruleWhenDateCase_in_ruleWhenDate13298 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0xFF80000000100200L,0x0000000000000007L});
    public static final BitSet FOLLOW_ruleWhenOther_in_ruleWhenDate13320 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000200L});
    public static final BitSet FOLLOW_137_in_ruleWhenDate13333 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleWhenDateCase_in_entryRuleWhenDateCase13369 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleWhenDateCase13379 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleMonthName_in_ruleWhenDateCase13425 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_ruleAbstractDateCase_in_ruleWhenDateCase13446 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000400L});
    public static final BitSet FOLLOW_138_in_ruleWhenDateCase13458 = new BitSet(new long[]{0x0800800000000002L,0x5555555234000040L,0x0000000000EFE18FL});
    public static final BitSet FOLLOW_ruleAbstractComponent_in_ruleWhenDateCase13479 = new BitSet(new long[]{0x0800800000000002L,0x5555555234000040L,0x0000000000EFE18FL});
    public static final BitSet FOLLOW_ruleAbstractDateCase_in_entryRuleAbstractDateCase13516 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleAbstractDateCase13526 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDateRange_in_ruleAbstractDateCase13573 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDateSet_in_ruleAbstractDateCase13600 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDateRange_in_entryRuleDateRange13635 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleDateRange13645 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_INT_in_ruleDateRange13687 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000800L});
    public static final BitSet FOLLOW_139_in_ruleDateRange13704 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_RULE_INT_in_ruleDateRange13721 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDateSet_in_entryRuleDateSet13762 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleDateSet13772 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_INT_in_ruleDateSet13814 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000000L,0x0000000000001000L});
    public static final BitSet FOLLOW_140_in_ruleDateSet13832 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_RULE_INT_in_ruleDateSet13849 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000000L,0x0000000000001000L});
    public static final BitSet FOLLOW_ruleWhenDayName_in_entryRuleWhenDayName13892 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleWhenDayName13902 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_141_in_ruleWhenDayName13939 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x007F000000000000L});
    public static final BitSet FOLLOW_ruleWhenDayNameCase_in_ruleWhenDayName13960 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x007F000000100200L});
    public static final BitSet FOLLOW_ruleWhenOther_in_ruleWhenDayName13982 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000200L});
    public static final BitSet FOLLOW_137_in_ruleWhenDayName13995 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleWhenDayNameCase_in_entryRuleWhenDayNameCase14031 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleWhenDayNameCase14041 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAbstractDayNameCase_in_ruleWhenDayNameCase14087 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000400L});
    public static final BitSet FOLLOW_138_in_ruleWhenDayNameCase14099 = new BitSet(new long[]{0x0800800000000002L,0x5555555234000040L,0x0000000000EFE18FL});
    public static final BitSet FOLLOW_ruleAbstractComponent_in_ruleWhenDayNameCase14120 = new BitSet(new long[]{0x0800800000000002L,0x5555555234000040L,0x0000000000EFE18FL});
    public static final BitSet FOLLOW_ruleAbstractDayNameCase_in_entryRuleAbstractDayNameCase14157 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleAbstractDayNameCase14167 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDayNameRange_in_ruleAbstractDayNameCase14214 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDayNameSet_in_ruleAbstractDayNameCase14241 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDayNameRange_in_entryRuleDayNameRange14276 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleDayNameRange14286 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDayOfWeek_in_ruleDayNameRange14332 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000800L});
    public static final BitSet FOLLOW_139_in_ruleDayNameRange14344 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x007F000000000000L});
    public static final BitSet FOLLOW_ruleDayOfWeek_in_ruleDayNameRange14365 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDayNameSet_in_entryRuleDayNameSet14401 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleDayNameSet14411 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDayOfWeek_in_ruleDayNameSet14457 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000000L,0x0000000000001000L});
    public static final BitSet FOLLOW_140_in_ruleDayNameSet14470 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x007F000000000000L});
    public static final BitSet FOLLOW_ruleDayOfWeek_in_ruleDayNameSet14491 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000000L,0x0000000000001000L});
    public static final BitSet FOLLOW_ruleWhenPentecostarionDay_in_entryRuleWhenPentecostarionDay14529 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleWhenPentecostarionDay14539 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_142_in_ruleWhenPentecostarionDay14576 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_ruleWhenPeriodCase_in_ruleWhenPentecostarionDay14597 = new BitSet(new long[]{0x0000000000000040L,0x0000000000000000L,0x0000000000100200L});
    public static final BitSet FOLLOW_ruleWhenOther_in_ruleWhenPentecostarionDay14619 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000200L});
    public static final BitSet FOLLOW_137_in_ruleWhenPentecostarionDay14632 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleWhenTriodionDay_in_entryRuleWhenTriodionDay14668 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleWhenTriodionDay14678 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_143_in_ruleWhenTriodionDay14715 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_ruleWhenPeriodCase_in_ruleWhenTriodionDay14736 = new BitSet(new long[]{0x0000000000000040L,0x0000000000000000L,0x0000000000100200L});
    public static final BitSet FOLLOW_ruleWhenOther_in_ruleWhenTriodionDay14758 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000200L});
    public static final BitSet FOLLOW_137_in_ruleWhenTriodionDay14771 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleWhenMovableCycleDay_in_entryRuleWhenMovableCycleDay14807 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleWhenMovableCycleDay14817 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_144_in_ruleWhenMovableCycleDay14854 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_ruleWhenPeriodCase_in_ruleWhenMovableCycleDay14875 = new BitSet(new long[]{0x0000000000000040L,0x0000000000000000L,0x0000000000100200L});
    public static final BitSet FOLLOW_ruleWhenOther_in_ruleWhenMovableCycleDay14897 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000200L});
    public static final BitSet FOLLOW_137_in_ruleWhenMovableCycleDay14910 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleWhenSundayAfterElevationOfCrossDay_in_entryRuleWhenSundayAfterElevationOfCrossDay14946 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleWhenSundayAfterElevationOfCrossDay14956 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_145_in_ruleWhenSundayAfterElevationOfCrossDay14993 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0xFF80000000000000L,0x0000000000000007L});
    public static final BitSet FOLLOW_ruleWhenDateCase_in_ruleWhenSundayAfterElevationOfCrossDay15014 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0xFF80000000100200L,0x0000000000000007L});
    public static final BitSet FOLLOW_ruleWhenOther_in_ruleWhenSundayAfterElevationOfCrossDay15036 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000200L});
    public static final BitSet FOLLOW_137_in_ruleWhenSundayAfterElevationOfCrossDay15049 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleWhenLukanCycleDay_in_entryRuleWhenLukanCycleDay15085 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleWhenLukanCycleDay15095 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_146_in_ruleWhenLukanCycleDay15132 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_ruleWhenPeriodCase_in_ruleWhenLukanCycleDay15153 = new BitSet(new long[]{0x0000000000000040L,0x0000000000000000L,0x0000000000100200L});
    public static final BitSet FOLLOW_ruleWhenOther_in_ruleWhenLukanCycleDay15175 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000200L});
    public static final BitSet FOLLOW_137_in_ruleWhenLukanCycleDay15188 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleWhenPascha_in_entryRuleWhenPascha15224 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleWhenPascha15234 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_147_in_ruleWhenPascha15271 = new BitSet(new long[]{0x0800800000000000L,0x5555555234000040L,0x0000000000FFE38FL});
    public static final BitSet FOLLOW_ruleAbstractComponent_in_ruleWhenPascha15292 = new BitSet(new long[]{0x0800800000000000L,0x5555555234000040L,0x0000000000FFE38FL});
    public static final BitSet FOLLOW_148_in_ruleWhenPascha15306 = new BitSet(new long[]{0x0800800000000000L,0x5555555234000040L,0x0000000000EFE38FL});
    public static final BitSet FOLLOW_ruleAbstractComponent_in_ruleWhenPascha15327 = new BitSet(new long[]{0x0800800000000000L,0x5555555234000040L,0x0000000000EFE38FL});
    public static final BitSet FOLLOW_137_in_ruleWhenPascha15342 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleWhenOther_in_entryRuleWhenOther15378 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleWhenOther15388 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_148_in_ruleWhenOther15425 = new BitSet(new long[]{0x0800800000000002L,0x5555555234000040L,0x0000000000EFE18FL});
    public static final BitSet FOLLOW_ruleAbstractComponent_in_ruleWhenOther15446 = new BitSet(new long[]{0x0800800000000002L,0x5555555234000040L,0x0000000000EFE18FL});
    public static final BitSet FOLLOW_ruleWhenPeriodCase_in_entryRuleWhenPeriodCase15483 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleWhenPeriodCase15493 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAbstractDayCase_in_ruleWhenPeriodCase15539 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000400L});
    public static final BitSet FOLLOW_138_in_ruleWhenPeriodCase15551 = new BitSet(new long[]{0x0800800000000002L,0x5555555234000040L,0x0000000000EFE18FL});
    public static final BitSet FOLLOW_ruleAbstractComponent_in_ruleWhenPeriodCase15572 = new BitSet(new long[]{0x0800800000000002L,0x5555555234000040L,0x0000000000EFE18FL});
    public static final BitSet FOLLOW_ruleAbstractDayCase_in_entryRuleAbstractDayCase15609 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleAbstractDayCase15619 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDayRange_in_ruleAbstractDayCase15666 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDaySet_in_ruleAbstractDayCase15693 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDayRange_in_entryRuleDayRange15728 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleDayRange15738 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_INT_in_ruleDayRange15780 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000800L});
    public static final BitSet FOLLOW_139_in_ruleDayRange15797 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_RULE_INT_in_ruleDayRange15814 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDaySet_in_entryRuleDaySet15855 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleDaySet15865 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_INT_in_ruleDaySet15907 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000000L,0x0000000000001000L});
    public static final BitSet FOLLOW_140_in_ruleDaySet15925 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_RULE_INT_in_ruleDaySet15942 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000000L,0x0000000000001000L});
    public static final BitSet FOLLOW_ruleWhenModeOfWeek_in_entryRuleWhenModeOfWeek15985 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleWhenModeOfWeek15995 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_149_in_ruleWhenModeOfWeek16032 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x000001FE00000000L});
    public static final BitSet FOLLOW_ruleWhenModeOfWeekCase_in_ruleWhenModeOfWeek16053 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x000001FE00100200L});
    public static final BitSet FOLLOW_ruleWhenOther_in_ruleWhenModeOfWeek16075 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000200L});
    public static final BitSet FOLLOW_137_in_ruleWhenModeOfWeek16088 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleWhenModeOfWeekCase_in_entryRuleWhenModeOfWeekCase16124 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleWhenModeOfWeekCase16134 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleModeOfWeekSet_in_ruleWhenModeOfWeekCase16180 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000400L});
    public static final BitSet FOLLOW_138_in_ruleWhenModeOfWeekCase16192 = new BitSet(new long[]{0x0800800000000002L,0x5555555234000040L,0x0000000000EFE18FL});
    public static final BitSet FOLLOW_ruleAbstractComponent_in_ruleWhenModeOfWeekCase16213 = new BitSet(new long[]{0x0800800000000002L,0x5555555234000040L,0x0000000000EFE18FL});
    public static final BitSet FOLLOW_ruleModeOfWeekSet_in_entryRuleModeOfWeekSet16250 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleModeOfWeekSet16260 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleModeTypes_in_ruleModeOfWeekSet16306 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000000L,0x0000000000001000L});
    public static final BitSet FOLLOW_140_in_ruleModeOfWeekSet16319 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x000001FE00000000L});
    public static final BitSet FOLLOW_ruleModeTypes_in_ruleModeOfWeekSet16340 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000000L,0x0000000000001000L});
    public static final BitSet FOLLOW_ruleWhenSundaysBeforeTriodion_in_entryRuleWhenSundaysBeforeTriodion16378 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleWhenSundaysBeforeTriodion16388 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_150_in_ruleWhenSundaysBeforeTriodion16425 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_ruleSundaysBeforeTriodionCase_in_ruleWhenSundaysBeforeTriodion16446 = new BitSet(new long[]{0x0000000000000040L,0x0000000000000000L,0x0000000000100200L});
    public static final BitSet FOLLOW_ruleWhenOther_in_ruleWhenSundaysBeforeTriodion16468 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000200L});
    public static final BitSet FOLLOW_137_in_ruleWhenSundaysBeforeTriodion16481 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSundaysBeforeTriodionCase_in_entryRuleSundaysBeforeTriodionCase16517 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleSundaysBeforeTriodionCase16527 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_INT_in_ruleSundaysBeforeTriodionCase16569 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000400L});
    public static final BitSet FOLLOW_138_in_ruleSundaysBeforeTriodionCase16586 = new BitSet(new long[]{0x0800800000000002L,0x5555555234000040L,0x0000000000EFE18FL});
    public static final BitSet FOLLOW_ruleAbstractComponent_in_ruleSundaysBeforeTriodionCase16607 = new BitSet(new long[]{0x0800800000000002L,0x5555555234000040L,0x0000000000EFE18FL});
    public static final BitSet FOLLOW_ruleWhenExists_in_entryRuleWhenExists16644 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleWhenExists16654 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_151_in_ruleWhenExists16691 = new BitSet(new long[]{0x0010000000000000L});
    public static final BitSet FOLLOW_ruleWhenExistsCase_in_ruleWhenExists16712 = new BitSet(new long[]{0x0010000000000000L,0x0000000000000000L,0x0000000000100200L});
    public static final BitSet FOLLOW_ruleWhenOther_in_ruleWhenExists16734 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000200L});
    public static final BitSet FOLLOW_137_in_ruleWhenExists16747 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleWhenExistsCase_in_entryRuleWhenExistsCase16783 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleWhenExistsCase16793 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_52_in_ruleWhenExistsCase16830 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_ruleQualifiedName_in_ruleWhenExistsCase16853 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000400L});
    public static final BitSet FOLLOW_138_in_ruleWhenExistsCase16865 = new BitSet(new long[]{0x0800800000000002L,0x5555555234000040L,0x0000000000EFE18FL});
    public static final BitSet FOLLOW_ruleAbstractComponent_in_ruleWhenExistsCase16886 = new BitSet(new long[]{0x0800800000000002L,0x5555555234000040L,0x0000000000EFE18FL});
    public static final BitSet FOLLOW_152_in_ruleVersionSwitchType16937 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_153_in_ruleVersionSwitchType16954 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_154_in_ruleVersionSwitchType16971 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_152_in_ruleLanguage17016 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_153_in_ruleLanguage17033 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_155_in_ruleBreakType17078 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_156_in_ruleBreakType17095 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_157_in_ruleTemplateStatuses17140 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_158_in_ruleTemplateStatuses17157 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_159_in_ruleTemplateStatuses17174 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_160_in_ruleTemplateStatuses17191 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_161_in_ruleModeTypes17238 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_162_in_ruleModeTypes17255 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_163_in_ruleModeTypes17272 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_164_in_ruleModeTypes17289 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_165_in_ruleModeTypes17306 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_166_in_ruleModeTypes17323 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_167_in_ruleModeTypes17340 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_168_in_ruleModeTypes17357 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_169_in_ruleDowTypes17402 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_170_in_ruleDowTypes17419 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_171_in_ruleDowTypes17436 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_172_in_ruleDowTypes17453 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_173_in_ruleDowTypes17470 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_174_in_ruleDowTypes17487 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_175_in_ruleDowTypes17504 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_176_in_ruleDayOfWeek17557 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_177_in_ruleDayOfWeek17574 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_178_in_ruleDayOfWeek17591 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_179_in_ruleDayOfWeek17608 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_180_in_ruleDayOfWeek17625 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_181_in_ruleDayOfWeek17642 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_182_in_ruleDayOfWeek17659 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_183_in_ruleMonthName17704 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_184_in_ruleMonthName17721 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_185_in_ruleMonthName17738 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_186_in_ruleMonthName17755 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_187_in_ruleMonthName17772 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_188_in_ruleMonthName17789 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_189_in_ruleMonthName17806 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_190_in_ruleMonthName17823 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_191_in_ruleMonthName17840 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_192_in_ruleMonthName17857 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_193_in_ruleMonthName17874 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_194_in_ruleMonthName17891 = new BitSet(new long[]{0x0000000000000002L});

}